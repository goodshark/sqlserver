// Generated from /Users/dengrenbo/prog/dev/sqlserver/src/main/antlr/Tsql.g4 by ANTLR 4.5.3
package test;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TsqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TsqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TsqlParser#tsqlfile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsqlfile(TsqlParser.TsqlfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#batch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatch(TsqlParser.BatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_clauses(TsqlParser.Sql_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#sql_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_clause(TsqlParser.Sql_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#dml_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_clause(TsqlParser.Dml_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#ddl_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_clause(TsqlParser.Ddl_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(TsqlParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code break_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(TsqlParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(TsqlParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goto_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(TsqlParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(TsqlParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(TsqlParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code throw_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(TsqlParser.Throw_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code try_catch_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_statement(TsqlParser.Try_catch_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code waitfor_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitfor_statement(TsqlParser.Waitfor_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(TsqlParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(TsqlParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code raiseerror_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseerror_statement(TsqlParser.Raiseerror_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#another_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnother_statement(TsqlParser.Another_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(TsqlParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#delete_statement_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement_from(TsqlParser.Delete_statement_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(TsqlParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#insert_statement_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement_value(TsqlParser.Insert_statement_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(TsqlParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(TsqlParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#output_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_clause(TsqlParser.Output_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_dml_list_elem(TsqlParser.Output_dml_list_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#output_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_column_name(TsqlParser.Output_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#create_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database(TsqlParser.Create_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#create_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index(TsqlParser.Create_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#create_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure(TsqlParser.Create_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#procedure_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_param(TsqlParser.Procedure_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#procedure_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_option(TsqlParser.Procedure_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#create_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_statistics(TsqlParser.Create_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(TsqlParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#create_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view(TsqlParser.Create_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#view_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_attribute(TsqlParser.View_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table(TsqlParser.Alter_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#alter_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database(TsqlParser.Alter_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#database_optionspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_optionspec(TsqlParser.Database_optionspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#auto_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_option(TsqlParser.Auto_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#change_tracking_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_tracking_option(TsqlParser.Change_tracking_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_tracking_option_list(TsqlParser.Change_tracking_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#containment_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainment_option(TsqlParser.Containment_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#cursor_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_option(TsqlParser.Cursor_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_correlation_optimization_option(TsqlParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#db_encryption_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_encryption_option(TsqlParser.Db_encryption_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#db_state_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_state_option(TsqlParser.Db_state_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#db_update_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_update_option(TsqlParser.Db_update_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#db_user_access_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_user_access_option(TsqlParser.Db_user_access_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayed_durability_option(TsqlParser.Delayed_durability_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#external_access_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_access_option(TsqlParser.External_access_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixed_page_allocation_option(TsqlParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#parameterization_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterization_option(TsqlParser.Parameterization_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#recovery_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecovery_option(TsqlParser.Recovery_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#service_broker_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService_broker_option(TsqlParser.Service_broker_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#snapshot_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSnapshot_option(TsqlParser.Snapshot_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#sql_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_option(TsqlParser.Sql_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_recovery_time_option(TsqlParser.Target_recovery_time_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#termination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermination(TsqlParser.TerminationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#drop_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index(TsqlParser.Drop_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_procedure(TsqlParser.Drop_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#drop_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_statistics(TsqlParser.Drop_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table(TsqlParser.Drop_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#drop_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view(TsqlParser.Drop_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#create_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type(TsqlParser.Create_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#drop_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_type(TsqlParser.Drop_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowset_function_limited(TsqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#openquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenquery(TsqlParser.OpenqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#opendatasource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpendatasource(TsqlParser.OpendatasourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#declare_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_statement(TsqlParser.Declare_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_statement(TsqlParser.Cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#execute_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement(TsqlParser.Execute_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement_arg(TsqlParser.Execute_statement_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#execute_var_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_var_string(TsqlParser.Execute_var_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#security_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_statement(TsqlParser.Security_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#grant_permission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_permission(TsqlParser.Grant_permissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#set_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_statement(TsqlParser.Set_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#transaction_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_statement(TsqlParser.Transaction_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#go_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGo_statement(TsqlParser.Go_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#use_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_statement(TsqlParser.Use_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#execute_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_clause(TsqlParser.Execute_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#declare_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_local(TsqlParser.Declare_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#table_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type_definition(TsqlParser.Table_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_table_constraints(TsqlParser.Column_def_table_constraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_table_constraint(TsqlParser.Column_def_table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(TsqlParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(TsqlParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(TsqlParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#index_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_options(TsqlParser.Index_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#index_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_option(TsqlParser.Index_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor(TsqlParser.Declare_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_set_cursor_common(TsqlParser.Declare_set_cursor_commonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_cursor(TsqlParser.Fetch_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#set_special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_special(TsqlParser.Set_specialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_LOCAL_ID(TsqlParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary_operator_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator_expression(TsqlParser.Binary_operator_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitive_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_expression(TsqlParser.Primitive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracket_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket_expression(TsqlParser.Bracket_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_operator_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator_expression(TsqlParser.Unary_operator_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_call_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_expression(TsqlParser.Function_call_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(TsqlParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code column_ref_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_ref_expression(TsqlParser.Column_ref_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_expression(TsqlParser.Subquery_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code over_clause_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause_expression(TsqlParser.Over_clause_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(TsqlParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(TsqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#with_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_expression(TsqlParser.With_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(TsqlParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#update_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_elem(TsqlParser.Update_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#search_condition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_list(TsqlParser.Search_condition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(TsqlParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#search_condition_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_and(TsqlParser.Search_condition_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#search_condition_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_not(TsqlParser.Search_condition_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(TsqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#query_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expression(TsqlParser.Query_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(TsqlParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#query_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_specification(TsqlParser.Query_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(TsqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_clause(TsqlParser.For_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#xml_common_directives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_common_directives(TsqlParser.Xml_common_directivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expression(TsqlParser.Order_by_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#group_by_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_item(TsqlParser.Group_by_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#option_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_clause(TsqlParser.Option_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(TsqlParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimize_for_arg(TsqlParser.Optimize_for_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(TsqlParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#select_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_elem(TsqlParser.Select_list_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#table_sources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_sources(TsqlParser.Table_sourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#table_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source(TsqlParser.Table_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#table_source_item_joined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source_item_joined(TsqlParser.Table_source_item_joinedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#table_source_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source_item(TsqlParser.Table_source_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#change_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_table(TsqlParser.Change_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#join_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_part(TsqlParser.Join_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name_with_hint(TsqlParser.Table_name_with_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#rowset_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowset_function(TsqlParser.Rowset_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#bulk_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulk_option(TsqlParser.Bulk_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#derived_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_table(TsqlParser.Derived_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(TsqlParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#switch_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_section(TsqlParser.Switch_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_search_condition_section(TsqlParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#as_table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_table_alias(TsqlParser.As_table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(TsqlParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#with_table_hints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_table_hints(TsqlParser.With_table_hintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_with_table_hints(TsqlParser.Insert_with_table_hintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#table_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_hint(TsqlParser.Table_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#index_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_value(TsqlParser.Index_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#column_alias_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias_list(TsqlParser.Column_alias_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(TsqlParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#table_value_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_value_constructor(TsqlParser.Table_value_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(TsqlParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRanking_windowed_function(TsqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_windowed_function(TsqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_distinct_expression(TsqlParser.All_distinct_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(TsqlParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_or_range_clause(TsqlParser.Row_or_range_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#window_frame_extent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_extent(TsqlParser.Window_frame_extentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#window_frame_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_bound(TsqlParser.Window_frame_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_preceding(TsqlParser.Window_frame_precedingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#window_frame_following}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_following(TsqlParser.Window_frame_followingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(TsqlParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#database_filestream_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_filestream_option(TsqlParser.Database_filestream_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#database_file_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_file_spec(TsqlParser.Database_file_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#file_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_group(TsqlParser.File_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#file_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_spec(TsqlParser.File_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#full_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_table_name(TsqlParser.Full_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(TsqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#simple_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_name(TsqlParser.Simple_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#func_proc_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_proc_name(TsqlParser.Func_proc_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#ddl_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_object(TsqlParser.Ddl_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#full_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_name(TsqlParser.Full_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(TsqlParser.Column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(TsqlParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#on_off}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_off(TsqlParser.On_offContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#clustered}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClustered(TsqlParser.ClusteredContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#null_notnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_notnull(TsqlParser.Null_notnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_function_name(TsqlParser.Scalar_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(TsqlParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value(TsqlParser.Default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(TsqlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(TsqlParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(TsqlParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#simple_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_id(TsqlParser.Simple_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(TsqlParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(TsqlParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TsqlParser#file_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_size(TsqlParser.File_sizeContext ctx);
}