package test;

import java.util.HashMap;

/**
 * Created by dengrb1 on 11/17 0017.
 */

class SqlVar {
    private String key;
    private String varType;
    private String val;

    SqlVar() {
    }

    public void setKey(String k) {
        key = k;
    }

    public String getKey() {
        return key;
    }

    public void setType(String type) {
        varType = type;
        if (type == "int") {
            val = "0";
        }
    }

    public void setVal(String v) {
        val = v;
    }

    public String getVal() {
        if (varType == "varchar") {
            return "\"" + val + "\"";
        } else {
            return val;
        }
    }
}

public class EvalVisitor extends TsqlBaseVisitor<Integer>  {
    private StringBuilder sql = new StringBuilder();
    private HashMap<String, SqlVar> varMap = new HashMap<String, SqlVar>();

    public String getSql() {
        return sql.toString();
    }

    public void testMap() {
        for (String key: varMap.keySet()) {
            System.out.println(varMap.get(key).getKey() + "-> " + varMap.get(key).getVal());
        }
    }

    public String subsitute() {
        String sql = getSql();
        for (String key : varMap.keySet()) {
            if (sql.contains(key)) {
                sql = sql.replaceAll(key, varMap.get(key).getVal());
            }
        }
        return sql;
    }

    // decalre var
    @Override
    public Integer visitDeclare_local(TsqlParser.Declare_localContext ctx) {
        SqlVar var = new SqlVar();
        String key = ctx.start.getText();
        String type = ctx.data_type().getText();
        var.setKey(key);
        var.setType(type);
        varMap.put(key, var);
        return visitChildren(ctx);
    }

    @Override
    public Integer visitSet_statement(TsqlParser.Set_statementContext ctx) {
        if (ctx.LOCAL_ID() != null) {
            String key = ctx.LOCAL_ID().getText();
            if (varMap.containsKey(key)) {
                String val = ctx.expression().getText();
                varMap.get(key).setVal(val);
            }
        }
        return visitChildren(ctx);
    }


    @Override
    public Integer visitSelect_statement(TsqlParser.Select_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitDml_clause(TsqlParser.Dml_clauseContext ctx) {
        if (ctx.delete_statement() != null) {
            System.out.println("del stmt");
        }
        if (ctx.select_statement() != null) {
            System.out.println("select stmt: " + ctx.select_statement());
            System.out.println("select child cnt: " + ctx.select_statement().getChildCount());
        }
        if (ctx.insert_statement() != null) {
            System.out.println("insert stmt");
        }
        if (ctx.update_statement() != null) {
            System.out.println("update stmt");
        }
        return visitChildren(ctx);
    }

    @Override
    public Integer visitQuery_specification(TsqlParser.Query_specificationContext ctx) {
        // select
        if (sql.capacity() != 0) {
            sql.append("\n");
        }
        sql.append(ctx.start.getText());
        sql.append(" ");
        return visitChildren(ctx);
    }

    @Override
    public Integer visitSelect_list(TsqlParser.Select_listContext ctx) {
        sql.append(ctx.getText());
        sql.append(" ");
        return visitChildren(ctx);
    }

    @Override
    public Integer visitTable_sources(TsqlParser.Table_sourcesContext ctx) {
        sql.append("from ");
        sql.append(ctx.getText());
        sql.append(" ");
        return visitChildren(ctx);
    }

    @Override
    public Integer visitSearch_condition(TsqlParser.Search_conditionContext ctx) {
        sql.append("where ");
        sql.append(ctx.getText());
        return visitChildren(ctx);
    }
}
