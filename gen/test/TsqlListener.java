// Generated from /Users/dengrenbo/prog/dev/sqlserver/src/main/antlr/Tsql.g4 by ANTLR 4.5.3
package test;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TsqlParser}.
 */
public interface TsqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TsqlParser#tsqlfile}.
	 * @param ctx the parse tree
	 */
	void enterTsqlfile(TsqlParser.TsqlfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#tsqlfile}.
	 * @param ctx the parse tree
	 */
	void exitTsqlfile(TsqlParser.TsqlfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#batch}.
	 * @param ctx the parse tree
	 */
	void enterBatch(TsqlParser.BatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#batch}.
	 * @param ctx the parse tree
	 */
	void exitBatch(TsqlParser.BatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void enterSql_clauses(TsqlParser.Sql_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void exitSql_clauses(TsqlParser.Sql_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#sql_clause}.
	 * @param ctx the parse tree
	 */
	void enterSql_clause(TsqlParser.Sql_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#sql_clause}.
	 * @param ctx the parse tree
	 */
	void exitSql_clause(TsqlParser.Sql_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_clause(TsqlParser.Dml_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_clause(TsqlParser.Dml_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void enterDdl_clause(TsqlParser.Ddl_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void exitDdl_clause(TsqlParser.Ddl_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(TsqlParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(TsqlParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(TsqlParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(TsqlParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(TsqlParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(TsqlParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goto_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(TsqlParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goto_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(TsqlParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(TsqlParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(TsqlParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(TsqlParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(TsqlParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code throw_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(TsqlParser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code throw_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(TsqlParser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code try_catch_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_statement(TsqlParser.Try_catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code try_catch_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_statement(TsqlParser.Try_catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code waitfor_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterWaitfor_statement(TsqlParser.Waitfor_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code waitfor_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitWaitfor_statement(TsqlParser.Waitfor_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(TsqlParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(TsqlParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(TsqlParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(TsqlParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code raiseerror_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaiseerror_statement(TsqlParser.Raiseerror_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code raiseerror_statement}
	 * labeled alternative in {@link TsqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaiseerror_statement(TsqlParser.Raiseerror_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#another_statement}.
	 * @param ctx the parse tree
	 */
	void enterAnother_statement(TsqlParser.Another_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#another_statement}.
	 * @param ctx the parse tree
	 */
	void exitAnother_statement(TsqlParser.Another_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(TsqlParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(TsqlParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#delete_statement_from}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement_from(TsqlParser.Delete_statement_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#delete_statement_from}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement_from(TsqlParser.Delete_statement_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(TsqlParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(TsqlParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#insert_statement_value}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement_value(TsqlParser.Insert_statement_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#insert_statement_value}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement_value(TsqlParser.Insert_statement_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(TsqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(TsqlParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(TsqlParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(TsqlParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#output_clause}.
	 * @param ctx the parse tree
	 */
	void enterOutput_clause(TsqlParser.Output_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#output_clause}.
	 * @param ctx the parse tree
	 */
	void exitOutput_clause(TsqlParser.Output_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterOutput_dml_list_elem(TsqlParser.Output_dml_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitOutput_dml_list_elem(TsqlParser.Output_dml_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#output_column_name}.
	 * @param ctx the parse tree
	 */
	void enterOutput_column_name(TsqlParser.Output_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#output_column_name}.
	 * @param ctx the parse tree
	 */
	void exitOutput_column_name(TsqlParser.Output_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#create_database}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database(TsqlParser.Create_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#create_database}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database(TsqlParser.Create_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index(TsqlParser.Create_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index(TsqlParser.Create_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#create_procedure}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure(TsqlParser.Create_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#create_procedure}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure(TsqlParser.Create_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#procedure_param}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_param(TsqlParser.Procedure_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#procedure_param}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_param(TsqlParser.Procedure_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#procedure_option}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_option(TsqlParser.Procedure_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#procedure_option}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_option(TsqlParser.Procedure_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statistics(TsqlParser.Create_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statistics(TsqlParser.Create_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(TsqlParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(TsqlParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view(TsqlParser.Create_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view(TsqlParser.Create_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#view_attribute}.
	 * @param ctx the parse tree
	 */
	void enterView_attribute(TsqlParser.View_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#view_attribute}.
	 * @param ctx the parse tree
	 */
	void exitView_attribute(TsqlParser.View_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table(TsqlParser.Alter_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table(TsqlParser.Alter_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database(TsqlParser.Alter_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database(TsqlParser.Alter_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#database_optionspec}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_optionspec(TsqlParser.Database_optionspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#database_optionspec}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_optionspec(TsqlParser.Database_optionspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#auto_option}.
	 * @param ctx the parse tree
	 */
	void enterAuto_option(TsqlParser.Auto_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#auto_option}.
	 * @param ctx the parse tree
	 */
	void exitAuto_option(TsqlParser.Auto_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#change_tracking_option}.
	 * @param ctx the parse tree
	 */
	void enterChange_tracking_option(TsqlParser.Change_tracking_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#change_tracking_option}.
	 * @param ctx the parse tree
	 */
	void exitChange_tracking_option(TsqlParser.Change_tracking_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 */
	void enterChange_tracking_option_list(TsqlParser.Change_tracking_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 */
	void exitChange_tracking_option_list(TsqlParser.Change_tracking_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#containment_option}.
	 * @param ctx the parse tree
	 */
	void enterContainment_option(TsqlParser.Containment_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#containment_option}.
	 * @param ctx the parse tree
	 */
	void exitContainment_option(TsqlParser.Containment_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void enterCursor_option(TsqlParser.Cursor_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void exitCursor_option(TsqlParser.Cursor_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 */
	void enterDate_correlation_optimization_option(TsqlParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 */
	void exitDate_correlation_optimization_option(TsqlParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#db_encryption_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_encryption_option(TsqlParser.Db_encryption_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#db_encryption_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_encryption_option(TsqlParser.Db_encryption_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#db_state_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_state_option(TsqlParser.Db_state_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#db_state_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_state_option(TsqlParser.Db_state_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#db_update_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_update_option(TsqlParser.Db_update_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#db_update_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_update_option(TsqlParser.Db_update_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#db_user_access_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_user_access_option(TsqlParser.Db_user_access_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#db_user_access_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_user_access_option(TsqlParser.Db_user_access_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 */
	void enterDelayed_durability_option(TsqlParser.Delayed_durability_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 */
	void exitDelayed_durability_option(TsqlParser.Delayed_durability_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#external_access_option}.
	 * @param ctx the parse tree
	 */
	void enterExternal_access_option(TsqlParser.External_access_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#external_access_option}.
	 * @param ctx the parse tree
	 */
	void exitExternal_access_option(TsqlParser.External_access_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 */
	void enterMixed_page_allocation_option(TsqlParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 */
	void exitMixed_page_allocation_option(TsqlParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#parameterization_option}.
	 * @param ctx the parse tree
	 */
	void enterParameterization_option(TsqlParser.Parameterization_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#parameterization_option}.
	 * @param ctx the parse tree
	 */
	void exitParameterization_option(TsqlParser.Parameterization_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#recovery_option}.
	 * @param ctx the parse tree
	 */
	void enterRecovery_option(TsqlParser.Recovery_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#recovery_option}.
	 * @param ctx the parse tree
	 */
	void exitRecovery_option(TsqlParser.Recovery_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#service_broker_option}.
	 * @param ctx the parse tree
	 */
	void enterService_broker_option(TsqlParser.Service_broker_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#service_broker_option}.
	 * @param ctx the parse tree
	 */
	void exitService_broker_option(TsqlParser.Service_broker_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#snapshot_option}.
	 * @param ctx the parse tree
	 */
	void enterSnapshot_option(TsqlParser.Snapshot_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#snapshot_option}.
	 * @param ctx the parse tree
	 */
	void exitSnapshot_option(TsqlParser.Snapshot_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#sql_option}.
	 * @param ctx the parse tree
	 */
	void enterSql_option(TsqlParser.Sql_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#sql_option}.
	 * @param ctx the parse tree
	 */
	void exitSql_option(TsqlParser.Sql_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 */
	void enterTarget_recovery_time_option(TsqlParser.Target_recovery_time_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 */
	void exitTarget_recovery_time_option(TsqlParser.Target_recovery_time_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#termination}.
	 * @param ctx the parse tree
	 */
	void enterTermination(TsqlParser.TerminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#termination}.
	 * @param ctx the parse tree
	 */
	void exitTermination(TsqlParser.TerminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index(TsqlParser.Drop_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index(TsqlParser.Drop_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure(TsqlParser.Drop_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure(TsqlParser.Drop_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#drop_statistics}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statistics(TsqlParser.Drop_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#drop_statistics}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statistics(TsqlParser.Drop_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(TsqlParser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(TsqlParser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#drop_view}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view(TsqlParser.Drop_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#drop_view}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view(TsqlParser.Drop_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(TsqlParser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(TsqlParser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type(TsqlParser.Drop_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type(TsqlParser.Drop_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function_limited(TsqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function_limited(TsqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#openquery}.
	 * @param ctx the parse tree
	 */
	void enterOpenquery(TsqlParser.OpenqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#openquery}.
	 * @param ctx the parse tree
	 */
	void exitOpenquery(TsqlParser.OpenqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void enterOpendatasource(TsqlParser.OpendatasourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void exitOpendatasource(TsqlParser.OpendatasourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_statement(TsqlParser.Declare_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_statement(TsqlParser.Declare_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterCursor_statement(TsqlParser.Cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitCursor_statement(TsqlParser.Cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement(TsqlParser.Execute_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement(TsqlParser.Execute_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement_arg(TsqlParser.Execute_statement_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement_arg(TsqlParser.Execute_statement_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#execute_var_string}.
	 * @param ctx the parse tree
	 */
	void enterExecute_var_string(TsqlParser.Execute_var_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#execute_var_string}.
	 * @param ctx the parse tree
	 */
	void exitExecute_var_string(TsqlParser.Execute_var_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#security_statement}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_statement(TsqlParser.Security_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#security_statement}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_statement(TsqlParser.Security_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#grant_permission}.
	 * @param ctx the parse tree
	 */
	void enterGrant_permission(TsqlParser.Grant_permissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#grant_permission}.
	 * @param ctx the parse tree
	 */
	void exitGrant_permission(TsqlParser.Grant_permissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_statement(TsqlParser.Set_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_statement(TsqlParser.Set_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_statement(TsqlParser.Transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_statement(TsqlParser.Transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#go_statement}.
	 * @param ctx the parse tree
	 */
	void enterGo_statement(TsqlParser.Go_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#go_statement}.
	 * @param ctx the parse tree
	 */
	void exitGo_statement(TsqlParser.Go_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void enterUse_statement(TsqlParser.Use_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void exitUse_statement(TsqlParser.Use_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#execute_clause}.
	 * @param ctx the parse tree
	 */
	void enterExecute_clause(TsqlParser.Execute_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#execute_clause}.
	 * @param ctx the parse tree
	 */
	void exitExecute_clause(TsqlParser.Execute_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#declare_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_local(TsqlParser.Declare_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#declare_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_local(TsqlParser.Declare_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#table_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_definition(TsqlParser.Table_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#table_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_definition(TsqlParser.Table_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_table_constraints(TsqlParser.Column_def_table_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_table_constraints(TsqlParser.Column_def_table_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_table_constraint(TsqlParser.Column_def_table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_table_constraint(TsqlParser.Column_def_table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(TsqlParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(TsqlParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(TsqlParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(TsqlParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(TsqlParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(TsqlParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#index_options}.
	 * @param ctx the parse tree
	 */
	void enterIndex_options(TsqlParser.Index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#index_options}.
	 * @param ctx the parse tree
	 */
	void exitIndex_options(TsqlParser.Index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#index_option}.
	 * @param ctx the parse tree
	 */
	void enterIndex_option(TsqlParser.Index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#index_option}.
	 * @param ctx the parse tree
	 */
	void exitIndex_option(TsqlParser.Index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor(TsqlParser.Declare_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor(TsqlParser.Declare_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_set_cursor_common(TsqlParser.Declare_set_cursor_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_set_cursor_common(TsqlParser.Declare_set_cursor_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 */
	void enterFetch_cursor(TsqlParser.Fetch_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 */
	void exitFetch_cursor(TsqlParser.Fetch_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#set_special}.
	 * @param ctx the parse tree
	 */
	void enterSet_special(TsqlParser.Set_specialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#set_special}.
	 * @param ctx the parse tree
	 */
	void exitSet_special(TsqlParser.Set_specialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 */
	void enterConstant_LOCAL_ID(TsqlParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 */
	void exitConstant_LOCAL_ID(TsqlParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary_operator_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator_expression(TsqlParser.Binary_operator_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary_operator_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator_expression(TsqlParser.Binary_operator_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitive_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_expression(TsqlParser.Primitive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitive_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_expression(TsqlParser.Primitive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracket_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracket_expression(TsqlParser.Bracket_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracket_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracket_expression(TsqlParser.Bracket_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_operator_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator_expression(TsqlParser.Unary_operator_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_operator_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator_expression(TsqlParser.Unary_operator_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_call_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_expression(TsqlParser.Function_call_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_call_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_expression(TsqlParser.Function_call_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(TsqlParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(TsqlParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code column_ref_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterColumn_ref_expression(TsqlParser.Column_ref_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code column_ref_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitColumn_ref_expression(TsqlParser.Column_ref_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_expression(TsqlParser.Subquery_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_expression(TsqlParser.Subquery_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code over_clause_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause_expression(TsqlParser.Over_clause_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code over_clause_expression}
	 * labeled alternative in {@link TsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause_expression(TsqlParser.Over_clause_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(TsqlParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(TsqlParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(TsqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(TsqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#with_expression}.
	 * @param ctx the parse tree
	 */
	void enterWith_expression(TsqlParser.With_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#with_expression}.
	 * @param ctx the parse tree
	 */
	void exitWith_expression(TsqlParser.With_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(TsqlParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(TsqlParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#update_elem}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_elem(TsqlParser.Update_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#update_elem}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_elem(TsqlParser.Update_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#search_condition_list}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition_list(TsqlParser.Search_condition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#search_condition_list}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition_list(TsqlParser.Search_condition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition(TsqlParser.Search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition(TsqlParser.Search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#search_condition_and}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition_and(TsqlParser.Search_condition_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#search_condition_and}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition_and(TsqlParser.Search_condition_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#search_condition_not}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition_not(TsqlParser.Search_condition_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#search_condition_not}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition_not(TsqlParser.Search_condition_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(TsqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(TsqlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_expression(TsqlParser.Query_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_expression(TsqlParser.Query_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(TsqlParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(TsqlParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#query_specification}.
	 * @param ctx the parse tree
	 */
	void enterQuery_specification(TsqlParser.Query_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#query_specification}.
	 * @param ctx the parse tree
	 */
	void exitQuery_specification(TsqlParser.Query_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(TsqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(TsqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_clause(TsqlParser.For_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_clause(TsqlParser.For_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#xml_common_directives}.
	 * @param ctx the parse tree
	 */
	void enterXml_common_directives(TsqlParser.Xml_common_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#xml_common_directives}.
	 * @param ctx the parse tree
	 */
	void exitXml_common_directives(TsqlParser.Xml_common_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expression(TsqlParser.Order_by_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expression(TsqlParser.Order_by_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_item(TsqlParser.Group_by_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_item(TsqlParser.Group_by_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#option_clause}.
	 * @param ctx the parse tree
	 */
	void enterOption_clause(TsqlParser.Option_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#option_clause}.
	 * @param ctx the parse tree
	 */
	void exitOption_clause(TsqlParser.Option_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(TsqlParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(TsqlParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 */
	void enterOptimize_for_arg(TsqlParser.Optimize_for_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 */
	void exitOptimize_for_arg(TsqlParser.Optimize_for_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(TsqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(TsqlParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elem(TsqlParser.Select_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elem(TsqlParser.Select_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#table_sources}.
	 * @param ctx the parse tree
	 */
	void enterTable_sources(TsqlParser.Table_sourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#table_sources}.
	 * @param ctx the parse tree
	 */
	void exitTable_sources(TsqlParser.Table_sourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void enterTable_source(TsqlParser.Table_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void exitTable_source(TsqlParser.Table_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#table_source_item_joined}.
	 * @param ctx the parse tree
	 */
	void enterTable_source_item_joined(TsqlParser.Table_source_item_joinedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#table_source_item_joined}.
	 * @param ctx the parse tree
	 */
	void exitTable_source_item_joined(TsqlParser.Table_source_item_joinedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void enterTable_source_item(TsqlParser.Table_source_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void exitTable_source_item(TsqlParser.Table_source_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#change_table}.
	 * @param ctx the parse tree
	 */
	void enterChange_table(TsqlParser.Change_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#change_table}.
	 * @param ctx the parse tree
	 */
	void exitChange_table(TsqlParser.Change_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#join_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_part(TsqlParser.Join_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#join_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_part(TsqlParser.Join_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 */
	void enterTable_name_with_hint(TsqlParser.Table_name_with_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 */
	void exitTable_name_with_hint(TsqlParser.Table_name_with_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function(TsqlParser.Rowset_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function(TsqlParser.Rowset_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void enterBulk_option(TsqlParser.Bulk_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void exitBulk_option(TsqlParser.Bulk_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void enterDerived_table(TsqlParser.Derived_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void exitDerived_table(TsqlParser.Derived_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(TsqlParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(TsqlParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_section(TsqlParser.Switch_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_section(TsqlParser.Switch_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_search_condition_section(TsqlParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_search_condition_section(TsqlParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#as_table_alias}.
	 * @param ctx the parse tree
	 */
	void enterAs_table_alias(TsqlParser.As_table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#as_table_alias}.
	 * @param ctx the parse tree
	 */
	void exitAs_table_alias(TsqlParser.As_table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(TsqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(TsqlParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#with_table_hints}.
	 * @param ctx the parse tree
	 */
	void enterWith_table_hints(TsqlParser.With_table_hintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#with_table_hints}.
	 * @param ctx the parse tree
	 */
	void exitWith_table_hints(TsqlParser.With_table_hintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 */
	void enterInsert_with_table_hints(TsqlParser.Insert_with_table_hintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 */
	void exitInsert_with_table_hints(TsqlParser.Insert_with_table_hintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#table_hint}.
	 * @param ctx the parse tree
	 */
	void enterTable_hint(TsqlParser.Table_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#table_hint}.
	 * @param ctx the parse tree
	 */
	void exitTable_hint(TsqlParser.Table_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#index_value}.
	 * @param ctx the parse tree
	 */
	void enterIndex_value(TsqlParser.Index_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#index_value}.
	 * @param ctx the parse tree
	 */
	void exitIndex_value(TsqlParser.Index_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#column_alias_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias_list(TsqlParser.Column_alias_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#column_alias_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias_list(TsqlParser.Column_alias_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(TsqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(TsqlParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void enterTable_value_constructor(TsqlParser.Table_value_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void exitTable_value_constructor(TsqlParser.Table_value_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(TsqlParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(TsqlParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterRanking_windowed_function(TsqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitRanking_windowed_function(TsqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_windowed_function(TsqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_windowed_function(TsqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 */
	void enterAll_distinct_expression(TsqlParser.All_distinct_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 */
	void exitAll_distinct_expression(TsqlParser.All_distinct_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(TsqlParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(TsqlParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 */
	void enterRow_or_range_clause(TsqlParser.Row_or_range_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 */
	void exitRow_or_range_clause(TsqlParser.Row_or_range_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#window_frame_extent}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_extent(TsqlParser.Window_frame_extentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#window_frame_extent}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_extent(TsqlParser.Window_frame_extentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#window_frame_bound}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_bound(TsqlParser.Window_frame_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#window_frame_bound}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_bound(TsqlParser.Window_frame_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_preceding(TsqlParser.Window_frame_precedingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_preceding(TsqlParser.Window_frame_precedingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#window_frame_following}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_following(TsqlParser.Window_frame_followingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#window_frame_following}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_following(TsqlParser.Window_frame_followingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(TsqlParser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(TsqlParser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#database_filestream_option}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_filestream_option(TsqlParser.Database_filestream_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#database_filestream_option}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_filestream_option(TsqlParser.Database_filestream_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#database_file_spec}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_file_spec(TsqlParser.Database_file_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#database_file_spec}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_file_spec(TsqlParser.Database_file_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#file_group}.
	 * @param ctx the parse tree
	 */
	void enterFile_group(TsqlParser.File_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#file_group}.
	 * @param ctx the parse tree
	 */
	void exitFile_group(TsqlParser.File_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void enterFile_spec(TsqlParser.File_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void exitFile_spec(TsqlParser.File_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_table_name(TsqlParser.Full_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_table_name(TsqlParser.Full_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(TsqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(TsqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void enterSimple_name(TsqlParser.Simple_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void exitSimple_name(TsqlParser.Simple_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#func_proc_name}.
	 * @param ctx the parse tree
	 */
	void enterFunc_proc_name(TsqlParser.Func_proc_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#func_proc_name}.
	 * @param ctx the parse tree
	 */
	void exitFunc_proc_name(TsqlParser.Func_proc_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#ddl_object}.
	 * @param ctx the parse tree
	 */
	void enterDdl_object(TsqlParser.Ddl_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#ddl_object}.
	 * @param ctx the parse tree
	 */
	void exitDdl_object(TsqlParser.Ddl_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_name(TsqlParser.Full_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_name(TsqlParser.Full_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list(TsqlParser.Column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list(TsqlParser.Column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(TsqlParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(TsqlParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#on_off}.
	 * @param ctx the parse tree
	 */
	void enterOn_off(TsqlParser.On_offContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#on_off}.
	 * @param ctx the parse tree
	 */
	void exitOn_off(TsqlParser.On_offContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#clustered}.
	 * @param ctx the parse tree
	 */
	void enterClustered(TsqlParser.ClusteredContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#clustered}.
	 * @param ctx the parse tree
	 */
	void exitClustered(TsqlParser.ClusteredContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void enterNull_notnull(TsqlParser.Null_notnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void exitNull_notnull(TsqlParser.Null_notnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void enterScalar_function_name(TsqlParser.Scalar_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void exitScalar_function_name(TsqlParser.Scalar_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(TsqlParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(TsqlParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#default_value}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value(TsqlParser.Default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#default_value}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value(TsqlParser.Default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(TsqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(TsqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(TsqlParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(TsqlParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(TsqlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(TsqlParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#simple_id}.
	 * @param ctx the parse tree
	 */
	void enterSimple_id(TsqlParser.Simple_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#simple_id}.
	 * @param ctx the parse tree
	 */
	void exitSimple_id(TsqlParser.Simple_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(TsqlParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(TsqlParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(TsqlParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(TsqlParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TsqlParser#file_size}.
	 * @param ctx the parse tree
	 */
	void enterFile_size(TsqlParser.File_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsqlParser#file_size}.
	 * @param ctx the parse tree
	 */
	void exitFile_size(TsqlParser.File_sizeContext ctx);
}