package test;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by dengrb1 on 11/17 0017.
 */

public class Test {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        TsqlLexer lexer = new TsqlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TsqlParser parser = new TsqlParser(tokens);
        ParseTree tree = parser.tsqlfile(); // parse

        System.out.println("tree: " + tree.toStringTree(parser));
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
        System.out.println("init sql: " + eval.getSql());
        eval.testMap();
        System.out.println("final sql: " + eval.subsitute());
//        ParseTreeWalker walker = new ParseTreeWalker();
//        EvalListener lis = new EvalListener();
//        walker.walk(lis, tree);
//        System.out.println("final sql: " + lis.getSql());
    }
}
