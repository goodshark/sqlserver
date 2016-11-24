// Generated from /Users/dengrenbo/prog/dev/sqlserver/src/main/antlr/Tsql.g4 by ANTLR 4.5.3
package test;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HADR_options=1, ADD=2, ALL=3, ALTER=4, AND=5, ANY=6, AS=7, ASC=8, AUTHORIZATION=9, 
		BACKUP=10, BEGIN=11, BETWEEN=12, BREAK=13, BROWSE=14, BULK=15, BY=16, 
		CASCADE=17, CASE=18, CHANGETABLE=19, CHANGES=20, CHECK=21, CHECKPOINT=22, 
		CLOSE=23, CLUSTERED=24, COALESCE=25, COLLATE=26, COLUMN=27, COMMIT=28, 
		COMPUTE=29, CONSTRAINT=30, CONTAINMENT=31, CONTAINS=32, CONTAINSTABLE=33, 
		CONTINUE=34, CONVERT=35, CREATE=36, CROSS=37, CURRENT=38, CURRENT_DATE=39, 
		CURRENT_TIME=40, CURRENT_TIMESTAMP=41, CURRENT_USER=42, CURSOR=43, DATABASE=44, 
		DBCC=45, DEALLOCATE=46, DECLARE=47, DEFAULT=48, DELETE=49, DENY=50, DESC=51, 
		DISK=52, DISTINCT=53, DISTRIBUTED=54, DOUBLE=55, DROP=56, DUMP=57, ELSE=58, 
		END=59, ERRLVL=60, ESCAPE=61, EXCEPT=62, EXECUTE=63, EXISTS=64, EXIT=65, 
		EXTERNAL=66, FETCH=67, FILE=68, FILENAME=69, FILLFACTOR=70, FOR=71, FORCESEEK=72, 
		FOREIGN=73, FREETEXT=74, FREETEXTTABLE=75, FROM=76, FULL=77, FUNCTION=78, 
		GOTO=79, GRANT=80, GROUP=81, HAVING=82, IDENTITY=83, IDENTITYCOL=84, IDENTITY_INSERT=85, 
		IF=86, IN=87, INDEX=88, INNER=89, INSERT=90, INTERSECT=91, INTO=92, IS=93, 
		JOIN=94, KEY=95, KILL=96, LEFT=97, LIKE=98, LINENO=99, LOAD=100, LOG=101, 
		MERGE=102, NATIONAL=103, NOCHECK=104, NONCLUSTERED=105, NONE=106, NOT=107, 
		NULL=108, NULLIF=109, OF=110, OFF=111, OFFSETS=112, ON=113, OPEN=114, 
		OPENDATASOURCE=115, OPENQUERY=116, OPENROWSET=117, OPENXML=118, OPTION=119, 
		OR=120, ORDER=121, OUTER=122, OVER=123, PARTIAL=124, PERCENT=125, PIVOT=126, 
		PLAN=127, PRECISION=128, PRIMARY=129, PRINT=130, PROC=131, PROCEDURE=132, 
		PUBLIC=133, RAISERROR=134, READ=135, READTEXT=136, RECONFIGURE=137, REFERENCES=138, 
		REPLICATION=139, RESTORE=140, RESTRICT=141, RETURN=142, REVERT=143, REVOKE=144, 
		RIGHT=145, ROLLBACK=146, ROWCOUNT=147, ROWGUIDCOL=148, RULE=149, SAVE=150, 
		SCHEMA=151, SECURITYAUDIT=152, SELECT=153, SEMANTICKEYPHRASETABLE=154, 
		SEMANTICSIMILARITYDETAILSTABLE=155, SEMANTICSIMILARITYTABLE=156, SESSION_USER=157, 
		SET=158, SETUSER=159, SHUTDOWN=160, SOME=161, STATISTICS=162, SYSTEM_USER=163, 
		TABLE=164, TABLESAMPLE=165, TEXTSIZE=166, THEN=167, TO=168, TOP=169, TRAN=170, 
		TRANSACTION=171, TRIGGER=172, TRUNCATE=173, TRY_CONVERT=174, TSEQUAL=175, 
		UNION=176, UNIQUE=177, UNPIVOT=178, UPDATE=179, UPDATETEXT=180, USE=181, 
		USER=182, VALUES=183, VARYING=184, VIEW=185, WAITFOR=186, WHEN=187, WHERE=188, 
		WHILE=189, WITH=190, WITHIN=191, WRITETEXT=192, ABSOLUTE=193, AFTER=194, 
		ALLOWED=195, ALLOW_SNAPSHOT_ISOLATION=196, ANSI_NULLS=197, ANSI_NULL_DEFAULT=198, 
		ANSI_PADDING=199, ANSI_WARNINGS=200, APPLY=201, ARITHABORT=202, AUTO=203, 
		AUTO_CLEANUP=204, AUTO_CLOSE=205, AUTO_CREATE_STATISTICS=206, AUTO_SHRINK=207, 
		AUTO_UPDATE_STATISTICS=208, AUTO_UPDATE_STATISTICS_ASYNC=209, AVG=210, 
		BASE64=211, BINARY_CHECKSUM=212, BULK_LOGGED=213, CALLER=214, CAST=215, 
		CATCH=216, CHANGE_RETENTION=217, CHANGE_TRACKING=218, CHECKSUM=219, CHECKSUM_AGG=220, 
		COMMITTED=221, COMPATIBILITY_LEVEL=222, CONCAT=223, CONCAT_NULL_YIELDS_NULL=224, 
		CONTROL=225, COOKIE=226, COUNT=227, COUNT_BIG=228, CURSOR_CLOSE_ON_COMMIT=229, 
		CURSOR_DEFAULT=230, DATEADD=231, DATEDIFF=232, DATENAME=233, DATEPART=234, 
		DATE_CORRELATION_OPTIMIZATION=235, DAYS=236, DB_CHAINING=237, DEFAULT_FULLTEXT_LANGUAGE=238, 
		DEFAULT_LANGUAGE=239, DELAY=240, DELAYED_DURABILITY=241, DELETED=242, 
		DENSE_RANK=243, DIRECTORY_NAME=244, DISABLE=245, DISABLED=246, DISABLE_BROKER=247, 
		DYNAMIC=248, EMERGENCY=249, ENABLE_BROKER=250, ENCRYPTION=251, ERROR_BROKER_CONVERSATIONS=252, 
		EXPAND=253, FAST=254, FAST_FORWARD=255, FILEGROUP=256, FILEGROWTH=257, 
		FILESTREAM=258, FIRST=259, FOLLOWING=260, FORCE=261, FORCED=262, FORWARD_ONLY=263, 
		FULLSCAN=264, GB=265, GLOBAL=266, GO=267, GROUPING=268, GROUPING_ID=269, 
		HADR=270, HASH=271, HONOR_BROKER_PRIORITY=272, HOURS=273, IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX=274, 
		IMMEDIATE=275, IMPERSONATE=276, INCREMENTAL=277, INSENSITIVE=278, INSERTED=279, 
		ISOLATION=280, KB=281, KEEP=282, KEEPFIXED=283, KEYSET=284, LAST=285, 
		LEVEL=286, LOCAL=287, LOCK_ESCALATION=288, LOGIN=289, LOOP=290, MARK=291, 
		MAX=292, MAXDOP=293, MAXRECURSION=294, MAXSIZE=295, MB=296, MEMORY_OPTIMIZED_DATA=297, 
		MIN=298, MINUTES=299, MIN_ACTIVE_ROWVERSION=300, MIXED_PAGE_ALLOCATION=301, 
		MODIFY=302, MULTI_USER=303, NAME=304, NESTED_TRIGGERS=305, NEW_BROKER=306, 
		NEXT=307, NOCOUNT=308, NOEXPAND=309, NON_TRANSACTED_ACCESS=310, NORECOMPUTE=311, 
		NO_WAIT=312, NTILE=313, NUMBER=314, NUMERIC_ROUNDABORT=315, OFFLINE=316, 
		OFFSET=317, ONLINE=318, ONLY=319, OPTIMISTIC=320, OPTIMIZE=321, OUT=322, 
		OUTPUT=323, OWNER=324, PAGE_VERIFY=325, PARAMETERIZATION=326, PARTITION=327, 
		PATH=328, PRECEDING=329, PRIOR=330, PRIVILEGES=331, QUOTED_IDENTIFIER=332, 
		RANGE=333, RANK=334, READONLY=335, READ_COMMITTED_SNAPSHOT=336, READ_ONLY=337, 
		READ_WRITE=338, RECOMPILE=339, RECOVERY=340, RECURSIVE_TRIGGERS=341, RELATIVE=342, 
		REMOTE=343, REPEATABLE=344, RESTRICTED_USER=345, ROBUST=346, ROOT=347, 
		ROW=348, ROWGUID=349, ROWS=350, ROW_NUMBER=351, SAMPLE=352, SCHEMABINDING=353, 
		SCROLL=354, SCROLL_LOCKS=355, SECONDS=356, SELF=357, SERIALIZABLE=358, 
		SHOWPLAN=359, SIMPLE=360, SINGLE_USER=361, SIZE=362, SNAPSHOT=363, SPATIAL_WINDOW_MAX_CELLS=364, 
		STATIC=365, STATS_STREAM=366, STDEV=367, STDEVP=368, SUM=369, TAKE=370, 
		TARGET_RECOVERY_TIME=371, TB=372, TEXTIMAGE_ON=373, THROW=374, TIES=375, 
		TIME=376, TORN_PAGE_DETECTION=377, TRANSFORM_NOISE_WORDS=378, TRUSTWORTHY=379, 
		TRY=380, TWO_DIGIT_YEAR_CUTOFF=381, TYPE=382, TYPE_WARNING=383, UNBOUNDED=384, 
		UNCOMMITTED=385, UNKNOWN=386, UNLIMITED=387, USING=388, VAR=389, VARP=390, 
		VIEWS=391, VIEW_METADATA=392, WORK=393, XML=394, XMLNAMESPACES=395, DOLLAR_ACTION=396, 
		SPACE=397, COMMENT=398, LINE_COMMENT=399, DOUBLE_QUOTE_ID=400, SQUARE_BRACKET_ID=401, 
		LOCAL_ID=402, DECIMAL=403, ID=404, STRING=405, BINARY=406, FLOAT=407, 
		REAL=408, EQUAL=409, GREATER=410, LESS=411, EXCLAMATION=412, PLUS_ASSIGN=413, 
		MINUS_ASSIGN=414, MULT_ASSIGN=415, DIV_ASSIGN=416, MOD_ASSIGN=417, AND_ASSIGN=418, 
		XOR_ASSIGN=419, OR_ASSIGN=420, DOT=421, UNDERLINE=422, AT=423, SHARP=424, 
		DOLLAR=425, LR_BRACKET=426, RR_BRACKET=427, COMMA=428, SEMI=429, COLON=430, 
		STAR=431, DIVIDE=432, MODULE=433, PLUS=434, MINUS=435, BIT_NOT=436, BIT_OR=437, 
		BIT_AND=438, BIT_XOR=439;
	public static final int
		RULE_tsqlfile = 0, RULE_batch = 1, RULE_sql_clauses = 2, RULE_sql_clause = 3, 
		RULE_dml_clause = 4, RULE_ddl_clause = 5, RULE_cfl_statement = 6, RULE_another_statement = 7, 
		RULE_delete_statement = 8, RULE_delete_statement_from = 9, RULE_insert_statement = 10, 
		RULE_insert_statement_value = 11, RULE_select_statement = 12, RULE_update_statement = 13, 
		RULE_output_clause = 14, RULE_output_dml_list_elem = 15, RULE_output_column_name = 16, 
		RULE_create_database = 17, RULE_create_index = 18, RULE_create_procedure = 19, 
		RULE_procedure_param = 20, RULE_procedure_option = 21, RULE_create_statistics = 22, 
		RULE_create_table = 23, RULE_create_view = 24, RULE_view_attribute = 25, 
		RULE_alter_table = 26, RULE_alter_database = 27, RULE_database_optionspec = 28, 
		RULE_auto_option = 29, RULE_change_tracking_option = 30, RULE_change_tracking_option_list = 31, 
		RULE_containment_option = 32, RULE_cursor_option = 33, RULE_date_correlation_optimization_option = 34, 
		RULE_db_encryption_option = 35, RULE_db_state_option = 36, RULE_db_update_option = 37, 
		RULE_db_user_access_option = 38, RULE_delayed_durability_option = 39, 
		RULE_external_access_option = 40, RULE_mixed_page_allocation_option = 41, 
		RULE_parameterization_option = 42, RULE_recovery_option = 43, RULE_service_broker_option = 44, 
		RULE_snapshot_option = 45, RULE_sql_option = 46, RULE_target_recovery_time_option = 47, 
		RULE_termination = 48, RULE_drop_index = 49, RULE_drop_procedure = 50, 
		RULE_drop_statistics = 51, RULE_drop_table = 52, RULE_drop_view = 53, 
		RULE_create_type = 54, RULE_drop_type = 55, RULE_rowset_function_limited = 56, 
		RULE_openquery = 57, RULE_opendatasource = 58, RULE_declare_statement = 59, 
		RULE_cursor_statement = 60, RULE_execute_statement = 61, RULE_execute_statement_arg = 62, 
		RULE_execute_var_string = 63, RULE_security_statement = 64, RULE_grant_permission = 65, 
		RULE_set_statement = 66, RULE_transaction_statement = 67, RULE_go_statement = 68, 
		RULE_use_statement = 69, RULE_execute_clause = 70, RULE_declare_local = 71, 
		RULE_table_type_definition = 72, RULE_column_def_table_constraints = 73, 
		RULE_column_def_table_constraint = 74, RULE_column_definition = 75, RULE_column_constraint = 76, 
		RULE_table_constraint = 77, RULE_index_options = 78, RULE_index_option = 79, 
		RULE_declare_cursor = 80, RULE_declare_set_cursor_common = 81, RULE_fetch_cursor = 82, 
		RULE_set_special = 83, RULE_constant_LOCAL_ID = 84, RULE_expression = 85, 
		RULE_constant_expression = 86, RULE_subquery = 87, RULE_with_expression = 88, 
		RULE_common_table_expression = 89, RULE_update_elem = 90, RULE_search_condition_list = 91, 
		RULE_search_condition = 92, RULE_search_condition_and = 93, RULE_search_condition_not = 94, 
		RULE_predicate = 95, RULE_query_expression = 96, RULE_union = 97, RULE_query_specification = 98, 
		RULE_order_by_clause = 99, RULE_for_clause = 100, RULE_xml_common_directives = 101, 
		RULE_order_by_expression = 102, RULE_group_by_item = 103, RULE_option_clause = 104, 
		RULE_option = 105, RULE_optimize_for_arg = 106, RULE_select_list = 107, 
		RULE_select_list_elem = 108, RULE_table_sources = 109, RULE_table_source = 110, 
		RULE_table_source_item_joined = 111, RULE_table_source_item = 112, RULE_change_table = 113, 
		RULE_join_part = 114, RULE_table_name_with_hint = 115, RULE_rowset_function = 116, 
		RULE_bulk_option = 117, RULE_derived_table = 118, RULE_function_call = 119, 
		RULE_switch_section = 120, RULE_switch_search_condition_section = 121, 
		RULE_as_table_alias = 122, RULE_table_alias = 123, RULE_with_table_hints = 124, 
		RULE_insert_with_table_hints = 125, RULE_table_hint = 126, RULE_index_value = 127, 
		RULE_column_alias_list = 128, RULE_column_alias = 129, RULE_table_value_constructor = 130, 
		RULE_expression_list = 131, RULE_ranking_windowed_function = 132, RULE_aggregate_windowed_function = 133, 
		RULE_all_distinct_expression = 134, RULE_over_clause = 135, RULE_row_or_range_clause = 136, 
		RULE_window_frame_extent = 137, RULE_window_frame_bound = 138, RULE_window_frame_preceding = 139, 
		RULE_window_frame_following = 140, RULE_create_database_option = 141, 
		RULE_database_filestream_option = 142, RULE_database_file_spec = 143, 
		RULE_file_group = 144, RULE_file_spec = 145, RULE_full_table_name = 146, 
		RULE_table_name = 147, RULE_simple_name = 148, RULE_func_proc_name = 149, 
		RULE_ddl_object = 150, RULE_full_column_name = 151, RULE_column_name_list = 152, 
		RULE_cursor_name = 153, RULE_on_off = 154, RULE_clustered = 155, RULE_null_notnull = 156, 
		RULE_scalar_function_name = 157, RULE_data_type = 158, RULE_default_value = 159, 
		RULE_constant = 160, RULE_sign = 161, RULE_id = 162, RULE_simple_id = 163, 
		RULE_comparison_operator = 164, RULE_assignment_operator = 165, RULE_file_size = 166;
	public static final String[] ruleNames = {
		"tsqlfile", "batch", "sql_clauses", "sql_clause", "dml_clause", "ddl_clause", 
		"cfl_statement", "another_statement", "delete_statement", "delete_statement_from", 
		"insert_statement", "insert_statement_value", "select_statement", "update_statement", 
		"output_clause", "output_dml_list_elem", "output_column_name", "create_database", 
		"create_index", "create_procedure", "procedure_param", "procedure_option", 
		"create_statistics", "create_table", "create_view", "view_attribute", 
		"alter_table", "alter_database", "database_optionspec", "auto_option", 
		"change_tracking_option", "change_tracking_option_list", "containment_option", 
		"cursor_option", "date_correlation_optimization_option", "db_encryption_option", 
		"db_state_option", "db_update_option", "db_user_access_option", "delayed_durability_option", 
		"external_access_option", "mixed_page_allocation_option", "parameterization_option", 
		"recovery_option", "service_broker_option", "snapshot_option", "sql_option", 
		"target_recovery_time_option", "termination", "drop_index", "drop_procedure", 
		"drop_statistics", "drop_table", "drop_view", "create_type", "drop_type", 
		"rowset_function_limited", "openquery", "opendatasource", "declare_statement", 
		"cursor_statement", "execute_statement", "execute_statement_arg", "execute_var_string", 
		"security_statement", "grant_permission", "set_statement", "transaction_statement", 
		"go_statement", "use_statement", "execute_clause", "declare_local", "table_type_definition", 
		"column_def_table_constraints", "column_def_table_constraint", "column_definition", 
		"column_constraint", "table_constraint", "index_options", "index_option", 
		"declare_cursor", "declare_set_cursor_common", "fetch_cursor", "set_special", 
		"constant_LOCAL_ID", "expression", "constant_expression", "subquery", 
		"with_expression", "common_table_expression", "update_elem", "search_condition_list", 
		"search_condition", "search_condition_and", "search_condition_not", "predicate", 
		"query_expression", "union", "query_specification", "order_by_clause", 
		"for_clause", "xml_common_directives", "order_by_expression", "group_by_item", 
		"option_clause", "option", "optimize_for_arg", "select_list", "select_list_elem", 
		"table_sources", "table_source", "table_source_item_joined", "table_source_item", 
		"change_table", "join_part", "table_name_with_hint", "rowset_function", 
		"bulk_option", "derived_table", "function_call", "switch_section", "switch_search_condition_section", 
		"as_table_alias", "table_alias", "with_table_hints", "insert_with_table_hints", 
		"table_hint", "index_value", "column_alias_list", "column_alias", "table_value_constructor", 
		"expression_list", "ranking_windowed_function", "aggregate_windowed_function", 
		"all_distinct_expression", "over_clause", "row_or_range_clause", "window_frame_extent", 
		"window_frame_bound", "window_frame_preceding", "window_frame_following", 
		"create_database_option", "database_filestream_option", "database_file_spec", 
		"file_group", "file_spec", "full_table_name", "table_name", "simple_name", 
		"func_proc_name", "ddl_object", "full_column_name", "column_name_list", 
		"cursor_name", "on_off", "clustered", "null_notnull", "scalar_function_name", 
		"data_type", "default_value", "constant", "sign", "id", "simple_id", "comparison_operator", 
		"assignment_operator", "file_size"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'='", "'>'", "'<'", "'!'", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'&='", "'^='", "'|='", "'.'", "'_'", "'@'", "'#'", "'$'", "'('", "')'", 
		"','", "';'", "':'", "'*'", "'/'", "'%'", "'+'", "'-'", "'~'", "'|'", 
		"'&'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HADR_options", "ADD", "ALL", "ALTER", "AND", "ANY", "AS", "ASC", 
		"AUTHORIZATION", "BACKUP", "BEGIN", "BETWEEN", "BREAK", "BROWSE", "BULK", 
		"BY", "CASCADE", "CASE", "CHANGETABLE", "CHANGES", "CHECK", "CHECKPOINT", 
		"CLOSE", "CLUSTERED", "COALESCE", "COLLATE", "COLUMN", "COMMIT", "COMPUTE", 
		"CONSTRAINT", "CONTAINMENT", "CONTAINS", "CONTAINSTABLE", "CONTINUE", 
		"CONVERT", "CREATE", "CROSS", "CURRENT", "CURRENT_DATE", "CURRENT_TIME", 
		"CURRENT_TIMESTAMP", "CURRENT_USER", "CURSOR", "DATABASE", "DBCC", "DEALLOCATE", 
		"DECLARE", "DEFAULT", "DELETE", "DENY", "DESC", "DISK", "DISTINCT", "DISTRIBUTED", 
		"DOUBLE", "DROP", "DUMP", "ELSE", "END", "ERRLVL", "ESCAPE", "EXCEPT", 
		"EXECUTE", "EXISTS", "EXIT", "EXTERNAL", "FETCH", "FILE", "FILENAME", 
		"FILLFACTOR", "FOR", "FORCESEEK", "FOREIGN", "FREETEXT", "FREETEXTTABLE", 
		"FROM", "FULL", "FUNCTION", "GOTO", "GRANT", "GROUP", "HAVING", "IDENTITY", 
		"IDENTITYCOL", "IDENTITY_INSERT", "IF", "IN", "INDEX", "INNER", "INSERT", 
		"INTERSECT", "INTO", "IS", "JOIN", "KEY", "KILL", "LEFT", "LIKE", "LINENO", 
		"LOAD", "LOG", "MERGE", "NATIONAL", "NOCHECK", "NONCLUSTERED", "NONE", 
		"NOT", "NULL", "NULLIF", "OF", "OFF", "OFFSETS", "ON", "OPEN", "OPENDATASOURCE", 
		"OPENQUERY", "OPENROWSET", "OPENXML", "OPTION", "OR", "ORDER", "OUTER", 
		"OVER", "PARTIAL", "PERCENT", "PIVOT", "PLAN", "PRECISION", "PRIMARY", 
		"PRINT", "PROC", "PROCEDURE", "PUBLIC", "RAISERROR", "READ", "READTEXT", 
		"RECONFIGURE", "REFERENCES", "REPLICATION", "RESTORE", "RESTRICT", "RETURN", 
		"REVERT", "REVOKE", "RIGHT", "ROLLBACK", "ROWCOUNT", "ROWGUIDCOL", "RULE", 
		"SAVE", "SCHEMA", "SECURITYAUDIT", "SELECT", "SEMANTICKEYPHRASETABLE", 
		"SEMANTICSIMILARITYDETAILSTABLE", "SEMANTICSIMILARITYTABLE", "SESSION_USER", 
		"SET", "SETUSER", "SHUTDOWN", "SOME", "STATISTICS", "SYSTEM_USER", "TABLE", 
		"TABLESAMPLE", "TEXTSIZE", "THEN", "TO", "TOP", "TRAN", "TRANSACTION", 
		"TRIGGER", "TRUNCATE", "TRY_CONVERT", "TSEQUAL", "UNION", "UNIQUE", "UNPIVOT", 
		"UPDATE", "UPDATETEXT", "USE", "USER", "VALUES", "VARYING", "VIEW", "WAITFOR", 
		"WHEN", "WHERE", "WHILE", "WITH", "WITHIN", "WRITETEXT", "ABSOLUTE", "AFTER", 
		"ALLOWED", "ALLOW_SNAPSHOT_ISOLATION", "ANSI_NULLS", "ANSI_NULL_DEFAULT", 
		"ANSI_PADDING", "ANSI_WARNINGS", "APPLY", "ARITHABORT", "AUTO", "AUTO_CLEANUP", 
		"AUTO_CLOSE", "AUTO_CREATE_STATISTICS", "AUTO_SHRINK", "AUTO_UPDATE_STATISTICS", 
		"AUTO_UPDATE_STATISTICS_ASYNC", "AVG", "BASE64", "BINARY_CHECKSUM", "BULK_LOGGED", 
		"CALLER", "CAST", "CATCH", "CHANGE_RETENTION", "CHANGE_TRACKING", "CHECKSUM", 
		"CHECKSUM_AGG", "COMMITTED", "COMPATIBILITY_LEVEL", "CONCAT", "CONCAT_NULL_YIELDS_NULL", 
		"CONTROL", "COOKIE", "COUNT", "COUNT_BIG", "CURSOR_CLOSE_ON_COMMIT", "CURSOR_DEFAULT", 
		"DATEADD", "DATEDIFF", "DATENAME", "DATEPART", "DATE_CORRELATION_OPTIMIZATION", 
		"DAYS", "DB_CHAINING", "DEFAULT_FULLTEXT_LANGUAGE", "DEFAULT_LANGUAGE", 
		"DELAY", "DELAYED_DURABILITY", "DELETED", "DENSE_RANK", "DIRECTORY_NAME", 
		"DISABLE", "DISABLED", "DISABLE_BROKER", "DYNAMIC", "EMERGENCY", "ENABLE_BROKER", 
		"ENCRYPTION", "ERROR_BROKER_CONVERSATIONS", "EXPAND", "FAST", "FAST_FORWARD", 
		"FILEGROUP", "FILEGROWTH", "FILESTREAM", "FIRST", "FOLLOWING", "FORCE", 
		"FORCED", "FORWARD_ONLY", "FULLSCAN", "GB", "GLOBAL", "GO", "GROUPING", 
		"GROUPING_ID", "HADR", "HASH", "HONOR_BROKER_PRIORITY", "HOURS", "IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX", 
		"IMMEDIATE", "IMPERSONATE", "INCREMENTAL", "INSENSITIVE", "INSERTED", 
		"ISOLATION", "KB", "KEEP", "KEEPFIXED", "KEYSET", "LAST", "LEVEL", "LOCAL", 
		"LOCK_ESCALATION", "LOGIN", "LOOP", "MARK", "MAX", "MAXDOP", "MAXRECURSION", 
		"MAXSIZE", "MB", "MEMORY_OPTIMIZED_DATA", "MIN", "MINUTES", "MIN_ACTIVE_ROWVERSION", 
		"MIXED_PAGE_ALLOCATION", "MODIFY", "MULTI_USER", "NAME", "NESTED_TRIGGERS", 
		"NEW_BROKER", "NEXT", "NOCOUNT", "NOEXPAND", "NON_TRANSACTED_ACCESS", 
		"NORECOMPUTE", "NO_WAIT", "NTILE", "NUMBER", "NUMERIC_ROUNDABORT", "OFFLINE", 
		"OFFSET", "ONLINE", "ONLY", "OPTIMISTIC", "OPTIMIZE", "OUT", "OUTPUT", 
		"OWNER", "PAGE_VERIFY", "PARAMETERIZATION", "PARTITION", "PATH", "PRECEDING", 
		"PRIOR", "PRIVILEGES", "QUOTED_IDENTIFIER", "RANGE", "RANK", "READONLY", 
		"READ_COMMITTED_SNAPSHOT", "READ_ONLY", "READ_WRITE", "RECOMPILE", "RECOVERY", 
		"RECURSIVE_TRIGGERS", "RELATIVE", "REMOTE", "REPEATABLE", "RESTRICTED_USER", 
		"ROBUST", "ROOT", "ROW", "ROWGUID", "ROWS", "ROW_NUMBER", "SAMPLE", "SCHEMABINDING", 
		"SCROLL", "SCROLL_LOCKS", "SECONDS", "SELF", "SERIALIZABLE", "SHOWPLAN", 
		"SIMPLE", "SINGLE_USER", "SIZE", "SNAPSHOT", "SPATIAL_WINDOW_MAX_CELLS", 
		"STATIC", "STATS_STREAM", "STDEV", "STDEVP", "SUM", "TAKE", "TARGET_RECOVERY_TIME", 
		"TB", "TEXTIMAGE_ON", "THROW", "TIES", "TIME", "TORN_PAGE_DETECTION", 
		"TRANSFORM_NOISE_WORDS", "TRUSTWORTHY", "TRY", "TWO_DIGIT_YEAR_CUTOFF", 
		"TYPE", "TYPE_WARNING", "UNBOUNDED", "UNCOMMITTED", "UNKNOWN", "UNLIMITED", 
		"USING", "VAR", "VARP", "VIEWS", "VIEW_METADATA", "WORK", "XML", "XMLNAMESPACES", 
		"DOLLAR_ACTION", "SPACE", "COMMENT", "LINE_COMMENT", "DOUBLE_QUOTE_ID", 
		"SQUARE_BRACKET_ID", "LOCAL_ID", "DECIMAL", "ID", "STRING", "BINARY", 
		"FLOAT", "REAL", "EQUAL", "GREATER", "LESS", "EXCLAMATION", "PLUS_ASSIGN", 
		"MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", 
		"XOR_ASSIGN", "OR_ASSIGN", "DOT", "UNDERLINE", "AT", "SHARP", "DOLLAR", 
		"LR_BRACKET", "RR_BRACKET", "COMMA", "SEMI", "COLON", "STAR", "DIVIDE", 
		"MODULE", "PLUS", "MINUS", "BIT_NOT", "BIT_OR", "BIT_AND", "BIT_XOR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Tsql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TsqlfileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TsqlParser.EOF, 0); }
		public List<BatchContext> batch() {
			return getRuleContexts(BatchContext.class);
		}
		public BatchContext batch(int i) {
			return getRuleContext(BatchContext.class,i);
		}
		public TsqlfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsqlfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTsqlfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTsqlfile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTsqlfile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsqlfileContext tsqlfile() throws RecognitionException {
		TsqlfileContext _localctx = new TsqlfileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tsqlfile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CREATE) | (1L << DEALLOCATE) | (1L << DECLARE) | (1L << DELETE) | (1L << DROP) | (1L << EXECUTE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (FETCH - 67)) | (1L << (FORCESEEK - 67)) | (1L << (GOTO - 67)) | (1L << (GRANT - 67)) | (1L << (IF - 67)) | (1L << (INSERT - 67)) | (1L << (OPEN - 67)) | (1L << (PRINT - 67)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (RAISERROR - 134)) | (1L << (RETURN - 134)) | (1L << (REVERT - 134)) | (1L << (ROLLBACK - 134)) | (1L << (SAVE - 134)) | (1L << (SELECT - 134)) | (1L << (SET - 134)) | (1L << (UPDATE - 134)) | (1L << (USE - 134)) | (1L << (WAITFOR - 134)) | (1L << (WHILE - 134)) | (1L << (WITH - 134)) | (1L << (ABSOLUTE - 134)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (APPLY - 201)) | (1L << (AUTO - 201)) | (1L << (AVG - 201)) | (1L << (BASE64 - 201)) | (1L << (CALLER - 201)) | (1L << (CAST - 201)) | (1L << (CATCH - 201)) | (1L << (CHECKSUM_AGG - 201)) | (1L << (COMMITTED - 201)) | (1L << (CONCAT - 201)) | (1L << (CONTROL - 201)) | (1L << (COOKIE - 201)) | (1L << (COUNT - 201)) | (1L << (COUNT_BIG - 201)) | (1L << (DELAY - 201)) | (1L << (DELETED - 201)) | (1L << (DENSE_RANK - 201)) | (1L << (DISABLE - 201)) | (1L << (DYNAMIC - 201)) | (1L << (ENCRYPTION - 201)) | (1L << (EXPAND - 201)) | (1L << (FAST - 201)) | (1L << (FAST_FORWARD - 201)) | (1L << (FIRST - 201)) | (1L << (FOLLOWING - 201)) | (1L << (FORCE - 201)) | (1L << (FORCED - 201)) | (1L << (FORWARD_ONLY - 201)) | (1L << (FULLSCAN - 201)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (GLOBAL - 266)) | (1L << (GO - 266)) | (1L << (GROUPING - 266)) | (1L << (GROUPING_ID - 266)) | (1L << (HASH - 266)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 266)) | (1L << (IMPERSONATE - 266)) | (1L << (INSENSITIVE - 266)) | (1L << (INSERTED - 266)) | (1L << (ISOLATION - 266)) | (1L << (KEEP - 266)) | (1L << (KEEPFIXED - 266)) | (1L << (KEYSET - 266)) | (1L << (LAST - 266)) | (1L << (LEVEL - 266)) | (1L << (LOCAL - 266)) | (1L << (LOCK_ESCALATION - 266)) | (1L << (LOGIN - 266)) | (1L << (LOOP - 266)) | (1L << (MARK - 266)) | (1L << (MAX - 266)) | (1L << (MAXDOP - 266)) | (1L << (MAXRECURSION - 266)) | (1L << (MIN - 266)) | (1L << (MODIFY - 266)) | (1L << (NAME - 266)) | (1L << (NEXT - 266)) | (1L << (NOCOUNT - 266)) | (1L << (NOEXPAND - 266)) | (1L << (NORECOMPUTE - 266)) | (1L << (NTILE - 266)) | (1L << (NUMBER - 266)) | (1L << (OFFSET - 266)) | (1L << (ONLINE - 266)) | (1L << (ONLY - 266)) | (1L << (OPTIMISTIC - 266)) | (1L << (OPTIMIZE - 266)) | (1L << (OUT - 266)) | (1L << (OUTPUT - 266)) | (1L << (OWNER - 266)) | (1L << (PARAMETERIZATION - 266)) | (1L << (PARTITION - 266)) | (1L << (PATH - 266)) | (1L << (PRECEDING - 266)))) != 0) || ((((_la - 330)) & ~0x3f) == 0 && ((1L << (_la - 330)) & ((1L << (PRIOR - 330)) | (1L << (PRIVILEGES - 330)) | (1L << (RANGE - 330)) | (1L << (RANK - 330)) | (1L << (READONLY - 330)) | (1L << (READ_ONLY - 330)) | (1L << (RECOMPILE - 330)) | (1L << (RELATIVE - 330)) | (1L << (REMOTE - 330)) | (1L << (REPEATABLE - 330)) | (1L << (ROBUST - 330)) | (1L << (ROOT - 330)) | (1L << (ROW - 330)) | (1L << (ROWGUID - 330)) | (1L << (ROWS - 330)) | (1L << (ROW_NUMBER - 330)) | (1L << (SAMPLE - 330)) | (1L << (SCHEMABINDING - 330)) | (1L << (SCROLL - 330)) | (1L << (SCROLL_LOCKS - 330)) | (1L << (SELF - 330)) | (1L << (SERIALIZABLE - 330)) | (1L << (SIMPLE - 330)) | (1L << (SNAPSHOT - 330)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 330)) | (1L << (STATIC - 330)) | (1L << (STATS_STREAM - 330)) | (1L << (STDEV - 330)) | (1L << (STDEVP - 330)) | (1L << (SUM - 330)) | (1L << (TEXTIMAGE_ON - 330)) | (1L << (THROW - 330)) | (1L << (TIES - 330)) | (1L << (TIME - 330)) | (1L << (TRY - 330)) | (1L << (TYPE - 330)) | (1L << (TYPE_WARNING - 330)) | (1L << (UNBOUNDED - 330)) | (1L << (UNCOMMITTED - 330)) | (1L << (UNKNOWN - 330)) | (1L << (USING - 330)) | (1L << (VAR - 330)) | (1L << (VARP - 330)) | (1L << (VIEWS - 330)) | (1L << (VIEW_METADATA - 330)) | (1L << (WORK - 330)))) != 0) || ((((_la - 394)) & ~0x3f) == 0 && ((1L << (_la - 394)) & ((1L << (XML - 394)) | (1L << (XMLNAMESPACES - 394)) | (1L << (DOUBLE_QUOTE_ID - 394)) | (1L << (SQUARE_BRACKET_ID - 394)) | (1L << (ID - 394)) | (1L << (LR_BRACKET - 394)))) != 0)) {
				{
				{
				setState(334);
				batch();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BatchContext extends ParserRuleContext {
		public Sql_clausesContext sql_clauses() {
			return getRuleContext(Sql_clausesContext.class,0);
		}
		public Go_statementContext go_statement() {
			return getRuleContext(Go_statementContext.class,0);
		}
		public BatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_batch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterBatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitBatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitBatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BatchContext batch() throws RecognitionException {
		BatchContext _localctx = new BatchContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_batch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			sql_clauses();
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(343);
				go_statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_clausesContext extends ParserRuleContext {
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(TsqlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TsqlParser.SEMI, i);
		}
		public Sql_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSql_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSql_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSql_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_clausesContext sql_clauses() throws RecognitionException {
		Sql_clausesContext _localctx = new Sql_clausesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_clauses);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(346);
					sql_clause();
					setState(348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(347);
						match(SEMI);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(352); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_clauseContext extends ParserRuleContext {
		public Dml_clauseContext dml_clause() {
			return getRuleContext(Dml_clauseContext.class,0);
		}
		public Ddl_clauseContext ddl_clause() {
			return getRuleContext(Ddl_clauseContext.class,0);
		}
		public Cfl_statementContext cfl_statement() {
			return getRuleContext(Cfl_statementContext.class,0);
		}
		public Another_statementContext another_statement() {
			return getRuleContext(Another_statementContext.class,0);
		}
		public Sql_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSql_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSql_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSql_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_clauseContext sql_clause() throws RecognitionException {
		Sql_clauseContext _localctx = new Sql_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_clause);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				dml_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				ddl_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				cfl_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				another_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dml_clauseContext extends ParserRuleContext {
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Dml_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDml_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDml_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDml_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dml_clauseContext dml_clause() throws RecognitionException {
		Dml_clauseContext _localctx = new Dml_clauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dml_clause);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				delete_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				insert_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				select_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				update_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ddl_clauseContext extends ParserRuleContext {
		public Create_databaseContext create_database() {
			return getRuleContext(Create_databaseContext.class,0);
		}
		public Create_indexContext create_index() {
			return getRuleContext(Create_indexContext.class,0);
		}
		public Create_procedureContext create_procedure() {
			return getRuleContext(Create_procedureContext.class,0);
		}
		public Create_statisticsContext create_statistics() {
			return getRuleContext(Create_statisticsContext.class,0);
		}
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Create_typeContext create_type() {
			return getRuleContext(Create_typeContext.class,0);
		}
		public Create_viewContext create_view() {
			return getRuleContext(Create_viewContext.class,0);
		}
		public Alter_tableContext alter_table() {
			return getRuleContext(Alter_tableContext.class,0);
		}
		public Alter_databaseContext alter_database() {
			return getRuleContext(Alter_databaseContext.class,0);
		}
		public Drop_indexContext drop_index() {
			return getRuleContext(Drop_indexContext.class,0);
		}
		public Drop_procedureContext drop_procedure() {
			return getRuleContext(Drop_procedureContext.class,0);
		}
		public Drop_statisticsContext drop_statistics() {
			return getRuleContext(Drop_statisticsContext.class,0);
		}
		public Drop_tableContext drop_table() {
			return getRuleContext(Drop_tableContext.class,0);
		}
		public Drop_typeContext drop_type() {
			return getRuleContext(Drop_typeContext.class,0);
		}
		public Drop_viewContext drop_view() {
			return getRuleContext(Drop_viewContext.class,0);
		}
		public Ddl_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDdl_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDdl_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDdl_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ddl_clauseContext ddl_clause() throws RecognitionException {
		Ddl_clauseContext _localctx = new Ddl_clauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ddl_clause);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				create_database();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				create_index();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				create_procedure();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				create_statistics();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(370);
				create_table();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(371);
				create_type();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(372);
				create_view();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(373);
				alter_table();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(374);
				alter_database();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(375);
				drop_index();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(376);
				drop_procedure();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(377);
				drop_statistics();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(378);
				drop_table();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(379);
				drop_type();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(380);
				drop_view();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cfl_statementContext extends ParserRuleContext {
		public Cfl_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfl_statement; }
	 
		public Cfl_statementContext() { }
		public void copyFrom(Cfl_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Waitfor_statementContext extends Cfl_statementContext {
		public TerminalNode WAITFOR() { return getToken(TsqlParser.WAITFOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELAY() { return getToken(TsqlParser.DELAY, 0); }
		public TerminalNode TIME() { return getToken(TsqlParser.TIME, 0); }
		public Waitfor_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterWaitfor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitWaitfor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitWaitfor_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Print_statementContext extends Cfl_statementContext {
		public TerminalNode PRINT() { return getToken(TsqlParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Print_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitPrint_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitPrint_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Continue_statementContext extends Cfl_statementContext {
		public TerminalNode CONTINUE() { return getToken(TsqlParser.CONTINUE, 0); }
		public Continue_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitContinue_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_statementContext extends Cfl_statementContext {
		public TerminalNode IF() { return getToken(TsqlParser.IF, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public List<Sql_clauseContext> sql_clause() {
			return getRuleContexts(Sql_clauseContext.class);
		}
		public Sql_clauseContext sql_clause(int i) {
			return getRuleContext(Sql_clauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TsqlParser.ELSE, 0); }
		public If_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Raiseerror_statementContext extends Cfl_statementContext {
		public Token msg;
		public Constant_LOCAL_IDContext severity;
		public Constant_LOCAL_IDContext state;
		public TerminalNode RAISERROR() { return getToken(TsqlParser.RAISERROR, 0); }
		public List<Constant_LOCAL_IDContext> constant_LOCAL_ID() {
			return getRuleContexts(Constant_LOCAL_IDContext.class);
		}
		public Constant_LOCAL_IDContext constant_LOCAL_ID(int i) {
			return getRuleContext(Constant_LOCAL_IDContext.class,i);
		}
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(TsqlParser.STRING, 0); }
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public Raiseerror_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterRaiseerror_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitRaiseerror_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitRaiseerror_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Throw_statementContext extends Cfl_statementContext {
		public Token error_number;
		public Token message;
		public Token state;
		public TerminalNode THROW() { return getToken(TsqlParser.THROW, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(TsqlParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(TsqlParser.DECIMAL, i);
		}
		public List<TerminalNode> LOCAL_ID() { return getTokens(TsqlParser.LOCAL_ID); }
		public TerminalNode LOCAL_ID(int i) {
			return getToken(TsqlParser.LOCAL_ID, i);
		}
		public TerminalNode STRING() { return getToken(TsqlParser.STRING, 0); }
		public Throw_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterThrow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitThrow_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitThrow_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Try_catch_statementContext extends Cfl_statementContext {
		public Sql_clausesContext try_clauses;
		public Sql_clausesContext catch_clauses;
		public List<TerminalNode> BEGIN() { return getTokens(TsqlParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(TsqlParser.BEGIN, i);
		}
		public List<TerminalNode> TRY() { return getTokens(TsqlParser.TRY); }
		public TerminalNode TRY(int i) {
			return getToken(TsqlParser.TRY, i);
		}
		public List<TerminalNode> END() { return getTokens(TsqlParser.END); }
		public TerminalNode END(int i) {
			return getToken(TsqlParser.END, i);
		}
		public List<TerminalNode> CATCH() { return getTokens(TsqlParser.CATCH); }
		public TerminalNode CATCH(int i) {
			return getToken(TsqlParser.CATCH, i);
		}
		public List<Sql_clausesContext> sql_clauses() {
			return getRuleContexts(Sql_clausesContext.class);
		}
		public Sql_clausesContext sql_clauses(int i) {
			return getRuleContext(Sql_clausesContext.class,i);
		}
		public Try_catch_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTry_catch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTry_catch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTry_catch_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class While_statementContext extends Cfl_statementContext {
		public TerminalNode WHILE() { return getToken(TsqlParser.WHILE, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public Sql_clauseContext sql_clause() {
			return getRuleContext(Sql_clauseContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(TsqlParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(TsqlParser.CONTINUE, 0); }
		public While_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Block_statementContext extends Cfl_statementContext {
		public TerminalNode BEGIN() { return getToken(TsqlParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(TsqlParser.END, 0); }
		public Sql_clausesContext sql_clauses() {
			return getRuleContext(Sql_clausesContext.class,0);
		}
		public Block_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Break_statementContext extends Cfl_statementContext {
		public TerminalNode BREAK() { return getToken(TsqlParser.BREAK, 0); }
		public Break_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Goto_statementContext extends Cfl_statementContext {
		public TerminalNode GOTO() { return getToken(TsqlParser.GOTO, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Goto_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterGoto_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitGoto_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitGoto_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Return_statementContext extends Cfl_statementContext {
		public TerminalNode RETURN() { return getToken(TsqlParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(Cfl_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cfl_statementContext cfl_statement() throws RecognitionException {
		Cfl_statementContext _localctx = new Cfl_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cfl_statement);
		int _la;
		try {
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new Block_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(BEGIN);
				setState(385);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(384);
					match(SEMI);
					}
				}

				setState(388);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CREATE) | (1L << DEALLOCATE) | (1L << DECLARE) | (1L << DELETE) | (1L << DROP) | (1L << EXECUTE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (FETCH - 67)) | (1L << (FORCESEEK - 67)) | (1L << (GOTO - 67)) | (1L << (GRANT - 67)) | (1L << (IF - 67)) | (1L << (INSERT - 67)) | (1L << (OPEN - 67)) | (1L << (PRINT - 67)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (RAISERROR - 134)) | (1L << (RETURN - 134)) | (1L << (REVERT - 134)) | (1L << (ROLLBACK - 134)) | (1L << (SAVE - 134)) | (1L << (SELECT - 134)) | (1L << (SET - 134)) | (1L << (UPDATE - 134)) | (1L << (USE - 134)) | (1L << (WAITFOR - 134)) | (1L << (WHILE - 134)) | (1L << (WITH - 134)) | (1L << (ABSOLUTE - 134)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (APPLY - 201)) | (1L << (AUTO - 201)) | (1L << (AVG - 201)) | (1L << (BASE64 - 201)) | (1L << (CALLER - 201)) | (1L << (CAST - 201)) | (1L << (CATCH - 201)) | (1L << (CHECKSUM_AGG - 201)) | (1L << (COMMITTED - 201)) | (1L << (CONCAT - 201)) | (1L << (CONTROL - 201)) | (1L << (COOKIE - 201)) | (1L << (COUNT - 201)) | (1L << (COUNT_BIG - 201)) | (1L << (DELAY - 201)) | (1L << (DELETED - 201)) | (1L << (DENSE_RANK - 201)) | (1L << (DISABLE - 201)) | (1L << (DYNAMIC - 201)) | (1L << (ENCRYPTION - 201)) | (1L << (EXPAND - 201)) | (1L << (FAST - 201)) | (1L << (FAST_FORWARD - 201)) | (1L << (FIRST - 201)) | (1L << (FOLLOWING - 201)) | (1L << (FORCE - 201)) | (1L << (FORCED - 201)) | (1L << (FORWARD_ONLY - 201)) | (1L << (FULLSCAN - 201)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (GLOBAL - 266)) | (1L << (GO - 266)) | (1L << (GROUPING - 266)) | (1L << (GROUPING_ID - 266)) | (1L << (HASH - 266)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 266)) | (1L << (IMPERSONATE - 266)) | (1L << (INSENSITIVE - 266)) | (1L << (INSERTED - 266)) | (1L << (ISOLATION - 266)) | (1L << (KEEP - 266)) | (1L << (KEEPFIXED - 266)) | (1L << (KEYSET - 266)) | (1L << (LAST - 266)) | (1L << (LEVEL - 266)) | (1L << (LOCAL - 266)) | (1L << (LOCK_ESCALATION - 266)) | (1L << (LOGIN - 266)) | (1L << (LOOP - 266)) | (1L << (MARK - 266)) | (1L << (MAX - 266)) | (1L << (MAXDOP - 266)) | (1L << (MAXRECURSION - 266)) | (1L << (MIN - 266)) | (1L << (MODIFY - 266)) | (1L << (NAME - 266)) | (1L << (NEXT - 266)) | (1L << (NOCOUNT - 266)) | (1L << (NOEXPAND - 266)) | (1L << (NORECOMPUTE - 266)) | (1L << (NTILE - 266)) | (1L << (NUMBER - 266)) | (1L << (OFFSET - 266)) | (1L << (ONLINE - 266)) | (1L << (ONLY - 266)) | (1L << (OPTIMISTIC - 266)) | (1L << (OPTIMIZE - 266)) | (1L << (OUT - 266)) | (1L << (OUTPUT - 266)) | (1L << (OWNER - 266)) | (1L << (PARAMETERIZATION - 266)) | (1L << (PARTITION - 266)) | (1L << (PATH - 266)) | (1L << (PRECEDING - 266)))) != 0) || ((((_la - 330)) & ~0x3f) == 0 && ((1L << (_la - 330)) & ((1L << (PRIOR - 330)) | (1L << (PRIVILEGES - 330)) | (1L << (RANGE - 330)) | (1L << (RANK - 330)) | (1L << (READONLY - 330)) | (1L << (READ_ONLY - 330)) | (1L << (RECOMPILE - 330)) | (1L << (RELATIVE - 330)) | (1L << (REMOTE - 330)) | (1L << (REPEATABLE - 330)) | (1L << (ROBUST - 330)) | (1L << (ROOT - 330)) | (1L << (ROW - 330)) | (1L << (ROWGUID - 330)) | (1L << (ROWS - 330)) | (1L << (ROW_NUMBER - 330)) | (1L << (SAMPLE - 330)) | (1L << (SCHEMABINDING - 330)) | (1L << (SCROLL - 330)) | (1L << (SCROLL_LOCKS - 330)) | (1L << (SELF - 330)) | (1L << (SERIALIZABLE - 330)) | (1L << (SIMPLE - 330)) | (1L << (SNAPSHOT - 330)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 330)) | (1L << (STATIC - 330)) | (1L << (STATS_STREAM - 330)) | (1L << (STDEV - 330)) | (1L << (STDEVP - 330)) | (1L << (SUM - 330)) | (1L << (TEXTIMAGE_ON - 330)) | (1L << (THROW - 330)) | (1L << (TIES - 330)) | (1L << (TIME - 330)) | (1L << (TRY - 330)) | (1L << (TYPE - 330)) | (1L << (TYPE_WARNING - 330)) | (1L << (UNBOUNDED - 330)) | (1L << (UNCOMMITTED - 330)) | (1L << (UNKNOWN - 330)) | (1L << (USING - 330)) | (1L << (VAR - 330)) | (1L << (VARP - 330)) | (1L << (VIEWS - 330)) | (1L << (VIEW_METADATA - 330)) | (1L << (WORK - 330)))) != 0) || ((((_la - 394)) & ~0x3f) == 0 && ((1L << (_la - 394)) & ((1L << (XML - 394)) | (1L << (XMLNAMESPACES - 394)) | (1L << (DOUBLE_QUOTE_ID - 394)) | (1L << (SQUARE_BRACKET_ID - 394)) | (1L << (ID - 394)) | (1L << (LR_BRACKET - 394)))) != 0)) {
					{
					setState(387);
					sql_clauses();
					}
				}

				setState(390);
				match(END);
				setState(392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(391);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new Break_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(BREAK);
				setState(396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(395);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new Continue_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				match(CONTINUE);
				setState(400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(399);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new Goto_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				match(GOTO);
				setState(403);
				id();
				setState(405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(404);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new Goto_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(407);
				id();
				setState(408);
				match(COLON);
				setState(410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(409);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(412);
				match(IF);
				setState(413);
				search_condition();
				setState(414);
				sql_clause();
				setState(417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(415);
					match(ELSE);
					setState(416);
					sql_clause();
					}
					break;
				}
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(419);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new Return_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(422);
				match(RETURN);
				setState(424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(423);
					expression(0);
					}
					break;
				}
				setState(427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(426);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new Throw_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(429);
				match(THROW);
				setState(435);
				_la = _input.LA(1);
				if (_la==LOCAL_ID || _la==DECIMAL) {
					{
					setState(430);
					((Throw_statementContext)_localctx).error_number = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==LOCAL_ID || _la==DECIMAL) ) {
						((Throw_statementContext)_localctx).error_number = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(431);
					match(COMMA);
					setState(432);
					((Throw_statementContext)_localctx).message = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==LOCAL_ID || _la==STRING) ) {
						((Throw_statementContext)_localctx).message = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(433);
					match(COMMA);
					setState(434);
					((Throw_statementContext)_localctx).state = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==LOCAL_ID || _la==DECIMAL) ) {
						((Throw_statementContext)_localctx).state = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(437);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new Try_catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(440);
				match(BEGIN);
				setState(441);
				match(TRY);
				setState(443);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(442);
					match(SEMI);
					}
				}

				setState(446);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CREATE) | (1L << DEALLOCATE) | (1L << DECLARE) | (1L << DELETE) | (1L << DROP) | (1L << EXECUTE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (FETCH - 67)) | (1L << (FORCESEEK - 67)) | (1L << (GOTO - 67)) | (1L << (GRANT - 67)) | (1L << (IF - 67)) | (1L << (INSERT - 67)) | (1L << (OPEN - 67)) | (1L << (PRINT - 67)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (RAISERROR - 134)) | (1L << (RETURN - 134)) | (1L << (REVERT - 134)) | (1L << (ROLLBACK - 134)) | (1L << (SAVE - 134)) | (1L << (SELECT - 134)) | (1L << (SET - 134)) | (1L << (UPDATE - 134)) | (1L << (USE - 134)) | (1L << (WAITFOR - 134)) | (1L << (WHILE - 134)) | (1L << (WITH - 134)) | (1L << (ABSOLUTE - 134)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (APPLY - 201)) | (1L << (AUTO - 201)) | (1L << (AVG - 201)) | (1L << (BASE64 - 201)) | (1L << (CALLER - 201)) | (1L << (CAST - 201)) | (1L << (CATCH - 201)) | (1L << (CHECKSUM_AGG - 201)) | (1L << (COMMITTED - 201)) | (1L << (CONCAT - 201)) | (1L << (CONTROL - 201)) | (1L << (COOKIE - 201)) | (1L << (COUNT - 201)) | (1L << (COUNT_BIG - 201)) | (1L << (DELAY - 201)) | (1L << (DELETED - 201)) | (1L << (DENSE_RANK - 201)) | (1L << (DISABLE - 201)) | (1L << (DYNAMIC - 201)) | (1L << (ENCRYPTION - 201)) | (1L << (EXPAND - 201)) | (1L << (FAST - 201)) | (1L << (FAST_FORWARD - 201)) | (1L << (FIRST - 201)) | (1L << (FOLLOWING - 201)) | (1L << (FORCE - 201)) | (1L << (FORCED - 201)) | (1L << (FORWARD_ONLY - 201)) | (1L << (FULLSCAN - 201)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (GLOBAL - 266)) | (1L << (GO - 266)) | (1L << (GROUPING - 266)) | (1L << (GROUPING_ID - 266)) | (1L << (HASH - 266)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 266)) | (1L << (IMPERSONATE - 266)) | (1L << (INSENSITIVE - 266)) | (1L << (INSERTED - 266)) | (1L << (ISOLATION - 266)) | (1L << (KEEP - 266)) | (1L << (KEEPFIXED - 266)) | (1L << (KEYSET - 266)) | (1L << (LAST - 266)) | (1L << (LEVEL - 266)) | (1L << (LOCAL - 266)) | (1L << (LOCK_ESCALATION - 266)) | (1L << (LOGIN - 266)) | (1L << (LOOP - 266)) | (1L << (MARK - 266)) | (1L << (MAX - 266)) | (1L << (MAXDOP - 266)) | (1L << (MAXRECURSION - 266)) | (1L << (MIN - 266)) | (1L << (MODIFY - 266)) | (1L << (NAME - 266)) | (1L << (NEXT - 266)) | (1L << (NOCOUNT - 266)) | (1L << (NOEXPAND - 266)) | (1L << (NORECOMPUTE - 266)) | (1L << (NTILE - 266)) | (1L << (NUMBER - 266)) | (1L << (OFFSET - 266)) | (1L << (ONLINE - 266)) | (1L << (ONLY - 266)) | (1L << (OPTIMISTIC - 266)) | (1L << (OPTIMIZE - 266)) | (1L << (OUT - 266)) | (1L << (OUTPUT - 266)) | (1L << (OWNER - 266)) | (1L << (PARAMETERIZATION - 266)) | (1L << (PARTITION - 266)) | (1L << (PATH - 266)) | (1L << (PRECEDING - 266)))) != 0) || ((((_la - 330)) & ~0x3f) == 0 && ((1L << (_la - 330)) & ((1L << (PRIOR - 330)) | (1L << (PRIVILEGES - 330)) | (1L << (RANGE - 330)) | (1L << (RANK - 330)) | (1L << (READONLY - 330)) | (1L << (READ_ONLY - 330)) | (1L << (RECOMPILE - 330)) | (1L << (RELATIVE - 330)) | (1L << (REMOTE - 330)) | (1L << (REPEATABLE - 330)) | (1L << (ROBUST - 330)) | (1L << (ROOT - 330)) | (1L << (ROW - 330)) | (1L << (ROWGUID - 330)) | (1L << (ROWS - 330)) | (1L << (ROW_NUMBER - 330)) | (1L << (SAMPLE - 330)) | (1L << (SCHEMABINDING - 330)) | (1L << (SCROLL - 330)) | (1L << (SCROLL_LOCKS - 330)) | (1L << (SELF - 330)) | (1L << (SERIALIZABLE - 330)) | (1L << (SIMPLE - 330)) | (1L << (SNAPSHOT - 330)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 330)) | (1L << (STATIC - 330)) | (1L << (STATS_STREAM - 330)) | (1L << (STDEV - 330)) | (1L << (STDEVP - 330)) | (1L << (SUM - 330)) | (1L << (TEXTIMAGE_ON - 330)) | (1L << (THROW - 330)) | (1L << (TIES - 330)) | (1L << (TIME - 330)) | (1L << (TRY - 330)) | (1L << (TYPE - 330)) | (1L << (TYPE_WARNING - 330)) | (1L << (UNBOUNDED - 330)) | (1L << (UNCOMMITTED - 330)) | (1L << (UNKNOWN - 330)) | (1L << (USING - 330)) | (1L << (VAR - 330)) | (1L << (VARP - 330)) | (1L << (VIEWS - 330)) | (1L << (VIEW_METADATA - 330)) | (1L << (WORK - 330)))) != 0) || ((((_la - 394)) & ~0x3f) == 0 && ((1L << (_la - 394)) & ((1L << (XML - 394)) | (1L << (XMLNAMESPACES - 394)) | (1L << (DOUBLE_QUOTE_ID - 394)) | (1L << (SQUARE_BRACKET_ID - 394)) | (1L << (ID - 394)) | (1L << (LR_BRACKET - 394)))) != 0)) {
					{
					setState(445);
					((Try_catch_statementContext)_localctx).try_clauses = sql_clauses();
					}
				}

				setState(448);
				match(END);
				setState(449);
				match(TRY);
				setState(451);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(450);
					match(SEMI);
					}
				}

				setState(453);
				match(BEGIN);
				setState(454);
				match(CATCH);
				setState(456);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(455);
					match(SEMI);
					}
				}

				setState(459);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << BEGIN) | (1L << BREAK) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONTINUE) | (1L << CREATE) | (1L << DEALLOCATE) | (1L << DECLARE) | (1L << DELETE) | (1L << DROP) | (1L << EXECUTE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (FETCH - 67)) | (1L << (FORCESEEK - 67)) | (1L << (GOTO - 67)) | (1L << (GRANT - 67)) | (1L << (IF - 67)) | (1L << (INSERT - 67)) | (1L << (OPEN - 67)) | (1L << (PRINT - 67)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (RAISERROR - 134)) | (1L << (RETURN - 134)) | (1L << (REVERT - 134)) | (1L << (ROLLBACK - 134)) | (1L << (SAVE - 134)) | (1L << (SELECT - 134)) | (1L << (SET - 134)) | (1L << (UPDATE - 134)) | (1L << (USE - 134)) | (1L << (WAITFOR - 134)) | (1L << (WHILE - 134)) | (1L << (WITH - 134)) | (1L << (ABSOLUTE - 134)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (APPLY - 201)) | (1L << (AUTO - 201)) | (1L << (AVG - 201)) | (1L << (BASE64 - 201)) | (1L << (CALLER - 201)) | (1L << (CAST - 201)) | (1L << (CATCH - 201)) | (1L << (CHECKSUM_AGG - 201)) | (1L << (COMMITTED - 201)) | (1L << (CONCAT - 201)) | (1L << (CONTROL - 201)) | (1L << (COOKIE - 201)) | (1L << (COUNT - 201)) | (1L << (COUNT_BIG - 201)) | (1L << (DELAY - 201)) | (1L << (DELETED - 201)) | (1L << (DENSE_RANK - 201)) | (1L << (DISABLE - 201)) | (1L << (DYNAMIC - 201)) | (1L << (ENCRYPTION - 201)) | (1L << (EXPAND - 201)) | (1L << (FAST - 201)) | (1L << (FAST_FORWARD - 201)) | (1L << (FIRST - 201)) | (1L << (FOLLOWING - 201)) | (1L << (FORCE - 201)) | (1L << (FORCED - 201)) | (1L << (FORWARD_ONLY - 201)) | (1L << (FULLSCAN - 201)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (GLOBAL - 266)) | (1L << (GO - 266)) | (1L << (GROUPING - 266)) | (1L << (GROUPING_ID - 266)) | (1L << (HASH - 266)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 266)) | (1L << (IMPERSONATE - 266)) | (1L << (INSENSITIVE - 266)) | (1L << (INSERTED - 266)) | (1L << (ISOLATION - 266)) | (1L << (KEEP - 266)) | (1L << (KEEPFIXED - 266)) | (1L << (KEYSET - 266)) | (1L << (LAST - 266)) | (1L << (LEVEL - 266)) | (1L << (LOCAL - 266)) | (1L << (LOCK_ESCALATION - 266)) | (1L << (LOGIN - 266)) | (1L << (LOOP - 266)) | (1L << (MARK - 266)) | (1L << (MAX - 266)) | (1L << (MAXDOP - 266)) | (1L << (MAXRECURSION - 266)) | (1L << (MIN - 266)) | (1L << (MODIFY - 266)) | (1L << (NAME - 266)) | (1L << (NEXT - 266)) | (1L << (NOCOUNT - 266)) | (1L << (NOEXPAND - 266)) | (1L << (NORECOMPUTE - 266)) | (1L << (NTILE - 266)) | (1L << (NUMBER - 266)) | (1L << (OFFSET - 266)) | (1L << (ONLINE - 266)) | (1L << (ONLY - 266)) | (1L << (OPTIMISTIC - 266)) | (1L << (OPTIMIZE - 266)) | (1L << (OUT - 266)) | (1L << (OUTPUT - 266)) | (1L << (OWNER - 266)) | (1L << (PARAMETERIZATION - 266)) | (1L << (PARTITION - 266)) | (1L << (PATH - 266)) | (1L << (PRECEDING - 266)))) != 0) || ((((_la - 330)) & ~0x3f) == 0 && ((1L << (_la - 330)) & ((1L << (PRIOR - 330)) | (1L << (PRIVILEGES - 330)) | (1L << (RANGE - 330)) | (1L << (RANK - 330)) | (1L << (READONLY - 330)) | (1L << (READ_ONLY - 330)) | (1L << (RECOMPILE - 330)) | (1L << (RELATIVE - 330)) | (1L << (REMOTE - 330)) | (1L << (REPEATABLE - 330)) | (1L << (ROBUST - 330)) | (1L << (ROOT - 330)) | (1L << (ROW - 330)) | (1L << (ROWGUID - 330)) | (1L << (ROWS - 330)) | (1L << (ROW_NUMBER - 330)) | (1L << (SAMPLE - 330)) | (1L << (SCHEMABINDING - 330)) | (1L << (SCROLL - 330)) | (1L << (SCROLL_LOCKS - 330)) | (1L << (SELF - 330)) | (1L << (SERIALIZABLE - 330)) | (1L << (SIMPLE - 330)) | (1L << (SNAPSHOT - 330)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 330)) | (1L << (STATIC - 330)) | (1L << (STATS_STREAM - 330)) | (1L << (STDEV - 330)) | (1L << (STDEVP - 330)) | (1L << (SUM - 330)) | (1L << (TEXTIMAGE_ON - 330)) | (1L << (THROW - 330)) | (1L << (TIES - 330)) | (1L << (TIME - 330)) | (1L << (TRY - 330)) | (1L << (TYPE - 330)) | (1L << (TYPE_WARNING - 330)) | (1L << (UNBOUNDED - 330)) | (1L << (UNCOMMITTED - 330)) | (1L << (UNKNOWN - 330)) | (1L << (USING - 330)) | (1L << (VAR - 330)) | (1L << (VARP - 330)) | (1L << (VIEWS - 330)) | (1L << (VIEW_METADATA - 330)) | (1L << (WORK - 330)))) != 0) || ((((_la - 394)) & ~0x3f) == 0 && ((1L << (_la - 394)) & ((1L << (XML - 394)) | (1L << (XMLNAMESPACES - 394)) | (1L << (DOUBLE_QUOTE_ID - 394)) | (1L << (SQUARE_BRACKET_ID - 394)) | (1L << (ID - 394)) | (1L << (LR_BRACKET - 394)))) != 0)) {
					{
					setState(458);
					((Try_catch_statementContext)_localctx).catch_clauses = sql_clauses();
					}
				}

				setState(461);
				match(END);
				setState(462);
				match(CATCH);
				setState(464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(463);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new Waitfor_statementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(466);
				match(WAITFOR);
				setState(467);
				_la = _input.LA(1);
				if ( !(_la==DELAY || _la==TIME) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(468);
				expression(0);
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(469);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(472);
				match(WHILE);
				setState(473);
				search_condition();
				setState(483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(474);
					sql_clause();
					}
					break;
				case 2:
					{
					setState(475);
					match(BREAK);
					setState(477);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(476);
						match(SEMI);
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(479);
					match(CONTINUE);
					setState(481);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(480);
						match(SEMI);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 12:
				_localctx = new Print_statementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(485);
				match(PRINT);
				setState(486);
				expression(0);
				setState(488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(487);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new Raiseerror_statementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(490);
				match(RAISERROR);
				setState(491);
				match(LR_BRACKET);
				setState(492);
				((Raiseerror_statementContext)_localctx).msg = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 402)) & ~0x3f) == 0 && ((1L << (_la - 402)) & ((1L << (LOCAL_ID - 402)) | (1L << (DECIMAL - 402)) | (1L << (STRING - 402)))) != 0)) ) {
					((Raiseerror_statementContext)_localctx).msg = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(493);
				match(COMMA);
				setState(494);
				((Raiseerror_statementContext)_localctx).severity = constant_LOCAL_ID();
				setState(495);
				match(COMMA);
				setState(496);
				((Raiseerror_statementContext)_localctx).state = constant_LOCAL_ID();
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(497);
					match(COMMA);
					setState(498);
					constant_LOCAL_ID();
					}
					}
					setState(503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(504);
				match(RR_BRACKET);
				setState(506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(505);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Another_statementContext extends ParserRuleContext {
		public Declare_statementContext declare_statement() {
			return getRuleContext(Declare_statementContext.class,0);
		}
		public Cursor_statementContext cursor_statement() {
			return getRuleContext(Cursor_statementContext.class,0);
		}
		public Execute_statementContext execute_statement() {
			return getRuleContext(Execute_statementContext.class,0);
		}
		public Security_statementContext security_statement() {
			return getRuleContext(Security_statementContext.class,0);
		}
		public Set_statementContext set_statement() {
			return getRuleContext(Set_statementContext.class,0);
		}
		public Transaction_statementContext transaction_statement() {
			return getRuleContext(Transaction_statementContext.class,0);
		}
		public Use_statementContext use_statement() {
			return getRuleContext(Use_statementContext.class,0);
		}
		public Another_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_another_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterAnother_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitAnother_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitAnother_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Another_statementContext another_statement() throws RecognitionException {
		Another_statementContext _localctx = new Another_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_another_statement);
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				declare_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				cursor_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(512);
				execute_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(513);
				security_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(514);
				set_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(515);
				transaction_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(516);
				use_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_statementContext extends ParserRuleContext {
		public Token cursor_var;
		public TerminalNode DELETE() { return getToken(TsqlParser.DELETE, 0); }
		public Delete_statement_fromContext delete_statement_from() {
			return getRuleContext(Delete_statement_fromContext.class,0);
		}
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public TerminalNode TOP() { return getToken(TsqlParser.TOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(TsqlParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(TsqlParser.FROM, i);
		}
		public Insert_with_table_hintsContext insert_with_table_hints() {
			return getRuleContext(Insert_with_table_hintsContext.class,0);
		}
		public Output_clauseContext output_clause() {
			return getRuleContext(Output_clauseContext.class,0);
		}
		public Table_sourcesContext table_sources() {
			return getRuleContext(Table_sourcesContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(TsqlParser.WHERE, 0); }
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(TsqlParser.CURRENT, 0); }
		public TerminalNode OF() { return getToken(TsqlParser.OF, 0); }
		public TerminalNode PERCENT() { return getToken(TsqlParser.PERCENT, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public TerminalNode GLOBAL() { return getToken(TsqlParser.GLOBAL, 0); }
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDelete_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDelete_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDelete_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(519);
				with_expression();
				}
			}

			setState(522);
			match(DELETE);
			setState(530);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(523);
				match(TOP);
				setState(524);
				match(LR_BRACKET);
				setState(525);
				expression(0);
				setState(526);
				match(RR_BRACKET);
				setState(528);
				_la = _input.LA(1);
				if (_la==PERCENT) {
					{
					setState(527);
					match(PERCENT);
					}
				}

				}
			}

			setState(533);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(532);
				match(FROM);
				}
			}

			setState(535);
			delete_statement_from();
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(536);
				insert_with_table_hints();
				}
				break;
			}
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(539);
				output_clause();
				}
				break;
			}
			setState(544);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(542);
				match(FROM);
				setState(543);
				table_sources();
				}
			}

			setState(559);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(546);
				match(WHERE);
				setState(557);
				switch (_input.LA(1)) {
				case CASE:
				case COALESCE:
				case CONVERT:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DEFAULT:
				case EXISTS:
				case FORCESEEK:
				case IDENTITY:
				case LEFT:
				case NOT:
				case NULL:
				case NULLIF:
				case OVER:
				case RIGHT:
				case SESSION_USER:
				case SYSTEM_USER:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case BINARY_CHECKSUM:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATEADD:
				case DATEDIFF:
				case DATENAME:
				case DATEPART:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MIN_ACTIVE_ROWVERSION:
				case MODIFY:
				case NAME:
				case NEXT:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case LOCAL_ID:
				case DECIMAL:
				case ID:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case LR_BRACKET:
				case PLUS:
				case MINUS:
				case BIT_NOT:
					{
					setState(547);
					search_condition();
					}
					break;
				case CURRENT:
					{
					setState(548);
					match(CURRENT);
					setState(549);
					match(OF);
					setState(555);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(551);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(550);
							match(GLOBAL);
							}
							break;
						}
						setState(553);
						cursor_name();
						}
						break;
					case 2:
						{
						setState(554);
						((Delete_statementContext)_localctx).cursor_var = match(LOCAL_ID);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(562);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(561);
				for_clause();
				}
			}

			setState(565);
			_la = _input.LA(1);
			if (_la==OPTION) {
				{
				setState(564);
				option_clause();
				}
			}

			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(567);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_statement_fromContext extends ParserRuleContext {
		public Token table_var;
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Ddl_objectContext ddl_object() {
			return getRuleContext(Ddl_objectContext.class,0);
		}
		public Rowset_function_limitedContext rowset_function_limited() {
			return getRuleContext(Rowset_function_limitedContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public Delete_statement_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDelete_statement_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDelete_statement_from(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDelete_statement_from(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_statement_fromContext delete_statement_from() throws RecognitionException {
		Delete_statement_fromContext _localctx = new Delete_statement_fromContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_delete_statement_from);
		try {
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				table_alias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				ddl_object();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				rowset_function_limited();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(573);
				((Delete_statement_fromContext)_localctx).table_var = match(LOCAL_ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(TsqlParser.INSERT, 0); }
		public Insert_statement_valueContext insert_statement_value() {
			return getRuleContext(Insert_statement_valueContext.class,0);
		}
		public Ddl_objectContext ddl_object() {
			return getRuleContext(Ddl_objectContext.class,0);
		}
		public Rowset_function_limitedContext rowset_function_limited() {
			return getRuleContext(Rowset_function_limitedContext.class,0);
		}
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public TerminalNode TOP() { return getToken(TsqlParser.TOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INTO() { return getToken(TsqlParser.INTO, 0); }
		public Insert_with_table_hintsContext insert_with_table_hints() {
			return getRuleContext(Insert_with_table_hintsContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Output_clauseContext output_clause() {
			return getRuleContext(Output_clauseContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public TerminalNode PERCENT() { return getToken(TsqlParser.PERCENT, 0); }
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitInsert_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitInsert_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(576);
				with_expression();
				}
			}

			setState(579);
			match(INSERT);
			setState(587);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(580);
				match(TOP);
				setState(581);
				match(LR_BRACKET);
				setState(582);
				expression(0);
				setState(583);
				match(RR_BRACKET);
				setState(585);
				_la = _input.LA(1);
				if (_la==PERCENT) {
					{
					setState(584);
					match(PERCENT);
					}
				}

				}
			}

			setState(590);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(589);
				match(INTO);
				}
			}

			setState(594);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case LOCAL_ID:
			case ID:
				{
				setState(592);
				ddl_object();
				}
				break;
			case OPENDATASOURCE:
			case OPENQUERY:
				{
				setState(593);
				rowset_function_limited();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(596);
				insert_with_table_hints();
				}
				break;
			}
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(599);
				match(LR_BRACKET);
				setState(600);
				column_name_list();
				setState(601);
				match(RR_BRACKET);
				}
				break;
			}
			setState(606);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(605);
				output_clause();
				}
			}

			setState(608);
			insert_statement_value();
			setState(610);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(609);
				for_clause();
				}
			}

			setState(613);
			_la = _input.LA(1);
			if (_la==OPTION) {
				{
				setState(612);
				option_clause();
				}
			}

			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(615);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statement_valueContext extends ParserRuleContext {
		public Table_value_constructorContext table_value_constructor() {
			return getRuleContext(Table_value_constructorContext.class,0);
		}
		public Derived_tableContext derived_table() {
			return getRuleContext(Derived_tableContext.class,0);
		}
		public Execute_statementContext execute_statement() {
			return getRuleContext(Execute_statementContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(TsqlParser.DEFAULT, 0); }
		public TerminalNode VALUES() { return getToken(TsqlParser.VALUES, 0); }
		public Insert_statement_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterInsert_statement_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitInsert_statement_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitInsert_statement_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statement_valueContext insert_statement_value() throws RecognitionException {
		Insert_statement_valueContext _localctx = new Insert_statement_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_insert_statement_value);
		try {
			setState(623);
			switch (_input.LA(1)) {
			case VALUES:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				table_value_constructor();
				}
				break;
			case SELECT:
			case WITH:
			case LR_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				derived_table();
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(620);
				execute_statement();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(621);
				match(DEFAULT);
				setState(622);
				match(VALUES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSelect_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(625);
				with_expression();
				}
			}

			setState(628);
			query_expression();
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(629);
				order_by_clause();
				}
				break;
			}
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(632);
				for_clause();
				}
				break;
			}
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(635);
				option_clause();
				}
				break;
			}
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(638);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_statementContext extends ParserRuleContext {
		public Token cursor_var;
		public TerminalNode UPDATE() { return getToken(TsqlParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(TsqlParser.SET, 0); }
		public List<Update_elemContext> update_elem() {
			return getRuleContexts(Update_elemContext.class);
		}
		public Update_elemContext update_elem(int i) {
			return getRuleContext(Update_elemContext.class,i);
		}
		public Ddl_objectContext ddl_object() {
			return getRuleContext(Ddl_objectContext.class,0);
		}
		public Rowset_function_limitedContext rowset_function_limited() {
			return getRuleContext(Rowset_function_limitedContext.class,0);
		}
		public With_expressionContext with_expression() {
			return getRuleContext(With_expressionContext.class,0);
		}
		public TerminalNode TOP() { return getToken(TsqlParser.TOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public Output_clauseContext output_clause() {
			return getRuleContext(Output_clauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TsqlParser.FROM, 0); }
		public Table_sourcesContext table_sources() {
			return getRuleContext(Table_sourcesContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(TsqlParser.WHERE, 0); }
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Option_clauseContext option_clause() {
			return getRuleContext(Option_clauseContext.class,0);
		}
		public Search_condition_listContext search_condition_list() {
			return getRuleContext(Search_condition_listContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(TsqlParser.CURRENT, 0); }
		public TerminalNode OF() { return getToken(TsqlParser.OF, 0); }
		public TerminalNode PERCENT() { return getToken(TsqlParser.PERCENT, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public TerminalNode GLOBAL() { return getToken(TsqlParser.GLOBAL, 0); }
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitUpdate_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitUpdate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(641);
				with_expression();
				}
			}

			setState(644);
			match(UPDATE);
			setState(652);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(645);
				match(TOP);
				setState(646);
				match(LR_BRACKET);
				setState(647);
				expression(0);
				setState(648);
				match(RR_BRACKET);
				setState(650);
				_la = _input.LA(1);
				if (_la==PERCENT) {
					{
					setState(649);
					match(PERCENT);
					}
				}

				}
			}

			setState(656);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case LOCAL_ID:
			case ID:
				{
				setState(654);
				ddl_object();
				}
				break;
			case OPENDATASOURCE:
			case OPENQUERY:
				{
				setState(655);
				rowset_function_limited();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(659);
			_la = _input.LA(1);
			if (_la==WITH || _la==LR_BRACKET) {
				{
				setState(658);
				with_table_hints();
				}
			}

			setState(661);
			match(SET);
			setState(662);
			update_elem();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(663);
				match(COMMA);
				setState(664);
				update_elem();
				}
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(670);
				output_clause();
				}
				break;
			}
			setState(675);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(673);
				match(FROM);
				setState(674);
				table_sources();
				}
			}

			setState(690);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(677);
				match(WHERE);
				setState(688);
				switch (_input.LA(1)) {
				case CASE:
				case COALESCE:
				case CONVERT:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DEFAULT:
				case EXISTS:
				case FORCESEEK:
				case IDENTITY:
				case LEFT:
				case NOT:
				case NULL:
				case NULLIF:
				case OVER:
				case RIGHT:
				case SESSION_USER:
				case SYSTEM_USER:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case BINARY_CHECKSUM:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATEADD:
				case DATEDIFF:
				case DATENAME:
				case DATEPART:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MIN_ACTIVE_ROWVERSION:
				case MODIFY:
				case NAME:
				case NEXT:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case LOCAL_ID:
				case DECIMAL:
				case ID:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case LR_BRACKET:
				case PLUS:
				case MINUS:
				case BIT_NOT:
					{
					setState(678);
					search_condition_list();
					}
					break;
				case CURRENT:
					{
					setState(679);
					match(CURRENT);
					setState(680);
					match(OF);
					setState(686);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						setState(682);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
						case 1:
							{
							setState(681);
							match(GLOBAL);
							}
							break;
						}
						setState(684);
						cursor_name();
						}
						break;
					case 2:
						{
						setState(685);
						((Update_statementContext)_localctx).cursor_var = match(LOCAL_ID);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(693);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(692);
				for_clause();
				}
			}

			setState(696);
			_la = _input.LA(1);
			if (_la==OPTION) {
				{
				setState(695);
				option_clause();
				}
			}

			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(698);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_clauseContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(TsqlParser.OUTPUT, 0); }
		public List<Output_dml_list_elemContext> output_dml_list_elem() {
			return getRuleContexts(Output_dml_list_elemContext.class);
		}
		public Output_dml_list_elemContext output_dml_list_elem(int i) {
			return getRuleContext(Output_dml_list_elemContext.class,i);
		}
		public TerminalNode INTO() { return getToken(TsqlParser.INTO, 0); }
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Output_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterOutput_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitOutput_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitOutput_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_clauseContext output_clause() throws RecognitionException {
		Output_clauseContext _localctx = new Output_clauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_output_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(OUTPUT);
			setState(702);
			output_dml_list_elem();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(703);
				match(COMMA);
				setState(704);
				output_dml_list_elem();
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(721);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(710);
				match(INTO);
				setState(713);
				switch (_input.LA(1)) {
				case LOCAL_ID:
					{
					setState(711);
					match(LOCAL_ID);
					}
					break;
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NEXT:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(712);
					table_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(715);
					match(LR_BRACKET);
					setState(716);
					column_name_list();
					setState(717);
					match(RR_BRACKET);
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_dml_list_elemContext extends ParserRuleContext {
		public Output_column_nameContext output_column_name() {
			return getRuleContext(Output_column_nameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(TsqlParser.AS, 0); }
		public Output_dml_list_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_dml_list_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterOutput_dml_list_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitOutput_dml_list_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitOutput_dml_list_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_dml_list_elemContext output_dml_list_elem() throws RecognitionException {
		Output_dml_list_elemContext _localctx = new Output_dml_list_elemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_output_dml_list_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(723);
				output_column_name();
				}
				break;
			case 2:
				{
				setState(724);
				expression(0);
				}
				break;
			}
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(728);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(727);
					match(AS);
					}
				}

				setState(730);
				column_alias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_column_nameContext extends ParserRuleContext {
		public TerminalNode DELETED() { return getToken(TsqlParser.DELETED, 0); }
		public TerminalNode INSERTED() { return getToken(TsqlParser.INSERTED, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DOLLAR_ACTION() { return getToken(TsqlParser.DOLLAR_ACTION, 0); }
		public Output_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterOutput_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitOutput_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitOutput_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_column_nameContext output_column_name() throws RecognitionException {
		Output_column_nameContext _localctx = new Output_column_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_output_column_name);
		try {
			setState(744);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(733);
					match(DELETED);
					}
					break;
				case 2:
					{
					setState(734);
					match(INSERTED);
					}
					break;
				case 3:
					{
					setState(735);
					table_name();
					}
					break;
				}
				setState(738);
				match(DOT);
				setState(741);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(739);
					match(STAR);
					}
					break;
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NEXT:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(740);
					id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DOLLAR_ACTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				match(DOLLAR_ACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_databaseContext extends ParserRuleContext {
		public IdContext database;
		public IdContext collation_name;
		public TerminalNode CREATE() { return getToken(TsqlParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(TsqlParser.DATABASE, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode CONTAINMENT() { return getToken(TsqlParser.CONTAINMENT, 0); }
		public List<TerminalNode> ON() { return getTokens(TsqlParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(TsqlParser.ON, i);
		}
		public List<Database_file_specContext> database_file_spec() {
			return getRuleContexts(Database_file_specContext.class);
		}
		public Database_file_specContext database_file_spec(int i) {
			return getRuleContext(Database_file_specContext.class,i);
		}
		public TerminalNode LOG() { return getToken(TsqlParser.LOG, 0); }
		public TerminalNode COLLATE() { return getToken(TsqlParser.COLLATE, 0); }
		public TerminalNode WITH() { return getToken(TsqlParser.WITH, 0); }
		public List<Create_database_optionContext> create_database_option() {
			return getRuleContexts(Create_database_optionContext.class);
		}
		public Create_database_optionContext create_database_option(int i) {
			return getRuleContext(Create_database_optionContext.class,i);
		}
		public TerminalNode NONE() { return getToken(TsqlParser.NONE, 0); }
		public TerminalNode PARTIAL() { return getToken(TsqlParser.PARTIAL, 0); }
		public TerminalNode PRIMARY() { return getToken(TsqlParser.PRIMARY, 0); }
		public Create_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterCreate_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitCreate_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitCreate_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_databaseContext create_database() throws RecognitionException {
		Create_databaseContext _localctx = new Create_databaseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_create_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(CREATE);
			setState(747);
			match(DATABASE);
			{
			setState(748);
			((Create_databaseContext)_localctx).database = id();
			}
			setState(752);
			_la = _input.LA(1);
			if (_la==CONTAINMENT) {
				{
				setState(749);
				match(CONTAINMENT);
				setState(750);
				match(EQUAL);
				setState(751);
				_la = _input.LA(1);
				if ( !(_la==NONE || _la==PARTIAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(766);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(754);
				match(ON);
				setState(756);
				_la = _input.LA(1);
				if (_la==PRIMARY) {
					{
					setState(755);
					match(PRIMARY);
					}
				}

				setState(758);
				database_file_spec();
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(759);
					match(COMMA);
					setState(760);
					database_file_spec();
					}
					}
					setState(765);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(778);
			_la = _input.LA(1);
			if (_la==LOG) {
				{
				setState(768);
				match(LOG);
				setState(769);
				match(ON);
				setState(770);
				database_file_spec();
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(771);
					match(COMMA);
					setState(772);
					database_file_spec();
					}
					}
					setState(777);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(782);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(780);
				match(COLLATE);
				setState(781);
				((Create_databaseContext)_localctx).collation_name = id();
				}
			}

			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(784);
				match(WITH);
				setState(785);
				create_database_option();
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(786);
					match(COMMA);
					setState(787);
					create_database_option();
					}
					}
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_indexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(TsqlParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(TsqlParser.INDEX, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> ON() { return getTokens(TsqlParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(TsqlParser.ON, i);
		}
		public Table_name_with_hintContext table_name_with_hint() {
			return getRuleContext(Table_name_with_hintContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(TsqlParser.UNIQUE, 0); }
		public ClusteredContext clustered() {
			return getRuleContext(ClusteredContext.class,0);
		}
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode ASC() { return getToken(TsqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(TsqlParser.DESC, 0); }
		public Create_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterCreate_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitCreate_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitCreate_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_indexContext create_index() throws RecognitionException {
		Create_indexContext _localctx = new Create_indexContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_create_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(CREATE);
			setState(797);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(796);
				match(UNIQUE);
				}
			}

			setState(800);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(799);
				clustered();
				}
			}

			setState(802);
			match(INDEX);
			setState(803);
			id();
			setState(804);
			match(ON);
			setState(805);
			table_name_with_hint();
			setState(806);
			match(LR_BRACKET);
			setState(807);
			column_name_list();
			setState(809);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(808);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(811);
			match(RR_BRACKET);
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(812);
				index_options();
				}
				break;
			}
			setState(817);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(815);
				match(ON);
				setState(816);
				id();
				}
			}

			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(819);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_procedureContext extends ParserRuleContext {
		public Token proc;
		public TerminalNode CREATE() { return getToken(TsqlParser.CREATE, 0); }
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(TsqlParser.AS, 0); }
		public Sql_clausesContext sql_clauses() {
			return getRuleContext(Sql_clausesContext.class,0);
		}
		public TerminalNode PROC() { return getToken(TsqlParser.PROC, 0); }
		public TerminalNode PROCEDURE() { return getToken(TsqlParser.PROCEDURE, 0); }
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public List<Procedure_paramContext> procedure_param() {
			return getRuleContexts(Procedure_paramContext.class);
		}
		public Procedure_paramContext procedure_param(int i) {
			return getRuleContext(Procedure_paramContext.class,i);
		}
		public TerminalNode WITH() { return getToken(TsqlParser.WITH, 0); }
		public List<Procedure_optionContext> procedure_option() {
			return getRuleContexts(Procedure_optionContext.class);
		}
		public Procedure_optionContext procedure_option(int i) {
			return getRuleContext(Procedure_optionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(TsqlParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(TsqlParser.REPLICATION, 0); }
		public Create_procedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterCreate_procedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitCreate_procedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitCreate_procedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_procedureContext create_procedure() throws RecognitionException {
		Create_procedureContext _localctx = new Create_procedureContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_create_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(CREATE);
			setState(823);
			((Create_procedureContext)_localctx).proc = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==PROC || _la==PROCEDURE) ) {
				((Create_procedureContext)_localctx).proc = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(824);
			func_proc_name();
			setState(827);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(825);
				match(SEMI);
				setState(826);
				match(DECIMAL);
				}
			}

			setState(843);
			_la = _input.LA(1);
			if (_la==LOCAL_ID || _la==LR_BRACKET) {
				{
				setState(830);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(829);
					match(LR_BRACKET);
					}
				}

				setState(832);
				procedure_param();
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(833);
					match(COMMA);
					setState(834);
					procedure_param();
					}
					}
					setState(839);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(841);
				_la = _input.LA(1);
				if (_la==RR_BRACKET) {
					{
					setState(840);
					match(RR_BRACKET);
					}
				}

				}
			}

			setState(854);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(845);
				match(WITH);
				setState(846);
				procedure_option();
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(847);
					match(COMMA);
					setState(848);
					procedure_option();
					}
					}
					setState(853);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(858);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(856);
				match(FOR);
				setState(857);
				match(REPLICATION);
				}
			}

			setState(860);
			match(AS);
			setState(861);
			sql_clauses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_paramContext extends ParserRuleContext {
		public Default_valueContext default_val;
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode AS() { return getToken(TsqlParser.AS, 0); }
		public TerminalNode VARYING() { return getToken(TsqlParser.VARYING, 0); }
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public TerminalNode OUT() { return getToken(TsqlParser.OUT, 0); }
		public TerminalNode OUTPUT() { return getToken(TsqlParser.OUTPUT, 0); }
		public TerminalNode READONLY() { return getToken(TsqlParser.READONLY, 0); }
		public Procedure_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterProcedure_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitProcedure_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitProcedure_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_paramContext procedure_param() throws RecognitionException {
		Procedure_paramContext _localctx = new Procedure_paramContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_procedure_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(LOCAL_ID);
			setState(867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(864);
				id();
				setState(865);
				match(DOT);
				}
				break;
			}
			setState(870);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(869);
				match(AS);
				}
			}

			setState(872);
			data_type();
			setState(874);
			_la = _input.LA(1);
			if (_la==VARYING) {
				{
				setState(873);
				match(VARYING);
				}
			}

			setState(878);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(876);
				match(EQUAL);
				setState(877);
				((Procedure_paramContext)_localctx).default_val = default_value();
				}
			}

			setState(881);
			_la = _input.LA(1);
			if (((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (OUT - 322)) | (1L << (OUTPUT - 322)) | (1L << (READONLY - 322)))) != 0)) {
				{
				setState(880);
				_la = _input.LA(1);
				if ( !(((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (OUT - 322)) | (1L << (OUTPUT - 322)) | (1L << (READONLY - 322)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_optionContext extends ParserRuleContext {
		public TerminalNode ENCRYPTION() { return getToken(TsqlParser.ENCRYPTION, 0); }
		public TerminalNode RECOMPILE() { return getToken(TsqlParser.RECOMPILE, 0); }
		public Execute_clauseContext execute_clause() {
			return getRuleContext(Execute_clauseContext.class,0);
		}
		public Procedure_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterProcedure_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitProcedure_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitProcedure_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_optionContext procedure_option() throws RecognitionException {
		Procedure_optionContext _localctx = new Procedure_optionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_procedure_option);
		try {
			setState(886);
			switch (_input.LA(1)) {
			case ENCRYPTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				match(ENCRYPTION);
				}
				break;
			case RECOMPILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(884);
				match(RECOMPILE);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(885);
				execute_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_statisticsContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(TsqlParser.CREATE, 0); }
		public TerminalNode STATISTICS() { return getToken(TsqlParser.STATISTICS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ON() { return getToken(TsqlParser.ON, 0); }
		public Table_name_with_hintContext table_name_with_hint() {
			return getRuleContext(Table_name_with_hintContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode WITH() { return getToken(TsqlParser.WITH, 0); }
		public TerminalNode FULLSCAN() { return getToken(TsqlParser.FULLSCAN, 0); }
		public TerminalNode SAMPLE() { return getToken(TsqlParser.SAMPLE, 0); }
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public TerminalNode STATS_STREAM() { return getToken(TsqlParser.STATS_STREAM, 0); }
		public TerminalNode PERCENT() { return getToken(TsqlParser.PERCENT, 0); }
		public TerminalNode ROWS() { return getToken(TsqlParser.ROWS, 0); }
		public TerminalNode NORECOMPUTE() { return getToken(TsqlParser.NORECOMPUTE, 0); }
		public TerminalNode INCREMENTAL() { return getToken(TsqlParser.INCREMENTAL, 0); }
		public TerminalNode EQUAL() { return getToken(TsqlParser.EQUAL, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public Create_statisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_statistics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterCreate_statistics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitCreate_statistics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitCreate_statistics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_statisticsContext create_statistics() throws RecognitionException {
		Create_statisticsContext _localctx = new Create_statisticsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_create_statistics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(CREATE);
			setState(889);
			match(STATISTICS);
			setState(890);
			id();
			setState(891);
			match(ON);
			setState(892);
			table_name_with_hint();
			setState(893);
			match(LR_BRACKET);
			setState(894);
			column_name_list();
			setState(895);
			match(RR_BRACKET);
			setState(914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(896);
				match(WITH);
				setState(902);
				switch (_input.LA(1)) {
				case FULLSCAN:
					{
					setState(897);
					match(FULLSCAN);
					}
					break;
				case SAMPLE:
					{
					setState(898);
					match(SAMPLE);
					setState(899);
					match(DECIMAL);
					setState(900);
					_la = _input.LA(1);
					if ( !(_la==PERCENT || _la==ROWS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case STATS_STREAM:
					{
					setState(901);
					match(STATS_STREAM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(904);
					match(COMMA);
					setState(905);
					match(NORECOMPUTE);
					}
					break;
				}
				setState(912);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(908);
					match(COMMA);
					setState(909);
					match(INCREMENTAL);
					setState(910);
					match(EQUAL);
					setState(911);
					on_off();
					}
				}

				}
				break;
			}
			setState(917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(916);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(TsqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(TsqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Column_def_table_constraintsContext column_def_table_constraints() {
			return getRuleContext(Column_def_table_constraintsContext.class,0);
		}
		public TerminalNode ON() { return getToken(TsqlParser.ON, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(TsqlParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(TsqlParser.DEFAULT, i);
		}
		public TerminalNode TEXTIMAGE_ON() { return getToken(TsqlParser.TEXTIMAGE_ON, 0); }
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitCreate_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitCreate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_create_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(CREATE);
			setState(920);
			match(TABLE);
			setState(921);
			table_name();
			setState(922);
			match(LR_BRACKET);
			setState(923);
			column_def_table_constraints();
			setState(925);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(924);
				match(COMMA);
				}
			}

			setState(927);
			match(RR_BRACKET);
			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(928);
				match(ON);
				setState(929);
				id();
				}
				break;
			case 2:
				{
				setState(930);
				match(DEFAULT);
				}
				break;
			}
			setState(936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(933);
				match(TEXTIMAGE_ON);
				setState(934);
				id();
				}
				break;
			case 2:
				{
				setState(935);
				match(DEFAULT);
				}
				break;
			}
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(938);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_viewContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(TsqlParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(TsqlParser.VIEW, 0); }
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(TsqlParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(TsqlParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(TsqlParser.WITH, i);
		}
		public List<View_attributeContext> view_attribute() {
			return getRuleContexts(View_attributeContext.class);
		}
		public View_attributeContext view_attribute(int i) {
			return getRuleContext(View_attributeContext.class,i);
		}
		public TerminalNode CHECK() { return getToken(TsqlParser.CHECK, 0); }
		public TerminalNode OPTION() { return getToken(TsqlParser.OPTION, 0); }
		public Create_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterCreate_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitCreate_view(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitCreate_view(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_viewContext create_view() throws RecognitionException {
		Create_viewContext _localctx = new Create_viewContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_create_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(CREATE);
			setState(942);
			match(VIEW);
			setState(943);
			simple_name();
			setState(948);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(944);
				match(LR_BRACKET);
				setState(945);
				column_name_list();
				setState(946);
				match(RR_BRACKET);
				}
			}

			setState(959);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(950);
				match(WITH);
				setState(951);
				view_attribute();
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(952);
					match(COMMA);
					setState(953);
					view_attribute();
					}
					}
					setState(958);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(961);
			match(AS);
			setState(962);
			select_statement();
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(963);
				match(WITH);
				setState(964);
				match(CHECK);
				setState(965);
				match(OPTION);
				}
				break;
			}
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(968);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_attributeContext extends ParserRuleContext {
		public TerminalNode ENCRYPTION() { return getToken(TsqlParser.ENCRYPTION, 0); }
		public TerminalNode SCHEMABINDING() { return getToken(TsqlParser.SCHEMABINDING, 0); }
		public TerminalNode VIEW_METADATA() { return getToken(TsqlParser.VIEW_METADATA, 0); }
		public View_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterView_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitView_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitView_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_attributeContext view_attribute() throws RecognitionException {
		View_attributeContext _localctx = new View_attributeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_view_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			_la = _input.LA(1);
			if ( !(_la==ENCRYPTION || _la==SCHEMABINDING || _la==VIEW_METADATA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_tableContext extends ParserRuleContext {
		public IdContext constraint;
		public Column_name_listContext fk;
		public Column_name_listContext pk;
		public TerminalNode ALTER() { return getToken(TsqlParser.ALTER, 0); }
		public List<TerminalNode> TABLE() { return getTokens(TsqlParser.TABLE); }
		public TerminalNode TABLE(int i) {
			return getToken(TsqlParser.TABLE, i);
		}
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode SET() { return getToken(TsqlParser.SET, 0); }
		public TerminalNode LOCK_ESCALATION() { return getToken(TsqlParser.LOCK_ESCALATION, 0); }
		public TerminalNode ADD() { return getToken(TsqlParser.ADD, 0); }
		public Column_def_table_constraintContext column_def_table_constraint() {
			return getRuleContext(Column_def_table_constraintContext.class,0);
		}
		public TerminalNode DROP() { return getToken(TsqlParser.DROP, 0); }
		public TerminalNode CONSTRAINT() { return getToken(TsqlParser.CONSTRAINT, 0); }
		public TerminalNode WITH() { return getToken(TsqlParser.WITH, 0); }
		public TerminalNode CHECK() { return getToken(TsqlParser.CHECK, 0); }
		public TerminalNode FOREIGN() { return getToken(TsqlParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(TsqlParser.KEY, 0); }
		public TerminalNode REFERENCES() { return getToken(TsqlParser.REFERENCES, 0); }
		public TerminalNode AUTO() { return getToken(TsqlParser.AUTO, 0); }
		public TerminalNode DISABLE() { return getToken(TsqlParser.DISABLE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<Column_name_listContext> column_name_list() {
			return getRuleContexts(Column_name_listContext.class);
		}
		public Column_name_listContext column_name_list(int i) {
			return getRuleContext(Column_name_listContext.class,i);
		}
		public Alter_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterAlter_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitAlter_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitAlter_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_tableContext alter_table() throws RecognitionException {
		Alter_tableContext _localctx = new Alter_tableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_alter_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(ALTER);
			setState(974);
			match(TABLE);
			setState(975);
			table_name();
			setState(1006);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(976);
				match(SET);
				setState(977);
				match(LR_BRACKET);
				setState(978);
				match(LOCK_ESCALATION);
				setState(979);
				match(EQUAL);
				setState(980);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==AUTO || _la==DISABLE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(981);
				match(RR_BRACKET);
				}
				break;
			case ADD:
				{
				setState(982);
				match(ADD);
				setState(983);
				column_def_table_constraint();
				}
				break;
			case DROP:
				{
				setState(984);
				match(DROP);
				setState(985);
				match(CONSTRAINT);
				setState(986);
				((Alter_tableContext)_localctx).constraint = id();
				}
				break;
			case WITH:
				{
				setState(987);
				match(WITH);
				setState(988);
				match(CHECK);
				setState(989);
				match(ADD);
				setState(990);
				match(CONSTRAINT);
				setState(991);
				((Alter_tableContext)_localctx).constraint = id();
				setState(992);
				match(FOREIGN);
				setState(993);
				match(KEY);
				setState(994);
				match(LR_BRACKET);
				setState(995);
				((Alter_tableContext)_localctx).fk = column_name_list();
				setState(996);
				match(RR_BRACKET);
				setState(997);
				match(REFERENCES);
				setState(998);
				table_name();
				setState(999);
				match(LR_BRACKET);
				setState(1000);
				((Alter_tableContext)_localctx).pk = column_name_list();
				setState(1001);
				match(RR_BRACKET);
				}
				break;
			case CHECK:
				{
				setState(1003);
				match(CHECK);
				setState(1004);
				match(CONSTRAINT);
				setState(1005);
				((Alter_tableContext)_localctx).constraint = id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1008);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_databaseContext extends ParserRuleContext {
		public IdContext database;
		public IdContext new_name;
		public IdContext collation;
		public TerminalNode ALTER() { return getToken(TsqlParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(TsqlParser.DATABASE, 0); }
		public TerminalNode CURRENT() { return getToken(TsqlParser.CURRENT, 0); }
		public TerminalNode MODIFY() { return getToken(TsqlParser.MODIFY, 0); }
		public TerminalNode NAME() { return getToken(TsqlParser.NAME, 0); }
		public TerminalNode COLLATE() { return getToken(TsqlParser.COLLATE, 0); }
		public TerminalNode SET() { return getToken(TsqlParser.SET, 0); }
		public Database_optionspecContext database_optionspec() {
			return getRuleContext(Database_optionspecContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode WITH() { return getToken(TsqlParser.WITH, 0); }
		public TerminationContext termination() {
			return getRuleContext(TerminationContext.class,0);
		}
		public Alter_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterAlter_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitAlter_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitAlter_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_databaseContext alter_database() throws RecognitionException {
		Alter_databaseContext _localctx = new Alter_databaseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_alter_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			match(ALTER);
			setState(1012);
			match(DATABASE);
			setState(1015);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				{
				setState(1013);
				((Alter_databaseContext)_localctx).database = id();
				}
				break;
			case CURRENT:
				{
				setState(1014);
				match(CURRENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1029);
			switch (_input.LA(1)) {
			case MODIFY:
				{
				setState(1017);
				match(MODIFY);
				setState(1018);
				match(NAME);
				setState(1019);
				match(EQUAL);
				setState(1020);
				((Alter_databaseContext)_localctx).new_name = id();
				}
				break;
			case COLLATE:
				{
				setState(1021);
				match(COLLATE);
				setState(1022);
				((Alter_databaseContext)_localctx).collation = id();
				}
				break;
			case SET:
				{
				setState(1023);
				match(SET);
				setState(1024);
				database_optionspec();
				setState(1027);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1025);
					match(WITH);
					setState(1026);
					termination();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1031);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_optionspecContext extends ParserRuleContext {
		public Auto_optionContext auto_option() {
			return getRuleContext(Auto_optionContext.class,0);
		}
		public Change_tracking_optionContext change_tracking_option() {
			return getRuleContext(Change_tracking_optionContext.class,0);
		}
		public Containment_optionContext containment_option() {
			return getRuleContext(Containment_optionContext.class,0);
		}
		public Cursor_optionContext cursor_option() {
			return getRuleContext(Cursor_optionContext.class,0);
		}
		public Date_correlation_optimization_optionContext date_correlation_optimization_option() {
			return getRuleContext(Date_correlation_optimization_optionContext.class,0);
		}
		public Db_encryption_optionContext db_encryption_option() {
			return getRuleContext(Db_encryption_optionContext.class,0);
		}
		public Db_state_optionContext db_state_option() {
			return getRuleContext(Db_state_optionContext.class,0);
		}
		public Db_update_optionContext db_update_option() {
			return getRuleContext(Db_update_optionContext.class,0);
		}
		public Db_user_access_optionContext db_user_access_option() {
			return getRuleContext(Db_user_access_optionContext.class,0);
		}
		public Delayed_durability_optionContext delayed_durability_option() {
			return getRuleContext(Delayed_durability_optionContext.class,0);
		}
		public External_access_optionContext external_access_option() {
			return getRuleContext(External_access_optionContext.class,0);
		}
		public TerminalNode FILESTREAM() { return getToken(TsqlParser.FILESTREAM, 0); }
		public Database_filestream_optionContext database_filestream_option() {
			return getRuleContext(Database_filestream_optionContext.class,0);
		}
		public TerminalNode HADR_options() { return getToken(TsqlParser.HADR_options, 0); }
		public Mixed_page_allocation_optionContext mixed_page_allocation_option() {
			return getRuleContext(Mixed_page_allocation_optionContext.class,0);
		}
		public Parameterization_optionContext parameterization_option() {
			return getRuleContext(Parameterization_optionContext.class,0);
		}
		public Recovery_optionContext recovery_option() {
			return getRuleContext(Recovery_optionContext.class,0);
		}
		public Service_broker_optionContext service_broker_option() {
			return getRuleContext(Service_broker_optionContext.class,0);
		}
		public Snapshot_optionContext snapshot_option() {
			return getRuleContext(Snapshot_optionContext.class,0);
		}
		public Sql_optionContext sql_option() {
			return getRuleContext(Sql_optionContext.class,0);
		}
		public Target_recovery_time_optionContext target_recovery_time_option() {
			return getRuleContext(Target_recovery_time_optionContext.class,0);
		}
		public TerminationContext termination() {
			return getRuleContext(TerminationContext.class,0);
		}
		public Database_optionspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_optionspec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDatabase_optionspec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDatabase_optionspec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDatabase_optionspec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_optionspecContext database_optionspec() throws RecognitionException {
		Database_optionspecContext _localctx = new Database_optionspecContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_database_optionspec);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				auto_option();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1035);
				change_tracking_option();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1036);
				containment_option();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1037);
				cursor_option();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1038);
				date_correlation_optimization_option();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1039);
				db_encryption_option();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1040);
				db_state_option();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1041);
				db_update_option();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1042);
				db_user_access_option();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1043);
				delayed_durability_option();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1044);
				external_access_option();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1045);
				match(FILESTREAM);
				setState(1046);
				database_filestream_option();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1047);
				match(HADR_options);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1048);
				mixed_page_allocation_option();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1049);
				parameterization_option();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1050);
				recovery_option();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1051);
				service_broker_option();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1052);
				snapshot_option();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1053);
				sql_option();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1054);
				target_recovery_time_option();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1055);
				termination();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Auto_optionContext extends ParserRuleContext {
		public TerminalNode AUTO_CLOSE() { return getToken(TsqlParser.AUTO_CLOSE, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode AUTO_CREATE_STATISTICS() { return getToken(TsqlParser.AUTO_CREATE_STATISTICS, 0); }
		public TerminalNode OFF() { return getToken(TsqlParser.OFF, 0); }
		public List<TerminalNode> ON() { return getTokens(TsqlParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(TsqlParser.ON, i);
		}
		public TerminalNode INCREMENTAL() { return getToken(TsqlParser.INCREMENTAL, 0); }
		public TerminalNode EQUAL() { return getToken(TsqlParser.EQUAL, 0); }
		public TerminalNode AUTO_SHRINK() { return getToken(TsqlParser.AUTO_SHRINK, 0); }
		public TerminalNode AUTO_UPDATE_STATISTICS() { return getToken(TsqlParser.AUTO_UPDATE_STATISTICS, 0); }
		public TerminalNode AUTO_UPDATE_STATISTICS_ASYNC() { return getToken(TsqlParser.AUTO_UPDATE_STATISTICS_ASYNC, 0); }
		public Auto_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auto_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterAuto_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitAuto_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitAuto_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Auto_optionContext auto_option() throws RecognitionException {
		Auto_optionContext _localctx = new Auto_optionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_auto_option);
		int _la;
		try {
			setState(1075);
			switch (_input.LA(1)) {
			case AUTO_CLOSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				match(AUTO_CLOSE);
				setState(1059);
				on_off();
				}
				break;
			case AUTO_CREATE_STATISTICS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				match(AUTO_CREATE_STATISTICS);
				setState(1061);
				match(OFF);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 3);
				{
				setState(1062);
				match(ON);
				setState(1067);
				switch (_input.LA(1)) {
				case INCREMENTAL:
					{
					setState(1063);
					match(INCREMENTAL);
					setState(1064);
					match(EQUAL);
					setState(1065);
					match(ON);
					}
					break;
				case OFF:
					{
					setState(1066);
					match(OFF);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case AUTO_SHRINK:
				enterOuterAlt(_localctx, 4);
				{
				setState(1069);
				match(AUTO_SHRINK);
				setState(1070);
				on_off();
				}
				break;
			case AUTO_UPDATE_STATISTICS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1071);
				match(AUTO_UPDATE_STATISTICS);
				setState(1072);
				on_off();
				}
				break;
			case AUTO_UPDATE_STATISTICS_ASYNC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1073);
				match(AUTO_UPDATE_STATISTICS_ASYNC);
				setState(1074);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Change_tracking_optionContext extends ParserRuleContext {
		public TerminalNode CHANGE_TRACKING() { return getToken(TsqlParser.CHANGE_TRACKING, 0); }
		public TerminalNode EQUAL() { return getToken(TsqlParser.EQUAL, 0); }
		public TerminalNode OFF() { return getToken(TsqlParser.OFF, 0); }
		public TerminalNode ON() { return getToken(TsqlParser.ON, 0); }
		public List<Change_tracking_option_listContext> change_tracking_option_list() {
			return getRuleContexts(Change_tracking_option_listContext.class);
		}
		public Change_tracking_option_listContext change_tracking_option_list(int i) {
			return getRuleContext(Change_tracking_option_listContext.class,i);
		}
		public Change_tracking_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_tracking_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterChange_tracking_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitChange_tracking_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitChange_tracking_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Change_tracking_optionContext change_tracking_option() throws RecognitionException {
		Change_tracking_optionContext _localctx = new Change_tracking_optionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_change_tracking_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			match(CHANGE_TRACKING);
			setState(1078);
			match(EQUAL);
			setState(1094);
			switch (_input.LA(1)) {
			case OFF:
				{
				setState(1079);
				match(OFF);
				}
				break;
			case ON:
				{
				setState(1080);
				match(ON);
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AUTO_CLEANUP || _la==CHANGE_RETENTION) {
					{
					{
					setState(1081);
					change_tracking_option_list();
					setState(1086);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1082);
						match(COMMA);
						setState(1083);
						change_tracking_option_list();
						}
						}
						setState(1088);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(1093);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Change_tracking_option_listContext extends ParserRuleContext {
		public TerminalNode AUTO_CLEANUP() { return getToken(TsqlParser.AUTO_CLEANUP, 0); }
		public TerminalNode EQUAL() { return getToken(TsqlParser.EQUAL, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode CHANGE_RETENTION() { return getToken(TsqlParser.CHANGE_RETENTION, 0); }
		public TerminalNode DAYS() { return getToken(TsqlParser.DAYS, 0); }
		public TerminalNode HOURS() { return getToken(TsqlParser.HOURS, 0); }
		public TerminalNode MINUTES() { return getToken(TsqlParser.MINUTES, 0); }
		public Change_tracking_option_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_tracking_option_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterChange_tracking_option_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitChange_tracking_option_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitChange_tracking_option_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Change_tracking_option_listContext change_tracking_option_list() throws RecognitionException {
		Change_tracking_option_listContext _localctx = new Change_tracking_option_listContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_change_tracking_option_list);
		int _la;
		try {
			setState(1102);
			switch (_input.LA(1)) {
			case AUTO_CLEANUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				match(AUTO_CLEANUP);
				setState(1097);
				match(EQUAL);
				setState(1098);
				on_off();
				}
				break;
			case CHANGE_RETENTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099);
				match(CHANGE_RETENTION);
				setState(1100);
				match(EQUAL);
				setState(1101);
				_la = _input.LA(1);
				if ( !(((((_la - 236)) & ~0x3f) == 0 && ((1L << (_la - 236)) & ((1L << (DAYS - 236)) | (1L << (HOURS - 236)) | (1L << (MINUTES - 236)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Containment_optionContext extends ParserRuleContext {
		public TerminalNode CONTAINMENT() { return getToken(TsqlParser.CONTAINMENT, 0); }
		public TerminalNode EQUAL() { return getToken(TsqlParser.EQUAL, 0); }
		public TerminalNode NONE() { return getToken(TsqlParser.NONE, 0); }
		public TerminalNode PARTIAL() { return getToken(TsqlParser.PARTIAL, 0); }
		public Containment_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containment_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterContainment_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitContainment_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitContainment_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Containment_optionContext containment_option() throws RecognitionException {
		Containment_optionContext _localctx = new Containment_optionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_containment_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			match(CONTAINMENT);
			setState(1105);
			match(EQUAL);
			setState(1106);
			_la = _input.LA(1);
			if ( !(_la==NONE || _la==PARTIAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_optionContext extends ParserRuleContext {
		public TerminalNode CURSOR_CLOSE_ON_COMMIT() { return getToken(TsqlParser.CURSOR_CLOSE_ON_COMMIT, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode CURSOR_DEFAULT() { return getToken(TsqlParser.CURSOR_DEFAULT, 0); }
		public TerminalNode LOCAL() { return getToken(TsqlParser.LOCAL, 0); }
		public TerminalNode GLOBAL() { return getToken(TsqlParser.GLOBAL, 0); }
		public Cursor_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterCursor_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitCursor_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitCursor_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_optionContext cursor_option() throws RecognitionException {
		Cursor_optionContext _localctx = new Cursor_optionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cursor_option);
		int _la;
		try {
			setState(1112);
			switch (_input.LA(1)) {
			case CURSOR_CLOSE_ON_COMMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1108);
				match(CURSOR_CLOSE_ON_COMMIT);
				setState(1109);
				on_off();
				}
				break;
			case CURSOR_DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1110);
				match(CURSOR_DEFAULT);
				setState(1111);
				_la = _input.LA(1);
				if ( !(_la==GLOBAL || _la==LOCAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_correlation_optimization_optionContext extends ParserRuleContext {
		public TerminalNode DATE_CORRELATION_OPTIMIZATION() { return getToken(TsqlParser.DATE_CORRELATION_OPTIMIZATION, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public Date_correlation_optimization_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_correlation_optimization_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDate_correlation_optimization_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDate_correlation_optimization_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDate_correlation_optimization_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_correlation_optimization_optionContext date_correlation_optimization_option() throws RecognitionException {
		Date_correlation_optimization_optionContext _localctx = new Date_correlation_optimization_optionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_date_correlation_optimization_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(DATE_CORRELATION_OPTIMIZATION);
			setState(1115);
			on_off();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Db_encryption_optionContext extends ParserRuleContext {
		public TerminalNode ENCRYPTION() { return getToken(TsqlParser.ENCRYPTION, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public Db_encryption_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_encryption_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDb_encryption_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDb_encryption_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDb_encryption_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Db_encryption_optionContext db_encryption_option() throws RecognitionException {
		Db_encryption_optionContext _localctx = new Db_encryption_optionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_db_encryption_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(ENCRYPTION);
			setState(1118);
			on_off();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Db_state_optionContext extends ParserRuleContext {
		public TerminalNode ONLINE() { return getToken(TsqlParser.ONLINE, 0); }
		public TerminalNode OFFLINE() { return getToken(TsqlParser.OFFLINE, 0); }
		public TerminalNode EMERGENCY() { return getToken(TsqlParser.EMERGENCY, 0); }
		public Db_state_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_state_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDb_state_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDb_state_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDb_state_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Db_state_optionContext db_state_option() throws RecognitionException {
		Db_state_optionContext _localctx = new Db_state_optionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_db_state_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			_la = _input.LA(1);
			if ( !(_la==EMERGENCY || _la==OFFLINE || _la==ONLINE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Db_update_optionContext extends ParserRuleContext {
		public TerminalNode READ_ONLY() { return getToken(TsqlParser.READ_ONLY, 0); }
		public TerminalNode READ_WRITE() { return getToken(TsqlParser.READ_WRITE, 0); }
		public Db_update_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_update_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDb_update_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDb_update_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDb_update_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Db_update_optionContext db_update_option() throws RecognitionException {
		Db_update_optionContext _localctx = new Db_update_optionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_db_update_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			_la = _input.LA(1);
			if ( !(_la==READ_ONLY || _la==READ_WRITE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Db_user_access_optionContext extends ParserRuleContext {
		public TerminalNode SINGLE_USER() { return getToken(TsqlParser.SINGLE_USER, 0); }
		public TerminalNode RESTRICTED_USER() { return getToken(TsqlParser.RESTRICTED_USER, 0); }
		public TerminalNode MULTI_USER() { return getToken(TsqlParser.MULTI_USER, 0); }
		public Db_user_access_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_user_access_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDb_user_access_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDb_user_access_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDb_user_access_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Db_user_access_optionContext db_user_access_option() throws RecognitionException {
		Db_user_access_optionContext _localctx = new Db_user_access_optionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_db_user_access_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			_la = _input.LA(1);
			if ( !(((((_la - 303)) & ~0x3f) == 0 && ((1L << (_la - 303)) & ((1L << (MULTI_USER - 303)) | (1L << (RESTRICTED_USER - 303)) | (1L << (SINGLE_USER - 303)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delayed_durability_optionContext extends ParserRuleContext {
		public TerminalNode DELAYED_DURABILITY() { return getToken(TsqlParser.DELAYED_DURABILITY, 0); }
		public TerminalNode EQUAL() { return getToken(TsqlParser.EQUAL, 0); }
		public TerminalNode DISABLED() { return getToken(TsqlParser.DISABLED, 0); }
		public TerminalNode ALLOWED() { return getToken(TsqlParser.ALLOWED, 0); }
		public TerminalNode FORCED() { return getToken(TsqlParser.FORCED, 0); }
		public Delayed_durability_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delayed_durability_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDelayed_durability_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDelayed_durability_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDelayed_durability_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delayed_durability_optionContext delayed_durability_option() throws RecognitionException {
		Delayed_durability_optionContext _localctx = new Delayed_durability_optionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_delayed_durability_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			match(DELAYED_DURABILITY);
			setState(1127);
			match(EQUAL);
			setState(1128);
			_la = _input.LA(1);
			if ( !(_la==ALLOWED || _la==DISABLED || _la==FORCED) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class External_access_optionContext extends ParserRuleContext {
		public TerminalNode DB_CHAINING() { return getToken(TsqlParser.DB_CHAINING, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode TRUSTWORTHY() { return getToken(TsqlParser.TRUSTWORTHY, 0); }
		public TerminalNode DEFAULT_LANGUAGE() { return getToken(TsqlParser.DEFAULT_LANGUAGE, 0); }
		public TerminalNode EQUAL() { return getToken(TsqlParser.EQUAL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STRING() { return getToken(TsqlParser.STRING, 0); }
		public TerminalNode DEFAULT_FULLTEXT_LANGUAGE() { return getToken(TsqlParser.DEFAULT_FULLTEXT_LANGUAGE, 0); }
		public TerminalNode NESTED_TRIGGERS() { return getToken(TsqlParser.NESTED_TRIGGERS, 0); }
		public TerminalNode OFF() { return getToken(TsqlParser.OFF, 0); }
		public TerminalNode ON() { return getToken(TsqlParser.ON, 0); }
		public TerminalNode TRANSFORM_NOISE_WORDS() { return getToken(TsqlParser.TRANSFORM_NOISE_WORDS, 0); }
		public TerminalNode TWO_DIGIT_YEAR_CUTOFF() { return getToken(TsqlParser.TWO_DIGIT_YEAR_CUTOFF, 0); }
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public External_access_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_access_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterExternal_access_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitExternal_access_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitExternal_access_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final External_access_optionContext external_access_option() throws RecognitionException {
		External_access_optionContext _localctx = new External_access_optionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_external_access_option);
		int _la;
		try {
			setState(1155);
			switch (_input.LA(1)) {
			case DB_CHAINING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				match(DB_CHAINING);
				setState(1131);
				on_off();
				}
				break;
			case TRUSTWORTHY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				match(TRUSTWORTHY);
				setState(1133);
				on_off();
				}
				break;
			case DEFAULT_LANGUAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1134);
				match(DEFAULT_LANGUAGE);
				setState(1135);
				match(EQUAL);
				setState(1138);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NEXT:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(1136);
					id();
					}
					break;
				case STRING:
					{
					setState(1137);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DEFAULT_FULLTEXT_LANGUAGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1140);
				match(DEFAULT_FULLTEXT_LANGUAGE);
				setState(1141);
				match(EQUAL);
				setState(1144);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NEXT:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(1142);
					id();
					}
					break;
				case STRING:
					{
					setState(1143);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NESTED_TRIGGERS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1146);
				match(NESTED_TRIGGERS);
				setState(1147);
				match(EQUAL);
				setState(1148);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case TRANSFORM_NOISE_WORDS:
				enterOuterAlt(_localctx, 6);
				{
				setState(1149);
				match(TRANSFORM_NOISE_WORDS);
				setState(1150);
				match(EQUAL);
				setState(1151);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case TWO_DIGIT_YEAR_CUTOFF:
				enterOuterAlt(_localctx, 7);
				{
				setState(1152);
				match(TWO_DIGIT_YEAR_CUTOFF);
				setState(1153);
				match(EQUAL);
				setState(1154);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mixed_page_allocation_optionContext extends ParserRuleContext {
		public TerminalNode MIXED_PAGE_ALLOCATION() { return getToken(TsqlParser.MIXED_PAGE_ALLOCATION, 0); }
		public TerminalNode OFF() { return getToken(TsqlParser.OFF, 0); }
		public TerminalNode ON() { return getToken(TsqlParser.ON, 0); }
		public Mixed_page_allocation_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixed_page_allocation_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterMixed_page_allocation_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitMixed_page_allocation_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitMixed_page_allocation_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mixed_page_allocation_optionContext mixed_page_allocation_option() throws RecognitionException {
		Mixed_page_allocation_optionContext _localctx = new Mixed_page_allocation_optionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mixed_page_allocation_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			match(MIXED_PAGE_ALLOCATION);
			setState(1158);
			_la = _input.LA(1);
			if ( !(_la==OFF || _la==ON) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameterization_optionContext extends ParserRuleContext {
		public TerminalNode PARAMETERIZATION() { return getToken(TsqlParser.PARAMETERIZATION, 0); }
		public TerminalNode SIMPLE() { return getToken(TsqlParser.SIMPLE, 0); }
		public TerminalNode FORCED() { return getToken(TsqlParser.FORCED, 0); }
		public Parameterization_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterization_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterParameterization_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitParameterization_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitParameterization_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameterization_optionContext parameterization_option() throws RecognitionException {
		Parameterization_optionContext _localctx = new Parameterization_optionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parameterization_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			match(PARAMETERIZATION);
			setState(1161);
			_la = _input.LA(1);
			if ( !(_la==FORCED || _la==SIMPLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Recovery_optionContext extends ParserRuleContext {
		public TerminalNode RECOVERY() { return getToken(TsqlParser.RECOVERY, 0); }
		public TerminalNode FULL() { return getToken(TsqlParser.FULL, 0); }
		public TerminalNode BULK_LOGGED() { return getToken(TsqlParser.BULK_LOGGED, 0); }
		public TerminalNode SIMPLE() { return getToken(TsqlParser.SIMPLE, 0); }
		public TerminalNode TORN_PAGE_DETECTION() { return getToken(TsqlParser.TORN_PAGE_DETECTION, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode PAGE_VERIFY() { return getToken(TsqlParser.PAGE_VERIFY, 0); }
		public TerminalNode CHECKSUM() { return getToken(TsqlParser.CHECKSUM, 0); }
		public TerminalNode NONE() { return getToken(TsqlParser.NONE, 0); }
		public Recovery_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recovery_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterRecovery_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitRecovery_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitRecovery_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Recovery_optionContext recovery_option() throws RecognitionException {
		Recovery_optionContext _localctx = new Recovery_optionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_recovery_option);
		int _la;
		try {
			setState(1169);
			switch (_input.LA(1)) {
			case RECOVERY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1163);
				match(RECOVERY);
				setState(1164);
				_la = _input.LA(1);
				if ( !(_la==FULL || _la==BULK_LOGGED || _la==SIMPLE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case TORN_PAGE_DETECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1165);
				match(TORN_PAGE_DETECTION);
				setState(1166);
				on_off();
				}
				break;
			case PAGE_VERIFY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1167);
				match(PAGE_VERIFY);
				setState(1168);
				_la = _input.LA(1);
				if ( !(_la==NONE || _la==CHECKSUM || _la==TORN_PAGE_DETECTION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Service_broker_optionContext extends ParserRuleContext {
		public TerminalNode ENABLE_BROKER() { return getToken(TsqlParser.ENABLE_BROKER, 0); }
		public TerminalNode DISABLE_BROKER() { return getToken(TsqlParser.DISABLE_BROKER, 0); }
		public TerminalNode NEW_BROKER() { return getToken(TsqlParser.NEW_BROKER, 0); }
		public TerminalNode ERROR_BROKER_CONVERSATIONS() { return getToken(TsqlParser.ERROR_BROKER_CONVERSATIONS, 0); }
		public TerminalNode HONOR_BROKER_PRIORITY() { return getToken(TsqlParser.HONOR_BROKER_PRIORITY, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public Service_broker_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service_broker_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterService_broker_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitService_broker_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitService_broker_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Service_broker_optionContext service_broker_option() throws RecognitionException {
		Service_broker_optionContext _localctx = new Service_broker_optionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_service_broker_option);
		try {
			setState(1177);
			switch (_input.LA(1)) {
			case ENABLE_BROKER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1171);
				match(ENABLE_BROKER);
				}
				break;
			case DISABLE_BROKER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1172);
				match(DISABLE_BROKER);
				}
				break;
			case NEW_BROKER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1173);
				match(NEW_BROKER);
				}
				break;
			case ERROR_BROKER_CONVERSATIONS:
				enterOuterAlt(_localctx, 4);
				{
				setState(1174);
				match(ERROR_BROKER_CONVERSATIONS);
				}
				break;
			case HONOR_BROKER_PRIORITY:
				enterOuterAlt(_localctx, 5);
				{
				setState(1175);
				match(HONOR_BROKER_PRIORITY);
				setState(1176);
				on_off();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Snapshot_optionContext extends ParserRuleContext {
		public Token MEMORY_OPTIMIZED_ELEVATE_TO_SNAPSHOT;
		public TerminalNode ALLOW_SNAPSHOT_ISOLATION() { return getToken(TsqlParser.ALLOW_SNAPSHOT_ISOLATION, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode READ_COMMITTED_SNAPSHOT() { return getToken(TsqlParser.READ_COMMITTED_SNAPSHOT, 0); }
		public TerminalNode ON() { return getToken(TsqlParser.ON, 0); }
		public TerminalNode OFF() { return getToken(TsqlParser.OFF, 0); }
		public Snapshot_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_snapshot_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSnapshot_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSnapshot_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSnapshot_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Snapshot_optionContext snapshot_option() throws RecognitionException {
		Snapshot_optionContext _localctx = new Snapshot_optionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_snapshot_option);
		int _la;
		try {
			setState(1184);
			switch (_input.LA(1)) {
			case ALLOW_SNAPSHOT_ISOLATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1179);
				match(ALLOW_SNAPSHOT_ISOLATION);
				setState(1180);
				on_off();
				}
				break;
			case READ_COMMITTED_SNAPSHOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1181);
				match(READ_COMMITTED_SNAPSHOT);
				setState(1182);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case OFF:
			case ON:
				enterOuterAlt(_localctx, 3);
				{
				setState(1183);
				((Snapshot_optionContext)_localctx).MEMORY_OPTIMIZED_ELEVATE_TO_SNAPSHOT = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
					((Snapshot_optionContext)_localctx).MEMORY_OPTIMIZED_ELEVATE_TO_SNAPSHOT = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_optionContext extends ParserRuleContext {
		public TerminalNode ANSI_NULL_DEFAULT() { return getToken(TsqlParser.ANSI_NULL_DEFAULT, 0); }
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode ANSI_NULLS() { return getToken(TsqlParser.ANSI_NULLS, 0); }
		public TerminalNode ANSI_PADDING() { return getToken(TsqlParser.ANSI_PADDING, 0); }
		public TerminalNode ANSI_WARNINGS() { return getToken(TsqlParser.ANSI_WARNINGS, 0); }
		public TerminalNode ARITHABORT() { return getToken(TsqlParser.ARITHABORT, 0); }
		public TerminalNode COMPATIBILITY_LEVEL() { return getToken(TsqlParser.COMPATIBILITY_LEVEL, 0); }
		public TerminalNode EQUAL() { return getToken(TsqlParser.EQUAL, 0); }
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public TerminalNode CONCAT_NULL_YIELDS_NULL() { return getToken(TsqlParser.CONCAT_NULL_YIELDS_NULL, 0); }
		public TerminalNode NUMERIC_ROUNDABORT() { return getToken(TsqlParser.NUMERIC_ROUNDABORT, 0); }
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(TsqlParser.QUOTED_IDENTIFIER, 0); }
		public TerminalNode RECURSIVE_TRIGGERS() { return getToken(TsqlParser.RECURSIVE_TRIGGERS, 0); }
		public Sql_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSql_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSql_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSql_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_optionContext sql_option() throws RecognitionException {
		Sql_optionContext _localctx = new Sql_optionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sql_option);
		try {
			setState(1207);
			switch (_input.LA(1)) {
			case ANSI_NULL_DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186);
				match(ANSI_NULL_DEFAULT);
				setState(1187);
				on_off();
				}
				break;
			case ANSI_NULLS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1188);
				match(ANSI_NULLS);
				setState(1189);
				on_off();
				}
				break;
			case ANSI_PADDING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1190);
				match(ANSI_PADDING);
				setState(1191);
				on_off();
				}
				break;
			case ANSI_WARNINGS:
				enterOuterAlt(_localctx, 4);
				{
				setState(1192);
				match(ANSI_WARNINGS);
				setState(1193);
				on_off();
				}
				break;
			case ARITHABORT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1194);
				match(ARITHABORT);
				setState(1195);
				on_off();
				}
				break;
			case COMPATIBILITY_LEVEL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1196);
				match(COMPATIBILITY_LEVEL);
				setState(1197);
				match(EQUAL);
				setState(1198);
				match(DECIMAL);
				}
				break;
			case CONCAT_NULL_YIELDS_NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1199);
				match(CONCAT_NULL_YIELDS_NULL);
				setState(1200);
				on_off();
				}
				break;
			case NUMERIC_ROUNDABORT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1201);
				match(NUMERIC_ROUNDABORT);
				setState(1202);
				on_off();
				}
				break;
			case QUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 9);
				{
				setState(1203);
				match(QUOTED_IDENTIFIER);
				setState(1204);
				on_off();
				}
				break;
			case RECURSIVE_TRIGGERS:
				enterOuterAlt(_localctx, 10);
				{
				setState(1205);
				match(RECURSIVE_TRIGGERS);
				setState(1206);
				on_off();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Target_recovery_time_optionContext extends ParserRuleContext {
		public TerminalNode TARGET_RECOVERY_TIME() { return getToken(TsqlParser.TARGET_RECOVERY_TIME, 0); }
		public TerminalNode EQUAL() { return getToken(TsqlParser.EQUAL, 0); }
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public TerminalNode SECONDS() { return getToken(TsqlParser.SECONDS, 0); }
		public TerminalNode MINUTES() { return getToken(TsqlParser.MINUTES, 0); }
		public Target_recovery_time_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_recovery_time_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTarget_recovery_time_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTarget_recovery_time_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTarget_recovery_time_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Target_recovery_time_optionContext target_recovery_time_option() throws RecognitionException {
		Target_recovery_time_optionContext _localctx = new Target_recovery_time_optionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_target_recovery_time_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			match(TARGET_RECOVERY_TIME);
			setState(1210);
			match(EQUAL);
			setState(1211);
			match(DECIMAL);
			setState(1212);
			_la = _input.LA(1);
			if ( !(_la==MINUTES || _la==SECONDS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminationContext extends ParserRuleContext {
		public Token seconds;
		public TerminalNode ROLLBACK() { return getToken(TsqlParser.ROLLBACK, 0); }
		public TerminalNode AFTER() { return getToken(TsqlParser.AFTER, 0); }
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public TerminalNode IMMEDIATE() { return getToken(TsqlParser.IMMEDIATE, 0); }
		public TerminalNode NO_WAIT() { return getToken(TsqlParser.NO_WAIT, 0); }
		public TerminationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTermination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTermination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTermination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminationContext termination() throws RecognitionException {
		TerminationContext _localctx = new TerminationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_termination);
		try {
			setState(1220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1214);
				match(ROLLBACK);
				setState(1215);
				match(AFTER);
				setState(1216);
				((TerminationContext)_localctx).seconds = match(DECIMAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1217);
				match(ROLLBACK);
				setState(1218);
				match(IMMEDIATE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1219);
				match(NO_WAIT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_indexContext extends ParserRuleContext {
		public IdContext name;
		public TerminalNode DROP() { return getToken(TsqlParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(TsqlParser.INDEX, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode IF() { return getToken(TsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(TsqlParser.EXISTS, 0); }
		public TerminalNode ON() { return getToken(TsqlParser.ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Drop_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDrop_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDrop_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDrop_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_indexContext drop_index() throws RecognitionException {
		Drop_indexContext _localctx = new Drop_indexContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_drop_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			match(DROP);
			setState(1223);
			match(INDEX);
			setState(1226);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1224);
				match(IF);
				setState(1225);
				match(EXISTS);
				}
			}

			setState(1228);
			((Drop_indexContext)_localctx).name = id();
			setState(1231);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1229);
				match(ON);
				setState(1230);
				table_name();
				}
			}

			setState(1234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1233);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_procedureContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(TsqlParser.DROP, 0); }
		public TerminalNode PROCEDURE() { return getToken(TsqlParser.PROCEDURE, 0); }
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(TsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(TsqlParser.EXISTS, 0); }
		public Drop_procedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDrop_procedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDrop_procedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDrop_procedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_procedureContext drop_procedure() throws RecognitionException {
		Drop_procedureContext _localctx = new Drop_procedureContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_drop_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			match(DROP);
			setState(1237);
			match(PROCEDURE);
			setState(1240);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1238);
				match(IF);
				setState(1239);
				match(EXISTS);
				}
			}

			setState(1242);
			func_proc_name();
			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1243);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_statisticsContext extends ParserRuleContext {
		public IdContext name;
		public TerminalNode DROP() { return getToken(TsqlParser.DROP, 0); }
		public TerminalNode STATISTICS() { return getToken(TsqlParser.STATISTICS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Drop_statisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_statistics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDrop_statistics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDrop_statistics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDrop_statistics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_statisticsContext drop_statistics() throws RecognitionException {
		Drop_statisticsContext _localctx = new Drop_statisticsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_drop_statistics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			match(DROP);
			setState(1247);
			match(STATISTICS);
			setState(1251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1248);
				table_name();
				setState(1249);
				match(DOT);
				}
				break;
			}
			setState(1253);
			((Drop_statisticsContext)_localctx).name = id();
			setState(1254);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_tableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(TsqlParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(TsqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(TsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(TsqlParser.EXISTS, 0); }
		public Drop_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDrop_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDrop_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDrop_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_tableContext drop_table() throws RecognitionException {
		Drop_tableContext _localctx = new Drop_tableContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_drop_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			match(DROP);
			setState(1257);
			match(TABLE);
			setState(1260);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1258);
				match(IF);
				setState(1259);
				match(EXISTS);
				}
			}

			setState(1262);
			table_name();
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1263);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_viewContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(TsqlParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(TsqlParser.VIEW, 0); }
		public List<Simple_nameContext> simple_name() {
			return getRuleContexts(Simple_nameContext.class);
		}
		public Simple_nameContext simple_name(int i) {
			return getRuleContext(Simple_nameContext.class,i);
		}
		public TerminalNode IF() { return getToken(TsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(TsqlParser.EXISTS, 0); }
		public Drop_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDrop_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDrop_view(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDrop_view(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_viewContext drop_view() throws RecognitionException {
		Drop_viewContext _localctx = new Drop_viewContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_drop_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(DROP);
			setState(1267);
			match(VIEW);
			setState(1270);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1268);
				match(IF);
				setState(1269);
				match(EXISTS);
				}
			}

			setState(1272);
			simple_name();
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1273);
				match(COMMA);
				setState(1274);
				simple_name();
				}
				}
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1280);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_typeContext extends ParserRuleContext {
		public Simple_nameContext name;
		public TerminalNode CREATE() { return getToken(TsqlParser.CREATE, 0); }
		public TerminalNode TYPE() { return getToken(TsqlParser.TYPE, 0); }
		public TerminalNode FROM() { return getToken(TsqlParser.FROM, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public Create_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterCreate_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitCreate_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitCreate_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_typeContext create_type() throws RecognitionException {
		Create_typeContext _localctx = new Create_typeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_create_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			match(CREATE);
			setState(1284);
			match(TYPE);
			setState(1285);
			((Create_typeContext)_localctx).name = simple_name();
			setState(1286);
			match(FROM);
			setState(1287);
			data_type();
			setState(1288);
			default_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_typeContext extends ParserRuleContext {
		public Simple_nameContext name;
		public TerminalNode DROP() { return getToken(TsqlParser.DROP, 0); }
		public TerminalNode TYPE() { return getToken(TsqlParser.TYPE, 0); }
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(TsqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(TsqlParser.EXISTS, 0); }
		public Drop_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDrop_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDrop_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDrop_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_typeContext drop_type() throws RecognitionException {
		Drop_typeContext _localctx = new Drop_typeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_drop_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			match(DROP);
			setState(1291);
			match(TYPE);
			setState(1294);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1292);
				match(IF);
				setState(1293);
				match(EXISTS);
				}
			}

			setState(1296);
			((Drop_typeContext)_localctx).name = simple_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rowset_function_limitedContext extends ParserRuleContext {
		public OpenqueryContext openquery() {
			return getRuleContext(OpenqueryContext.class,0);
		}
		public OpendatasourceContext opendatasource() {
			return getRuleContext(OpendatasourceContext.class,0);
		}
		public Rowset_function_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowset_function_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterRowset_function_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitRowset_function_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitRowset_function_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rowset_function_limitedContext rowset_function_limited() throws RecognitionException {
		Rowset_function_limitedContext _localctx = new Rowset_function_limitedContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_rowset_function_limited);
		try {
			setState(1300);
			switch (_input.LA(1)) {
			case OPENQUERY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1298);
				openquery();
				}
				break;
			case OPENDATASOURCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1299);
				opendatasource();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenqueryContext extends ParserRuleContext {
		public IdContext linked_server;
		public Token query;
		public TerminalNode OPENQUERY() { return getToken(TsqlParser.OPENQUERY, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STRING() { return getToken(TsqlParser.STRING, 0); }
		public OpenqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterOpenquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitOpenquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitOpenquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenqueryContext openquery() throws RecognitionException {
		OpenqueryContext _localctx = new OpenqueryContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_openquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			match(OPENQUERY);
			setState(1303);
			match(LR_BRACKET);
			setState(1304);
			((OpenqueryContext)_localctx).linked_server = id();
			setState(1305);
			match(COMMA);
			setState(1306);
			((OpenqueryContext)_localctx).query = match(STRING);
			setState(1307);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpendatasourceContext extends ParserRuleContext {
		public Token provider;
		public Token init;
		public IdContext database;
		public IdContext scheme;
		public IdContext table;
		public TerminalNode OPENDATASOURCE() { return getToken(TsqlParser.OPENDATASOURCE, 0); }
		public List<TerminalNode> STRING() { return getTokens(TsqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TsqlParser.STRING, i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public OpendatasourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opendatasource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterOpendatasource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitOpendatasource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitOpendatasource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpendatasourceContext opendatasource() throws RecognitionException {
		OpendatasourceContext _localctx = new OpendatasourceContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_opendatasource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			match(OPENDATASOURCE);
			setState(1310);
			match(LR_BRACKET);
			setState(1311);
			((OpendatasourceContext)_localctx).provider = match(STRING);
			setState(1312);
			match(COMMA);
			setState(1313);
			((OpendatasourceContext)_localctx).init = match(STRING);
			setState(1314);
			match(RR_BRACKET);
			setState(1315);
			match(DOT);
			setState(1317);
			_la = _input.LA(1);
			if (_la==FORCESEEK || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (ABSOLUTE - 193)) | (1L << (APPLY - 193)) | (1L << (AUTO - 193)) | (1L << (AVG - 193)) | (1L << (BASE64 - 193)) | (1L << (CALLER - 193)) | (1L << (CAST - 193)) | (1L << (CATCH - 193)) | (1L << (CHECKSUM_AGG - 193)) | (1L << (COMMITTED - 193)) | (1L << (CONCAT - 193)) | (1L << (CONTROL - 193)) | (1L << (COOKIE - 193)) | (1L << (COUNT - 193)) | (1L << (COUNT_BIG - 193)) | (1L << (DELAY - 193)) | (1L << (DELETED - 193)) | (1L << (DENSE_RANK - 193)) | (1L << (DISABLE - 193)) | (1L << (DYNAMIC - 193)) | (1L << (ENCRYPTION - 193)) | (1L << (EXPAND - 193)) | (1L << (FAST - 193)) | (1L << (FAST_FORWARD - 193)))) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (FIRST - 259)) | (1L << (FOLLOWING - 259)) | (1L << (FORCE - 259)) | (1L << (FORCED - 259)) | (1L << (FORWARD_ONLY - 259)) | (1L << (FULLSCAN - 259)) | (1L << (GLOBAL - 259)) | (1L << (GO - 259)) | (1L << (GROUPING - 259)) | (1L << (GROUPING_ID - 259)) | (1L << (HASH - 259)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 259)) | (1L << (IMPERSONATE - 259)) | (1L << (INSENSITIVE - 259)) | (1L << (INSERTED - 259)) | (1L << (ISOLATION - 259)) | (1L << (KEEP - 259)) | (1L << (KEEPFIXED - 259)) | (1L << (KEYSET - 259)) | (1L << (LAST - 259)) | (1L << (LEVEL - 259)) | (1L << (LOCAL - 259)) | (1L << (LOCK_ESCALATION - 259)) | (1L << (LOGIN - 259)) | (1L << (LOOP - 259)) | (1L << (MARK - 259)) | (1L << (MAX - 259)) | (1L << (MAXDOP - 259)) | (1L << (MAXRECURSION - 259)) | (1L << (MIN - 259)) | (1L << (MODIFY - 259)) | (1L << (NAME - 259)) | (1L << (NEXT - 259)) | (1L << (NOCOUNT - 259)) | (1L << (NOEXPAND - 259)) | (1L << (NORECOMPUTE - 259)) | (1L << (NTILE - 259)) | (1L << (NUMBER - 259)) | (1L << (OFFSET - 259)) | (1L << (ONLINE - 259)) | (1L << (ONLY - 259)) | (1L << (OPTIMISTIC - 259)) | (1L << (OPTIMIZE - 259)) | (1L << (OUT - 259)))) != 0) || ((((_la - 323)) & ~0x3f) == 0 && ((1L << (_la - 323)) & ((1L << (OUTPUT - 323)) | (1L << (OWNER - 323)) | (1L << (PARAMETERIZATION - 323)) | (1L << (PARTITION - 323)) | (1L << (PATH - 323)) | (1L << (PRECEDING - 323)) | (1L << (PRIOR - 323)) | (1L << (PRIVILEGES - 323)) | (1L << (RANGE - 323)) | (1L << (RANK - 323)) | (1L << (READONLY - 323)) | (1L << (READ_ONLY - 323)) | (1L << (RECOMPILE - 323)) | (1L << (RELATIVE - 323)) | (1L << (REMOTE - 323)) | (1L << (REPEATABLE - 323)) | (1L << (ROBUST - 323)) | (1L << (ROOT - 323)) | (1L << (ROW - 323)) | (1L << (ROWGUID - 323)) | (1L << (ROWS - 323)) | (1L << (ROW_NUMBER - 323)) | (1L << (SAMPLE - 323)) | (1L << (SCHEMABINDING - 323)) | (1L << (SCROLL - 323)) | (1L << (SCROLL_LOCKS - 323)) | (1L << (SELF - 323)) | (1L << (SERIALIZABLE - 323)) | (1L << (SIMPLE - 323)) | (1L << (SNAPSHOT - 323)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 323)) | (1L << (STATIC - 323)) | (1L << (STATS_STREAM - 323)) | (1L << (STDEV - 323)) | (1L << (STDEVP - 323)) | (1L << (SUM - 323)) | (1L << (TEXTIMAGE_ON - 323)) | (1L << (THROW - 323)) | (1L << (TIES - 323)) | (1L << (TIME - 323)) | (1L << (TRY - 323)) | (1L << (TYPE - 323)) | (1L << (TYPE_WARNING - 323)) | (1L << (UNBOUNDED - 323)) | (1L << (UNCOMMITTED - 323)) | (1L << (UNKNOWN - 323)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (SQUARE_BRACKET_ID - 388)) | (1L << (ID - 388)))) != 0)) {
				{
				setState(1316);
				((OpendatasourceContext)_localctx).database = id();
				}
			}

			setState(1319);
			match(DOT);
			setState(1321);
			_la = _input.LA(1);
			if (_la==FORCESEEK || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (ABSOLUTE - 193)) | (1L << (APPLY - 193)) | (1L << (AUTO - 193)) | (1L << (AVG - 193)) | (1L << (BASE64 - 193)) | (1L << (CALLER - 193)) | (1L << (CAST - 193)) | (1L << (CATCH - 193)) | (1L << (CHECKSUM_AGG - 193)) | (1L << (COMMITTED - 193)) | (1L << (CONCAT - 193)) | (1L << (CONTROL - 193)) | (1L << (COOKIE - 193)) | (1L << (COUNT - 193)) | (1L << (COUNT_BIG - 193)) | (1L << (DELAY - 193)) | (1L << (DELETED - 193)) | (1L << (DENSE_RANK - 193)) | (1L << (DISABLE - 193)) | (1L << (DYNAMIC - 193)) | (1L << (ENCRYPTION - 193)) | (1L << (EXPAND - 193)) | (1L << (FAST - 193)) | (1L << (FAST_FORWARD - 193)))) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (FIRST - 259)) | (1L << (FOLLOWING - 259)) | (1L << (FORCE - 259)) | (1L << (FORCED - 259)) | (1L << (FORWARD_ONLY - 259)) | (1L << (FULLSCAN - 259)) | (1L << (GLOBAL - 259)) | (1L << (GO - 259)) | (1L << (GROUPING - 259)) | (1L << (GROUPING_ID - 259)) | (1L << (HASH - 259)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 259)) | (1L << (IMPERSONATE - 259)) | (1L << (INSENSITIVE - 259)) | (1L << (INSERTED - 259)) | (1L << (ISOLATION - 259)) | (1L << (KEEP - 259)) | (1L << (KEEPFIXED - 259)) | (1L << (KEYSET - 259)) | (1L << (LAST - 259)) | (1L << (LEVEL - 259)) | (1L << (LOCAL - 259)) | (1L << (LOCK_ESCALATION - 259)) | (1L << (LOGIN - 259)) | (1L << (LOOP - 259)) | (1L << (MARK - 259)) | (1L << (MAX - 259)) | (1L << (MAXDOP - 259)) | (1L << (MAXRECURSION - 259)) | (1L << (MIN - 259)) | (1L << (MODIFY - 259)) | (1L << (NAME - 259)) | (1L << (NEXT - 259)) | (1L << (NOCOUNT - 259)) | (1L << (NOEXPAND - 259)) | (1L << (NORECOMPUTE - 259)) | (1L << (NTILE - 259)) | (1L << (NUMBER - 259)) | (1L << (OFFSET - 259)) | (1L << (ONLINE - 259)) | (1L << (ONLY - 259)) | (1L << (OPTIMISTIC - 259)) | (1L << (OPTIMIZE - 259)) | (1L << (OUT - 259)))) != 0) || ((((_la - 323)) & ~0x3f) == 0 && ((1L << (_la - 323)) & ((1L << (OUTPUT - 323)) | (1L << (OWNER - 323)) | (1L << (PARAMETERIZATION - 323)) | (1L << (PARTITION - 323)) | (1L << (PATH - 323)) | (1L << (PRECEDING - 323)) | (1L << (PRIOR - 323)) | (1L << (PRIVILEGES - 323)) | (1L << (RANGE - 323)) | (1L << (RANK - 323)) | (1L << (READONLY - 323)) | (1L << (READ_ONLY - 323)) | (1L << (RECOMPILE - 323)) | (1L << (RELATIVE - 323)) | (1L << (REMOTE - 323)) | (1L << (REPEATABLE - 323)) | (1L << (ROBUST - 323)) | (1L << (ROOT - 323)) | (1L << (ROW - 323)) | (1L << (ROWGUID - 323)) | (1L << (ROWS - 323)) | (1L << (ROW_NUMBER - 323)) | (1L << (SAMPLE - 323)) | (1L << (SCHEMABINDING - 323)) | (1L << (SCROLL - 323)) | (1L << (SCROLL_LOCKS - 323)) | (1L << (SELF - 323)) | (1L << (SERIALIZABLE - 323)) | (1L << (SIMPLE - 323)) | (1L << (SNAPSHOT - 323)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 323)) | (1L << (STATIC - 323)) | (1L << (STATS_STREAM - 323)) | (1L << (STDEV - 323)) | (1L << (STDEVP - 323)) | (1L << (SUM - 323)) | (1L << (TEXTIMAGE_ON - 323)) | (1L << (THROW - 323)) | (1L << (TIES - 323)) | (1L << (TIME - 323)) | (1L << (TRY - 323)) | (1L << (TYPE - 323)) | (1L << (TYPE_WARNING - 323)) | (1L << (UNBOUNDED - 323)) | (1L << (UNCOMMITTED - 323)) | (1L << (UNKNOWN - 323)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (SQUARE_BRACKET_ID - 388)) | (1L << (ID - 388)))) != 0)) {
				{
				setState(1320);
				((OpendatasourceContext)_localctx).scheme = id();
				}
			}

			setState(1323);
			match(DOT);
			{
			setState(1324);
			((OpendatasourceContext)_localctx).table = id();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_statementContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(TsqlParser.DECLARE, 0); }
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public Table_type_definitionContext table_type_definition() {
			return getRuleContext(Table_type_definitionContext.class,0);
		}
		public TerminalNode AS() { return getToken(TsqlParser.AS, 0); }
		public List<Declare_localContext> declare_local() {
			return getRuleContexts(Declare_localContext.class);
		}
		public Declare_localContext declare_local(int i) {
			return getRuleContext(Declare_localContext.class,i);
		}
		public Declare_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDeclare_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDeclare_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDeclare_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_statementContext declare_statement() throws RecognitionException {
		Declare_statementContext _localctx = new Declare_statementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_declare_statement);
		int _la;
		try {
			setState(1347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1326);
				match(DECLARE);
				setState(1327);
				match(LOCAL_ID);
				setState(1329);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1328);
					match(AS);
					}
				}

				setState(1331);
				table_type_definition();
				setState(1333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1332);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1335);
				match(DECLARE);
				setState(1336);
				declare_local();
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1337);
					match(COMMA);
					setState(1338);
					declare_local();
					}
					}
					setState(1343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1344);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_statementContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(TsqlParser.CLOSE, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(TsqlParser.GLOBAL, 0); }
		public TerminalNode DEALLOCATE() { return getToken(TsqlParser.DEALLOCATE, 0); }
		public Declare_cursorContext declare_cursor() {
			return getRuleContext(Declare_cursorContext.class,0);
		}
		public Fetch_cursorContext fetch_cursor() {
			return getRuleContext(Fetch_cursorContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(TsqlParser.OPEN, 0); }
		public Cursor_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterCursor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitCursor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitCursor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_statementContext cursor_statement() throws RecognitionException {
		Cursor_statementContext _localctx = new Cursor_statementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_cursor_statement);
		try {
			setState(1375);
			switch (_input.LA(1)) {
			case CLOSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1349);
				match(CLOSE);
				setState(1351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1350);
					match(GLOBAL);
					}
					break;
				}
				setState(1353);
				cursor_name();
				setState(1355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1354);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case DEALLOCATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				match(DEALLOCATE);
				setState(1359);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1358);
					match(GLOBAL);
					}
					break;
				}
				setState(1361);
				cursor_name();
				setState(1363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1362);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case DECLARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1365);
				declare_cursor();
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(1366);
				fetch_cursor();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1367);
				match(OPEN);
				setState(1369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1368);
					match(GLOBAL);
					}
					break;
				}
				setState(1371);
				cursor_name();
				setState(1373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1372);
					match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execute_statementContext extends ParserRuleContext {
		public Token return_status;
		public TerminalNode EXECUTE() { return getToken(TsqlParser.EXECUTE, 0); }
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public List<Execute_statement_argContext> execute_statement_arg() {
			return getRuleContexts(Execute_statement_argContext.class);
		}
		public Execute_statement_argContext execute_statement_arg(int i) {
			return getRuleContext(Execute_statement_argContext.class,i);
		}
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public List<Execute_var_stringContext> execute_var_string() {
			return getRuleContexts(Execute_var_stringContext.class);
		}
		public Execute_var_stringContext execute_var_string(int i) {
			return getRuleContext(Execute_var_stringContext.class,i);
		}
		public TerminalNode STRING() { return getToken(TsqlParser.STRING, 0); }
		public TerminalNode LOGIN() { return getToken(TsqlParser.LOGIN, 0); }
		public TerminalNode USER() { return getToken(TsqlParser.USER, 0); }
		public TerminalNode AS() { return getToken(TsqlParser.AS, 0); }
		public Execute_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterExecute_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitExecute_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitExecute_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Execute_statementContext execute_statement() throws RecognitionException {
		Execute_statementContext _localctx = new Execute_statementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_execute_statement);
		int _la;
		try {
			setState(1418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1377);
				match(EXECUTE);
				setState(1380);
				_la = _input.LA(1);
				if (_la==LOCAL_ID) {
					{
					setState(1378);
					((Execute_statementContext)_localctx).return_status = match(LOCAL_ID);
					setState(1379);
					match(EQUAL);
					}
				}

				setState(1382);
				func_proc_name();
				setState(1391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1383);
					execute_statement_arg();
					setState(1388);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1384);
						match(COMMA);
						setState(1385);
						execute_statement_arg();
						}
						}
						setState(1390);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1393);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1396);
				match(EXECUTE);
				setState(1397);
				match(LR_BRACKET);
				setState(1398);
				execute_var_string();
				setState(1403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(1399);
					match(PLUS);
					setState(1400);
					execute_var_string();
					}
					}
					setState(1405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1406);
				match(RR_BRACKET);
				setState(1413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1408);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1407);
						match(AS);
						}
					}

					setState(1410);
					_la = _input.LA(1);
					if ( !(_la==USER || _la==LOGIN) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1411);
					match(EQUAL);
					setState(1412);
					match(STRING);
					}
					break;
				}
				setState(1416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1415);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execute_statement_argContext extends ParserRuleContext {
		public Token parameter;
		public TerminalNode DEFAULT() { return getToken(TsqlParser.DEFAULT, 0); }
		public TerminalNode NULL() { return getToken(TsqlParser.NULL, 0); }
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public Constant_LOCAL_IDContext constant_LOCAL_ID() {
			return getRuleContext(Constant_LOCAL_IDContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OUTPUT() { return getToken(TsqlParser.OUTPUT, 0); }
		public TerminalNode OUT() { return getToken(TsqlParser.OUT, 0); }
		public Execute_statement_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_statement_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterExecute_statement_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitExecute_statement_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitExecute_statement_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Execute_statement_argContext execute_statement_arg() throws RecognitionException {
		Execute_statement_argContext _localctx = new Execute_statement_argContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_execute_statement_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1420);
				((Execute_statement_argContext)_localctx).parameter = match(LOCAL_ID);
				setState(1421);
				match(EQUAL);
				}
				break;
			}
			setState(1433);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case LOCAL_ID:
			case DECIMAL:
			case ID:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				{
				setState(1426);
				switch (_input.LA(1)) {
				case LOCAL_ID:
				case DECIMAL:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case PLUS:
				case MINUS:
					{
					setState(1424);
					constant_LOCAL_ID();
					}
					break;
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NEXT:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(1425);
					id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1428);
					_la = _input.LA(1);
					if ( !(_la==OUT || _la==OUTPUT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				}
				break;
			case DEFAULT:
				{
				setState(1431);
				match(DEFAULT);
				}
				break;
			case NULL:
				{
				setState(1432);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execute_var_stringContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public TerminalNode STRING() { return getToken(TsqlParser.STRING, 0); }
		public Execute_var_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_var_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterExecute_var_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitExecute_var_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitExecute_var_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Execute_var_stringContext execute_var_string() throws RecognitionException {
		Execute_var_stringContext _localctx = new Execute_var_stringContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_execute_var_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			_la = _input.LA(1);
			if ( !(_la==LOCAL_ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Security_statementContext extends ParserRuleContext {
		public Table_nameContext on_id;
		public IdContext to_principal;
		public IdContext as_principal;
		public Execute_clauseContext execute_clause() {
			return getRuleContext(Execute_clauseContext.class,0);
		}
		public List<TerminalNode> GRANT() { return getTokens(TsqlParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(TsqlParser.GRANT, i);
		}
		public TerminalNode TO() { return getToken(TsqlParser.TO, 0); }
		public TerminalNode ALL() { return getToken(TsqlParser.ALL, 0); }
		public Grant_permissionContext grant_permission() {
			return getRuleContext(Grant_permissionContext.class,0);
		}
		public TerminalNode ON() { return getToken(TsqlParser.ON, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode WITH() { return getToken(TsqlParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(TsqlParser.OPTION, 0); }
		public TerminalNode AS() { return getToken(TsqlParser.AS, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode PRIVILEGES() { return getToken(TsqlParser.PRIVILEGES, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode REVERT() { return getToken(TsqlParser.REVERT, 0); }
		public TerminalNode COOKIE() { return getToken(TsqlParser.COOKIE, 0); }
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public Security_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_security_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSecurity_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSecurity_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSecurity_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Security_statementContext security_statement() throws RecognitionException {
		Security_statementContext _localctx = new Security_statementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_security_statement);
		int _la;
		try {
			setState(1485);
			switch (_input.LA(1)) {
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				execute_clause();
				setState(1439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1438);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case GRANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1441);
				match(GRANT);
				setState(1453);
				switch (_input.LA(1)) {
				case ALL:
					{
					setState(1442);
					match(ALL);
					setState(1444);
					_la = _input.LA(1);
					if (_la==PRIVILEGES) {
						{
						setState(1443);
						match(PRIVILEGES);
						}
					}

					}
					break;
				case ALTER:
				case CREATE:
				case EXECUTE:
				case INSERT:
				case REFERENCES:
				case SELECT:
				case VIEW:
				case CONTROL:
				case IMPERSONATE:
				case SHOWPLAN:
				case TAKE:
					{
					setState(1446);
					grant_permission();
					setState(1451);
					_la = _input.LA(1);
					if (_la==LR_BRACKET) {
						{
						setState(1447);
						match(LR_BRACKET);
						setState(1448);
						column_name_list();
						setState(1449);
						match(RR_BRACKET);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1457);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1455);
					match(ON);
					setState(1456);
					((Security_statementContext)_localctx).on_id = table_name();
					}
				}

				setState(1459);
				match(TO);
				{
				setState(1460);
				((Security_statementContext)_localctx).to_principal = id();
				}
				setState(1464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1461);
					match(WITH);
					setState(1462);
					match(GRANT);
					setState(1463);
					match(OPTION);
					}
					break;
				}
				setState(1468);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1466);
					match(AS);
					setState(1467);
					((Security_statementContext)_localctx).as_principal = id();
					}
				}

				setState(1471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1470);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case REVERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1473);
				match(REVERT);
				setState(1480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1474);
					match(LR_BRACKET);
					setState(1475);
					match(WITH);
					setState(1476);
					match(COOKIE);
					setState(1477);
					match(EQUAL);
					setState(1478);
					match(LOCAL_ID);
					setState(1479);
					match(RR_BRACKET);
					}
					break;
				}
				setState(1483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1482);
					match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_permissionContext extends ParserRuleContext {
		public TerminalNode EXECUTE() { return getToken(TsqlParser.EXECUTE, 0); }
		public TerminalNode VIEW() { return getToken(TsqlParser.VIEW, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode TAKE() { return getToken(TsqlParser.TAKE, 0); }
		public TerminalNode CONTROL() { return getToken(TsqlParser.CONTROL, 0); }
		public TerminalNode CREATE() { return getToken(TsqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(TsqlParser.TABLE, 0); }
		public TerminalNode SHOWPLAN() { return getToken(TsqlParser.SHOWPLAN, 0); }
		public TerminalNode IMPERSONATE() { return getToken(TsqlParser.IMPERSONATE, 0); }
		public TerminalNode SELECT() { return getToken(TsqlParser.SELECT, 0); }
		public TerminalNode REFERENCES() { return getToken(TsqlParser.REFERENCES, 0); }
		public TerminalNode INSERT() { return getToken(TsqlParser.INSERT, 0); }
		public TerminalNode ALTER() { return getToken(TsqlParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(TsqlParser.DATABASE, 0); }
		public TerminalNode ANY() { return getToken(TsqlParser.ANY, 0); }
		public Grant_permissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_permission; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterGrant_permission(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitGrant_permission(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitGrant_permission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grant_permissionContext grant_permission() throws RecognitionException {
		Grant_permissionContext _localctx = new Grant_permissionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_grant_permission);
		int _la;
		try {
			setState(1513);
			switch (_input.LA(1)) {
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1487);
				match(EXECUTE);
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1488);
				match(VIEW);
				setState(1489);
				id();
				}
				break;
			case TAKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1490);
				match(TAKE);
				setState(1491);
				id();
				}
				break;
			case CONTROL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1492);
				match(CONTROL);
				setState(1494);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (ABSOLUTE - 193)) | (1L << (APPLY - 193)) | (1L << (AUTO - 193)) | (1L << (AVG - 193)) | (1L << (BASE64 - 193)) | (1L << (CALLER - 193)) | (1L << (CAST - 193)) | (1L << (CATCH - 193)) | (1L << (CHECKSUM_AGG - 193)) | (1L << (COMMITTED - 193)) | (1L << (CONCAT - 193)) | (1L << (CONTROL - 193)) | (1L << (COOKIE - 193)) | (1L << (COUNT - 193)) | (1L << (COUNT_BIG - 193)) | (1L << (DELAY - 193)) | (1L << (DELETED - 193)) | (1L << (DENSE_RANK - 193)) | (1L << (DISABLE - 193)) | (1L << (DYNAMIC - 193)) | (1L << (ENCRYPTION - 193)) | (1L << (EXPAND - 193)) | (1L << (FAST - 193)) | (1L << (FAST_FORWARD - 193)))) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (FIRST - 259)) | (1L << (FOLLOWING - 259)) | (1L << (FORCE - 259)) | (1L << (FORCED - 259)) | (1L << (FORWARD_ONLY - 259)) | (1L << (FULLSCAN - 259)) | (1L << (GLOBAL - 259)) | (1L << (GO - 259)) | (1L << (GROUPING - 259)) | (1L << (GROUPING_ID - 259)) | (1L << (HASH - 259)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 259)) | (1L << (IMPERSONATE - 259)) | (1L << (INSENSITIVE - 259)) | (1L << (INSERTED - 259)) | (1L << (ISOLATION - 259)) | (1L << (KEEP - 259)) | (1L << (KEEPFIXED - 259)) | (1L << (KEYSET - 259)) | (1L << (LAST - 259)) | (1L << (LEVEL - 259)) | (1L << (LOCAL - 259)) | (1L << (LOCK_ESCALATION - 259)) | (1L << (LOGIN - 259)) | (1L << (LOOP - 259)) | (1L << (MARK - 259)) | (1L << (MAX - 259)) | (1L << (MAXDOP - 259)) | (1L << (MAXRECURSION - 259)) | (1L << (MIN - 259)) | (1L << (MODIFY - 259)) | (1L << (NAME - 259)) | (1L << (NEXT - 259)) | (1L << (NOCOUNT - 259)) | (1L << (NOEXPAND - 259)) | (1L << (NORECOMPUTE - 259)) | (1L << (NTILE - 259)) | (1L << (NUMBER - 259)) | (1L << (OFFSET - 259)) | (1L << (ONLINE - 259)) | (1L << (ONLY - 259)) | (1L << (OPTIMISTIC - 259)) | (1L << (OPTIMIZE - 259)) | (1L << (OUT - 259)))) != 0) || ((((_la - 323)) & ~0x3f) == 0 && ((1L << (_la - 323)) & ((1L << (OUTPUT - 323)) | (1L << (OWNER - 323)) | (1L << (PARAMETERIZATION - 323)) | (1L << (PARTITION - 323)) | (1L << (PATH - 323)) | (1L << (PRECEDING - 323)) | (1L << (PRIOR - 323)) | (1L << (PRIVILEGES - 323)) | (1L << (RANGE - 323)) | (1L << (RANK - 323)) | (1L << (READONLY - 323)) | (1L << (READ_ONLY - 323)) | (1L << (RECOMPILE - 323)) | (1L << (RELATIVE - 323)) | (1L << (REMOTE - 323)) | (1L << (REPEATABLE - 323)) | (1L << (ROBUST - 323)) | (1L << (ROOT - 323)) | (1L << (ROW - 323)) | (1L << (ROWGUID - 323)) | (1L << (ROWS - 323)) | (1L << (ROW_NUMBER - 323)) | (1L << (SAMPLE - 323)) | (1L << (SCHEMABINDING - 323)) | (1L << (SCROLL - 323)) | (1L << (SCROLL_LOCKS - 323)) | (1L << (SELF - 323)) | (1L << (SERIALIZABLE - 323)) | (1L << (SIMPLE - 323)) | (1L << (SNAPSHOT - 323)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 323)) | (1L << (STATIC - 323)) | (1L << (STATS_STREAM - 323)) | (1L << (STDEV - 323)) | (1L << (STDEVP - 323)) | (1L << (SUM - 323)) | (1L << (TEXTIMAGE_ON - 323)) | (1L << (THROW - 323)) | (1L << (TIES - 323)) | (1L << (TIME - 323)) | (1L << (TRY - 323)) | (1L << (TYPE - 323)) | (1L << (TYPE_WARNING - 323)) | (1L << (UNBOUNDED - 323)) | (1L << (UNCOMMITTED - 323)) | (1L << (UNKNOWN - 323)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (SQUARE_BRACKET_ID - 388)) | (1L << (ID - 388)))) != 0)) {
					{
					setState(1493);
					id();
					}
				}

				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1496);
				match(CREATE);
				setState(1497);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case SHOWPLAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(1498);
				match(SHOWPLAN);
				}
				break;
			case IMPERSONATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1499);
				match(IMPERSONATE);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1500);
				match(SELECT);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 9);
				{
				setState(1501);
				match(REFERENCES);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 10);
				{
				setState(1502);
				match(INSERT);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 11);
				{
				setState(1503);
				match(ALTER);
				setState(1511);
				_la = _input.LA(1);
				if (_la==ANY || _la==DATABASE || _la==FORCESEEK || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (ABSOLUTE - 193)) | (1L << (APPLY - 193)) | (1L << (AUTO - 193)) | (1L << (AVG - 193)) | (1L << (BASE64 - 193)) | (1L << (CALLER - 193)) | (1L << (CAST - 193)) | (1L << (CATCH - 193)) | (1L << (CHECKSUM_AGG - 193)) | (1L << (COMMITTED - 193)) | (1L << (CONCAT - 193)) | (1L << (CONTROL - 193)) | (1L << (COOKIE - 193)) | (1L << (COUNT - 193)) | (1L << (COUNT_BIG - 193)) | (1L << (DELAY - 193)) | (1L << (DELETED - 193)) | (1L << (DENSE_RANK - 193)) | (1L << (DISABLE - 193)) | (1L << (DYNAMIC - 193)) | (1L << (ENCRYPTION - 193)) | (1L << (EXPAND - 193)) | (1L << (FAST - 193)) | (1L << (FAST_FORWARD - 193)))) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (FIRST - 259)) | (1L << (FOLLOWING - 259)) | (1L << (FORCE - 259)) | (1L << (FORCED - 259)) | (1L << (FORWARD_ONLY - 259)) | (1L << (FULLSCAN - 259)) | (1L << (GLOBAL - 259)) | (1L << (GO - 259)) | (1L << (GROUPING - 259)) | (1L << (GROUPING_ID - 259)) | (1L << (HASH - 259)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 259)) | (1L << (IMPERSONATE - 259)) | (1L << (INSENSITIVE - 259)) | (1L << (INSERTED - 259)) | (1L << (ISOLATION - 259)) | (1L << (KEEP - 259)) | (1L << (KEEPFIXED - 259)) | (1L << (KEYSET - 259)) | (1L << (LAST - 259)) | (1L << (LEVEL - 259)) | (1L << (LOCAL - 259)) | (1L << (LOCK_ESCALATION - 259)) | (1L << (LOGIN - 259)) | (1L << (LOOP - 259)) | (1L << (MARK - 259)) | (1L << (MAX - 259)) | (1L << (MAXDOP - 259)) | (1L << (MAXRECURSION - 259)) | (1L << (MIN - 259)) | (1L << (MODIFY - 259)) | (1L << (NAME - 259)) | (1L << (NEXT - 259)) | (1L << (NOCOUNT - 259)) | (1L << (NOEXPAND - 259)) | (1L << (NORECOMPUTE - 259)) | (1L << (NTILE - 259)) | (1L << (NUMBER - 259)) | (1L << (OFFSET - 259)) | (1L << (ONLINE - 259)) | (1L << (ONLY - 259)) | (1L << (OPTIMISTIC - 259)) | (1L << (OPTIMIZE - 259)) | (1L << (OUT - 259)))) != 0) || ((((_la - 323)) & ~0x3f) == 0 && ((1L << (_la - 323)) & ((1L << (OUTPUT - 323)) | (1L << (OWNER - 323)) | (1L << (PARAMETERIZATION - 323)) | (1L << (PARTITION - 323)) | (1L << (PATH - 323)) | (1L << (PRECEDING - 323)) | (1L << (PRIOR - 323)) | (1L << (PRIVILEGES - 323)) | (1L << (RANGE - 323)) | (1L << (RANK - 323)) | (1L << (READONLY - 323)) | (1L << (READ_ONLY - 323)) | (1L << (RECOMPILE - 323)) | (1L << (RELATIVE - 323)) | (1L << (REMOTE - 323)) | (1L << (REPEATABLE - 323)) | (1L << (ROBUST - 323)) | (1L << (ROOT - 323)) | (1L << (ROW - 323)) | (1L << (ROWGUID - 323)) | (1L << (ROWS - 323)) | (1L << (ROW_NUMBER - 323)) | (1L << (SAMPLE - 323)) | (1L << (SCHEMABINDING - 323)) | (1L << (SCROLL - 323)) | (1L << (SCROLL_LOCKS - 323)) | (1L << (SELF - 323)) | (1L << (SERIALIZABLE - 323)) | (1L << (SIMPLE - 323)) | (1L << (SNAPSHOT - 323)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 323)) | (1L << (STATIC - 323)) | (1L << (STATS_STREAM - 323)) | (1L << (STDEV - 323)) | (1L << (STDEVP - 323)) | (1L << (SUM - 323)) | (1L << (TEXTIMAGE_ON - 323)) | (1L << (THROW - 323)) | (1L << (TIES - 323)) | (1L << (TIME - 323)) | (1L << (TRY - 323)) | (1L << (TYPE - 323)) | (1L << (TYPE_WARNING - 323)) | (1L << (UNBOUNDED - 323)) | (1L << (UNCOMMITTED - 323)) | (1L << (UNKNOWN - 323)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (SQUARE_BRACKET_ID - 388)) | (1L << (ID - 388)))) != 0)) {
					{
					setState(1505);
					_la = _input.LA(1);
					if (_la==ANY) {
						{
						setState(1504);
						match(ANY);
						}
					}

					setState(1509);
					switch (_input.LA(1)) {
					case FORCESEEK:
					case ABSOLUTE:
					case APPLY:
					case AUTO:
					case AVG:
					case BASE64:
					case CALLER:
					case CAST:
					case CATCH:
					case CHECKSUM_AGG:
					case COMMITTED:
					case CONCAT:
					case CONTROL:
					case COOKIE:
					case COUNT:
					case COUNT_BIG:
					case DELAY:
					case DELETED:
					case DENSE_RANK:
					case DISABLE:
					case DYNAMIC:
					case ENCRYPTION:
					case EXPAND:
					case FAST:
					case FAST_FORWARD:
					case FIRST:
					case FOLLOWING:
					case FORCE:
					case FORCED:
					case FORWARD_ONLY:
					case FULLSCAN:
					case GLOBAL:
					case GO:
					case GROUPING:
					case GROUPING_ID:
					case HASH:
					case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
					case IMPERSONATE:
					case INSENSITIVE:
					case INSERTED:
					case ISOLATION:
					case KEEP:
					case KEEPFIXED:
					case KEYSET:
					case LAST:
					case LEVEL:
					case LOCAL:
					case LOCK_ESCALATION:
					case LOGIN:
					case LOOP:
					case MARK:
					case MAX:
					case MAXDOP:
					case MAXRECURSION:
					case MIN:
					case MODIFY:
					case NAME:
					case NEXT:
					case NOCOUNT:
					case NOEXPAND:
					case NORECOMPUTE:
					case NTILE:
					case NUMBER:
					case OFFSET:
					case ONLINE:
					case ONLY:
					case OPTIMISTIC:
					case OPTIMIZE:
					case OUT:
					case OUTPUT:
					case OWNER:
					case PARAMETERIZATION:
					case PARTITION:
					case PATH:
					case PRECEDING:
					case PRIOR:
					case PRIVILEGES:
					case RANGE:
					case RANK:
					case READONLY:
					case READ_ONLY:
					case RECOMPILE:
					case RELATIVE:
					case REMOTE:
					case REPEATABLE:
					case ROBUST:
					case ROOT:
					case ROW:
					case ROWGUID:
					case ROWS:
					case ROW_NUMBER:
					case SAMPLE:
					case SCHEMABINDING:
					case SCROLL:
					case SCROLL_LOCKS:
					case SELF:
					case SERIALIZABLE:
					case SIMPLE:
					case SNAPSHOT:
					case SPATIAL_WINDOW_MAX_CELLS:
					case STATIC:
					case STATS_STREAM:
					case STDEV:
					case STDEVP:
					case SUM:
					case TEXTIMAGE_ON:
					case THROW:
					case TIES:
					case TIME:
					case TRY:
					case TYPE:
					case TYPE_WARNING:
					case UNBOUNDED:
					case UNCOMMITTED:
					case UNKNOWN:
					case USING:
					case VAR:
					case VARP:
					case VIEWS:
					case VIEW_METADATA:
					case WORK:
					case XML:
					case XMLNAMESPACES:
					case DOUBLE_QUOTE_ID:
					case SQUARE_BRACKET_ID:
					case ID:
						{
						setState(1507);
						id();
						}
						break;
					case DATABASE:
						{
						setState(1508);
						match(DATABASE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_statementContext extends ParserRuleContext {
		public IdContext member_name;
		public TerminalNode SET() { return getToken(TsqlParser.SET, 0); }
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(TsqlParser.CURSOR, 0); }
		public Declare_set_cursor_commonContext declare_set_cursor_common() {
			return getRuleContext(Declare_set_cursor_commonContext.class,0);
		}
		public TerminalNode FOR() { return getToken(TsqlParser.FOR, 0); }
		public TerminalNode READ() { return getToken(TsqlParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(TsqlParser.ONLY, 0); }
		public TerminalNode UPDATE() { return getToken(TsqlParser.UPDATE, 0); }
		public TerminalNode OF() { return getToken(TsqlParser.OF, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Set_specialContext set_special() {
			return getRuleContext(Set_specialContext.class,0);
		}
		public Set_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSet_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSet_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSet_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_statementContext set_statement() throws RecognitionException {
		Set_statementContext _localctx = new Set_statementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_set_statement);
		int _la;
		try {
			setState(1554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1515);
				match(SET);
				setState(1516);
				match(LOCAL_ID);
				setState(1519);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(1517);
					match(DOT);
					setState(1518);
					((Set_statementContext)_localctx).member_name = id();
					}
				}

				setState(1521);
				match(EQUAL);
				setState(1522);
				expression(0);
				setState(1524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1523);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1526);
				match(SET);
				setState(1527);
				match(LOCAL_ID);
				setState(1528);
				assignment_operator();
				setState(1529);
				expression(0);
				setState(1531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1530);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1533);
				match(SET);
				setState(1534);
				match(LOCAL_ID);
				setState(1535);
				match(EQUAL);
				setState(1536);
				match(CURSOR);
				setState(1537);
				declare_set_cursor_common();
				setState(1548);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1538);
					match(FOR);
					setState(1546);
					switch (_input.LA(1)) {
					case READ:
						{
						setState(1539);
						match(READ);
						setState(1540);
						match(ONLY);
						}
						break;
					case UPDATE:
						{
						setState(1541);
						match(UPDATE);
						setState(1544);
						_la = _input.LA(1);
						if (_la==OF) {
							{
							setState(1542);
							match(OF);
							setState(1543);
							column_name_list();
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(1551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1550);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1553);
				set_special();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_statementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(TsqlParser.BEGIN, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(TsqlParser.DISTRIBUTED, 0); }
		public TerminalNode TRAN() { return getToken(TsqlParser.TRAN, 0); }
		public TerminalNode TRANSACTION() { return getToken(TsqlParser.TRANSACTION, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public TerminalNode WITH() { return getToken(TsqlParser.WITH, 0); }
		public TerminalNode MARK() { return getToken(TsqlParser.MARK, 0); }
		public TerminalNode STRING() { return getToken(TsqlParser.STRING, 0); }
		public TerminalNode COMMIT() { return getToken(TsqlParser.COMMIT, 0); }
		public TerminalNode DELAYED_DURABILITY() { return getToken(TsqlParser.DELAYED_DURABILITY, 0); }
		public TerminalNode EQUAL() { return getToken(TsqlParser.EQUAL, 0); }
		public TerminalNode OFF() { return getToken(TsqlParser.OFF, 0); }
		public TerminalNode ON() { return getToken(TsqlParser.ON, 0); }
		public TerminalNode WORK() { return getToken(TsqlParser.WORK, 0); }
		public TerminalNode ROLLBACK() { return getToken(TsqlParser.ROLLBACK, 0); }
		public TerminalNode SAVE() { return getToken(TsqlParser.SAVE, 0); }
		public Transaction_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTransaction_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTransaction_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTransaction_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_statementContext transaction_statement() throws RecognitionException {
		Transaction_statementContext _localctx = new Transaction_statementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_transaction_statement);
		int _la;
		try {
			setState(1633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1556);
				match(BEGIN);
				setState(1557);
				match(DISTRIBUTED);
				setState(1558);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1559);
					id();
					}
					break;
				case 2:
					{
					setState(1560);
					match(LOCAL_ID);
					}
					break;
				}
				setState(1564);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1563);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1566);
				match(BEGIN);
				setState(1567);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1577);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1570);
					switch (_input.LA(1)) {
					case FORCESEEK:
					case ABSOLUTE:
					case APPLY:
					case AUTO:
					case AVG:
					case BASE64:
					case CALLER:
					case CAST:
					case CATCH:
					case CHECKSUM_AGG:
					case COMMITTED:
					case CONCAT:
					case CONTROL:
					case COOKIE:
					case COUNT:
					case COUNT_BIG:
					case DELAY:
					case DELETED:
					case DENSE_RANK:
					case DISABLE:
					case DYNAMIC:
					case ENCRYPTION:
					case EXPAND:
					case FAST:
					case FAST_FORWARD:
					case FIRST:
					case FOLLOWING:
					case FORCE:
					case FORCED:
					case FORWARD_ONLY:
					case FULLSCAN:
					case GLOBAL:
					case GO:
					case GROUPING:
					case GROUPING_ID:
					case HASH:
					case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
					case IMPERSONATE:
					case INSENSITIVE:
					case INSERTED:
					case ISOLATION:
					case KEEP:
					case KEEPFIXED:
					case KEYSET:
					case LAST:
					case LEVEL:
					case LOCAL:
					case LOCK_ESCALATION:
					case LOGIN:
					case LOOP:
					case MARK:
					case MAX:
					case MAXDOP:
					case MAXRECURSION:
					case MIN:
					case MODIFY:
					case NAME:
					case NEXT:
					case NOCOUNT:
					case NOEXPAND:
					case NORECOMPUTE:
					case NTILE:
					case NUMBER:
					case OFFSET:
					case ONLINE:
					case ONLY:
					case OPTIMISTIC:
					case OPTIMIZE:
					case OUT:
					case OUTPUT:
					case OWNER:
					case PARAMETERIZATION:
					case PARTITION:
					case PATH:
					case PRECEDING:
					case PRIOR:
					case PRIVILEGES:
					case RANGE:
					case RANK:
					case READONLY:
					case READ_ONLY:
					case RECOMPILE:
					case RELATIVE:
					case REMOTE:
					case REPEATABLE:
					case ROBUST:
					case ROOT:
					case ROW:
					case ROWGUID:
					case ROWS:
					case ROW_NUMBER:
					case SAMPLE:
					case SCHEMABINDING:
					case SCROLL:
					case SCROLL_LOCKS:
					case SELF:
					case SERIALIZABLE:
					case SIMPLE:
					case SNAPSHOT:
					case SPATIAL_WINDOW_MAX_CELLS:
					case STATIC:
					case STATS_STREAM:
					case STDEV:
					case STDEVP:
					case SUM:
					case TEXTIMAGE_ON:
					case THROW:
					case TIES:
					case TIME:
					case TRY:
					case TYPE:
					case TYPE_WARNING:
					case UNBOUNDED:
					case UNCOMMITTED:
					case UNKNOWN:
					case USING:
					case VAR:
					case VARP:
					case VIEWS:
					case VIEW_METADATA:
					case WORK:
					case XML:
					case XMLNAMESPACES:
					case DOUBLE_QUOTE_ID:
					case SQUARE_BRACKET_ID:
					case ID:
						{
						setState(1568);
						id();
						}
						break;
					case LOCAL_ID:
						{
						setState(1569);
						match(LOCAL_ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1575);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
					case 1:
						{
						setState(1572);
						match(WITH);
						setState(1573);
						match(MARK);
						setState(1574);
						match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1580);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1579);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1582);
				match(COMMIT);
				setState(1583);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1596);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1586);
					switch (_input.LA(1)) {
					case FORCESEEK:
					case ABSOLUTE:
					case APPLY:
					case AUTO:
					case AVG:
					case BASE64:
					case CALLER:
					case CAST:
					case CATCH:
					case CHECKSUM_AGG:
					case COMMITTED:
					case CONCAT:
					case CONTROL:
					case COOKIE:
					case COUNT:
					case COUNT_BIG:
					case DELAY:
					case DELETED:
					case DENSE_RANK:
					case DISABLE:
					case DYNAMIC:
					case ENCRYPTION:
					case EXPAND:
					case FAST:
					case FAST_FORWARD:
					case FIRST:
					case FOLLOWING:
					case FORCE:
					case FORCED:
					case FORWARD_ONLY:
					case FULLSCAN:
					case GLOBAL:
					case GO:
					case GROUPING:
					case GROUPING_ID:
					case HASH:
					case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
					case IMPERSONATE:
					case INSENSITIVE:
					case INSERTED:
					case ISOLATION:
					case KEEP:
					case KEEPFIXED:
					case KEYSET:
					case LAST:
					case LEVEL:
					case LOCAL:
					case LOCK_ESCALATION:
					case LOGIN:
					case LOOP:
					case MARK:
					case MAX:
					case MAXDOP:
					case MAXRECURSION:
					case MIN:
					case MODIFY:
					case NAME:
					case NEXT:
					case NOCOUNT:
					case NOEXPAND:
					case NORECOMPUTE:
					case NTILE:
					case NUMBER:
					case OFFSET:
					case ONLINE:
					case ONLY:
					case OPTIMISTIC:
					case OPTIMIZE:
					case OUT:
					case OUTPUT:
					case OWNER:
					case PARAMETERIZATION:
					case PARTITION:
					case PATH:
					case PRECEDING:
					case PRIOR:
					case PRIVILEGES:
					case RANGE:
					case RANK:
					case READONLY:
					case READ_ONLY:
					case RECOMPILE:
					case RELATIVE:
					case REMOTE:
					case REPEATABLE:
					case ROBUST:
					case ROOT:
					case ROW:
					case ROWGUID:
					case ROWS:
					case ROW_NUMBER:
					case SAMPLE:
					case SCHEMABINDING:
					case SCROLL:
					case SCROLL_LOCKS:
					case SELF:
					case SERIALIZABLE:
					case SIMPLE:
					case SNAPSHOT:
					case SPATIAL_WINDOW_MAX_CELLS:
					case STATIC:
					case STATS_STREAM:
					case STDEV:
					case STDEVP:
					case SUM:
					case TEXTIMAGE_ON:
					case THROW:
					case TIES:
					case TIME:
					case TRY:
					case TYPE:
					case TYPE_WARNING:
					case UNBOUNDED:
					case UNCOMMITTED:
					case UNKNOWN:
					case USING:
					case VAR:
					case VARP:
					case VIEWS:
					case VIEW_METADATA:
					case WORK:
					case XML:
					case XMLNAMESPACES:
					case DOUBLE_QUOTE_ID:
					case SQUARE_BRACKET_ID:
					case ID:
						{
						setState(1584);
						id();
						}
						break;
					case LOCAL_ID:
						{
						setState(1585);
						match(LOCAL_ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1594);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
					case 1:
						{
						setState(1588);
						match(WITH);
						setState(1589);
						match(LR_BRACKET);
						setState(1590);
						match(DELAYED_DURABILITY);
						setState(1591);
						match(EQUAL);
						setState(1592);
						_la = _input.LA(1);
						if ( !(_la==OFF || _la==ON) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1593);
						match(RR_BRACKET);
						}
						break;
					}
					}
					break;
				}
				setState(1599);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1598);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1601);
				match(COMMIT);
				setState(1603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1602);
					match(WORK);
					}
					break;
				}
				setState(1606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1605);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1608);
				match(ROLLBACK);
				setState(1609);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1612);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1610);
					id();
					}
					break;
				case 2:
					{
					setState(1611);
					match(LOCAL_ID);
					}
					break;
				}
				setState(1615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1614);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1617);
				match(ROLLBACK);
				setState(1619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1618);
					match(WORK);
					}
					break;
				}
				setState(1622);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1621);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1624);
				match(SAVE);
				setState(1625);
				_la = _input.LA(1);
				if ( !(_la==TRAN || _la==TRANSACTION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1626);
					id();
					}
					break;
				case 2:
					{
					setState(1627);
					match(LOCAL_ID);
					}
					break;
				}
				setState(1631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1630);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Go_statementContext extends ParserRuleContext {
		public Token count;
		public TerminalNode GO() { return getToken(TsqlParser.GO, 0); }
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public Go_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_go_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterGo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitGo_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitGo_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Go_statementContext go_statement() throws RecognitionException {
		Go_statementContext _localctx = new Go_statementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_go_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			match(GO);
			setState(1637);
			_la = _input.LA(1);
			if (_la==DECIMAL) {
				{
				setState(1636);
				((Go_statementContext)_localctx).count = match(DECIMAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_statementContext extends ParserRuleContext {
		public IdContext database;
		public TerminalNode USE() { return getToken(TsqlParser.USE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Use_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterUse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitUse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitUse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_statementContext use_statement() throws RecognitionException {
		Use_statementContext _localctx = new Use_statementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_use_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			match(USE);
			setState(1640);
			((Use_statementContext)_localctx).database = id();
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1641);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execute_clauseContext extends ParserRuleContext {
		public Token clause;
		public TerminalNode EXECUTE() { return getToken(TsqlParser.EXECUTE, 0); }
		public TerminalNode AS() { return getToken(TsqlParser.AS, 0); }
		public TerminalNode CALLER() { return getToken(TsqlParser.CALLER, 0); }
		public TerminalNode SELF() { return getToken(TsqlParser.SELF, 0); }
		public TerminalNode OWNER() { return getToken(TsqlParser.OWNER, 0); }
		public TerminalNode STRING() { return getToken(TsqlParser.STRING, 0); }
		public Execute_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterExecute_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitExecute_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitExecute_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Execute_clauseContext execute_clause() throws RecognitionException {
		Execute_clauseContext _localctx = new Execute_clauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_execute_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			match(EXECUTE);
			setState(1645);
			match(AS);
			setState(1646);
			((Execute_clauseContext)_localctx).clause = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CALLER || _la==OWNER || _la==SELF || _la==STRING) ) {
				((Execute_clauseContext)_localctx).clause = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_localContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode AS() { return getToken(TsqlParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Declare_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDeclare_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDeclare_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDeclare_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_localContext declare_local() throws RecognitionException {
		Declare_localContext _localctx = new Declare_localContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_declare_local);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1648);
			match(LOCAL_ID);
			setState(1650);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1649);
				match(AS);
				}
			}

			setState(1652);
			data_type();
			setState(1655);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(1653);
				match(EQUAL);
				setState(1654);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_type_definitionContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(TsqlParser.TABLE, 0); }
		public Column_def_table_constraintsContext column_def_table_constraints() {
			return getRuleContext(Column_def_table_constraintsContext.class,0);
		}
		public Table_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTable_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTable_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTable_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_type_definitionContext table_type_definition() throws RecognitionException {
		Table_type_definitionContext _localctx = new Table_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_table_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			match(TABLE);
			setState(1658);
			match(LR_BRACKET);
			setState(1659);
			column_def_table_constraints();
			setState(1660);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_def_table_constraintsContext extends ParserRuleContext {
		public List<Column_def_table_constraintContext> column_def_table_constraint() {
			return getRuleContexts(Column_def_table_constraintContext.class);
		}
		public Column_def_table_constraintContext column_def_table_constraint(int i) {
			return getRuleContext(Column_def_table_constraintContext.class,i);
		}
		public Column_def_table_constraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def_table_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterColumn_def_table_constraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitColumn_def_table_constraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitColumn_def_table_constraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_def_table_constraintsContext column_def_table_constraints() throws RecognitionException {
		Column_def_table_constraintsContext _localctx = new Column_def_table_constraintsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_column_def_table_constraints);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			column_def_table_constraint();
			setState(1669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1664);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1663);
						match(COMMA);
						}
					}

					setState(1666);
					column_def_table_constraint();
					}
					} 
				}
				setState(1671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_def_table_constraintContext extends ParserRuleContext {
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Column_def_table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterColumn_def_table_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitColumn_def_table_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitColumn_def_table_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_def_table_constraintContext column_def_table_constraint() throws RecognitionException {
		Column_def_table_constraintContext _localctx = new Column_def_table_constraintContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_column_def_table_constraint);
		try {
			setState(1674);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1672);
				column_definition();
				}
				break;
			case CHECK:
			case CONSTRAINT:
			case PRIMARY:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1673);
				table_constraint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionContext extends ParserRuleContext {
		public IdContext constraint;
		public Token seed;
		public Token increment;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode AS() { return getToken(TsqlParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(TsqlParser.COLLATE, 0); }
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(TsqlParser.DEFAULT, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(TsqlParser.IDENTITY, 0); }
		public TerminalNode ROWGUIDCOL() { return getToken(TsqlParser.ROWGUIDCOL, 0); }
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(TsqlParser.CONSTRAINT, 0); }
		public TerminalNode WITH() { return getToken(TsqlParser.WITH, 0); }
		public TerminalNode VALUES() { return getToken(TsqlParser.VALUES, 0); }
		public TerminalNode NOT() { return getToken(TsqlParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(TsqlParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(TsqlParser.REPLICATION, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(TsqlParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(TsqlParser.DECIMAL, i);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitColumn_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitColumn_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_column_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			id();
			setState(1680);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				{
				setState(1677);
				data_type();
				}
				break;
			case AS:
				{
				setState(1678);
				match(AS);
				setState(1679);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1684);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(1682);
				match(COLLATE);
				setState(1683);
				id();
				}
			}

			setState(1687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(1686);
				null_notnull();
				}
				break;
			}
			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(1691);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1689);
					match(CONSTRAINT);
					setState(1690);
					((Column_definitionContext)_localctx).constraint = id();
					}
				}

				setState(1693);
				match(DEFAULT);
				setState(1694);
				constant_expression();
				setState(1697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(1695);
					match(WITH);
					setState(1696);
					match(VALUES);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1699);
				match(IDENTITY);
				setState(1705);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(1700);
					match(LR_BRACKET);
					setState(1701);
					((Column_definitionContext)_localctx).seed = match(DECIMAL);
					setState(1702);
					match(COMMA);
					setState(1703);
					((Column_definitionContext)_localctx).increment = match(DECIMAL);
					setState(1704);
					match(RR_BRACKET);
					}
					break;
				}
				setState(1710);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(1707);
					match(NOT);
					setState(1708);
					match(FOR);
					setState(1709);
					match(REPLICATION);
					}
					break;
				}
				}
				break;
			}
			setState(1715);
			_la = _input.LA(1);
			if (_la==ROWGUIDCOL) {
				{
				setState(1714);
				match(ROWGUIDCOL);
				}
			}

			setState(1720);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1717);
					column_constraint();
					}
					} 
				}
				setState(1722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(TsqlParser.CHECK, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(TsqlParser.CONSTRAINT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public TerminalNode PRIMARY() { return getToken(TsqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(TsqlParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(TsqlParser.UNIQUE, 0); }
		public ClusteredContext clustered() {
			return getRuleContext(ClusteredContext.class,0);
		}
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TsqlParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(TsqlParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(TsqlParser.REPLICATION, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1723);
				match(CONSTRAINT);
				setState(1724);
				id();
				}
			}

			setState(1728);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(1727);
				null_notnull();
				}
			}

			setState(1751);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
				{
				setState(1733);
				switch (_input.LA(1)) {
				case PRIMARY:
					{
					setState(1730);
					match(PRIMARY);
					setState(1731);
					match(KEY);
					}
					break;
				case UNIQUE:
					{
					setState(1732);
					match(UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1736);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(1735);
					clustered();
					}
				}

				setState(1739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(1738);
					index_options();
					}
					break;
				}
				}
				break;
			case CHECK:
				{
				setState(1741);
				match(CHECK);
				setState(1745);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1742);
					match(NOT);
					setState(1743);
					match(FOR);
					setState(1744);
					match(REPLICATION);
					}
				}

				setState(1747);
				match(LR_BRACKET);
				setState(1748);
				search_condition();
				setState(1749);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(TsqlParser.CHECK, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(TsqlParser.CONSTRAINT, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode PRIMARY() { return getToken(TsqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(TsqlParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(TsqlParser.UNIQUE, 0); }
		public ClusteredContext clustered() {
			return getRuleContext(ClusteredContext.class,0);
		}
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode ON() { return getToken(TsqlParser.ON, 0); }
		public TerminalNode NOT() { return getToken(TsqlParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(TsqlParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(TsqlParser.REPLICATION, 0); }
		public TerminalNode ASC() { return getToken(TsqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(TsqlParser.DESC, 0); }
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1753);
				match(CONSTRAINT);
				setState(1754);
				id();
				}
			}

			setState(1788);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
				{
				setState(1760);
				switch (_input.LA(1)) {
				case PRIMARY:
					{
					setState(1757);
					match(PRIMARY);
					setState(1758);
					match(KEY);
					}
					break;
				case UNIQUE:
					{
					setState(1759);
					match(UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1763);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(1762);
					clustered();
					}
				}

				setState(1765);
				match(LR_BRACKET);
				setState(1766);
				column_name_list();
				setState(1768);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(1767);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1770);
				match(RR_BRACKET);
				setState(1772);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(1771);
					index_options();
					}
					break;
				}
				setState(1776);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1774);
					match(ON);
					setState(1775);
					id();
					}
				}

				}
				break;
			case CHECK:
				{
				setState(1778);
				match(CHECK);
				setState(1782);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1779);
					match(NOT);
					setState(1780);
					match(FOR);
					setState(1781);
					match(REPLICATION);
					}
				}

				setState(1784);
				match(LR_BRACKET);
				setState(1785);
				search_condition();
				setState(1786);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionsContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(TsqlParser.WITH, 0); }
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public Index_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterIndex_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitIndex_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitIndex_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_optionsContext index_options() throws RecognitionException {
		Index_optionsContext _localctx = new Index_optionsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_index_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			match(WITH);
			setState(1791);
			match(LR_BRACKET);
			setState(1792);
			index_option();
			setState(1797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1793);
				match(COMMA);
				setState(1794);
				index_option();
				}
				}
				setState(1799);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1800);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionContext extends ParserRuleContext {
		public List<Simple_idContext> simple_id() {
			return getRuleContexts(Simple_idContext.class);
		}
		public Simple_idContext simple_id(int i) {
			return getRuleContext(Simple_idContext.class,i);
		}
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public Index_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterIndex_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitIndex_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitIndex_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_optionContext index_option() throws RecognitionException {
		Index_optionContext _localctx = new Index_optionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_index_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			simple_id();
			setState(1803);
			match(EQUAL);
			setState(1807);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ID:
				{
				setState(1804);
				simple_id();
				}
				break;
			case OFF:
			case ON:
				{
				setState(1805);
				on_off();
				}
				break;
			case DECIMAL:
				{
				setState(1806);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_cursorContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(TsqlParser.DECLARE, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(TsqlParser.CURSOR, 0); }
		public List<TerminalNode> FOR() { return getTokens(TsqlParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(TsqlParser.FOR, i);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Declare_set_cursor_commonContext declare_set_cursor_common() {
			return getRuleContext(Declare_set_cursor_commonContext.class,0);
		}
		public TerminalNode INSENSITIVE() { return getToken(TsqlParser.INSENSITIVE, 0); }
		public TerminalNode SCROLL() { return getToken(TsqlParser.SCROLL, 0); }
		public TerminalNode READ() { return getToken(TsqlParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(TsqlParser.ONLY, 0); }
		public TerminalNode UPDATE() { return getToken(TsqlParser.UPDATE, 0); }
		public TerminalNode OF() { return getToken(TsqlParser.OF, 0); }
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Declare_cursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDeclare_cursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDeclare_cursor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDeclare_cursor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_cursorContext declare_cursor() throws RecognitionException {
		Declare_cursorContext _localctx = new Declare_cursorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_declare_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			match(DECLARE);
			setState(1810);
			cursor_name();
			setState(1842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				setState(1811);
				match(CURSOR);
				setState(1821);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(1812);
					declare_set_cursor_common();
					setState(1819);
					_la = _input.LA(1);
					if (_la==FOR) {
						{
						setState(1813);
						match(FOR);
						setState(1814);
						match(UPDATE);
						setState(1817);
						_la = _input.LA(1);
						if (_la==OF) {
							{
							setState(1815);
							match(OF);
							setState(1816);
							column_name_list();
							}
						}

						}
					}

					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1824);
				_la = _input.LA(1);
				if (_la==INSENSITIVE) {
					{
					setState(1823);
					match(INSENSITIVE);
					}
				}

				setState(1827);
				_la = _input.LA(1);
				if (_la==SCROLL) {
					{
					setState(1826);
					match(SCROLL);
					}
				}

				setState(1829);
				match(CURSOR);
				setState(1830);
				match(FOR);
				setState(1831);
				select_statement();
				setState(1840);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1832);
					match(FOR);
					setState(1838);
					switch (_input.LA(1)) {
					case READ:
						{
						setState(1833);
						match(READ);
						setState(1834);
						match(ONLY);
						}
						break;
					case UPDATE:
						{
						setState(1835);
						match(UPDATE);
						}
						break;
					case OF:
						{
						{
						setState(1836);
						match(OF);
						setState(1837);
						column_name_list();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			}
			setState(1845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(1844);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_set_cursor_commonContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TsqlParser.FOR, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode TYPE_WARNING() { return getToken(TsqlParser.TYPE_WARNING, 0); }
		public TerminalNode LOCAL() { return getToken(TsqlParser.LOCAL, 0); }
		public TerminalNode GLOBAL() { return getToken(TsqlParser.GLOBAL, 0); }
		public TerminalNode FORWARD_ONLY() { return getToken(TsqlParser.FORWARD_ONLY, 0); }
		public TerminalNode SCROLL() { return getToken(TsqlParser.SCROLL, 0); }
		public TerminalNode STATIC() { return getToken(TsqlParser.STATIC, 0); }
		public TerminalNode KEYSET() { return getToken(TsqlParser.KEYSET, 0); }
		public TerminalNode DYNAMIC() { return getToken(TsqlParser.DYNAMIC, 0); }
		public TerminalNode FAST_FORWARD() { return getToken(TsqlParser.FAST_FORWARD, 0); }
		public TerminalNode READ_ONLY() { return getToken(TsqlParser.READ_ONLY, 0); }
		public TerminalNode SCROLL_LOCKS() { return getToken(TsqlParser.SCROLL_LOCKS, 0); }
		public TerminalNode OPTIMISTIC() { return getToken(TsqlParser.OPTIMISTIC, 0); }
		public Declare_set_cursor_commonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_set_cursor_common; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDeclare_set_cursor_common(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDeclare_set_cursor_common(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDeclare_set_cursor_common(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_set_cursor_commonContext declare_set_cursor_common() throws RecognitionException {
		Declare_set_cursor_commonContext _localctx = new Declare_set_cursor_commonContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_declare_set_cursor_common);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			_la = _input.LA(1);
			if (_la==GLOBAL || _la==LOCAL) {
				{
				setState(1847);
				_la = _input.LA(1);
				if ( !(_la==GLOBAL || _la==LOCAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1851);
			_la = _input.LA(1);
			if (_la==FORWARD_ONLY || _la==SCROLL) {
				{
				setState(1850);
				_la = _input.LA(1);
				if ( !(_la==FORWARD_ONLY || _la==SCROLL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1854);
			_la = _input.LA(1);
			if (((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & ((1L << (DYNAMIC - 248)) | (1L << (FAST_FORWARD - 248)) | (1L << (KEYSET - 248)))) != 0) || _la==STATIC) {
				{
				setState(1853);
				_la = _input.LA(1);
				if ( !(((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & ((1L << (DYNAMIC - 248)) | (1L << (FAST_FORWARD - 248)) | (1L << (KEYSET - 248)))) != 0) || _la==STATIC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1857);
			_la = _input.LA(1);
			if (((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (OPTIMISTIC - 320)) | (1L << (READ_ONLY - 320)) | (1L << (SCROLL_LOCKS - 320)))) != 0)) {
				{
				setState(1856);
				_la = _input.LA(1);
				if ( !(((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (OPTIMISTIC - 320)) | (1L << (READ_ONLY - 320)) | (1L << (SCROLL_LOCKS - 320)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1860);
			_la = _input.LA(1);
			if (_la==TYPE_WARNING) {
				{
				setState(1859);
				match(TYPE_WARNING);
				}
			}

			setState(1862);
			match(FOR);
			setState(1863);
			select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_cursorContext extends ParserRuleContext {
		public TerminalNode FETCH() { return getToken(TsqlParser.FETCH, 0); }
		public Cursor_nameContext cursor_name() {
			return getRuleContext(Cursor_nameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TsqlParser.FROM, 0); }
		public TerminalNode GLOBAL() { return getToken(TsqlParser.GLOBAL, 0); }
		public TerminalNode INTO() { return getToken(TsqlParser.INTO, 0); }
		public List<TerminalNode> LOCAL_ID() { return getTokens(TsqlParser.LOCAL_ID); }
		public TerminalNode LOCAL_ID(int i) {
			return getToken(TsqlParser.LOCAL_ID, i);
		}
		public TerminalNode NEXT() { return getToken(TsqlParser.NEXT, 0); }
		public TerminalNode PRIOR() { return getToken(TsqlParser.PRIOR, 0); }
		public TerminalNode FIRST() { return getToken(TsqlParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(TsqlParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ABSOLUTE() { return getToken(TsqlParser.ABSOLUTE, 0); }
		public TerminalNode RELATIVE() { return getToken(TsqlParser.RELATIVE, 0); }
		public Fetch_cursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_cursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterFetch_cursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitFetch_cursor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitFetch_cursor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fetch_cursorContext fetch_cursor() throws RecognitionException {
		Fetch_cursorContext _localctx = new Fetch_cursorContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_fetch_cursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			match(FETCH);
			setState(1875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(1872);
				switch (_input.LA(1)) {
				case NEXT:
					{
					setState(1866);
					match(NEXT);
					}
					break;
				case PRIOR:
					{
					setState(1867);
					match(PRIOR);
					}
					break;
				case FIRST:
					{
					setState(1868);
					match(FIRST);
					}
					break;
				case LAST:
					{
					setState(1869);
					match(LAST);
					}
					break;
				case ABSOLUTE:
				case RELATIVE:
					{
					setState(1870);
					_la = _input.LA(1);
					if ( !(_la==ABSOLUTE || _la==RELATIVE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1871);
					expression(0);
					}
					break;
				case FROM:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1874);
				match(FROM);
				}
				break;
			}
			setState(1878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(1877);
				match(GLOBAL);
				}
				break;
			}
			setState(1880);
			cursor_name();
			setState(1890);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1881);
				match(INTO);
				setState(1882);
				match(LOCAL_ID);
				setState(1887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1883);
					match(COMMA);
					setState(1884);
					match(LOCAL_ID);
					}
					}
					setState(1889);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				setState(1892);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_specialContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(TsqlParser.SET, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Constant_LOCAL_IDContext constant_LOCAL_ID() {
			return getRuleContext(Constant_LOCAL_IDContext.class,0);
		}
		public On_offContext on_off() {
			return getRuleContext(On_offContext.class,0);
		}
		public TerminalNode TRANSACTION() { return getToken(TsqlParser.TRANSACTION, 0); }
		public TerminalNode ISOLATION() { return getToken(TsqlParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(TsqlParser.LEVEL, 0); }
		public TerminalNode READ() { return getToken(TsqlParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(TsqlParser.UNCOMMITTED, 0); }
		public TerminalNode COMMITTED() { return getToken(TsqlParser.COMMITTED, 0); }
		public TerminalNode REPEATABLE() { return getToken(TsqlParser.REPEATABLE, 0); }
		public TerminalNode SNAPSHOT() { return getToken(TsqlParser.SNAPSHOT, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(TsqlParser.SERIALIZABLE, 0); }
		public TerminalNode IDENTITY_INSERT() { return getToken(TsqlParser.IDENTITY_INSERT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode ANSI_NULLS() { return getToken(TsqlParser.ANSI_NULLS, 0); }
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(TsqlParser.QUOTED_IDENTIFIER, 0); }
		public TerminalNode ANSI_PADDING() { return getToken(TsqlParser.ANSI_PADDING, 0); }
		public Set_specialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSet_special(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSet_special(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSet_special(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_specialContext set_special() throws RecognitionException {
		Set_specialContext _localctx = new Set_specialContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_set_special);
		try {
			setState(1938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1895);
				match(SET);
				setState(1896);
				id();
				setState(1900);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NEXT:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(1897);
					id();
					}
					break;
				case LOCAL_ID:
				case DECIMAL:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case PLUS:
				case MINUS:
					{
					setState(1898);
					constant_LOCAL_ID();
					}
					break;
				case OFF:
				case ON:
					{
					setState(1899);
					on_off();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1903);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(1902);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1905);
				match(SET);
				setState(1906);
				match(TRANSACTION);
				setState(1907);
				match(ISOLATION);
				setState(1908);
				match(LEVEL);
				setState(1917);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(1909);
					match(READ);
					setState(1910);
					match(UNCOMMITTED);
					}
					break;
				case 2:
					{
					setState(1911);
					match(READ);
					setState(1912);
					match(COMMITTED);
					}
					break;
				case 3:
					{
					setState(1913);
					match(REPEATABLE);
					setState(1914);
					match(READ);
					}
					break;
				case 4:
					{
					setState(1915);
					match(SNAPSHOT);
					}
					break;
				case 5:
					{
					setState(1916);
					match(SERIALIZABLE);
					}
					break;
				}
				setState(1920);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(1919);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1922);
				match(SET);
				setState(1923);
				match(IDENTITY_INSERT);
				setState(1924);
				table_name();
				setState(1925);
				on_off();
				setState(1927);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(1926);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1929);
				match(SET);
				setState(1930);
				match(ANSI_NULLS);
				setState(1931);
				on_off();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1932);
				match(SET);
				setState(1933);
				match(QUOTED_IDENTIFIER);
				setState(1934);
				on_off();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1935);
				match(SET);
				setState(1936);
				match(ANSI_PADDING);
				setState(1937);
				on_off();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_LOCAL_IDContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public Constant_LOCAL_IDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_LOCAL_ID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterConstant_LOCAL_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitConstant_LOCAL_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitConstant_LOCAL_ID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_LOCAL_IDContext constant_LOCAL_ID() throws RecognitionException {
		Constant_LOCAL_IDContext _localctx = new Constant_LOCAL_IDContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_constant_LOCAL_ID);
		try {
			setState(1942);
			switch (_input.LA(1)) {
			case DECIMAL:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1940);
				constant();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1941);
				match(LOCAL_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Binary_operator_expressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public Binary_operator_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterBinary_operator_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitBinary_operator_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitBinary_operator_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Primitive_expressionContext extends ExpressionContext {
		public TerminalNode DEFAULT() { return getToken(TsqlParser.DEFAULT, 0); }
		public TerminalNode NULL() { return getToken(TsqlParser.NULL, 0); }
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Primitive_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterPrimitive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitPrimitive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitPrimitive_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bracket_expressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bracket_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterBracket_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitBracket_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitBracket_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unary_operator_expressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Unary_operator_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterUnary_operator_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitUnary_operator_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitUnary_operator_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_call_expressionContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(TsqlParser.COLLATE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_call_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterFunction_call_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitFunction_call_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitFunction_call_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case_expressionContext extends ExpressionContext {
		public ExpressionContext caseExpr;
		public ExpressionContext elseExpr;
		public TerminalNode CASE() { return getToken(TsqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(TsqlParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Switch_sectionContext> switch_section() {
			return getRuleContexts(Switch_sectionContext.class);
		}
		public Switch_sectionContext switch_section(int i) {
			return getRuleContext(Switch_sectionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TsqlParser.ELSE, 0); }
		public List<Switch_search_condition_sectionContext> switch_search_condition_section() {
			return getRuleContexts(Switch_search_condition_sectionContext.class);
		}
		public Switch_search_condition_sectionContext switch_search_condition_section(int i) {
			return getRuleContext(Switch_search_condition_sectionContext.class,i);
		}
		public Case_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterCase_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitCase_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitCase_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Column_ref_expressionContext extends ExpressionContext {
		public Full_column_nameContext full_column_name() {
			return getRuleContext(Full_column_nameContext.class,0);
		}
		public Column_ref_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterColumn_ref_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitColumn_ref_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitColumn_ref_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Subquery_expressionContext extends ExpressionContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Subquery_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSubquery_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSubquery_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSubquery_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Over_clause_expressionContext extends ExpressionContext {
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public Over_clause_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterOver_clause_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitOver_clause_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitOver_clause_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1945);
				match(DEFAULT);
				}
				break;
			case 2:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1946);
				match(NULL);
				}
				break;
			case 3:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1947);
				match(LOCAL_ID);
				}
				break;
			case 4:
				{
				_localctx = new Primitive_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1948);
				constant();
				}
				break;
			case 5:
				{
				_localctx = new Function_call_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1949);
				function_call();
				}
				break;
			case 6:
				{
				_localctx = new Case_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1950);
				match(CASE);
				setState(1951);
				((Case_expressionContext)_localctx).caseExpr = expression(0);
				setState(1953); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1952);
					switch_section();
					}
					}
					setState(1955); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1959);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1957);
					match(ELSE);
					setState(1958);
					((Case_expressionContext)_localctx).elseExpr = expression(0);
					}
				}

				setState(1961);
				match(END);
				}
				break;
			case 7:
				{
				_localctx = new Case_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1963);
				match(CASE);
				setState(1965); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1964);
					switch_search_condition_section();
					}
					}
					setState(1967); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1971);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1969);
					match(ELSE);
					setState(1970);
					((Case_expressionContext)_localctx).elseExpr = expression(0);
					}
				}

				setState(1973);
				match(END);
				}
				break;
			case 8:
				{
				_localctx = new Column_ref_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1975);
				full_column_name();
				}
				break;
			case 9:
				{
				_localctx = new Bracket_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1976);
				match(LR_BRACKET);
				setState(1977);
				expression(0);
				setState(1978);
				match(RR_BRACKET);
				}
				break;
			case 10:
				{
				_localctx = new Subquery_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1980);
				match(LR_BRACKET);
				setState(1981);
				subquery();
				setState(1982);
				match(RR_BRACKET);
				}
				break;
			case 11:
				{
				_localctx = new Unary_operator_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1984);
				match(BIT_NOT);
				setState(1985);
				expression(6);
				}
				break;
			case 12:
				{
				_localctx = new Unary_operator_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1986);
				((Unary_operator_expressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Unary_operator_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1987);
				expression(4);
				}
				break;
			case 13:
				{
				_localctx = new Over_clause_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1988);
				over_clause();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2006);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2004);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
					case 1:
						{
						_localctx = new Binary_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1991);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1992);
						((Binary_operator_expressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 431)) & ~0x3f) == 0 && ((1L << (_la - 431)) & ((1L << (STAR - 431)) | (1L << (DIVIDE - 431)) | (1L << (MODULE - 431)))) != 0)) ) {
							((Binary_operator_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1993);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Binary_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1994);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1995);
						((Binary_operator_expressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 434)) & ~0x3f) == 0 && ((1L << (_la - 434)) & ((1L << (PLUS - 434)) | (1L << (MINUS - 434)) | (1L << (BIT_OR - 434)) | (1L << (BIT_AND - 434)) | (1L << (BIT_XOR - 434)))) != 0)) ) {
							((Binary_operator_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1996);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new Binary_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1997);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1998);
						comparison_operator();
						setState(1999);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new Function_call_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(2001);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2002);
						match(COLLATE);
						setState(2003);
						id();
						}
						break;
					}
					} 
				}
				setState(2008);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Constant_expressionContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(TsqlParser.NULL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitConstant_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitConstant_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_constant_expression);
		try {
			setState(2017);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2009);
				match(NULL);
				}
				break;
			case DECIMAL:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2010);
				constant();
				}
				break;
			case COALESCE:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case FORCESEEK:
			case IDENTITY:
			case LEFT:
			case NULLIF:
			case RIGHT:
			case SESSION_USER:
			case SYSTEM_USER:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case BINARY_CHECKSUM:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DATEADD:
			case DATEDIFF:
			case DATENAME:
			case DATEPART:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MIN_ACTIVE_ROWVERSION:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(2011);
				function_call();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(2012);
				match(LOCAL_ID);
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(2013);
				match(LR_BRACKET);
				setState(2014);
				constant_expression();
				setState(2015);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2019);
			select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_expressionContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(TsqlParser.WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode XMLNAMESPACES() { return getToken(TsqlParser.XMLNAMESPACES, 0); }
		public With_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterWith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitWith_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitWith_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_expressionContext with_expression() throws RecognitionException {
		With_expressionContext _localctx = new With_expressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_with_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2021);
			match(WITH);
			setState(2024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				{
				setState(2022);
				match(XMLNAMESPACES);
				setState(2023);
				match(COMMA);
				}
				break;
			}
			setState(2026);
			common_table_expression();
			setState(2031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2027);
				match(COMMA);
				setState(2028);
				common_table_expression();
				}
				}
				setState(2033);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public IdContext expression_name;
		public TerminalNode AS() { return getToken(TsqlParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2034);
			((Common_table_expressionContext)_localctx).expression_name = id();
			setState(2039);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(2035);
				match(LR_BRACKET);
				setState(2036);
				column_name_list();
				setState(2037);
				match(RR_BRACKET);
				}
			}

			setState(2041);
			match(AS);
			setState(2042);
			match(LR_BRACKET);
			setState(2043);
			select_statement();
			setState(2044);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_elemContext extends ParserRuleContext {
		public IdContext udt_column_name;
		public IdContext method_name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Full_column_nameContext full_column_name() {
			return getRuleContext(Full_column_nameContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Update_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterUpdate_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitUpdate_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitUpdate_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_elemContext update_elem() throws RecognitionException {
		Update_elemContext _localctx = new Update_elemContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_update_elem);
		try {
			setState(2062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2048);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NEXT:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(2046);
					full_column_name();
					}
					break;
				case LOCAL_ID:
					{
					setState(2047);
					match(LOCAL_ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2052);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(2050);
					match(EQUAL);
					}
					break;
				case PLUS_ASSIGN:
				case MINUS_ASSIGN:
				case MULT_ASSIGN:
				case DIV_ASSIGN:
				case MOD_ASSIGN:
				case AND_ASSIGN:
				case XOR_ASSIGN:
				case OR_ASSIGN:
					{
					setState(2051);
					assignment_operator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2054);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2055);
				((Update_elemContext)_localctx).udt_column_name = id();
				setState(2056);
				match(DOT);
				setState(2057);
				((Update_elemContext)_localctx).method_name = id();
				setState(2058);
				match(LR_BRACKET);
				setState(2059);
				expression_list();
				setState(2060);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_condition_listContext extends ParserRuleContext {
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public Search_condition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSearch_condition_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSearch_condition_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSearch_condition_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_condition_listContext search_condition_list() throws RecognitionException {
		Search_condition_listContext _localctx = new Search_condition_listContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_search_condition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
			search_condition();
			setState(2069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2065);
				match(COMMA);
				setState(2066);
				search_condition();
				}
				}
				setState(2071);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_conditionContext extends ParserRuleContext {
		public List<Search_condition_andContext> search_condition_and() {
			return getRuleContexts(Search_condition_andContext.class);
		}
		public Search_condition_andContext search_condition_and(int i) {
			return getRuleContext(Search_condition_andContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(TsqlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(TsqlParser.OR, i);
		}
		public Search_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSearch_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSearch_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSearch_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_conditionContext search_condition() throws RecognitionException {
		Search_conditionContext _localctx = new Search_conditionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_search_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2072);
			search_condition_and();
			setState(2077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(2073);
				match(OR);
				setState(2074);
				search_condition_and();
				}
				}
				setState(2079);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_condition_andContext extends ParserRuleContext {
		public List<Search_condition_notContext> search_condition_not() {
			return getRuleContexts(Search_condition_notContext.class);
		}
		public Search_condition_notContext search_condition_not(int i) {
			return getRuleContext(Search_condition_notContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(TsqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TsqlParser.AND, i);
		}
		public Search_condition_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSearch_condition_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSearch_condition_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSearch_condition_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_condition_andContext search_condition_and() throws RecognitionException {
		Search_condition_andContext _localctx = new Search_condition_andContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_search_condition_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			search_condition_not();
			setState(2085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(2081);
				match(AND);
				setState(2082);
				search_condition_not();
				}
				}
				setState(2087);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_condition_notContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TsqlParser.NOT, 0); }
		public Search_condition_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSearch_condition_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSearch_condition_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSearch_condition_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_condition_notContext search_condition_not() throws RecognitionException {
		Search_condition_notContext _localctx = new Search_condition_notContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_search_condition_not);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2088);
				match(NOT);
				}
			}

			setState(2091);
			predicate();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(TsqlParser.EXISTS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public TerminalNode ALL() { return getToken(TsqlParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(TsqlParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(TsqlParser.ANY, 0); }
		public TerminalNode BETWEEN() { return getToken(TsqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(TsqlParser.AND, 0); }
		public TerminalNode NOT() { return getToken(TsqlParser.NOT, 0); }
		public TerminalNode IN() { return getToken(TsqlParser.IN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(TsqlParser.LIKE, 0); }
		public TerminalNode ESCAPE() { return getToken(TsqlParser.ESCAPE, 0); }
		public TerminalNode IS() { return getToken(TsqlParser.IS, 0); }
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_predicate);
		int _la;
		try {
			setState(2149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2093);
				match(EXISTS);
				setState(2094);
				match(LR_BRACKET);
				setState(2095);
				subquery();
				setState(2096);
				match(RR_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2098);
				expression(0);
				setState(2099);
				comparison_operator();
				setState(2100);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2102);
				expression(0);
				setState(2103);
				comparison_operator();
				setState(2104);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2105);
				match(LR_BRACKET);
				setState(2106);
				subquery();
				setState(2107);
				match(RR_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2109);
				expression(0);
				setState(2111);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2110);
					match(NOT);
					}
				}

				setState(2113);
				match(BETWEEN);
				setState(2114);
				expression(0);
				setState(2115);
				match(AND);
				setState(2116);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2118);
				expression(0);
				setState(2120);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2119);
					match(NOT);
					}
				}

				setState(2122);
				match(IN);
				setState(2123);
				match(LR_BRACKET);
				setState(2126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(2124);
					subquery();
					}
					break;
				case 2:
					{
					setState(2125);
					expression_list();
					}
					break;
				}
				setState(2128);
				match(RR_BRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2130);
				expression(0);
				setState(2132);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2131);
					match(NOT);
					}
				}

				setState(2134);
				match(LIKE);
				setState(2135);
				expression(0);
				setState(2138);
				_la = _input.LA(1);
				if (_la==ESCAPE) {
					{
					setState(2136);
					match(ESCAPE);
					setState(2137);
					expression(0);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2140);
				expression(0);
				setState(2141);
				match(IS);
				setState(2142);
				null_notnull();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2144);
				match(LR_BRACKET);
				setState(2145);
				search_condition();
				setState(2146);
				match(RR_BRACKET);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2148);
				match(DECIMAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_expressionContext extends ParserRuleContext {
		public Query_specificationContext query_specification() {
			return getRuleContext(Query_specificationContext.class,0);
		}
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public List<UnionContext> union() {
			return getRuleContexts(UnionContext.class);
		}
		public UnionContext union(int i) {
			return getRuleContext(UnionContext.class,i);
		}
		public Query_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterQuery_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitQuery_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitQuery_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_expressionContext query_expression() throws RecognitionException {
		Query_expressionContext _localctx = new Query_expressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_query_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2156);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(2151);
				query_specification();
				}
				break;
			case LR_BRACKET:
				{
				setState(2152);
				match(LR_BRACKET);
				setState(2153);
				query_expression();
				setState(2154);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2158);
					union();
					}
					} 
				}
				setState(2163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(TsqlParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(TsqlParser.EXCEPT, 0); }
		public TerminalNode INTERSECT() { return getToken(TsqlParser.INTERSECT, 0); }
		public Query_specificationContext query_specification() {
			return getRuleContext(Query_specificationContext.class,0);
		}
		public TerminalNode ALL() { return getToken(TsqlParser.ALL, 0); }
		public List<Query_expressionContext> query_expression() {
			return getRuleContexts(Query_expressionContext.class);
		}
		public Query_expressionContext query_expression(int i) {
			return getRuleContext(Query_expressionContext.class,i);
		}
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_union);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2170);
			switch (_input.LA(1)) {
			case UNION:
				{
				setState(2164);
				match(UNION);
				setState(2166);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(2165);
					match(ALL);
					}
				}

				}
				break;
			case EXCEPT:
				{
				setState(2168);
				match(EXCEPT);
				}
				break;
			case INTERSECT:
				{
				setState(2169);
				match(INTERSECT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2181);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(2172);
				query_specification();
				}
				break;
			case LR_BRACKET:
				{
				setState(2177); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2173);
						match(LR_BRACKET);
						setState(2174);
						query_expression();
						setState(2175);
						match(RR_BRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2179); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_specificationContext extends ParserRuleContext {
		public Search_conditionContext where;
		public Search_conditionContext having;
		public TerminalNode SELECT() { return getToken(TsqlParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode TOP() { return getToken(TsqlParser.TOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INTO() { return getToken(TsqlParser.INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TsqlParser.FROM, 0); }
		public Table_sourcesContext table_sources() {
			return getRuleContext(Table_sourcesContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(TsqlParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(TsqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(TsqlParser.BY, 0); }
		public List<Group_by_itemContext> group_by_item() {
			return getRuleContexts(Group_by_itemContext.class);
		}
		public Group_by_itemContext group_by_item(int i) {
			return getRuleContext(Group_by_itemContext.class,i);
		}
		public TerminalNode HAVING() { return getToken(TsqlParser.HAVING, 0); }
		public TerminalNode ALL() { return getToken(TsqlParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(TsqlParser.DISTINCT, 0); }
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public TerminalNode PERCENT() { return getToken(TsqlParser.PERCENT, 0); }
		public TerminalNode WITH() { return getToken(TsqlParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(TsqlParser.TIES, 0); }
		public Query_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterQuery_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitQuery_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitQuery_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_specificationContext query_specification() throws RecognitionException {
		Query_specificationContext _localctx = new Query_specificationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_query_specification);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2183);
			match(SELECT);
			setState(2185);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(2184);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(2196);
			_la = _input.LA(1);
			if (_la==TOP) {
				{
				setState(2187);
				match(TOP);
				setState(2188);
				expression(0);
				setState(2190);
				_la = _input.LA(1);
				if (_la==PERCENT) {
					{
					setState(2189);
					match(PERCENT);
					}
				}

				setState(2194);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2192);
					match(WITH);
					setState(2193);
					match(TIES);
					}
				}

				}
			}

			setState(2198);
			select_list();
			setState(2201);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(2199);
				match(INTO);
				setState(2200);
				table_name();
				}
			}

			setState(2205);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(2203);
				match(FROM);
				setState(2204);
				table_sources();
				}
			}

			setState(2209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				{
				setState(2207);
				match(WHERE);
				setState(2208);
				((Query_specificationContext)_localctx).where = search_condition();
				}
				break;
			}
			setState(2221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				{
				setState(2211);
				match(GROUP);
				setState(2212);
				match(BY);
				setState(2213);
				group_by_item();
				setState(2218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,338,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2214);
						match(COMMA);
						setState(2215);
						group_by_item();
						}
						} 
					}
					setState(2220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,338,_ctx);
				}
				}
				break;
			}
			setState(2225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
			case 1:
				{
				setState(2223);
				match(HAVING);
				setState(2224);
				((Query_specificationContext)_localctx).having = search_condition();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(TsqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(TsqlParser.BY, 0); }
		public List<Order_by_expressionContext> order_by_expression() {
			return getRuleContexts(Order_by_expressionContext.class);
		}
		public Order_by_expressionContext order_by_expression(int i) {
			return getRuleContext(Order_by_expressionContext.class,i);
		}
		public TerminalNode OFFSET() { return getToken(TsqlParser.OFFSET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ROW() { return getTokens(TsqlParser.ROW); }
		public TerminalNode ROW(int i) {
			return getToken(TsqlParser.ROW, i);
		}
		public List<TerminalNode> ROWS() { return getTokens(TsqlParser.ROWS); }
		public TerminalNode ROWS(int i) {
			return getToken(TsqlParser.ROWS, i);
		}
		public TerminalNode FETCH() { return getToken(TsqlParser.FETCH, 0); }
		public TerminalNode ONLY() { return getToken(TsqlParser.ONLY, 0); }
		public TerminalNode FIRST() { return getToken(TsqlParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(TsqlParser.NEXT, 0); }
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitOrder_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2227);
			match(ORDER);
			setState(2228);
			match(BY);
			setState(2229);
			order_by_expression();
			setState(2234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2230);
					match(COMMA);
					setState(2231);
					order_by_expression();
					}
					} 
				}
				setState(2236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,341,_ctx);
			}
			setState(2248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				{
				setState(2237);
				match(OFFSET);
				setState(2238);
				expression(0);
				setState(2239);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(2240);
					match(FETCH);
					setState(2241);
					_la = _input.LA(1);
					if ( !(_la==FIRST || _la==NEXT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2242);
					expression(0);
					setState(2243);
					_la = _input.LA(1);
					if ( !(_la==ROW || _la==ROWS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2244);
					match(ONLY);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_clauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TsqlParser.FOR, 0); }
		public TerminalNode BROWSE() { return getToken(TsqlParser.BROWSE, 0); }
		public TerminalNode XML() { return getToken(TsqlParser.XML, 0); }
		public TerminalNode AUTO() { return getToken(TsqlParser.AUTO, 0); }
		public Xml_common_directivesContext xml_common_directives() {
			return getRuleContext(Xml_common_directivesContext.class,0);
		}
		public TerminalNode PATH() { return getToken(TsqlParser.PATH, 0); }
		public TerminalNode STRING() { return getToken(TsqlParser.STRING, 0); }
		public For_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterFor_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitFor_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitFor_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_clauseContext for_clause() throws RecognitionException {
		For_clauseContext _localctx = new For_clauseContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_for_clause);
		try {
			setState(2269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2250);
				match(FOR);
				setState(2251);
				match(BROWSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2252);
				match(FOR);
				setState(2253);
				match(XML);
				setState(2254);
				match(AUTO);
				setState(2256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
				case 1:
					{
					setState(2255);
					xml_common_directives();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2258);
				match(FOR);
				setState(2259);
				match(XML);
				setState(2260);
				match(PATH);
				setState(2264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
				case 1:
					{
					setState(2261);
					match(LR_BRACKET);
					setState(2262);
					match(STRING);
					setState(2263);
					match(RR_BRACKET);
					}
					break;
				}
				setState(2267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
				case 1:
					{
					setState(2266);
					xml_common_directives();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xml_common_directivesContext extends ParserRuleContext {
		public TerminalNode BINARY() { return getToken(TsqlParser.BINARY, 0); }
		public TerminalNode BASE64() { return getToken(TsqlParser.BASE64, 0); }
		public TerminalNode TYPE() { return getToken(TsqlParser.TYPE, 0); }
		public TerminalNode ROOT() { return getToken(TsqlParser.ROOT, 0); }
		public Xml_common_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml_common_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterXml_common_directives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitXml_common_directives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitXml_common_directives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xml_common_directivesContext xml_common_directives() throws RecognitionException {
		Xml_common_directivesContext _localctx = new Xml_common_directivesContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_xml_common_directives);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2271);
			match(COMMA);
			setState(2276);
			switch (_input.LA(1)) {
			case BINARY:
				{
				setState(2272);
				match(BINARY);
				setState(2273);
				match(BASE64);
				}
				break;
			case TYPE:
				{
				setState(2274);
				match(TYPE);
				}
				break;
			case ROOT:
				{
				setState(2275);
				match(ROOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(TsqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(TsqlParser.DESC, 0); }
		public Order_by_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterOrder_by_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitOrder_by_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitOrder_by_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_expressionContext order_by_expression() throws RecognitionException {
		Order_by_expressionContext _localctx = new Order_by_expressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_order_by_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2278);
			expression(0);
			setState(2280);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2279);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Group_by_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterGroup_by_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitGroup_by_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitGroup_by_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_itemContext group_by_item() throws RecognitionException {
		Group_by_itemContext _localctx = new Group_by_itemContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_group_by_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2282);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Option_clauseContext extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(TsqlParser.OPTION, 0); }
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public Option_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterOption_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitOption_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitOption_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Option_clauseContext option_clause() throws RecognitionException {
		Option_clauseContext _localctx = new Option_clauseContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_option_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2284);
			match(OPTION);
			setState(2285);
			match(LR_BRACKET);
			setState(2286);
			option();
			setState(2291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2287);
				match(COMMA);
				setState(2288);
				option();
				}
				}
				setState(2293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2294);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionContext extends ParserRuleContext {
		public Token number_rows;
		public Token number_of_processors;
		public Token number_recursion;
		public TerminalNode FAST() { return getToken(TsqlParser.FAST, 0); }
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public TerminalNode GROUP() { return getToken(TsqlParser.GROUP, 0); }
		public TerminalNode HASH() { return getToken(TsqlParser.HASH, 0); }
		public TerminalNode ORDER() { return getToken(TsqlParser.ORDER, 0); }
		public TerminalNode UNION() { return getToken(TsqlParser.UNION, 0); }
		public TerminalNode MERGE() { return getToken(TsqlParser.MERGE, 0); }
		public TerminalNode CONCAT() { return getToken(TsqlParser.CONCAT, 0); }
		public TerminalNode JOIN() { return getToken(TsqlParser.JOIN, 0); }
		public TerminalNode LOOP() { return getToken(TsqlParser.LOOP, 0); }
		public TerminalNode EXPAND() { return getToken(TsqlParser.EXPAND, 0); }
		public TerminalNode VIEWS() { return getToken(TsqlParser.VIEWS, 0); }
		public TerminalNode FORCE() { return getToken(TsqlParser.FORCE, 0); }
		public TerminalNode IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX() { return getToken(TsqlParser.IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX, 0); }
		public TerminalNode KEEP() { return getToken(TsqlParser.KEEP, 0); }
		public TerminalNode PLAN() { return getToken(TsqlParser.PLAN, 0); }
		public TerminalNode KEEPFIXED() { return getToken(TsqlParser.KEEPFIXED, 0); }
		public TerminalNode MAXDOP() { return getToken(TsqlParser.MAXDOP, 0); }
		public TerminalNode MAXRECURSION() { return getToken(TsqlParser.MAXRECURSION, 0); }
		public TerminalNode OPTIMIZE() { return getToken(TsqlParser.OPTIMIZE, 0); }
		public TerminalNode FOR() { return getToken(TsqlParser.FOR, 0); }
		public List<Optimize_for_argContext> optimize_for_arg() {
			return getRuleContexts(Optimize_for_argContext.class);
		}
		public Optimize_for_argContext optimize_for_arg(int i) {
			return getRuleContext(Optimize_for_argContext.class,i);
		}
		public TerminalNode UNKNOWN() { return getToken(TsqlParser.UNKNOWN, 0); }
		public TerminalNode PARAMETERIZATION() { return getToken(TsqlParser.PARAMETERIZATION, 0); }
		public TerminalNode SIMPLE() { return getToken(TsqlParser.SIMPLE, 0); }
		public TerminalNode FORCED() { return getToken(TsqlParser.FORCED, 0); }
		public TerminalNode RECOMPILE() { return getToken(TsqlParser.RECOMPILE, 0); }
		public TerminalNode ROBUST() { return getToken(TsqlParser.ROBUST, 0); }
		public TerminalNode USE() { return getToken(TsqlParser.USE, 0); }
		public TerminalNode STRING() { return getToken(TsqlParser.STRING, 0); }
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_option);
		int _la;
		try {
			setState(2341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2296);
				match(FAST);
				setState(2297);
				((OptionContext)_localctx).number_rows = match(DECIMAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2298);
				_la = _input.LA(1);
				if ( !(_la==ORDER || _la==HASH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2299);
				match(GROUP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2300);
				_la = _input.LA(1);
				if ( !(_la==MERGE || _la==CONCAT || _la==HASH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2301);
				match(UNION);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2302);
				_la = _input.LA(1);
				if ( !(_la==MERGE || _la==HASH || _la==LOOP) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2303);
				match(JOIN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2304);
				match(EXPAND);
				setState(2305);
				match(VIEWS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2306);
				match(FORCE);
				setState(2307);
				match(ORDER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2308);
				match(IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2309);
				match(KEEP);
				setState(2310);
				match(PLAN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2311);
				match(KEEPFIXED);
				setState(2312);
				match(PLAN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2313);
				match(MAXDOP);
				setState(2314);
				((OptionContext)_localctx).number_of_processors = match(DECIMAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2315);
				match(MAXRECURSION);
				setState(2316);
				((OptionContext)_localctx).number_recursion = match(DECIMAL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2317);
				match(OPTIMIZE);
				setState(2318);
				match(FOR);
				setState(2319);
				match(LR_BRACKET);
				setState(2320);
				optimize_for_arg();
				setState(2325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2321);
					match(COMMA);
					setState(2322);
					optimize_for_arg();
					}
					}
					setState(2327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2328);
				match(RR_BRACKET);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2330);
				match(OPTIMIZE);
				setState(2331);
				match(FOR);
				setState(2332);
				match(UNKNOWN);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2333);
				match(PARAMETERIZATION);
				setState(2334);
				_la = _input.LA(1);
				if ( !(_la==FORCED || _la==SIMPLE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2335);
				match(RECOMPILE);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2336);
				match(ROBUST);
				setState(2337);
				match(PLAN);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2338);
				match(USE);
				setState(2339);
				match(PLAN);
				setState(2340);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optimize_for_argContext extends ParserRuleContext {
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public TerminalNode UNKNOWN() { return getToken(TsqlParser.UNKNOWN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Optimize_for_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimize_for_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterOptimize_for_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitOptimize_for_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitOptimize_for_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optimize_for_argContext optimize_for_arg() throws RecognitionException {
		Optimize_for_argContext _localctx = new Optimize_for_argContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_optimize_for_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2343);
			match(LOCAL_ID);
			setState(2347);
			switch (_input.LA(1)) {
			case UNKNOWN:
				{
				setState(2344);
				match(UNKNOWN);
				}
				break;
			case EQUAL:
				{
				setState(2345);
				match(EQUAL);
				setState(2346);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_elemContext> select_list_elem() {
			return getRuleContexts(Select_list_elemContext.class);
		}
		public Select_list_elemContext select_list_elem(int i) {
			return getRuleContext(Select_list_elemContext.class,i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			select_list_elem();
			setState(2354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2350);
					match(COMMA);
					setState(2351);
					select_list_elem();
					}
					} 
				}
				setState(2356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_elemContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(TsqlParser.IDENTITY, 0); }
		public TerminalNode ROWGUID() { return getToken(TsqlParser.ROWGUID, 0); }
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(TsqlParser.AS, 0); }
		public Select_list_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSelect_list_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSelect_list_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSelect_list_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_elemContext select_list_elem() throws RecognitionException {
		Select_list_elemContext _localctx = new Select_list_elemContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_select_list_elem);
		int _la;
		try {
			setState(2378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2360);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (ABSOLUTE - 193)) | (1L << (APPLY - 193)) | (1L << (AUTO - 193)) | (1L << (AVG - 193)) | (1L << (BASE64 - 193)) | (1L << (CALLER - 193)) | (1L << (CAST - 193)) | (1L << (CATCH - 193)) | (1L << (CHECKSUM_AGG - 193)) | (1L << (COMMITTED - 193)) | (1L << (CONCAT - 193)) | (1L << (CONTROL - 193)) | (1L << (COOKIE - 193)) | (1L << (COUNT - 193)) | (1L << (COUNT_BIG - 193)) | (1L << (DELAY - 193)) | (1L << (DELETED - 193)) | (1L << (DENSE_RANK - 193)) | (1L << (DISABLE - 193)) | (1L << (DYNAMIC - 193)) | (1L << (ENCRYPTION - 193)) | (1L << (EXPAND - 193)) | (1L << (FAST - 193)) | (1L << (FAST_FORWARD - 193)))) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (FIRST - 259)) | (1L << (FOLLOWING - 259)) | (1L << (FORCE - 259)) | (1L << (FORCED - 259)) | (1L << (FORWARD_ONLY - 259)) | (1L << (FULLSCAN - 259)) | (1L << (GLOBAL - 259)) | (1L << (GO - 259)) | (1L << (GROUPING - 259)) | (1L << (GROUPING_ID - 259)) | (1L << (HASH - 259)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 259)) | (1L << (IMPERSONATE - 259)) | (1L << (INSENSITIVE - 259)) | (1L << (INSERTED - 259)) | (1L << (ISOLATION - 259)) | (1L << (KEEP - 259)) | (1L << (KEEPFIXED - 259)) | (1L << (KEYSET - 259)) | (1L << (LAST - 259)) | (1L << (LEVEL - 259)) | (1L << (LOCAL - 259)) | (1L << (LOCK_ESCALATION - 259)) | (1L << (LOGIN - 259)) | (1L << (LOOP - 259)) | (1L << (MARK - 259)) | (1L << (MAX - 259)) | (1L << (MAXDOP - 259)) | (1L << (MAXRECURSION - 259)) | (1L << (MIN - 259)) | (1L << (MODIFY - 259)) | (1L << (NAME - 259)) | (1L << (NEXT - 259)) | (1L << (NOCOUNT - 259)) | (1L << (NOEXPAND - 259)) | (1L << (NORECOMPUTE - 259)) | (1L << (NTILE - 259)) | (1L << (NUMBER - 259)) | (1L << (OFFSET - 259)) | (1L << (ONLINE - 259)) | (1L << (ONLY - 259)) | (1L << (OPTIMISTIC - 259)) | (1L << (OPTIMIZE - 259)) | (1L << (OUT - 259)))) != 0) || ((((_la - 323)) & ~0x3f) == 0 && ((1L << (_la - 323)) & ((1L << (OUTPUT - 323)) | (1L << (OWNER - 323)) | (1L << (PARAMETERIZATION - 323)) | (1L << (PARTITION - 323)) | (1L << (PATH - 323)) | (1L << (PRECEDING - 323)) | (1L << (PRIOR - 323)) | (1L << (PRIVILEGES - 323)) | (1L << (RANGE - 323)) | (1L << (RANK - 323)) | (1L << (READONLY - 323)) | (1L << (READ_ONLY - 323)) | (1L << (RECOMPILE - 323)) | (1L << (RELATIVE - 323)) | (1L << (REMOTE - 323)) | (1L << (REPEATABLE - 323)) | (1L << (ROBUST - 323)) | (1L << (ROOT - 323)) | (1L << (ROW - 323)) | (1L << (ROWGUID - 323)) | (1L << (ROWS - 323)) | (1L << (ROW_NUMBER - 323)) | (1L << (SAMPLE - 323)) | (1L << (SCHEMABINDING - 323)) | (1L << (SCROLL - 323)) | (1L << (SCROLL_LOCKS - 323)) | (1L << (SELF - 323)) | (1L << (SERIALIZABLE - 323)) | (1L << (SIMPLE - 323)) | (1L << (SNAPSHOT - 323)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 323)) | (1L << (STATIC - 323)) | (1L << (STATS_STREAM - 323)) | (1L << (STDEV - 323)) | (1L << (STDEVP - 323)) | (1L << (SUM - 323)) | (1L << (TEXTIMAGE_ON - 323)) | (1L << (THROW - 323)) | (1L << (TIES - 323)) | (1L << (TIME - 323)) | (1L << (TRY - 323)) | (1L << (TYPE - 323)) | (1L << (TYPE_WARNING - 323)) | (1L << (UNBOUNDED - 323)) | (1L << (UNCOMMITTED - 323)) | (1L << (UNKNOWN - 323)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (SQUARE_BRACKET_ID - 388)) | (1L << (ID - 388)))) != 0)) {
					{
					setState(2357);
					table_name();
					setState(2358);
					match(DOT);
					}
				}

				setState(2365);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(2362);
					match(STAR);
					}
					break;
				case DOLLAR:
					{
					setState(2363);
					match(DOLLAR);
					setState(2364);
					_la = _input.LA(1);
					if ( !(_la==IDENTITY || _la==ROWGUID) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2367);
				column_alias();
				setState(2368);
				match(EQUAL);
				setState(2369);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2371);
				expression(0);
				setState(2376);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
				case 1:
					{
					setState(2373);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(2372);
						match(AS);
						}
					}

					setState(2375);
					column_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_sourcesContext extends ParserRuleContext {
		public List<Table_sourceContext> table_source() {
			return getRuleContexts(Table_sourceContext.class);
		}
		public Table_sourceContext table_source(int i) {
			return getRuleContext(Table_sourceContext.class,i);
		}
		public Table_sourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_sources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTable_sources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTable_sources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTable_sources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_sourcesContext table_sources() throws RecognitionException {
		Table_sourcesContext _localctx = new Table_sourcesContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_table_sources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2380);
			table_source();
			setState(2385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,360,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2381);
					match(COMMA);
					setState(2382);
					table_source();
					}
					} 
				}
				setState(2387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,360,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_sourceContext extends ParserRuleContext {
		public Table_source_item_joinedContext table_source_item_joined() {
			return getRuleContext(Table_source_item_joinedContext.class,0);
		}
		public Table_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTable_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTable_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTable_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_sourceContext table_source() throws RecognitionException {
		Table_sourceContext _localctx = new Table_sourceContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_table_source);
		try {
			setState(2393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2388);
				table_source_item_joined();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2389);
				match(LR_BRACKET);
				setState(2390);
				table_source_item_joined();
				setState(2391);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_source_item_joinedContext extends ParserRuleContext {
		public Table_source_itemContext table_source_item() {
			return getRuleContext(Table_source_itemContext.class,0);
		}
		public List<Join_partContext> join_part() {
			return getRuleContexts(Join_partContext.class);
		}
		public Join_partContext join_part(int i) {
			return getRuleContext(Join_partContext.class,i);
		}
		public Table_source_item_joinedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source_item_joined; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTable_source_item_joined(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTable_source_item_joined(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTable_source_item_joined(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_source_item_joinedContext table_source_item_joined() throws RecognitionException {
		Table_source_item_joinedContext _localctx = new Table_source_item_joinedContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_table_source_item_joined);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2395);
			table_source_item();
			setState(2399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2396);
					join_part();
					}
					} 
				}
				setState(2401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_source_itemContext extends ParserRuleContext {
		public Table_name_with_hintContext table_name_with_hint() {
			return getRuleContext(Table_name_with_hintContext.class,0);
		}
		public As_table_aliasContext as_table_alias() {
			return getRuleContext(As_table_aliasContext.class,0);
		}
		public Rowset_functionContext rowset_function() {
			return getRuleContext(Rowset_functionContext.class,0);
		}
		public Derived_tableContext derived_table() {
			return getRuleContext(Derived_tableContext.class,0);
		}
		public Column_alias_listContext column_alias_list() {
			return getRuleContext(Column_alias_listContext.class,0);
		}
		public Change_tableContext change_table() {
			return getRuleContext(Change_tableContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public Table_source_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_source_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTable_source_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTable_source_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTable_source_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_source_itemContext table_source_item() throws RecognitionException {
		Table_source_itemContext _localctx = new Table_source_itemContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_table_source_item);
		try {
			setState(2437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2402);
				table_name_with_hint();
				setState(2404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
				case 1:
					{
					setState(2403);
					as_table_alias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2406);
				rowset_function();
				setState(2408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
				case 1:
					{
					setState(2407);
					as_table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2410);
				derived_table();
				setState(2415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
				case 1:
					{
					setState(2411);
					as_table_alias();
					setState(2413);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
					case 1:
						{
						setState(2412);
						column_alias_list();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2417);
				change_table();
				setState(2418);
				as_table_alias();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2420);
				function_call();
				setState(2422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
				case 1:
					{
					setState(2421);
					as_table_alias();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2424);
				match(LOCAL_ID);
				setState(2426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
				case 1:
					{
					setState(2425);
					as_table_alias();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2428);
				match(LOCAL_ID);
				setState(2429);
				match(DOT);
				setState(2430);
				function_call();
				setState(2435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
				case 1:
					{
					setState(2431);
					as_table_alias();
					setState(2433);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
					case 1:
						{
						setState(2432);
						column_alias_list();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Change_tableContext extends ParserRuleContext {
		public TerminalNode CHANGETABLE() { return getToken(TsqlParser.CHANGETABLE, 0); }
		public TerminalNode CHANGES() { return getToken(TsqlParser.CHANGES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode NULL() { return getToken(TsqlParser.NULL, 0); }
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public Change_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterChange_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitChange_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitChange_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Change_tableContext change_table() throws RecognitionException {
		Change_tableContext _localctx = new Change_tableContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_change_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2439);
			match(CHANGETABLE);
			setState(2440);
			match(LR_BRACKET);
			setState(2441);
			match(CHANGES);
			setState(2442);
			table_name();
			setState(2443);
			match(COMMA);
			setState(2444);
			_la = _input.LA(1);
			if ( !(_la==NULL || _la==LOCAL_ID || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2445);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_partContext extends ParserRuleContext {
		public Token join_type;
		public Token join_hint;
		public TerminalNode JOIN() { return getToken(TsqlParser.JOIN, 0); }
		public Table_sourceContext table_source() {
			return getRuleContext(Table_sourceContext.class,0);
		}
		public TerminalNode ON() { return getToken(TsqlParser.ON, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(TsqlParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(TsqlParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(TsqlParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(TsqlParser.INNER, 0); }
		public TerminalNode OUTER() { return getToken(TsqlParser.OUTER, 0); }
		public TerminalNode LOOP() { return getToken(TsqlParser.LOOP, 0); }
		public TerminalNode HASH() { return getToken(TsqlParser.HASH, 0); }
		public TerminalNode MERGE() { return getToken(TsqlParser.MERGE, 0); }
		public TerminalNode REMOTE() { return getToken(TsqlParser.REMOTE, 0); }
		public TerminalNode CROSS() { return getToken(TsqlParser.CROSS, 0); }
		public TerminalNode APPLY() { return getToken(TsqlParser.APPLY, 0); }
		public Join_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterJoin_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitJoin_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitJoin_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_partContext join_part() throws RecognitionException {
		Join_partContext _localctx = new Join_partContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_join_part);
		int _la;
		try {
			setState(2473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2454);
				switch (_input.LA(1)) {
				case INNER:
				case JOIN:
				case MERGE:
				case HASH:
				case LOOP:
				case REMOTE:
					{
					setState(2448);
					_la = _input.LA(1);
					if (_la==INNER) {
						{
						setState(2447);
						match(INNER);
						}
					}

					}
					break;
				case FULL:
				case LEFT:
				case RIGHT:
					{
					setState(2450);
					((Join_partContext)_localctx).join_type = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==FULL || _la==LEFT || _la==RIGHT) ) {
						((Join_partContext)_localctx).join_type = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2452);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(2451);
						match(OUTER);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2457);
				_la = _input.LA(1);
				if (_la==MERGE || _la==HASH || _la==LOOP || _la==REMOTE) {
					{
					setState(2456);
					((Join_partContext)_localctx).join_hint = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==MERGE || _la==HASH || _la==LOOP || _la==REMOTE) ) {
						((Join_partContext)_localctx).join_hint = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(2459);
				match(JOIN);
				setState(2460);
				table_source();
				setState(2461);
				match(ON);
				setState(2462);
				search_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2464);
				match(CROSS);
				setState(2465);
				match(JOIN);
				setState(2466);
				table_source();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2467);
				match(CROSS);
				setState(2468);
				match(APPLY);
				setState(2469);
				table_source();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2470);
				match(OUTER);
				setState(2471);
				match(APPLY);
				setState(2472);
				table_source();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_name_with_hintContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public Table_name_with_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name_with_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTable_name_with_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTable_name_with_hint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTable_name_with_hint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_name_with_hintContext table_name_with_hint() throws RecognitionException {
		Table_name_with_hintContext _localctx = new Table_name_with_hintContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_table_name_with_hint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2475);
			table_name();
			setState(2477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
			case 1:
				{
				setState(2476);
				with_table_hints();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rowset_functionContext extends ParserRuleContext {
		public Token provider_name;
		public Token connectionString;
		public Token sql;
		public Token data_file;
		public TerminalNode OPENROWSET() { return getToken(TsqlParser.OPENROWSET, 0); }
		public TerminalNode LR_BRACKET() { return getToken(TsqlParser.LR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TsqlParser.COMMA, i);
		}
		public TerminalNode RR_BRACKET() { return getToken(TsqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> STRING() { return getTokens(TsqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TsqlParser.STRING, i);
		}
		public TerminalNode BULK() { return getToken(TsqlParser.BULK, 0); }
		public List<Bulk_optionContext> bulk_option() {
			return getRuleContexts(Bulk_optionContext.class);
		}
		public Bulk_optionContext bulk_option(int i) {
			return getRuleContext(Bulk_optionContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Rowset_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowset_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterRowset_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitRowset_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitRowset_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rowset_functionContext rowset_function() throws RecognitionException {
		Rowset_functionContext _localctx = new Rowset_functionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_rowset_function);
		int _la;
		try {
			setState(2505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2479);
				match(OPENROWSET);
				setState(2480);
				match(LR_BRACKET);
				setState(2481);
				((Rowset_functionContext)_localctx).provider_name = match(STRING);
				setState(2482);
				match(COMMA);
				setState(2483);
				((Rowset_functionContext)_localctx).connectionString = match(STRING);
				setState(2484);
				match(COMMA);
				setState(2485);
				((Rowset_functionContext)_localctx).sql = match(STRING);
				setState(2486);
				match(RR_BRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2487);
				match(OPENROWSET);
				setState(2488);
				match(LR_BRACKET);
				setState(2489);
				match(BULK);
				setState(2490);
				((Rowset_functionContext)_localctx).data_file = match(STRING);
				setState(2491);
				match(COMMA);
				setState(2501);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
				case 1:
					{
					setState(2492);
					bulk_option();
					setState(2497);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2493);
						match(COMMA);
						setState(2494);
						bulk_option();
						}
						}
						setState(2499);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(2500);
					id();
					}
					break;
				}
				setState(2503);
				match(RR_BRACKET);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bulk_optionContext extends ParserRuleContext {
		public Token bulk_option_value;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(TsqlParser.STRING, 0); }
		public Bulk_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulk_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterBulk_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitBulk_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitBulk_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bulk_optionContext bulk_option() throws RecognitionException {
		Bulk_optionContext _localctx = new Bulk_optionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_bulk_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2507);
			id();
			setState(2508);
			match(EQUAL);
			setState(2509);
			((Bulk_optionContext)_localctx).bulk_option_value = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL || _la==STRING) ) {
				((Bulk_optionContext)_localctx).bulk_option_value = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Derived_tableContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Derived_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDerived_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDerived_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDerived_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Derived_tableContext derived_table() throws RecognitionException {
		Derived_tableContext _localctx = new Derived_tableContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_derived_table);
		try {
			setState(2516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2511);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2512);
				match(LR_BRACKET);
				setState(2513);
				subquery();
				setState(2514);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public ExpressionContext style;
		public Token seed;
		public Token increment;
		public Ranking_windowed_functionContext ranking_windowed_function() {
			return getRuleContext(Ranking_windowed_functionContext.class,0);
		}
		public Aggregate_windowed_functionContext aggregate_windowed_function() {
			return getRuleContext(Aggregate_windowed_functionContext.class,0);
		}
		public Scalar_function_nameContext scalar_function_name() {
			return getRuleContext(Scalar_function_nameContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode BINARY_CHECKSUM() { return getToken(TsqlParser.BINARY_CHECKSUM, 0); }
		public TerminalNode CAST() { return getToken(TsqlParser.CAST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(TsqlParser.AS, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode CONVERT() { return getToken(TsqlParser.CONVERT, 0); }
		public TerminalNode CHECKSUM() { return getToken(TsqlParser.CHECKSUM, 0); }
		public TerminalNode COALESCE() { return getToken(TsqlParser.COALESCE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(TsqlParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(TsqlParser.CURRENT_USER, 0); }
		public TerminalNode DATEADD() { return getToken(TsqlParser.DATEADD, 0); }
		public TerminalNode ID() { return getToken(TsqlParser.ID, 0); }
		public TerminalNode DATEDIFF() { return getToken(TsqlParser.DATEDIFF, 0); }
		public TerminalNode DATENAME() { return getToken(TsqlParser.DATENAME, 0); }
		public TerminalNode DATEPART() { return getToken(TsqlParser.DATEPART, 0); }
		public TerminalNode IDENTITY() { return getToken(TsqlParser.IDENTITY, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(TsqlParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(TsqlParser.DECIMAL, i);
		}
		public TerminalNode MIN_ACTIVE_ROWVERSION() { return getToken(TsqlParser.MIN_ACTIVE_ROWVERSION, 0); }
		public TerminalNode NULLIF() { return getToken(TsqlParser.NULLIF, 0); }
		public TerminalNode SESSION_USER() { return getToken(TsqlParser.SESSION_USER, 0); }
		public TerminalNode SYSTEM_USER() { return getToken(TsqlParser.SYSTEM_USER, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_function_call);
		int _la;
		try {
			setState(2615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,386,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2518);
				ranking_windowed_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2519);
				aggregate_windowed_function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2520);
				scalar_function_name();
				setState(2521);
				match(LR_BRACKET);
				setState(2523);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << COALESCE) | (1L << CONVERT) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DEFAULT))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (FORCESEEK - 72)) | (1L << (IDENTITY - 72)) | (1L << (LEFT - 72)) | (1L << (NULL - 72)) | (1L << (NULLIF - 72)) | (1L << (OVER - 72)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (RIGHT - 145)) | (1L << (SESSION_USER - 145)) | (1L << (SYSTEM_USER - 145)) | (1L << (ABSOLUTE - 145)) | (1L << (APPLY - 145)) | (1L << (AUTO - 145)))) != 0) || ((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & ((1L << (AVG - 210)) | (1L << (BASE64 - 210)) | (1L << (BINARY_CHECKSUM - 210)) | (1L << (CALLER - 210)) | (1L << (CAST - 210)) | (1L << (CATCH - 210)) | (1L << (CHECKSUM - 210)) | (1L << (CHECKSUM_AGG - 210)) | (1L << (COMMITTED - 210)) | (1L << (CONCAT - 210)) | (1L << (CONTROL - 210)) | (1L << (COOKIE - 210)) | (1L << (COUNT - 210)) | (1L << (COUNT_BIG - 210)) | (1L << (DATEADD - 210)) | (1L << (DATEDIFF - 210)) | (1L << (DATENAME - 210)) | (1L << (DATEPART - 210)) | (1L << (DELAY - 210)) | (1L << (DELETED - 210)) | (1L << (DENSE_RANK - 210)) | (1L << (DISABLE - 210)) | (1L << (DYNAMIC - 210)) | (1L << (ENCRYPTION - 210)) | (1L << (EXPAND - 210)) | (1L << (FAST - 210)) | (1L << (FAST_FORWARD - 210)) | (1L << (FIRST - 210)) | (1L << (FOLLOWING - 210)) | (1L << (FORCE - 210)) | (1L << (FORCED - 210)) | (1L << (FORWARD_ONLY - 210)) | (1L << (FULLSCAN - 210)) | (1L << (GLOBAL - 210)) | (1L << (GO - 210)) | (1L << (GROUPING - 210)) | (1L << (GROUPING_ID - 210)) | (1L << (HASH - 210)))) != 0) || ((((_la - 274)) & ~0x3f) == 0 && ((1L << (_la - 274)) & ((1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 274)) | (1L << (IMPERSONATE - 274)) | (1L << (INSENSITIVE - 274)) | (1L << (INSERTED - 274)) | (1L << (ISOLATION - 274)) | (1L << (KEEP - 274)) | (1L << (KEEPFIXED - 274)) | (1L << (KEYSET - 274)) | (1L << (LAST - 274)) | (1L << (LEVEL - 274)) | (1L << (LOCAL - 274)) | (1L << (LOCK_ESCALATION - 274)) | (1L << (LOGIN - 274)) | (1L << (LOOP - 274)) | (1L << (MARK - 274)) | (1L << (MAX - 274)) | (1L << (MAXDOP - 274)) | (1L << (MAXRECURSION - 274)) | (1L << (MIN - 274)) | (1L << (MIN_ACTIVE_ROWVERSION - 274)) | (1L << (MODIFY - 274)) | (1L << (NAME - 274)) | (1L << (NEXT - 274)) | (1L << (NOCOUNT - 274)) | (1L << (NOEXPAND - 274)) | (1L << (NORECOMPUTE - 274)) | (1L << (NTILE - 274)) | (1L << (NUMBER - 274)) | (1L << (OFFSET - 274)) | (1L << (ONLINE - 274)) | (1L << (ONLY - 274)) | (1L << (OPTIMISTIC - 274)) | (1L << (OPTIMIZE - 274)) | (1L << (OUT - 274)) | (1L << (OUTPUT - 274)) | (1L << (OWNER - 274)) | (1L << (PARAMETERIZATION - 274)) | (1L << (PARTITION - 274)) | (1L << (PATH - 274)) | (1L << (PRECEDING - 274)) | (1L << (PRIOR - 274)) | (1L << (PRIVILEGES - 274)) | (1L << (RANGE - 274)) | (1L << (RANK - 274)) | (1L << (READONLY - 274)) | (1L << (READ_ONLY - 274)))) != 0) || ((((_la - 339)) & ~0x3f) == 0 && ((1L << (_la - 339)) & ((1L << (RECOMPILE - 339)) | (1L << (RELATIVE - 339)) | (1L << (REMOTE - 339)) | (1L << (REPEATABLE - 339)) | (1L << (ROBUST - 339)) | (1L << (ROOT - 339)) | (1L << (ROW - 339)) | (1L << (ROWGUID - 339)) | (1L << (ROWS - 339)) | (1L << (ROW_NUMBER - 339)) | (1L << (SAMPLE - 339)) | (1L << (SCHEMABINDING - 339)) | (1L << (SCROLL - 339)) | (1L << (SCROLL_LOCKS - 339)) | (1L << (SELF - 339)) | (1L << (SERIALIZABLE - 339)) | (1L << (SIMPLE - 339)) | (1L << (SNAPSHOT - 339)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 339)) | (1L << (STATIC - 339)) | (1L << (STATS_STREAM - 339)) | (1L << (STDEV - 339)) | (1L << (STDEVP - 339)) | (1L << (SUM - 339)) | (1L << (TEXTIMAGE_ON - 339)) | (1L << (THROW - 339)) | (1L << (TIES - 339)) | (1L << (TIME - 339)) | (1L << (TRY - 339)) | (1L << (TYPE - 339)) | (1L << (TYPE_WARNING - 339)) | (1L << (UNBOUNDED - 339)) | (1L << (UNCOMMITTED - 339)) | (1L << (UNKNOWN - 339)) | (1L << (USING - 339)) | (1L << (VAR - 339)) | (1L << (VARP - 339)) | (1L << (VIEWS - 339)) | (1L << (VIEW_METADATA - 339)) | (1L << (WORK - 339)) | (1L << (XML - 339)) | (1L << (XMLNAMESPACES - 339)) | (1L << (DOUBLE_QUOTE_ID - 339)) | (1L << (SQUARE_BRACKET_ID - 339)) | (1L << (LOCAL_ID - 339)))) != 0) || ((((_la - 403)) & ~0x3f) == 0 && ((1L << (_la - 403)) & ((1L << (DECIMAL - 403)) | (1L << (ID - 403)) | (1L << (STRING - 403)) | (1L << (BINARY - 403)) | (1L << (FLOAT - 403)) | (1L << (REAL - 403)) | (1L << (DOLLAR - 403)) | (1L << (LR_BRACKET - 403)) | (1L << (PLUS - 403)) | (1L << (MINUS - 403)) | (1L << (BIT_NOT - 403)))) != 0)) {
					{
					setState(2522);
					expression_list();
					}
				}

				setState(2525);
				match(RR_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2527);
				match(BINARY_CHECKSUM);
				setState(2528);
				match(LR_BRACKET);
				setState(2529);
				match(STAR);
				setState(2530);
				match(RR_BRACKET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2531);
				match(CAST);
				setState(2532);
				match(LR_BRACKET);
				setState(2533);
				expression(0);
				setState(2534);
				match(AS);
				setState(2535);
				data_type();
				setState(2536);
				match(RR_BRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2538);
				match(CONVERT);
				setState(2539);
				match(LR_BRACKET);
				setState(2540);
				data_type();
				setState(2541);
				match(COMMA);
				setState(2542);
				expression(0);
				setState(2545);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2543);
					match(COMMA);
					setState(2544);
					((Function_callContext)_localctx).style = expression(0);
					}
				}

				setState(2547);
				match(RR_BRACKET);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2549);
				match(CHECKSUM);
				setState(2550);
				match(LR_BRACKET);
				setState(2551);
				match(STAR);
				setState(2552);
				match(RR_BRACKET);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2553);
				match(COALESCE);
				setState(2554);
				match(LR_BRACKET);
				setState(2555);
				expression_list();
				setState(2556);
				match(RR_BRACKET);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2558);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2559);
				match(CURRENT_USER);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2560);
				match(DATEADD);
				setState(2561);
				match(LR_BRACKET);
				setState(2562);
				match(ID);
				setState(2563);
				match(COMMA);
				setState(2564);
				expression(0);
				setState(2565);
				match(COMMA);
				setState(2566);
				expression(0);
				setState(2567);
				match(RR_BRACKET);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2569);
				match(DATEDIFF);
				setState(2570);
				match(LR_BRACKET);
				setState(2571);
				match(ID);
				setState(2572);
				match(COMMA);
				setState(2573);
				expression(0);
				setState(2574);
				match(COMMA);
				setState(2575);
				expression(0);
				setState(2576);
				match(RR_BRACKET);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2578);
				match(DATENAME);
				setState(2579);
				match(LR_BRACKET);
				setState(2580);
				match(ID);
				setState(2581);
				match(COMMA);
				setState(2582);
				expression(0);
				setState(2583);
				match(RR_BRACKET);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2585);
				match(DATEPART);
				setState(2586);
				match(LR_BRACKET);
				setState(2587);
				match(ID);
				setState(2588);
				match(COMMA);
				setState(2589);
				expression(0);
				setState(2590);
				match(RR_BRACKET);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2592);
				match(IDENTITY);
				setState(2593);
				match(LR_BRACKET);
				setState(2594);
				data_type();
				setState(2597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
				case 1:
					{
					setState(2595);
					match(COMMA);
					setState(2596);
					((Function_callContext)_localctx).seed = match(DECIMAL);
					}
					break;
				}
				setState(2601);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2599);
					match(COMMA);
					setState(2600);
					((Function_callContext)_localctx).increment = match(DECIMAL);
					}
				}

				setState(2603);
				match(RR_BRACKET);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2605);
				match(MIN_ACTIVE_ROWVERSION);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2606);
				match(NULLIF);
				setState(2607);
				match(LR_BRACKET);
				setState(2608);
				expression(0);
				setState(2609);
				match(COMMA);
				setState(2610);
				expression(0);
				setState(2611);
				match(RR_BRACKET);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2613);
				match(SESSION_USER);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2614);
				match(SYSTEM_USER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_sectionContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(TsqlParser.WHEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(TsqlParser.THEN, 0); }
		public Switch_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSwitch_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSwitch_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSwitch_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_sectionContext switch_section() throws RecognitionException {
		Switch_sectionContext _localctx = new Switch_sectionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_switch_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2617);
			match(WHEN);
			setState(2618);
			expression(0);
			setState(2619);
			match(THEN);
			setState(2620);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_search_condition_sectionContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(TsqlParser.WHEN, 0); }
		public Search_conditionContext search_condition() {
			return getRuleContext(Search_conditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(TsqlParser.THEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Switch_search_condition_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_search_condition_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSwitch_search_condition_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSwitch_search_condition_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSwitch_search_condition_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_search_condition_sectionContext switch_search_condition_section() throws RecognitionException {
		Switch_search_condition_sectionContext _localctx = new Switch_search_condition_sectionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_switch_search_condition_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2622);
			match(WHEN);
			setState(2623);
			search_condition();
			setState(2624);
			match(THEN);
			setState(2625);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class As_table_aliasContext extends ParserRuleContext {
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(TsqlParser.AS, 0); }
		public As_table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterAs_table_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitAs_table_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitAs_table_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final As_table_aliasContext as_table_alias() throws RecognitionException {
		As_table_aliasContext _localctx = new As_table_aliasContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_as_table_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2628);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2627);
				match(AS);
				}
			}

			setState(2630);
			table_alias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public With_table_hintsContext with_table_hints() {
			return getRuleContext(With_table_hintsContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2632);
			id();
			setState(2634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
			case 1:
				{
				setState(2633);
				with_table_hints();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_table_hintsContext extends ParserRuleContext {
		public List<Table_hintContext> table_hint() {
			return getRuleContexts(Table_hintContext.class);
		}
		public Table_hintContext table_hint(int i) {
			return getRuleContext(Table_hintContext.class,i);
		}
		public TerminalNode WITH() { return getToken(TsqlParser.WITH, 0); }
		public With_table_hintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_table_hints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterWith_table_hints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitWith_table_hints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitWith_table_hints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_table_hintsContext with_table_hints() throws RecognitionException {
		With_table_hintsContext _localctx = new With_table_hintsContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_with_table_hints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2637);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2636);
				match(WITH);
				}
			}

			setState(2639);
			match(LR_BRACKET);
			setState(2640);
			table_hint();
			setState(2645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2641);
				match(COMMA);
				setState(2642);
				table_hint();
				}
				}
				setState(2647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2648);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_with_table_hintsContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(TsqlParser.WITH, 0); }
		public List<Table_hintContext> table_hint() {
			return getRuleContexts(Table_hintContext.class);
		}
		public Table_hintContext table_hint(int i) {
			return getRuleContext(Table_hintContext.class,i);
		}
		public Insert_with_table_hintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_with_table_hints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterInsert_with_table_hints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitInsert_with_table_hints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitInsert_with_table_hints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_with_table_hintsContext insert_with_table_hints() throws RecognitionException {
		Insert_with_table_hintsContext _localctx = new Insert_with_table_hintsContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_insert_with_table_hints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2650);
			match(WITH);
			setState(2651);
			match(LR_BRACKET);
			setState(2652);
			table_hint();
			setState(2657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2653);
				match(COMMA);
				setState(2654);
				table_hint();
				}
				}
				setState(2659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2660);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_hintContext extends ParserRuleContext {
		public TerminalNode NOEXPAND() { return getToken(TsqlParser.NOEXPAND, 0); }
		public TerminalNode INDEX() { return getToken(TsqlParser.INDEX, 0); }
		public List<Index_valueContext> index_value() {
			return getRuleContexts(Index_valueContext.class);
		}
		public Index_valueContext index_value(int i) {
			return getRuleContext(Index_valueContext.class,i);
		}
		public TerminalNode FORCESEEK() { return getToken(TsqlParser.FORCESEEK, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(TsqlParser.SERIALIZABLE, 0); }
		public TerminalNode SNAPSHOT() { return getToken(TsqlParser.SNAPSHOT, 0); }
		public TerminalNode SPATIAL_WINDOW_MAX_CELLS() { return getToken(TsqlParser.SPATIAL_WINDOW_MAX_CELLS, 0); }
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public List<TerminalNode> ID() { return getTokens(TsqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TsqlParser.ID, i);
		}
		public Table_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTable_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTable_hint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTable_hint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_hintContext table_hint() throws RecognitionException {
		Table_hintContext _localctx = new Table_hintContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_table_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2663);
			_la = _input.LA(1);
			if (_la==NOEXPAND) {
				{
				setState(2662);
				match(NOEXPAND);
				}
			}

			setState(2703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
			case 1:
				{
				setState(2665);
				match(INDEX);
				setState(2666);
				match(LR_BRACKET);
				setState(2667);
				index_value();
				setState(2672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2668);
					match(COMMA);
					setState(2669);
					index_value();
					}
					}
					setState(2674);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2675);
				match(RR_BRACKET);
				}
				break;
			case 2:
				{
				setState(2677);
				match(INDEX);
				setState(2678);
				match(EQUAL);
				setState(2679);
				index_value();
				}
				break;
			case 3:
				{
				setState(2680);
				match(FORCESEEK);
				setState(2695);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(2681);
					match(LR_BRACKET);
					setState(2682);
					index_value();
					setState(2683);
					match(LR_BRACKET);
					setState(2684);
					match(ID);
					setState(2689);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2685);
						match(COMMA);
						setState(2686);
						match(ID);
						}
						}
						setState(2691);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2692);
					match(RR_BRACKET);
					setState(2693);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case 4:
				{
				setState(2697);
				match(SERIALIZABLE);
				}
				break;
			case 5:
				{
				setState(2698);
				match(SNAPSHOT);
				}
				break;
			case 6:
				{
				setState(2699);
				match(SPATIAL_WINDOW_MAX_CELLS);
				setState(2700);
				match(EQUAL);
				setState(2701);
				match(DECIMAL);
				}
				break;
			case 7:
				{
				setState(2702);
				match(ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_valueContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public Index_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterIndex_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitIndex_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitIndex_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_valueContext index_value() throws RecognitionException {
		Index_valueContext _localctx = new Index_valueContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_index_value);
		try {
			setState(2707);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2705);
				id();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2706);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_alias_listContext extends ParserRuleContext {
		public List<Column_aliasContext> column_alias() {
			return getRuleContexts(Column_aliasContext.class);
		}
		public Column_aliasContext column_alias(int i) {
			return getRuleContext(Column_aliasContext.class,i);
		}
		public Column_alias_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterColumn_alias_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitColumn_alias_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitColumn_alias_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_alias_listContext column_alias_list() throws RecognitionException {
		Column_alias_listContext _localctx = new Column_alias_listContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_column_alias_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2709);
			match(LR_BRACKET);
			setState(2710);
			column_alias();
			setState(2715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2711);
				match(COMMA);
				setState(2712);
				column_alias();
				}
				}
				setState(2717);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2718);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STRING() { return getToken(TsqlParser.STRING, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_column_alias);
		try {
			setState(2722);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2720);
				id();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2721);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_value_constructorContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(TsqlParser.VALUES, 0); }
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public Table_value_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_value_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTable_value_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTable_value_constructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTable_value_constructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_value_constructorContext table_value_constructor() throws RecognitionException {
		Table_value_constructorContext _localctx = new Table_value_constructorContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_table_value_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2724);
			match(VALUES);
			setState(2725);
			match(LR_BRACKET);
			setState(2726);
			expression_list();
			setState(2727);
			match(RR_BRACKET);
			setState(2735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2728);
				match(COMMA);
				setState(2729);
				match(LR_BRACKET);
				setState(2730);
				expression_list();
				setState(2731);
				match(RR_BRACKET);
				}
				}
				setState(2737);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2738);
			expression(0);
			setState(2743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2739);
				match(COMMA);
				setState(2740);
				expression(0);
				}
				}
				setState(2745);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ranking_windowed_functionContext extends ParserRuleContext {
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public TerminalNode RANK() { return getToken(TsqlParser.RANK, 0); }
		public TerminalNode DENSE_RANK() { return getToken(TsqlParser.DENSE_RANK, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(TsqlParser.ROW_NUMBER, 0); }
		public TerminalNode NTILE() { return getToken(TsqlParser.NTILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Ranking_windowed_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ranking_windowed_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterRanking_windowed_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitRanking_windowed_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitRanking_windowed_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ranking_windowed_functionContext ranking_windowed_function() throws RecognitionException {
		Ranking_windowed_functionContext _localctx = new Ranking_windowed_functionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_ranking_windowed_function);
		int _la;
		try {
			setState(2756);
			switch (_input.LA(1)) {
			case DENSE_RANK:
			case RANK:
			case ROW_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2746);
				_la = _input.LA(1);
				if ( !(_la==DENSE_RANK || _la==RANK || _la==ROW_NUMBER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2747);
				match(LR_BRACKET);
				setState(2748);
				match(RR_BRACKET);
				setState(2749);
				over_clause();
				}
				break;
			case NTILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2750);
				match(NTILE);
				setState(2751);
				match(LR_BRACKET);
				setState(2752);
				expression(0);
				setState(2753);
				match(RR_BRACKET);
				setState(2754);
				over_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_windowed_functionContext extends ParserRuleContext {
		public All_distinct_expressionContext all_distinct_expression() {
			return getRuleContext(All_distinct_expressionContext.class,0);
		}
		public TerminalNode AVG() { return getToken(TsqlParser.AVG, 0); }
		public TerminalNode MAX() { return getToken(TsqlParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(TsqlParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(TsqlParser.SUM, 0); }
		public TerminalNode STDEV() { return getToken(TsqlParser.STDEV, 0); }
		public TerminalNode STDEVP() { return getToken(TsqlParser.STDEVP, 0); }
		public TerminalNode VAR() { return getToken(TsqlParser.VAR, 0); }
		public TerminalNode VARP() { return getToken(TsqlParser.VARP, 0); }
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public TerminalNode COUNT() { return getToken(TsqlParser.COUNT, 0); }
		public TerminalNode COUNT_BIG() { return getToken(TsqlParser.COUNT_BIG, 0); }
		public TerminalNode CHECKSUM_AGG() { return getToken(TsqlParser.CHECKSUM_AGG, 0); }
		public TerminalNode GROUPING() { return getToken(TsqlParser.GROUPING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode GROUPING_ID() { return getToken(TsqlParser.GROUPING_ID, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Aggregate_windowed_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_windowed_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterAggregate_windowed_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitAggregate_windowed_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitAggregate_windowed_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_windowed_functionContext aggregate_windowed_function() throws RecognitionException {
		Aggregate_windowed_functionContext _localctx = new Aggregate_windowed_functionContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_aggregate_windowed_function);
		int _la;
		try {
			setState(2790);
			switch (_input.LA(1)) {
			case AVG:
			case MAX:
			case MIN:
			case STDEV:
			case STDEVP:
			case SUM:
			case VAR:
			case VARP:
				enterOuterAlt(_localctx, 1);
				{
				setState(2758);
				_la = _input.LA(1);
				if ( !(_la==AVG || _la==MAX || _la==MIN || ((((_la - 367)) & ~0x3f) == 0 && ((1L << (_la - 367)) & ((1L << (STDEV - 367)) | (1L << (STDEVP - 367)) | (1L << (SUM - 367)) | (1L << (VAR - 367)) | (1L << (VARP - 367)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2759);
				match(LR_BRACKET);
				setState(2760);
				all_distinct_expression();
				setState(2761);
				match(RR_BRACKET);
				setState(2763);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
				case 1:
					{
					setState(2762);
					over_clause();
					}
					break;
				}
				}
				break;
			case COUNT:
			case COUNT_BIG:
				enterOuterAlt(_localctx, 2);
				{
				setState(2765);
				_la = _input.LA(1);
				if ( !(_la==COUNT || _la==COUNT_BIG) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(2766);
				match(LR_BRACKET);
				setState(2769);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(2767);
					match(STAR);
					}
					break;
				case ALL:
				case CASE:
				case COALESCE:
				case CONVERT:
				case CURRENT_TIMESTAMP:
				case CURRENT_USER:
				case DEFAULT:
				case DISTINCT:
				case FORCESEEK:
				case IDENTITY:
				case LEFT:
				case NULL:
				case NULLIF:
				case OVER:
				case RIGHT:
				case SESSION_USER:
				case SYSTEM_USER:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case BINARY_CHECKSUM:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DATEADD:
				case DATEDIFF:
				case DATENAME:
				case DATEPART:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MIN_ACTIVE_ROWVERSION:
				case MODIFY:
				case NAME:
				case NEXT:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case LOCAL_ID:
				case DECIMAL:
				case ID:
				case STRING:
				case BINARY:
				case FLOAT:
				case REAL:
				case DOLLAR:
				case LR_BRACKET:
				case PLUS:
				case MINUS:
				case BIT_NOT:
					{
					setState(2768);
					all_distinct_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2771);
				match(RR_BRACKET);
				setState(2773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,405,_ctx) ) {
				case 1:
					{
					setState(2772);
					over_clause();
					}
					break;
				}
				}
				break;
			case CHECKSUM_AGG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2775);
				match(CHECKSUM_AGG);
				setState(2776);
				match(LR_BRACKET);
				setState(2777);
				all_distinct_expression();
				setState(2778);
				match(RR_BRACKET);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2780);
				match(GROUPING);
				setState(2781);
				match(LR_BRACKET);
				setState(2782);
				expression(0);
				setState(2783);
				match(RR_BRACKET);
				}
				break;
			case GROUPING_ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(2785);
				match(GROUPING_ID);
				setState(2786);
				match(LR_BRACKET);
				setState(2787);
				expression_list();
				setState(2788);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_distinct_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ALL() { return getToken(TsqlParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(TsqlParser.DISTINCT, 0); }
		public All_distinct_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_distinct_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterAll_distinct_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitAll_distinct_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitAll_distinct_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_distinct_expressionContext all_distinct_expression() throws RecognitionException {
		All_distinct_expressionContext _localctx = new All_distinct_expressionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_all_distinct_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2793);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(2792);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(2795);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Over_clauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(TsqlParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(TsqlParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(TsqlParser.BY, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Row_or_range_clauseContext row_or_range_clause() {
			return getRuleContext(Row_or_range_clauseContext.class,0);
		}
		public Over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterOver_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitOver_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitOver_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Over_clauseContext over_clause() throws RecognitionException {
		Over_clauseContext _localctx = new Over_clauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2797);
			match(OVER);
			setState(2798);
			match(LR_BRACKET);
			setState(2802);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2799);
				match(PARTITION);
				setState(2800);
				match(BY);
				setState(2801);
				expression_list();
				}
			}

			setState(2805);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(2804);
				order_by_clause();
				}
			}

			setState(2808);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(2807);
				row_or_range_clause();
				}
			}

			setState(2810);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_or_range_clauseContext extends ParserRuleContext {
		public Window_frame_extentContext window_frame_extent() {
			return getRuleContext(Window_frame_extentContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(TsqlParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(TsqlParser.RANGE, 0); }
		public Row_or_range_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_or_range_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterRow_or_range_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitRow_or_range_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitRow_or_range_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_or_range_clauseContext row_or_range_clause() throws RecognitionException {
		Row_or_range_clauseContext _localctx = new Row_or_range_clauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_row_or_range_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2812);
			_la = _input.LA(1);
			if ( !(_la==RANGE || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(2813);
			window_frame_extent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_extentContext extends ParserRuleContext {
		public Window_frame_precedingContext window_frame_preceding() {
			return getRuleContext(Window_frame_precedingContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(TsqlParser.BETWEEN, 0); }
		public List<Window_frame_boundContext> window_frame_bound() {
			return getRuleContexts(Window_frame_boundContext.class);
		}
		public Window_frame_boundContext window_frame_bound(int i) {
			return getRuleContext(Window_frame_boundContext.class,i);
		}
		public TerminalNode AND() { return getToken(TsqlParser.AND, 0); }
		public Window_frame_extentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_extent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterWindow_frame_extent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitWindow_frame_extent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitWindow_frame_extent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_extentContext window_frame_extent() throws RecognitionException {
		Window_frame_extentContext _localctx = new Window_frame_extentContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_window_frame_extent);
		try {
			setState(2821);
			switch (_input.LA(1)) {
			case CURRENT:
			case UNBOUNDED:
			case DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2815);
				window_frame_preceding();
				}
				break;
			case BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2816);
				match(BETWEEN);
				setState(2817);
				window_frame_bound();
				setState(2818);
				match(AND);
				setState(2819);
				window_frame_bound();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_boundContext extends ParserRuleContext {
		public Window_frame_precedingContext window_frame_preceding() {
			return getRuleContext(Window_frame_precedingContext.class,0);
		}
		public Window_frame_followingContext window_frame_following() {
			return getRuleContext(Window_frame_followingContext.class,0);
		}
		public Window_frame_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterWindow_frame_bound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitWindow_frame_bound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitWindow_frame_bound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_boundContext window_frame_bound() throws RecognitionException {
		Window_frame_boundContext _localctx = new Window_frame_boundContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_window_frame_bound);
		try {
			setState(2825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,412,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2823);
				window_frame_preceding();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2824);
				window_frame_following();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_precedingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(TsqlParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(TsqlParser.PRECEDING, 0); }
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public TerminalNode CURRENT() { return getToken(TsqlParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(TsqlParser.ROW, 0); }
		public Window_frame_precedingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_preceding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterWindow_frame_preceding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitWindow_frame_preceding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitWindow_frame_preceding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_precedingContext window_frame_preceding() throws RecognitionException {
		Window_frame_precedingContext _localctx = new Window_frame_precedingContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_window_frame_preceding);
		try {
			setState(2833);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(2827);
				match(UNBOUNDED);
				setState(2828);
				match(PRECEDING);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2829);
				match(DECIMAL);
				setState(2830);
				match(PRECEDING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2831);
				match(CURRENT);
				setState(2832);
				match(ROW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_followingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(TsqlParser.UNBOUNDED, 0); }
		public TerminalNode FOLLOWING() { return getToken(TsqlParser.FOLLOWING, 0); }
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public Window_frame_followingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_following; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterWindow_frame_following(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitWindow_frame_following(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitWindow_frame_following(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_frame_followingContext window_frame_following() throws RecognitionException {
		Window_frame_followingContext _localctx = new Window_frame_followingContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_window_frame_following);
		try {
			setState(2839);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(2835);
				match(UNBOUNDED);
				setState(2836);
				match(FOLLOWING);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2837);
				match(DECIMAL);
				setState(2838);
				match(FOLLOWING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_optionContext extends ParserRuleContext {
		public TerminalNode FILESTREAM() { return getToken(TsqlParser.FILESTREAM, 0); }
		public List<Database_filestream_optionContext> database_filestream_option() {
			return getRuleContexts(Database_filestream_optionContext.class);
		}
		public Database_filestream_optionContext database_filestream_option(int i) {
			return getRuleContext(Database_filestream_optionContext.class,i);
		}
		public TerminalNode DEFAULT_LANGUAGE() { return getToken(TsqlParser.DEFAULT_LANGUAGE, 0); }
		public TerminalNode EQUAL() { return getToken(TsqlParser.EQUAL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STRING() { return getToken(TsqlParser.STRING, 0); }
		public TerminalNode DEFAULT_FULLTEXT_LANGUAGE() { return getToken(TsqlParser.DEFAULT_FULLTEXT_LANGUAGE, 0); }
		public TerminalNode NESTED_TRIGGERS() { return getToken(TsqlParser.NESTED_TRIGGERS, 0); }
		public TerminalNode OFF() { return getToken(TsqlParser.OFF, 0); }
		public TerminalNode ON() { return getToken(TsqlParser.ON, 0); }
		public TerminalNode TRANSFORM_NOISE_WORDS() { return getToken(TsqlParser.TRANSFORM_NOISE_WORDS, 0); }
		public TerminalNode TWO_DIGIT_YEAR_CUTOFF() { return getToken(TsqlParser.TWO_DIGIT_YEAR_CUTOFF, 0); }
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public TerminalNode DB_CHAINING() { return getToken(TsqlParser.DB_CHAINING, 0); }
		public TerminalNode TRUSTWORTHY() { return getToken(TsqlParser.TRUSTWORTHY, 0); }
		public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterCreate_database_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitCreate_database_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitCreate_database_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_create_database_option);
		int _la;
		try {
			int _alt;
			setState(2875);
			switch (_input.LA(1)) {
			case FILESTREAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(2841);
				match(FILESTREAM);
				{
				setState(2842);
				database_filestream_option();
				setState(2847);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,415,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2843);
						match(COMMA);
						setState(2844);
						database_filestream_option();
						}
						} 
					}
					setState(2849);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,415,_ctx);
				}
				}
				}
				break;
			case DEFAULT_LANGUAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2850);
				match(DEFAULT_LANGUAGE);
				setState(2851);
				match(EQUAL);
				setState(2854);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NEXT:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(2852);
					id();
					}
					break;
				case STRING:
					{
					setState(2853);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DEFAULT_FULLTEXT_LANGUAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2856);
				match(DEFAULT_FULLTEXT_LANGUAGE);
				setState(2857);
				match(EQUAL);
				setState(2860);
				switch (_input.LA(1)) {
				case FORCESEEK:
				case ABSOLUTE:
				case APPLY:
				case AUTO:
				case AVG:
				case BASE64:
				case CALLER:
				case CAST:
				case CATCH:
				case CHECKSUM_AGG:
				case COMMITTED:
				case CONCAT:
				case CONTROL:
				case COOKIE:
				case COUNT:
				case COUNT_BIG:
				case DELAY:
				case DELETED:
				case DENSE_RANK:
				case DISABLE:
				case DYNAMIC:
				case ENCRYPTION:
				case EXPAND:
				case FAST:
				case FAST_FORWARD:
				case FIRST:
				case FOLLOWING:
				case FORCE:
				case FORCED:
				case FORWARD_ONLY:
				case FULLSCAN:
				case GLOBAL:
				case GO:
				case GROUPING:
				case GROUPING_ID:
				case HASH:
				case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
				case IMPERSONATE:
				case INSENSITIVE:
				case INSERTED:
				case ISOLATION:
				case KEEP:
				case KEEPFIXED:
				case KEYSET:
				case LAST:
				case LEVEL:
				case LOCAL:
				case LOCK_ESCALATION:
				case LOGIN:
				case LOOP:
				case MARK:
				case MAX:
				case MAXDOP:
				case MAXRECURSION:
				case MIN:
				case MODIFY:
				case NAME:
				case NEXT:
				case NOCOUNT:
				case NOEXPAND:
				case NORECOMPUTE:
				case NTILE:
				case NUMBER:
				case OFFSET:
				case ONLINE:
				case ONLY:
				case OPTIMISTIC:
				case OPTIMIZE:
				case OUT:
				case OUTPUT:
				case OWNER:
				case PARAMETERIZATION:
				case PARTITION:
				case PATH:
				case PRECEDING:
				case PRIOR:
				case PRIVILEGES:
				case RANGE:
				case RANK:
				case READONLY:
				case READ_ONLY:
				case RECOMPILE:
				case RELATIVE:
				case REMOTE:
				case REPEATABLE:
				case ROBUST:
				case ROOT:
				case ROW:
				case ROWGUID:
				case ROWS:
				case ROW_NUMBER:
				case SAMPLE:
				case SCHEMABINDING:
				case SCROLL:
				case SCROLL_LOCKS:
				case SELF:
				case SERIALIZABLE:
				case SIMPLE:
				case SNAPSHOT:
				case SPATIAL_WINDOW_MAX_CELLS:
				case STATIC:
				case STATS_STREAM:
				case STDEV:
				case STDEVP:
				case SUM:
				case TEXTIMAGE_ON:
				case THROW:
				case TIES:
				case TIME:
				case TRY:
				case TYPE:
				case TYPE_WARNING:
				case UNBOUNDED:
				case UNCOMMITTED:
				case UNKNOWN:
				case USING:
				case VAR:
				case VARP:
				case VIEWS:
				case VIEW_METADATA:
				case WORK:
				case XML:
				case XMLNAMESPACES:
				case DOUBLE_QUOTE_ID:
				case SQUARE_BRACKET_ID:
				case ID:
					{
					setState(2858);
					id();
					}
					break;
				case STRING:
					{
					setState(2859);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NESTED_TRIGGERS:
				enterOuterAlt(_localctx, 4);
				{
				setState(2862);
				match(NESTED_TRIGGERS);
				setState(2863);
				match(EQUAL);
				setState(2864);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case TRANSFORM_NOISE_WORDS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2865);
				match(TRANSFORM_NOISE_WORDS);
				setState(2866);
				match(EQUAL);
				setState(2867);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case TWO_DIGIT_YEAR_CUTOFF:
				enterOuterAlt(_localctx, 6);
				{
				setState(2868);
				match(TWO_DIGIT_YEAR_CUTOFF);
				setState(2869);
				match(EQUAL);
				setState(2870);
				match(DECIMAL);
				}
				break;
			case DB_CHAINING:
				enterOuterAlt(_localctx, 7);
				{
				setState(2871);
				match(DB_CHAINING);
				setState(2872);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case TRUSTWORTHY:
				enterOuterAlt(_localctx, 8);
				{
				setState(2873);
				match(TRUSTWORTHY);
				setState(2874);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_filestream_optionContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(TsqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(TsqlParser.RR_BRACKET, 0); }
		public TerminalNode NON_TRANSACTED_ACCESS() { return getToken(TsqlParser.NON_TRANSACTED_ACCESS, 0); }
		public TerminalNode EQUAL() { return getToken(TsqlParser.EQUAL, 0); }
		public TerminalNode DIRECTORY_NAME() { return getToken(TsqlParser.DIRECTORY_NAME, 0); }
		public TerminalNode STRING() { return getToken(TsqlParser.STRING, 0); }
		public TerminalNode OFF() { return getToken(TsqlParser.OFF, 0); }
		public TerminalNode READ_ONLY() { return getToken(TsqlParser.READ_ONLY, 0); }
		public TerminalNode FULL() { return getToken(TsqlParser.FULL, 0); }
		public Database_filestream_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_filestream_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDatabase_filestream_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDatabase_filestream_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDatabase_filestream_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_filestream_optionContext database_filestream_option() throws RecognitionException {
		Database_filestream_optionContext _localctx = new Database_filestream_optionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_database_filestream_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2877);
			match(LR_BRACKET);
			setState(2884);
			switch (_input.LA(1)) {
			case NON_TRANSACTED_ACCESS:
				{
				{
				setState(2878);
				match(NON_TRANSACTED_ACCESS);
				setState(2879);
				match(EQUAL);
				setState(2880);
				_la = _input.LA(1);
				if ( !(_la==FULL || _la==OFF || _la==READ_ONLY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				break;
			case DIRECTORY_NAME:
				{
				{
				setState(2881);
				match(DIRECTORY_NAME);
				setState(2882);
				match(EQUAL);
				setState(2883);
				match(STRING);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2886);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_file_specContext extends ParserRuleContext {
		public File_groupContext file_group() {
			return getRuleContext(File_groupContext.class,0);
		}
		public File_specContext file_spec() {
			return getRuleContext(File_specContext.class,0);
		}
		public Database_file_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_file_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDatabase_file_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDatabase_file_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDatabase_file_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_file_specContext database_file_spec() throws RecognitionException {
		Database_file_specContext _localctx = new Database_file_specContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_database_file_spec);
		try {
			setState(2890);
			switch (_input.LA(1)) {
			case FILEGROUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(2888);
				file_group();
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(2889);
				file_spec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_groupContext extends ParserRuleContext {
		public TerminalNode FILEGROUP() { return getToken(TsqlParser.FILEGROUP, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<File_specContext> file_spec() {
			return getRuleContexts(File_specContext.class);
		}
		public File_specContext file_spec(int i) {
			return getRuleContext(File_specContext.class,i);
		}
		public List<TerminalNode> CONTAINS() { return getTokens(TsqlParser.CONTAINS); }
		public TerminalNode CONTAINS(int i) {
			return getToken(TsqlParser.CONTAINS, i);
		}
		public TerminalNode FILESTREAM() { return getToken(TsqlParser.FILESTREAM, 0); }
		public TerminalNode DEFAULT() { return getToken(TsqlParser.DEFAULT, 0); }
		public TerminalNode MEMORY_OPTIMIZED_DATA() { return getToken(TsqlParser.MEMORY_OPTIMIZED_DATA, 0); }
		public File_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterFile_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitFile_group(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitFile_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_groupContext file_group() throws RecognitionException {
		File_groupContext _localctx = new File_groupContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_file_group);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2892);
			match(FILEGROUP);
			setState(2893);
			id();
			setState(2896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,421,_ctx) ) {
			case 1:
				{
				setState(2894);
				match(CONTAINS);
				setState(2895);
				match(FILESTREAM);
				}
				break;
			}
			setState(2899);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(2898);
				match(DEFAULT);
				}
			}

			setState(2903);
			_la = _input.LA(1);
			if (_la==CONTAINS) {
				{
				setState(2901);
				match(CONTAINS);
				setState(2902);
				match(MEMORY_OPTIMIZED_DATA);
				}
			}

			setState(2905);
			file_spec();
			setState(2910);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,424,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2906);
					match(COMMA);
					setState(2907);
					file_spec();
					}
					} 
				}
				setState(2912);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,424,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_specContext extends ParserRuleContext {
		public Token file;
		public TerminalNode LR_BRACKET() { return getToken(TsqlParser.LR_BRACKET, 0); }
		public TerminalNode NAME() { return getToken(TsqlParser.NAME, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(TsqlParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(TsqlParser.EQUAL, i);
		}
		public TerminalNode FILENAME() { return getToken(TsqlParser.FILENAME, 0); }
		public TerminalNode RR_BRACKET() { return getToken(TsqlParser.RR_BRACKET, 0); }
		public List<TerminalNode> STRING() { return getTokens(TsqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TsqlParser.STRING, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SIZE() { return getToken(TsqlParser.SIZE, 0); }
		public List<File_sizeContext> file_size() {
			return getRuleContexts(File_sizeContext.class);
		}
		public File_sizeContext file_size(int i) {
			return getRuleContext(File_sizeContext.class,i);
		}
		public TerminalNode MAXSIZE() { return getToken(TsqlParser.MAXSIZE, 0); }
		public TerminalNode FILEGROWTH() { return getToken(TsqlParser.FILEGROWTH, 0); }
		public TerminalNode UNLIMITED() { return getToken(TsqlParser.UNLIMITED, 0); }
		public File_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterFile_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitFile_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitFile_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_specContext file_spec() throws RecognitionException {
		File_specContext _localctx = new File_specContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_file_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2913);
			match(LR_BRACKET);
			setState(2914);
			match(NAME);
			setState(2915);
			match(EQUAL);
			setState(2918);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				{
				setState(2916);
				id();
				}
				break;
			case STRING:
				{
				setState(2917);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2921);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2920);
				match(COMMA);
				}
			}

			setState(2923);
			match(FILENAME);
			setState(2924);
			match(EQUAL);
			setState(2925);
			((File_specContext)_localctx).file = match(STRING);
			setState(2927);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2926);
				match(COMMA);
				}
			}

			setState(2935);
			_la = _input.LA(1);
			if (_la==SIZE) {
				{
				setState(2929);
				match(SIZE);
				setState(2930);
				match(EQUAL);
				setState(2931);
				file_size();
				setState(2933);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2932);
					match(COMMA);
					}
				}

				}
			}

			setState(2946);
			_la = _input.LA(1);
			if (_la==MAXSIZE) {
				{
				setState(2937);
				match(MAXSIZE);
				setState(2938);
				match(EQUAL);
				setState(2941);
				switch (_input.LA(1)) {
				case DECIMAL:
					{
					setState(2939);
					file_size();
					}
					break;
				case UNLIMITED:
					{
					setState(2940);
					match(UNLIMITED);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2944);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2943);
					match(COMMA);
					}
				}

				}
			}

			setState(2954);
			_la = _input.LA(1);
			if (_la==FILEGROWTH) {
				{
				setState(2948);
				match(FILEGROWTH);
				setState(2949);
				match(EQUAL);
				setState(2950);
				file_size();
				setState(2952);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2951);
					match(COMMA);
					}
				}

				}
			}

			setState(2956);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Full_table_nameContext extends ParserRuleContext {
		public IdContext server;
		public IdContext database;
		public IdContext schema;
		public IdContext table;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Full_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterFull_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitFull_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitFull_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Full_table_nameContext full_table_name() throws RecognitionException {
		Full_table_nameContext _localctx = new Full_table_nameContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_full_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,436,_ctx) ) {
			case 1:
				{
				setState(2958);
				((Full_table_nameContext)_localctx).server = id();
				setState(2959);
				match(DOT);
				setState(2960);
				((Full_table_nameContext)_localctx).database = id();
				setState(2961);
				match(DOT);
				setState(2962);
				((Full_table_nameContext)_localctx).schema = id();
				setState(2963);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(2965);
				((Full_table_nameContext)_localctx).database = id();
				setState(2966);
				match(DOT);
				setState(2968);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (ABSOLUTE - 193)) | (1L << (APPLY - 193)) | (1L << (AUTO - 193)) | (1L << (AVG - 193)) | (1L << (BASE64 - 193)) | (1L << (CALLER - 193)) | (1L << (CAST - 193)) | (1L << (CATCH - 193)) | (1L << (CHECKSUM_AGG - 193)) | (1L << (COMMITTED - 193)) | (1L << (CONCAT - 193)) | (1L << (CONTROL - 193)) | (1L << (COOKIE - 193)) | (1L << (COUNT - 193)) | (1L << (COUNT_BIG - 193)) | (1L << (DELAY - 193)) | (1L << (DELETED - 193)) | (1L << (DENSE_RANK - 193)) | (1L << (DISABLE - 193)) | (1L << (DYNAMIC - 193)) | (1L << (ENCRYPTION - 193)) | (1L << (EXPAND - 193)) | (1L << (FAST - 193)) | (1L << (FAST_FORWARD - 193)))) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (FIRST - 259)) | (1L << (FOLLOWING - 259)) | (1L << (FORCE - 259)) | (1L << (FORCED - 259)) | (1L << (FORWARD_ONLY - 259)) | (1L << (FULLSCAN - 259)) | (1L << (GLOBAL - 259)) | (1L << (GO - 259)) | (1L << (GROUPING - 259)) | (1L << (GROUPING_ID - 259)) | (1L << (HASH - 259)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 259)) | (1L << (IMPERSONATE - 259)) | (1L << (INSENSITIVE - 259)) | (1L << (INSERTED - 259)) | (1L << (ISOLATION - 259)) | (1L << (KEEP - 259)) | (1L << (KEEPFIXED - 259)) | (1L << (KEYSET - 259)) | (1L << (LAST - 259)) | (1L << (LEVEL - 259)) | (1L << (LOCAL - 259)) | (1L << (LOCK_ESCALATION - 259)) | (1L << (LOGIN - 259)) | (1L << (LOOP - 259)) | (1L << (MARK - 259)) | (1L << (MAX - 259)) | (1L << (MAXDOP - 259)) | (1L << (MAXRECURSION - 259)) | (1L << (MIN - 259)) | (1L << (MODIFY - 259)) | (1L << (NAME - 259)) | (1L << (NEXT - 259)) | (1L << (NOCOUNT - 259)) | (1L << (NOEXPAND - 259)) | (1L << (NORECOMPUTE - 259)) | (1L << (NTILE - 259)) | (1L << (NUMBER - 259)) | (1L << (OFFSET - 259)) | (1L << (ONLINE - 259)) | (1L << (ONLY - 259)) | (1L << (OPTIMISTIC - 259)) | (1L << (OPTIMIZE - 259)) | (1L << (OUT - 259)))) != 0) || ((((_la - 323)) & ~0x3f) == 0 && ((1L << (_la - 323)) & ((1L << (OUTPUT - 323)) | (1L << (OWNER - 323)) | (1L << (PARAMETERIZATION - 323)) | (1L << (PARTITION - 323)) | (1L << (PATH - 323)) | (1L << (PRECEDING - 323)) | (1L << (PRIOR - 323)) | (1L << (PRIVILEGES - 323)) | (1L << (RANGE - 323)) | (1L << (RANK - 323)) | (1L << (READONLY - 323)) | (1L << (READ_ONLY - 323)) | (1L << (RECOMPILE - 323)) | (1L << (RELATIVE - 323)) | (1L << (REMOTE - 323)) | (1L << (REPEATABLE - 323)) | (1L << (ROBUST - 323)) | (1L << (ROOT - 323)) | (1L << (ROW - 323)) | (1L << (ROWGUID - 323)) | (1L << (ROWS - 323)) | (1L << (ROW_NUMBER - 323)) | (1L << (SAMPLE - 323)) | (1L << (SCHEMABINDING - 323)) | (1L << (SCROLL - 323)) | (1L << (SCROLL_LOCKS - 323)) | (1L << (SELF - 323)) | (1L << (SERIALIZABLE - 323)) | (1L << (SIMPLE - 323)) | (1L << (SNAPSHOT - 323)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 323)) | (1L << (STATIC - 323)) | (1L << (STATS_STREAM - 323)) | (1L << (STDEV - 323)) | (1L << (STDEVP - 323)) | (1L << (SUM - 323)) | (1L << (TEXTIMAGE_ON - 323)) | (1L << (THROW - 323)) | (1L << (TIES - 323)) | (1L << (TIME - 323)) | (1L << (TRY - 323)) | (1L << (TYPE - 323)) | (1L << (TYPE_WARNING - 323)) | (1L << (UNBOUNDED - 323)) | (1L << (UNCOMMITTED - 323)) | (1L << (UNKNOWN - 323)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (SQUARE_BRACKET_ID - 388)) | (1L << (ID - 388)))) != 0)) {
					{
					setState(2967);
					((Full_table_nameContext)_localctx).schema = id();
					}
				}

				setState(2970);
				match(DOT);
				}
				break;
			case 3:
				{
				setState(2972);
				((Full_table_nameContext)_localctx).schema = id();
				setState(2973);
				match(DOT);
				}
				break;
			}
			setState(2977);
			((Full_table_nameContext)_localctx).table = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public IdContext database;
		public IdContext schema;
		public IdContext table;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,438,_ctx) ) {
			case 1:
				{
				setState(2979);
				((Table_nameContext)_localctx).database = id();
				setState(2980);
				match(DOT);
				setState(2982);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (ABSOLUTE - 193)) | (1L << (APPLY - 193)) | (1L << (AUTO - 193)) | (1L << (AVG - 193)) | (1L << (BASE64 - 193)) | (1L << (CALLER - 193)) | (1L << (CAST - 193)) | (1L << (CATCH - 193)) | (1L << (CHECKSUM_AGG - 193)) | (1L << (COMMITTED - 193)) | (1L << (CONCAT - 193)) | (1L << (CONTROL - 193)) | (1L << (COOKIE - 193)) | (1L << (COUNT - 193)) | (1L << (COUNT_BIG - 193)) | (1L << (DELAY - 193)) | (1L << (DELETED - 193)) | (1L << (DENSE_RANK - 193)) | (1L << (DISABLE - 193)) | (1L << (DYNAMIC - 193)) | (1L << (ENCRYPTION - 193)) | (1L << (EXPAND - 193)) | (1L << (FAST - 193)) | (1L << (FAST_FORWARD - 193)))) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (FIRST - 259)) | (1L << (FOLLOWING - 259)) | (1L << (FORCE - 259)) | (1L << (FORCED - 259)) | (1L << (FORWARD_ONLY - 259)) | (1L << (FULLSCAN - 259)) | (1L << (GLOBAL - 259)) | (1L << (GO - 259)) | (1L << (GROUPING - 259)) | (1L << (GROUPING_ID - 259)) | (1L << (HASH - 259)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 259)) | (1L << (IMPERSONATE - 259)) | (1L << (INSENSITIVE - 259)) | (1L << (INSERTED - 259)) | (1L << (ISOLATION - 259)) | (1L << (KEEP - 259)) | (1L << (KEEPFIXED - 259)) | (1L << (KEYSET - 259)) | (1L << (LAST - 259)) | (1L << (LEVEL - 259)) | (1L << (LOCAL - 259)) | (1L << (LOCK_ESCALATION - 259)) | (1L << (LOGIN - 259)) | (1L << (LOOP - 259)) | (1L << (MARK - 259)) | (1L << (MAX - 259)) | (1L << (MAXDOP - 259)) | (1L << (MAXRECURSION - 259)) | (1L << (MIN - 259)) | (1L << (MODIFY - 259)) | (1L << (NAME - 259)) | (1L << (NEXT - 259)) | (1L << (NOCOUNT - 259)) | (1L << (NOEXPAND - 259)) | (1L << (NORECOMPUTE - 259)) | (1L << (NTILE - 259)) | (1L << (NUMBER - 259)) | (1L << (OFFSET - 259)) | (1L << (ONLINE - 259)) | (1L << (ONLY - 259)) | (1L << (OPTIMISTIC - 259)) | (1L << (OPTIMIZE - 259)) | (1L << (OUT - 259)))) != 0) || ((((_la - 323)) & ~0x3f) == 0 && ((1L << (_la - 323)) & ((1L << (OUTPUT - 323)) | (1L << (OWNER - 323)) | (1L << (PARAMETERIZATION - 323)) | (1L << (PARTITION - 323)) | (1L << (PATH - 323)) | (1L << (PRECEDING - 323)) | (1L << (PRIOR - 323)) | (1L << (PRIVILEGES - 323)) | (1L << (RANGE - 323)) | (1L << (RANK - 323)) | (1L << (READONLY - 323)) | (1L << (READ_ONLY - 323)) | (1L << (RECOMPILE - 323)) | (1L << (RELATIVE - 323)) | (1L << (REMOTE - 323)) | (1L << (REPEATABLE - 323)) | (1L << (ROBUST - 323)) | (1L << (ROOT - 323)) | (1L << (ROW - 323)) | (1L << (ROWGUID - 323)) | (1L << (ROWS - 323)) | (1L << (ROW_NUMBER - 323)) | (1L << (SAMPLE - 323)) | (1L << (SCHEMABINDING - 323)) | (1L << (SCROLL - 323)) | (1L << (SCROLL_LOCKS - 323)) | (1L << (SELF - 323)) | (1L << (SERIALIZABLE - 323)) | (1L << (SIMPLE - 323)) | (1L << (SNAPSHOT - 323)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 323)) | (1L << (STATIC - 323)) | (1L << (STATS_STREAM - 323)) | (1L << (STDEV - 323)) | (1L << (STDEVP - 323)) | (1L << (SUM - 323)) | (1L << (TEXTIMAGE_ON - 323)) | (1L << (THROW - 323)) | (1L << (TIES - 323)) | (1L << (TIME - 323)) | (1L << (TRY - 323)) | (1L << (TYPE - 323)) | (1L << (TYPE_WARNING - 323)) | (1L << (UNBOUNDED - 323)) | (1L << (UNCOMMITTED - 323)) | (1L << (UNKNOWN - 323)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (SQUARE_BRACKET_ID - 388)) | (1L << (ID - 388)))) != 0)) {
					{
					setState(2981);
					((Table_nameContext)_localctx).schema = id();
					}
				}

				setState(2984);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(2986);
				((Table_nameContext)_localctx).schema = id();
				setState(2987);
				match(DOT);
				}
				break;
			}
			setState(2991);
			((Table_nameContext)_localctx).table = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_nameContext extends ParserRuleContext {
		public IdContext schema;
		public IdContext name;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Simple_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSimple_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSimple_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSimple_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_nameContext simple_name() throws RecognitionException {
		Simple_nameContext _localctx = new Simple_nameContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_simple_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,439,_ctx) ) {
			case 1:
				{
				setState(2993);
				((Simple_nameContext)_localctx).schema = id();
				setState(2994);
				match(DOT);
				}
				break;
			}
			setState(2998);
			((Simple_nameContext)_localctx).name = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_proc_nameContext extends ParserRuleContext {
		public IdContext database;
		public IdContext schema;
		public IdContext procedure;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Func_proc_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_proc_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterFunc_proc_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitFunc_proc_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitFunc_proc_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_proc_nameContext func_proc_name() throws RecognitionException {
		Func_proc_nameContext _localctx = new Func_proc_nameContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_func_proc_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,441,_ctx) ) {
			case 1:
				{
				setState(3000);
				((Func_proc_nameContext)_localctx).database = id();
				setState(3001);
				match(DOT);
				setState(3003);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (ABSOLUTE - 193)) | (1L << (APPLY - 193)) | (1L << (AUTO - 193)) | (1L << (AVG - 193)) | (1L << (BASE64 - 193)) | (1L << (CALLER - 193)) | (1L << (CAST - 193)) | (1L << (CATCH - 193)) | (1L << (CHECKSUM_AGG - 193)) | (1L << (COMMITTED - 193)) | (1L << (CONCAT - 193)) | (1L << (CONTROL - 193)) | (1L << (COOKIE - 193)) | (1L << (COUNT - 193)) | (1L << (COUNT_BIG - 193)) | (1L << (DELAY - 193)) | (1L << (DELETED - 193)) | (1L << (DENSE_RANK - 193)) | (1L << (DISABLE - 193)) | (1L << (DYNAMIC - 193)) | (1L << (ENCRYPTION - 193)) | (1L << (EXPAND - 193)) | (1L << (FAST - 193)) | (1L << (FAST_FORWARD - 193)))) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (FIRST - 259)) | (1L << (FOLLOWING - 259)) | (1L << (FORCE - 259)) | (1L << (FORCED - 259)) | (1L << (FORWARD_ONLY - 259)) | (1L << (FULLSCAN - 259)) | (1L << (GLOBAL - 259)) | (1L << (GO - 259)) | (1L << (GROUPING - 259)) | (1L << (GROUPING_ID - 259)) | (1L << (HASH - 259)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 259)) | (1L << (IMPERSONATE - 259)) | (1L << (INSENSITIVE - 259)) | (1L << (INSERTED - 259)) | (1L << (ISOLATION - 259)) | (1L << (KEEP - 259)) | (1L << (KEEPFIXED - 259)) | (1L << (KEYSET - 259)) | (1L << (LAST - 259)) | (1L << (LEVEL - 259)) | (1L << (LOCAL - 259)) | (1L << (LOCK_ESCALATION - 259)) | (1L << (LOGIN - 259)) | (1L << (LOOP - 259)) | (1L << (MARK - 259)) | (1L << (MAX - 259)) | (1L << (MAXDOP - 259)) | (1L << (MAXRECURSION - 259)) | (1L << (MIN - 259)) | (1L << (MODIFY - 259)) | (1L << (NAME - 259)) | (1L << (NEXT - 259)) | (1L << (NOCOUNT - 259)) | (1L << (NOEXPAND - 259)) | (1L << (NORECOMPUTE - 259)) | (1L << (NTILE - 259)) | (1L << (NUMBER - 259)) | (1L << (OFFSET - 259)) | (1L << (ONLINE - 259)) | (1L << (ONLY - 259)) | (1L << (OPTIMISTIC - 259)) | (1L << (OPTIMIZE - 259)) | (1L << (OUT - 259)))) != 0) || ((((_la - 323)) & ~0x3f) == 0 && ((1L << (_la - 323)) & ((1L << (OUTPUT - 323)) | (1L << (OWNER - 323)) | (1L << (PARAMETERIZATION - 323)) | (1L << (PARTITION - 323)) | (1L << (PATH - 323)) | (1L << (PRECEDING - 323)) | (1L << (PRIOR - 323)) | (1L << (PRIVILEGES - 323)) | (1L << (RANGE - 323)) | (1L << (RANK - 323)) | (1L << (READONLY - 323)) | (1L << (READ_ONLY - 323)) | (1L << (RECOMPILE - 323)) | (1L << (RELATIVE - 323)) | (1L << (REMOTE - 323)) | (1L << (REPEATABLE - 323)) | (1L << (ROBUST - 323)) | (1L << (ROOT - 323)) | (1L << (ROW - 323)) | (1L << (ROWGUID - 323)) | (1L << (ROWS - 323)) | (1L << (ROW_NUMBER - 323)) | (1L << (SAMPLE - 323)) | (1L << (SCHEMABINDING - 323)) | (1L << (SCROLL - 323)) | (1L << (SCROLL_LOCKS - 323)) | (1L << (SELF - 323)) | (1L << (SERIALIZABLE - 323)) | (1L << (SIMPLE - 323)) | (1L << (SNAPSHOT - 323)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 323)) | (1L << (STATIC - 323)) | (1L << (STATS_STREAM - 323)) | (1L << (STDEV - 323)) | (1L << (STDEVP - 323)) | (1L << (SUM - 323)) | (1L << (TEXTIMAGE_ON - 323)) | (1L << (THROW - 323)) | (1L << (TIES - 323)) | (1L << (TIME - 323)) | (1L << (TRY - 323)) | (1L << (TYPE - 323)) | (1L << (TYPE_WARNING - 323)) | (1L << (UNBOUNDED - 323)) | (1L << (UNCOMMITTED - 323)) | (1L << (UNKNOWN - 323)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (SQUARE_BRACKET_ID - 388)) | (1L << (ID - 388)))) != 0)) {
					{
					setState(3002);
					((Func_proc_nameContext)_localctx).schema = id();
					}
				}

				setState(3005);
				match(DOT);
				}
				break;
			case 2:
				{
				{
				setState(3007);
				((Func_proc_nameContext)_localctx).schema = id();
				}
				setState(3008);
				match(DOT);
				}
				break;
			}
			setState(3012);
			((Func_proc_nameContext)_localctx).procedure = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ddl_objectContext extends ParserRuleContext {
		public Full_table_nameContext full_table_name() {
			return getRuleContext(Full_table_nameContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public Ddl_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDdl_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDdl_object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDdl_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ddl_objectContext ddl_object() throws RecognitionException {
		Ddl_objectContext _localctx = new Ddl_objectContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_ddl_object);
		try {
			setState(3016);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(3014);
				full_table_name();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(3015);
				match(LOCAL_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Full_column_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Full_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterFull_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitFull_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitFull_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Full_column_nameContext full_column_name() throws RecognitionException {
		Full_column_nameContext _localctx = new Full_column_nameContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_full_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,443,_ctx) ) {
			case 1:
				{
				setState(3018);
				table_name();
				setState(3019);
				match(DOT);
				}
				break;
			}
			setState(3023);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_name_listContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterColumn_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitColumn_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitColumn_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3025);
			id();
			setState(3030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3026);
				match(COMMA);
				setState(3027);
				id();
				}
				}
				setState(3032);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(TsqlParser.LOCAL_ID, 0); }
		public Cursor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterCursor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitCursor_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitCursor_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_nameContext cursor_name() throws RecognitionException {
		Cursor_nameContext _localctx = new Cursor_nameContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_cursor_name);
		try {
			setState(3035);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(3033);
				id();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(3034);
				match(LOCAL_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class On_offContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(TsqlParser.ON, 0); }
		public TerminalNode OFF() { return getToken(TsqlParser.OFF, 0); }
		public On_offContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_off; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterOn_off(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitOn_off(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitOn_off(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_offContext on_off() throws RecognitionException {
		On_offContext _localctx = new On_offContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_on_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3037);
			_la = _input.LA(1);
			if ( !(_la==OFF || _la==ON) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClusteredContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(TsqlParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(TsqlParser.NONCLUSTERED, 0); }
		public ClusteredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clustered; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterClustered(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitClustered(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitClustered(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClusteredContext clustered() throws RecognitionException {
		ClusteredContext _localctx = new ClusteredContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_clustered);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3039);
			_la = _input.LA(1);
			if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_notnullContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(TsqlParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(TsqlParser.NOT, 0); }
		public Null_notnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_notnull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterNull_notnull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitNull_notnull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitNull_notnull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_notnullContext null_notnull() throws RecognitionException {
		Null_notnullContext _localctx = new Null_notnullContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_null_notnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3042);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(3041);
				match(NOT);
				}
			}

			setState(3044);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scalar_function_nameContext extends ParserRuleContext {
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(TsqlParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(TsqlParser.LEFT, 0); }
		public TerminalNode BINARY_CHECKSUM() { return getToken(TsqlParser.BINARY_CHECKSUM, 0); }
		public TerminalNode CHECKSUM() { return getToken(TsqlParser.CHECKSUM, 0); }
		public Scalar_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterScalar_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitScalar_function_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitScalar_function_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_function_nameContext scalar_function_name() throws RecognitionException {
		Scalar_function_nameContext _localctx = new Scalar_function_nameContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_scalar_function_name);
		try {
			setState(3051);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case SQUARE_BRACKET_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(3046);
				func_proc_name();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3047);
				match(RIGHT);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(3048);
				match(LEFT);
				}
				break;
			case BINARY_CHECKSUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(3049);
				match(BINARY_CHECKSUM);
				}
				break;
			case CHECKSUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(3050);
				match(CHECKSUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(TsqlParser.IDENTITY, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(TsqlParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(TsqlParser.DECIMAL, i);
		}
		public TerminalNode MAX() { return getToken(TsqlParser.MAX, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3053);
			id();
			setState(3055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,448,_ctx) ) {
			case 1:
				{
				setState(3054);
				match(IDENTITY);
				}
				break;
			}
			setState(3064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,450,_ctx) ) {
			case 1:
				{
				setState(3057);
				match(LR_BRACKET);
				setState(3058);
				_la = _input.LA(1);
				if ( !(_la==MAX || _la==DECIMAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(3061);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(3059);
					match(COMMA);
					setState(3060);
					match(DECIMAL);
					}
				}

				setState(3063);
				match(RR_BRACKET);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(TsqlParser.NULL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterDefault_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitDefault_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitDefault_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_default_value);
		try {
			setState(3068);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3066);
				match(NULL);
				}
				break;
			case DECIMAL:
			case STRING:
			case BINARY:
			case FLOAT:
			case REAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(3067);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public Token dollar;
		public TerminalNode STRING() { return getToken(TsqlParser.STRING, 0); }
		public TerminalNode BINARY() { return getToken(TsqlParser.BINARY, 0); }
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode REAL() { return getToken(TsqlParser.REAL, 0); }
		public TerminalNode FLOAT() { return getToken(TsqlParser.FLOAT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_constant);
		int _la;
		try {
			setState(3085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,455,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3070);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3071);
				match(BINARY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3073);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(3072);
					sign();
					}
				}

				setState(3075);
				match(DECIMAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3077);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(3076);
					sign();
					}
				}

				setState(3079);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==REAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3081);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(3080);
					sign();
					}
				}

				setState(3083);
				((ConstantContext)_localctx).dollar = match(DOLLAR);
				setState(3084);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3087);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public Simple_idContext simple_id() {
			return getRuleContext(Simple_idContext.class,0);
		}
		public TerminalNode DOUBLE_QUOTE_ID() { return getToken(TsqlParser.DOUBLE_QUOTE_ID, 0); }
		public TerminalNode SQUARE_BRACKET_ID() { return getToken(TsqlParser.SQUARE_BRACKET_ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_id);
		try {
			setState(3092);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(3089);
				simple_id();
				}
				break;
			case DOUBLE_QUOTE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(3090);
				match(DOUBLE_QUOTE_ID);
				}
				break;
			case SQUARE_BRACKET_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(3091);
				match(SQUARE_BRACKET_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TsqlParser.ID, 0); }
		public TerminalNode ABSOLUTE() { return getToken(TsqlParser.ABSOLUTE, 0); }
		public TerminalNode APPLY() { return getToken(TsqlParser.APPLY, 0); }
		public TerminalNode AUTO() { return getToken(TsqlParser.AUTO, 0); }
		public TerminalNode AVG() { return getToken(TsqlParser.AVG, 0); }
		public TerminalNode BASE64() { return getToken(TsqlParser.BASE64, 0); }
		public TerminalNode CALLER() { return getToken(TsqlParser.CALLER, 0); }
		public TerminalNode CAST() { return getToken(TsqlParser.CAST, 0); }
		public TerminalNode CATCH() { return getToken(TsqlParser.CATCH, 0); }
		public TerminalNode CHECKSUM_AGG() { return getToken(TsqlParser.CHECKSUM_AGG, 0); }
		public TerminalNode COMMITTED() { return getToken(TsqlParser.COMMITTED, 0); }
		public TerminalNode CONCAT() { return getToken(TsqlParser.CONCAT, 0); }
		public TerminalNode CONTROL() { return getToken(TsqlParser.CONTROL, 0); }
		public TerminalNode COOKIE() { return getToken(TsqlParser.COOKIE, 0); }
		public TerminalNode COUNT() { return getToken(TsqlParser.COUNT, 0); }
		public TerminalNode COUNT_BIG() { return getToken(TsqlParser.COUNT_BIG, 0); }
		public TerminalNode DELAY() { return getToken(TsqlParser.DELAY, 0); }
		public TerminalNode DELETED() { return getToken(TsqlParser.DELETED, 0); }
		public TerminalNode DENSE_RANK() { return getToken(TsqlParser.DENSE_RANK, 0); }
		public TerminalNode DISABLE() { return getToken(TsqlParser.DISABLE, 0); }
		public TerminalNode DYNAMIC() { return getToken(TsqlParser.DYNAMIC, 0); }
		public TerminalNode ENCRYPTION() { return getToken(TsqlParser.ENCRYPTION, 0); }
		public TerminalNode EXPAND() { return getToken(TsqlParser.EXPAND, 0); }
		public TerminalNode FAST() { return getToken(TsqlParser.FAST, 0); }
		public TerminalNode FAST_FORWARD() { return getToken(TsqlParser.FAST_FORWARD, 0); }
		public TerminalNode FIRST() { return getToken(TsqlParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(TsqlParser.FOLLOWING, 0); }
		public TerminalNode FORCE() { return getToken(TsqlParser.FORCE, 0); }
		public TerminalNode FORCESEEK() { return getToken(TsqlParser.FORCESEEK, 0); }
		public TerminalNode FORWARD_ONLY() { return getToken(TsqlParser.FORWARD_ONLY, 0); }
		public TerminalNode FULLSCAN() { return getToken(TsqlParser.FULLSCAN, 0); }
		public TerminalNode GLOBAL() { return getToken(TsqlParser.GLOBAL, 0); }
		public TerminalNode GO() { return getToken(TsqlParser.GO, 0); }
		public TerminalNode GROUPING() { return getToken(TsqlParser.GROUPING, 0); }
		public TerminalNode GROUPING_ID() { return getToken(TsqlParser.GROUPING_ID, 0); }
		public TerminalNode HASH() { return getToken(TsqlParser.HASH, 0); }
		public TerminalNode IMPERSONATE() { return getToken(TsqlParser.IMPERSONATE, 0); }
		public TerminalNode INSENSITIVE() { return getToken(TsqlParser.INSENSITIVE, 0); }
		public TerminalNode INSERTED() { return getToken(TsqlParser.INSERTED, 0); }
		public TerminalNode ISOLATION() { return getToken(TsqlParser.ISOLATION, 0); }
		public TerminalNode KEEP() { return getToken(TsqlParser.KEEP, 0); }
		public TerminalNode KEEPFIXED() { return getToken(TsqlParser.KEEPFIXED, 0); }
		public TerminalNode FORCED() { return getToken(TsqlParser.FORCED, 0); }
		public TerminalNode KEYSET() { return getToken(TsqlParser.KEYSET, 0); }
		public TerminalNode IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX() { return getToken(TsqlParser.IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX, 0); }
		public TerminalNode LAST() { return getToken(TsqlParser.LAST, 0); }
		public TerminalNode LEVEL() { return getToken(TsqlParser.LEVEL, 0); }
		public TerminalNode LOCAL() { return getToken(TsqlParser.LOCAL, 0); }
		public TerminalNode LOCK_ESCALATION() { return getToken(TsqlParser.LOCK_ESCALATION, 0); }
		public TerminalNode LOGIN() { return getToken(TsqlParser.LOGIN, 0); }
		public TerminalNode LOOP() { return getToken(TsqlParser.LOOP, 0); }
		public TerminalNode MARK() { return getToken(TsqlParser.MARK, 0); }
		public TerminalNode MAX() { return getToken(TsqlParser.MAX, 0); }
		public TerminalNode MAXDOP() { return getToken(TsqlParser.MAXDOP, 0); }
		public TerminalNode MAXRECURSION() { return getToken(TsqlParser.MAXRECURSION, 0); }
		public TerminalNode MIN() { return getToken(TsqlParser.MIN, 0); }
		public TerminalNode MODIFY() { return getToken(TsqlParser.MODIFY, 0); }
		public TerminalNode NAME() { return getToken(TsqlParser.NAME, 0); }
		public TerminalNode NEXT() { return getToken(TsqlParser.NEXT, 0); }
		public TerminalNode NOCOUNT() { return getToken(TsqlParser.NOCOUNT, 0); }
		public TerminalNode NOEXPAND() { return getToken(TsqlParser.NOEXPAND, 0); }
		public TerminalNode NORECOMPUTE() { return getToken(TsqlParser.NORECOMPUTE, 0); }
		public TerminalNode NTILE() { return getToken(TsqlParser.NTILE, 0); }
		public TerminalNode NUMBER() { return getToken(TsqlParser.NUMBER, 0); }
		public TerminalNode OFFSET() { return getToken(TsqlParser.OFFSET, 0); }
		public TerminalNode ONLINE() { return getToken(TsqlParser.ONLINE, 0); }
		public TerminalNode ONLY() { return getToken(TsqlParser.ONLY, 0); }
		public TerminalNode OPTIMISTIC() { return getToken(TsqlParser.OPTIMISTIC, 0); }
		public TerminalNode OPTIMIZE() { return getToken(TsqlParser.OPTIMIZE, 0); }
		public TerminalNode OUT() { return getToken(TsqlParser.OUT, 0); }
		public TerminalNode OUTPUT() { return getToken(TsqlParser.OUTPUT, 0); }
		public TerminalNode OWNER() { return getToken(TsqlParser.OWNER, 0); }
		public TerminalNode PARAMETERIZATION() { return getToken(TsqlParser.PARAMETERIZATION, 0); }
		public TerminalNode PARTITION() { return getToken(TsqlParser.PARTITION, 0); }
		public TerminalNode PATH() { return getToken(TsqlParser.PATH, 0); }
		public TerminalNode PRECEDING() { return getToken(TsqlParser.PRECEDING, 0); }
		public TerminalNode PRIOR() { return getToken(TsqlParser.PRIOR, 0); }
		public TerminalNode PRIVILEGES() { return getToken(TsqlParser.PRIVILEGES, 0); }
		public TerminalNode RANGE() { return getToken(TsqlParser.RANGE, 0); }
		public TerminalNode RANK() { return getToken(TsqlParser.RANK, 0); }
		public TerminalNode READONLY() { return getToken(TsqlParser.READONLY, 0); }
		public TerminalNode READ_ONLY() { return getToken(TsqlParser.READ_ONLY, 0); }
		public TerminalNode RECOMPILE() { return getToken(TsqlParser.RECOMPILE, 0); }
		public TerminalNode RELATIVE() { return getToken(TsqlParser.RELATIVE, 0); }
		public TerminalNode REMOTE() { return getToken(TsqlParser.REMOTE, 0); }
		public TerminalNode REPEATABLE() { return getToken(TsqlParser.REPEATABLE, 0); }
		public TerminalNode ROBUST() { return getToken(TsqlParser.ROBUST, 0); }
		public TerminalNode ROOT() { return getToken(TsqlParser.ROOT, 0); }
		public TerminalNode ROW() { return getToken(TsqlParser.ROW, 0); }
		public TerminalNode ROWGUID() { return getToken(TsqlParser.ROWGUID, 0); }
		public TerminalNode ROWS() { return getToken(TsqlParser.ROWS, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(TsqlParser.ROW_NUMBER, 0); }
		public TerminalNode SAMPLE() { return getToken(TsqlParser.SAMPLE, 0); }
		public TerminalNode SCHEMABINDING() { return getToken(TsqlParser.SCHEMABINDING, 0); }
		public TerminalNode SCROLL() { return getToken(TsqlParser.SCROLL, 0); }
		public TerminalNode SCROLL_LOCKS() { return getToken(TsqlParser.SCROLL_LOCKS, 0); }
		public TerminalNode SELF() { return getToken(TsqlParser.SELF, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(TsqlParser.SERIALIZABLE, 0); }
		public TerminalNode SIMPLE() { return getToken(TsqlParser.SIMPLE, 0); }
		public TerminalNode SNAPSHOT() { return getToken(TsqlParser.SNAPSHOT, 0); }
		public TerminalNode SPATIAL_WINDOW_MAX_CELLS() { return getToken(TsqlParser.SPATIAL_WINDOW_MAX_CELLS, 0); }
		public TerminalNode STATIC() { return getToken(TsqlParser.STATIC, 0); }
		public TerminalNode STATS_STREAM() { return getToken(TsqlParser.STATS_STREAM, 0); }
		public TerminalNode STDEV() { return getToken(TsqlParser.STDEV, 0); }
		public TerminalNode STDEVP() { return getToken(TsqlParser.STDEVP, 0); }
		public TerminalNode SUM() { return getToken(TsqlParser.SUM, 0); }
		public TerminalNode TEXTIMAGE_ON() { return getToken(TsqlParser.TEXTIMAGE_ON, 0); }
		public TerminalNode THROW() { return getToken(TsqlParser.THROW, 0); }
		public TerminalNode TIES() { return getToken(TsqlParser.TIES, 0); }
		public TerminalNode TIME() { return getToken(TsqlParser.TIME, 0); }
		public TerminalNode TRY() { return getToken(TsqlParser.TRY, 0); }
		public TerminalNode TYPE() { return getToken(TsqlParser.TYPE, 0); }
		public TerminalNode TYPE_WARNING() { return getToken(TsqlParser.TYPE_WARNING, 0); }
		public TerminalNode UNBOUNDED() { return getToken(TsqlParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(TsqlParser.UNCOMMITTED, 0); }
		public TerminalNode UNKNOWN() { return getToken(TsqlParser.UNKNOWN, 0); }
		public TerminalNode USING() { return getToken(TsqlParser.USING, 0); }
		public TerminalNode VAR() { return getToken(TsqlParser.VAR, 0); }
		public TerminalNode VARP() { return getToken(TsqlParser.VARP, 0); }
		public TerminalNode VIEW_METADATA() { return getToken(TsqlParser.VIEW_METADATA, 0); }
		public TerminalNode VIEWS() { return getToken(TsqlParser.VIEWS, 0); }
		public TerminalNode WORK() { return getToken(TsqlParser.WORK, 0); }
		public TerminalNode XML() { return getToken(TsqlParser.XML, 0); }
		public TerminalNode XMLNAMESPACES() { return getToken(TsqlParser.XMLNAMESPACES, 0); }
		public Simple_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterSimple_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitSimple_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitSimple_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_idContext simple_id() throws RecognitionException {
		Simple_idContext _localctx = new Simple_idContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_simple_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3094);
			_la = _input.LA(1);
			if ( !(_la==FORCESEEK || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (ABSOLUTE - 193)) | (1L << (APPLY - 193)) | (1L << (AUTO - 193)) | (1L << (AVG - 193)) | (1L << (BASE64 - 193)) | (1L << (CALLER - 193)) | (1L << (CAST - 193)) | (1L << (CATCH - 193)) | (1L << (CHECKSUM_AGG - 193)) | (1L << (COMMITTED - 193)) | (1L << (CONCAT - 193)) | (1L << (CONTROL - 193)) | (1L << (COOKIE - 193)) | (1L << (COUNT - 193)) | (1L << (COUNT_BIG - 193)) | (1L << (DELAY - 193)) | (1L << (DELETED - 193)) | (1L << (DENSE_RANK - 193)) | (1L << (DISABLE - 193)) | (1L << (DYNAMIC - 193)) | (1L << (ENCRYPTION - 193)) | (1L << (EXPAND - 193)) | (1L << (FAST - 193)) | (1L << (FAST_FORWARD - 193)))) != 0) || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (FIRST - 259)) | (1L << (FOLLOWING - 259)) | (1L << (FORCE - 259)) | (1L << (FORCED - 259)) | (1L << (FORWARD_ONLY - 259)) | (1L << (FULLSCAN - 259)) | (1L << (GLOBAL - 259)) | (1L << (GO - 259)) | (1L << (GROUPING - 259)) | (1L << (GROUPING_ID - 259)) | (1L << (HASH - 259)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 259)) | (1L << (IMPERSONATE - 259)) | (1L << (INSENSITIVE - 259)) | (1L << (INSERTED - 259)) | (1L << (ISOLATION - 259)) | (1L << (KEEP - 259)) | (1L << (KEEPFIXED - 259)) | (1L << (KEYSET - 259)) | (1L << (LAST - 259)) | (1L << (LEVEL - 259)) | (1L << (LOCAL - 259)) | (1L << (LOCK_ESCALATION - 259)) | (1L << (LOGIN - 259)) | (1L << (LOOP - 259)) | (1L << (MARK - 259)) | (1L << (MAX - 259)) | (1L << (MAXDOP - 259)) | (1L << (MAXRECURSION - 259)) | (1L << (MIN - 259)) | (1L << (MODIFY - 259)) | (1L << (NAME - 259)) | (1L << (NEXT - 259)) | (1L << (NOCOUNT - 259)) | (1L << (NOEXPAND - 259)) | (1L << (NORECOMPUTE - 259)) | (1L << (NTILE - 259)) | (1L << (NUMBER - 259)) | (1L << (OFFSET - 259)) | (1L << (ONLINE - 259)) | (1L << (ONLY - 259)) | (1L << (OPTIMISTIC - 259)) | (1L << (OPTIMIZE - 259)) | (1L << (OUT - 259)))) != 0) || ((((_la - 323)) & ~0x3f) == 0 && ((1L << (_la - 323)) & ((1L << (OUTPUT - 323)) | (1L << (OWNER - 323)) | (1L << (PARAMETERIZATION - 323)) | (1L << (PARTITION - 323)) | (1L << (PATH - 323)) | (1L << (PRECEDING - 323)) | (1L << (PRIOR - 323)) | (1L << (PRIVILEGES - 323)) | (1L << (RANGE - 323)) | (1L << (RANK - 323)) | (1L << (READONLY - 323)) | (1L << (READ_ONLY - 323)) | (1L << (RECOMPILE - 323)) | (1L << (RELATIVE - 323)) | (1L << (REMOTE - 323)) | (1L << (REPEATABLE - 323)) | (1L << (ROBUST - 323)) | (1L << (ROOT - 323)) | (1L << (ROW - 323)) | (1L << (ROWGUID - 323)) | (1L << (ROWS - 323)) | (1L << (ROW_NUMBER - 323)) | (1L << (SAMPLE - 323)) | (1L << (SCHEMABINDING - 323)) | (1L << (SCROLL - 323)) | (1L << (SCROLL_LOCKS - 323)) | (1L << (SELF - 323)) | (1L << (SERIALIZABLE - 323)) | (1L << (SIMPLE - 323)) | (1L << (SNAPSHOT - 323)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 323)) | (1L << (STATIC - 323)) | (1L << (STATS_STREAM - 323)) | (1L << (STDEV - 323)) | (1L << (STDEVP - 323)) | (1L << (SUM - 323)) | (1L << (TEXTIMAGE_ON - 323)) | (1L << (THROW - 323)) | (1L << (TIES - 323)) | (1L << (TIME - 323)) | (1L << (TRY - 323)) | (1L << (TYPE - 323)) | (1L << (TYPE_WARNING - 323)) | (1L << (UNBOUNDED - 323)) | (1L << (UNCOMMITTED - 323)) | (1L << (UNKNOWN - 323)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (ID - 388)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_operatorContext extends ParserRuleContext {
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitComparison_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitComparison_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_comparison_operator);
		try {
			setState(3111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,457,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3096);
				match(EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3097);
				match(GREATER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3098);
				match(LESS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3099);
				match(LESS);
				setState(3100);
				match(EQUAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3101);
				match(GREATER);
				setState(3102);
				match(EQUAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3103);
				match(LESS);
				setState(3104);
				match(GREATER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3105);
				match(EXCLAMATION);
				setState(3106);
				match(EQUAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3107);
				match(EXCLAMATION);
				setState(3108);
				match(GREATER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3109);
				match(EXCLAMATION);
				setState(3110);
				match(LESS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3113);
			_la = _input.LA(1);
			if ( !(((((_la - 413)) & ~0x3f) == 0 && ((1L << (_la - 413)) & ((1L << (PLUS_ASSIGN - 413)) | (1L << (MINUS_ASSIGN - 413)) | (1L << (MULT_ASSIGN - 413)) | (1L << (DIV_ASSIGN - 413)) | (1L << (MOD_ASSIGN - 413)) | (1L << (AND_ASSIGN - 413)) | (1L << (XOR_ASSIGN - 413)) | (1L << (OR_ASSIGN - 413)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_sizeContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(TsqlParser.DECIMAL, 0); }
		public TerminalNode KB() { return getToken(TsqlParser.KB, 0); }
		public TerminalNode MB() { return getToken(TsqlParser.MB, 0); }
		public TerminalNode GB() { return getToken(TsqlParser.GB, 0); }
		public TerminalNode TB() { return getToken(TsqlParser.TB, 0); }
		public File_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).enterFile_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsqlListener ) ((TsqlListener)listener).exitFile_size(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TsqlVisitor ) return ((TsqlVisitor<? extends T>)visitor).visitFile_size(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_sizeContext file_size() throws RecognitionException {
		File_sizeContext _localctx = new File_sizeContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_file_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3115);
			match(DECIMAL);
			setState(3117);
			_la = _input.LA(1);
			if (((((_la - 265)) & ~0x3f) == 0 && ((1L << (_la - 265)) & ((1L << (GB - 265)) | (1L << (KB - 265)) | (1L << (MB - 265)))) != 0) || _la==TB || _la==MODULE) {
				{
				setState(3116);
				_la = _input.LA(1);
				if ( !(((((_la - 265)) & ~0x3f) == 0 && ((1L << (_la - 265)) & ((1L << (GB - 265)) | (1L << (KB - 265)) | (1L << (MB - 265)))) != 0) || _la==TB || _la==MODULE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 85:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 12);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u01b9\u0c32\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\3\2\7"+
		"\2\u0152\n\2\f\2\16\2\u0155\13\2\3\2\3\2\3\3\3\3\5\3\u015b\n\3\3\4\3\4"+
		"\5\4\u015f\n\4\6\4\u0161\n\4\r\4\16\4\u0162\3\5\3\5\3\5\3\5\5\5\u0169"+
		"\n\5\3\6\3\6\3\6\3\6\5\6\u016f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0180\n\7\3\b\3\b\5\b\u0184\n\b\3\b\5\b\u0187"+
		"\n\b\3\b\3\b\5\b\u018b\n\b\3\b\3\b\5\b\u018f\n\b\3\b\3\b\5\b\u0193\n\b"+
		"\3\b\3\b\3\b\5\b\u0198\n\b\3\b\3\b\3\b\5\b\u019d\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u01a4\n\b\3\b\5\b\u01a7\n\b\3\b\3\b\5\b\u01ab\n\b\3\b\5\b\u01ae"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01b6\n\b\3\b\5\b\u01b9\n\b\3\b\3\b\3"+
		"\b\5\b\u01be\n\b\3\b\5\b\u01c1\n\b\3\b\3\b\3\b\5\b\u01c6\n\b\3\b\3\b\3"+
		"\b\5\b\u01cb\n\b\3\b\5\b\u01ce\n\b\3\b\3\b\3\b\5\b\u01d3\n\b\3\b\3\b\3"+
		"\b\3\b\5\b\u01d9\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u01e0\n\b\3\b\3\b\5\b\u01e4"+
		"\n\b\5\b\u01e6\n\b\3\b\3\b\3\b\5\b\u01eb\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u01f6\n\b\f\b\16\b\u01f9\13\b\3\b\3\b\5\b\u01fd\n\b\5\b"+
		"\u01ff\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0208\n\t\3\n\5\n\u020b\n\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0213\n\n\5\n\u0215\n\n\3\n\5\n\u0218\n\n"+
		"\3\n\3\n\5\n\u021c\n\n\3\n\5\n\u021f\n\n\3\n\3\n\5\n\u0223\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u022a\n\n\3\n\3\n\5\n\u022e\n\n\5\n\u0230\n\n\5\n\u0232"+
		"\n\n\3\n\5\n\u0235\n\n\3\n\5\n\u0238\n\n\3\n\5\n\u023b\n\n\3\13\3\13\3"+
		"\13\3\13\5\13\u0241\n\13\3\f\5\f\u0244\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u024c\n\f\5\f\u024e\n\f\3\f\5\f\u0251\n\f\3\f\3\f\5\f\u0255\n\f\3\f\5"+
		"\f\u0258\n\f\3\f\3\f\3\f\3\f\5\f\u025e\n\f\3\f\5\f\u0261\n\f\3\f\3\f\5"+
		"\f\u0265\n\f\3\f\5\f\u0268\n\f\3\f\5\f\u026b\n\f\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0272\n\r\3\16\5\16\u0275\n\16\3\16\3\16\5\16\u0279\n\16\3\16\5\16"+
		"\u027c\n\16\3\16\5\16\u027f\n\16\3\16\5\16\u0282\n\16\3\17\5\17\u0285"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u028d\n\17\5\17\u028f\n\17\3"+
		"\17\3\17\5\17\u0293\n\17\3\17\5\17\u0296\n\17\3\17\3\17\3\17\3\17\7\17"+
		"\u029c\n\17\f\17\16\17\u029f\13\17\3\17\5\17\u02a2\n\17\3\17\3\17\5\17"+
		"\u02a6\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u02ad\n\17\3\17\3\17\5\17\u02b1"+
		"\n\17\5\17\u02b3\n\17\5\17\u02b5\n\17\3\17\5\17\u02b8\n\17\3\17\5\17\u02bb"+
		"\n\17\3\17\5\17\u02be\n\17\3\20\3\20\3\20\3\20\7\20\u02c4\n\20\f\20\16"+
		"\20\u02c7\13\20\3\20\3\20\3\20\5\20\u02cc\n\20\3\20\3\20\3\20\3\20\5\20"+
		"\u02d2\n\20\5\20\u02d4\n\20\3\21\3\21\5\21\u02d8\n\21\3\21\5\21\u02db"+
		"\n\21\3\21\5\21\u02de\n\21\3\22\3\22\3\22\5\22\u02e3\n\22\3\22\3\22\3"+
		"\22\5\22\u02e8\n\22\3\22\5\22\u02eb\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u02f3\n\23\3\23\3\23\5\23\u02f7\n\23\3\23\3\23\3\23\7\23\u02fc\n"+
		"\23\f\23\16\23\u02ff\13\23\5\23\u0301\n\23\3\23\3\23\3\23\3\23\3\23\7"+
		"\23\u0308\n\23\f\23\16\23\u030b\13\23\5\23\u030d\n\23\3\23\3\23\5\23\u0311"+
		"\n\23\3\23\3\23\3\23\3\23\7\23\u0317\n\23\f\23\16\23\u031a\13\23\5\23"+
		"\u031c\n\23\3\24\3\24\5\24\u0320\n\24\3\24\5\24\u0323\n\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u032c\n\24\3\24\3\24\5\24\u0330\n\24\3\24"+
		"\3\24\5\24\u0334\n\24\3\24\5\24\u0337\n\24\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u033e\n\25\3\25\5\25\u0341\n\25\3\25\3\25\3\25\7\25\u0346\n\25\f\25"+
		"\16\25\u0349\13\25\3\25\5\25\u034c\n\25\5\25\u034e\n\25\3\25\3\25\3\25"+
		"\3\25\7\25\u0354\n\25\f\25\16\25\u0357\13\25\5\25\u0359\n\25\3\25\3\25"+
		"\5\25\u035d\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0366\n\26\3"+
		"\26\5\26\u0369\n\26\3\26\3\26\5\26\u036d\n\26\3\26\3\26\5\26\u0371\n\26"+
		"\3\26\5\26\u0374\n\26\3\27\3\27\3\27\5\27\u0379\n\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0389\n\30"+
		"\3\30\3\30\5\30\u038d\n\30\3\30\3\30\3\30\3\30\5\30\u0393\n\30\5\30\u0395"+
		"\n\30\3\30\5\30\u0398\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u03a0\n"+
		"\31\3\31\3\31\3\31\3\31\5\31\u03a6\n\31\3\31\3\31\3\31\5\31\u03ab\n\31"+
		"\3\31\5\31\u03ae\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u03b7\n"+
		"\32\3\32\3\32\3\32\3\32\7\32\u03bd\n\32\f\32\16\32\u03c0\13\32\5\32\u03c2"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\5\32\u03c9\n\32\3\32\5\32\u03cc\n\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u03f1\n\34\3\34\5\34\u03f4\n\34"+
		"\3\35\3\35\3\35\3\35\5\35\u03fa\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u0406\n\35\5\35\u0408\n\35\3\35\5\35\u040b\n\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0423\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u042e\n\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0436\n\37\3 \3 \3 \3 \3 \3 \3 \7 \u043f\n \f \16 \u0442\13"+
		" \7 \u0444\n \f \16 \u0447\13 \5 \u0449\n \3!\3!\3!\3!\3!\3!\5!\u0451"+
		"\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u045b\n#\3$\3$\3$\3%\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0475\n*\3*\3*\3*"+
		"\3*\5*\u047b\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0486\n*\3+\3+\3+\3,\3,"+
		"\3,\3-\3-\3-\3-\3-\3-\5-\u0494\n-\3.\3.\3.\3.\3.\3.\5.\u049c\n.\3/\3/"+
		"\3/\3/\3/\5/\u04a3\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u04ba\n\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u04c7\n\62"+
		"\3\63\3\63\3\63\3\63\5\63\u04cd\n\63\3\63\3\63\3\63\5\63\u04d2\n\63\3"+
		"\63\5\63\u04d5\n\63\3\64\3\64\3\64\3\64\5\64\u04db\n\64\3\64\3\64\5\64"+
		"\u04df\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u04e6\n\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\5\66\u04ef\n\66\3\66\3\66\5\66\u04f3\n\66\3\67\3\67"+
		"\3\67\3\67\5\67\u04f9\n\67\3\67\3\67\3\67\7\67\u04fe\n\67\f\67\16\67\u0501"+
		"\13\67\3\67\5\67\u0504\n\67\38\38\38\38\38\38\38\39\39\39\39\59\u0511"+
		"\n9\39\39\3:\3:\5:\u0517\n:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\5<\u0528\n<\3<\3<\5<\u052c\n<\3<\3<\3<\3=\3=\3=\5=\u0534\n=\3=\3="+
		"\5=\u0538\n=\3=\3=\3=\3=\7=\u053e\n=\f=\16=\u0541\13=\3=\5=\u0544\n=\5"+
		"=\u0546\n=\3>\3>\5>\u054a\n>\3>\3>\5>\u054e\n>\3>\3>\5>\u0552\n>\3>\3"+
		">\5>\u0556\n>\3>\3>\3>\3>\5>\u055c\n>\3>\3>\5>\u0560\n>\5>\u0562\n>\3"+
		"?\3?\3?\5?\u0567\n?\3?\3?\3?\3?\7?\u056d\n?\f?\16?\u0570\13?\5?\u0572"+
		"\n?\3?\5?\u0575\n?\3?\3?\3?\3?\3?\7?\u057c\n?\f?\16?\u057f\13?\3?\3?\5"+
		"?\u0583\n?\3?\3?\3?\5?\u0588\n?\3?\5?\u058b\n?\5?\u058d\n?\3@\3@\5@\u0591"+
		"\n@\3@\3@\5@\u0595\n@\3@\5@\u0598\n@\3@\3@\5@\u059c\n@\3A\3A\3B\3B\5B"+
		"\u05a2\nB\3B\3B\3B\5B\u05a7\nB\3B\3B\3B\3B\3B\5B\u05ae\nB\5B\u05b0\nB"+
		"\3B\3B\5B\u05b4\nB\3B\3B\3B\3B\3B\5B\u05bb\nB\3B\3B\5B\u05bf\nB\3B\5B"+
		"\u05c2\nB\3B\3B\3B\3B\3B\3B\3B\5B\u05cb\nB\3B\5B\u05ce\nB\5B\u05d0\nB"+
		"\3C\3C\3C\3C\3C\3C\3C\5C\u05d9\nC\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u05e4"+
		"\nC\3C\3C\5C\u05e8\nC\5C\u05ea\nC\5C\u05ec\nC\3D\3D\3D\3D\5D\u05f2\nD"+
		"\3D\3D\3D\5D\u05f7\nD\3D\3D\3D\3D\3D\5D\u05fe\nD\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\5D\u060b\nD\5D\u060d\nD\5D\u060f\nD\3D\5D\u0612\nD\3D\5D"+
		"\u0615\nD\3E\3E\3E\3E\3E\5E\u061c\nE\3E\5E\u061f\nE\3E\3E\3E\3E\5E\u0625"+
		"\nE\3E\3E\3E\5E\u062a\nE\5E\u062c\nE\3E\5E\u062f\nE\3E\3E\3E\3E\5E\u0635"+
		"\nE\3E\3E\3E\3E\3E\3E\5E\u063d\nE\5E\u063f\nE\3E\5E\u0642\nE\3E\3E\5E"+
		"\u0646\nE\3E\5E\u0649\nE\3E\3E\3E\3E\5E\u064f\nE\3E\5E\u0652\nE\3E\3E"+
		"\5E\u0656\nE\3E\5E\u0659\nE\3E\3E\3E\3E\5E\u065f\nE\3E\5E\u0662\nE\5E"+
		"\u0664\nE\3F\3F\5F\u0668\nF\3G\3G\3G\5G\u066d\nG\3H\3H\3H\3H\3I\3I\5I"+
		"\u0675\nI\3I\3I\3I\5I\u067a\nI\3J\3J\3J\3J\3J\3K\3K\5K\u0683\nK\3K\7K"+
		"\u0686\nK\fK\16K\u0689\13K\3L\3L\5L\u068d\nL\3M\3M\3M\3M\5M\u0693\nM\3"+
		"M\3M\5M\u0697\nM\3M\5M\u069a\nM\3M\3M\5M\u069e\nM\3M\3M\3M\3M\5M\u06a4"+
		"\nM\3M\3M\3M\3M\3M\3M\5M\u06ac\nM\3M\3M\3M\5M\u06b1\nM\5M\u06b3\nM\3M"+
		"\5M\u06b6\nM\3M\7M\u06b9\nM\fM\16M\u06bc\13M\3N\3N\5N\u06c0\nN\3N\5N\u06c3"+
		"\nN\3N\3N\3N\5N\u06c8\nN\3N\5N\u06cb\nN\3N\5N\u06ce\nN\3N\3N\3N\3N\5N"+
		"\u06d4\nN\3N\3N\3N\3N\5N\u06da\nN\3O\3O\5O\u06de\nO\3O\3O\3O\5O\u06e3"+
		"\nO\3O\5O\u06e6\nO\3O\3O\3O\5O\u06eb\nO\3O\3O\5O\u06ef\nO\3O\3O\5O\u06f3"+
		"\nO\3O\3O\3O\3O\5O\u06f9\nO\3O\3O\3O\3O\5O\u06ff\nO\3P\3P\3P\3P\3P\7P"+
		"\u0706\nP\fP\16P\u0709\13P\3P\3P\3Q\3Q\3Q\3Q\3Q\5Q\u0712\nQ\3R\3R\3R\3"+
		"R\3R\3R\3R\3R\5R\u071c\nR\5R\u071e\nR\5R\u0720\nR\3R\5R\u0723\nR\3R\5"+
		"R\u0726\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0731\nR\5R\u0733\nR\5R\u0735"+
		"\nR\3R\5R\u0738\nR\3S\5S\u073b\nS\3S\5S\u073e\nS\3S\5S\u0741\nS\3S\5S"+
		"\u0744\nS\3S\5S\u0747\nS\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\5T\u0753\nT\3T"+
		"\5T\u0756\nT\3T\5T\u0759\nT\3T\3T\3T\3T\3T\7T\u0760\nT\fT\16T\u0763\13"+
		"T\5T\u0765\nT\3T\5T\u0768\nT\3U\3U\3U\3U\3U\5U\u076f\nU\3U\5U\u0772\n"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0780\nU\3U\5U\u0783\nU\3U\3"+
		"U\3U\3U\3U\5U\u078a\nU\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0795\nU\3V\3V\5"+
		"V\u0799\nV\3W\3W\3W\3W\3W\3W\3W\3W\3W\6W\u07a4\nW\rW\16W\u07a5\3W\3W\5"+
		"W\u07aa\nW\3W\3W\3W\3W\6W\u07b0\nW\rW\16W\u07b1\3W\3W\5W\u07b6\nW\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u07c8\nW\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\7W\u07d7\nW\fW\16W\u07da\13W\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\5X\u07e4\nX\3Y\3Y\3Z\3Z\3Z\5Z\u07eb\nZ\3Z\3Z\3Z\7Z\u07f0\nZ"+
		"\fZ\16Z\u07f3\13Z\3[\3[\3[\3[\3[\5[\u07fa\n[\3[\3[\3[\3[\3[\3\\\3\\\5"+
		"\\\u0803\n\\\3\\\3\\\5\\\u0807\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\"+
		"\u0811\n\\\3]\3]\3]\7]\u0816\n]\f]\16]\u0819\13]\3^\3^\3^\7^\u081e\n^"+
		"\f^\16^\u0821\13^\3_\3_\3_\7_\u0826\n_\f_\16_\u0829\13_\3`\5`\u082c\n"+
		"`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u0842"+
		"\na\3a\3a\3a\3a\3a\3a\3a\5a\u084b\na\3a\3a\3a\3a\5a\u0851\na\3a\3a\3a"+
		"\3a\5a\u0857\na\3a\3a\3a\3a\5a\u085d\na\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a"+
		"\u0868\na\3b\3b\3b\3b\3b\5b\u086f\nb\3b\7b\u0872\nb\fb\16b\u0875\13b\3"+
		"c\3c\5c\u0879\nc\3c\3c\5c\u087d\nc\3c\3c\3c\3c\3c\6c\u0884\nc\rc\16c\u0885"+
		"\5c\u0888\nc\3d\3d\5d\u088c\nd\3d\3d\3d\5d\u0891\nd\3d\3d\5d\u0895\nd"+
		"\5d\u0897\nd\3d\3d\3d\5d\u089c\nd\3d\3d\5d\u08a0\nd\3d\3d\5d\u08a4\nd"+
		"\3d\3d\3d\3d\3d\7d\u08ab\nd\fd\16d\u08ae\13d\5d\u08b0\nd\3d\3d\5d\u08b4"+
		"\nd\3e\3e\3e\3e\3e\7e\u08bb\ne\fe\16e\u08be\13e\3e\3e\3e\3e\3e\3e\3e\3"+
		"e\3e\5e\u08c9\ne\5e\u08cb\ne\3f\3f\3f\3f\3f\3f\5f\u08d3\nf\3f\3f\3f\3"+
		"f\3f\3f\5f\u08db\nf\3f\5f\u08de\nf\5f\u08e0\nf\3g\3g\3g\3g\3g\5g\u08e7"+
		"\ng\3h\3h\5h\u08eb\nh\3i\3i\3j\3j\3j\3j\3j\7j\u08f4\nj\fj\16j\u08f7\13"+
		"j\3j\3j\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3"+
		"k\3k\3k\3k\3k\3k\3k\7k\u0916\nk\fk\16k\u0919\13k\3k\3k\3k\3k\3k\3k\3k"+
		"\3k\3k\3k\3k\3k\3k\5k\u0928\nk\3l\3l\3l\3l\5l\u092e\nl\3m\3m\3m\7m\u0933"+
		"\nm\fm\16m\u0936\13m\3n\3n\3n\5n\u093b\nn\3n\3n\3n\5n\u0940\nn\3n\3n\3"+
		"n\3n\3n\3n\5n\u0948\nn\3n\5n\u094b\nn\5n\u094d\nn\3o\3o\3o\7o\u0952\n"+
		"o\fo\16o\u0955\13o\3p\3p\3p\3p\3p\5p\u095c\np\3q\3q\7q\u0960\nq\fq\16"+
		"q\u0963\13q\3r\3r\5r\u0967\nr\3r\3r\5r\u096b\nr\3r\3r\3r\5r\u0970\nr\5"+
		"r\u0972\nr\3r\3r\3r\3r\3r\5r\u0979\nr\3r\3r\5r\u097d\nr\3r\3r\3r\3r\3"+
		"r\5r\u0984\nr\5r\u0986\nr\5r\u0988\nr\3s\3s\3s\3s\3s\3s\3s\3s\3t\5t\u0993"+
		"\nt\3t\3t\5t\u0997\nt\5t\u0999\nt\3t\5t\u099c\nt\3t\3t\3t\3t\3t\3t\3t"+
		"\3t\3t\3t\3t\3t\3t\3t\5t\u09ac\nt\3u\3u\5u\u09b0\nu\3v\3v\3v\3v\3v\3v"+
		"\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\7v\u09c2\nv\fv\16v\u09c5\13v\3v\5v\u09c8"+
		"\nv\3v\3v\5v\u09cc\nv\3w\3w\3w\3w\3x\3x\3x\3x\3x\5x\u09d7\nx\3y\3y\3y"+
		"\3y\3y\5y\u09de\ny\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y"+
		"\3y\3y\3y\5y\u09f4\ny\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y"+
		"\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y"+
		"\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\5y\u0a28\ny\3y\3y\5y\u0a2c\ny\3y\3y"+
		"\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\5y\u0a3a\ny\3z\3z\3z\3z\3z\3{\3{\3{\3{"+
		"\3{\3|\5|\u0a47\n|\3|\3|\3}\3}\5}\u0a4d\n}\3~\5~\u0a50\n~\3~\3~\3~\3~"+
		"\7~\u0a56\n~\f~\16~\u0a59\13~\3~\3~\3\177\3\177\3\177\3\177\3\177\7\177"+
		"\u0a62\n\177\f\177\16\177\u0a65\13\177\3\177\3\177\3\u0080\5\u0080\u0a6a"+
		"\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u0a71\n\u0080"+
		"\f\u0080\16\u0080\u0a74\13\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u0a82"+
		"\n\u0080\f\u0080\16\u0080\u0a85\13\u0080\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u0a8a\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u0a92\n\u0080\3\u0081\3\u0081\5\u0081\u0a96\n\u0081\3\u0082\3\u0082\3"+
		"\u0082\3\u0082\7\u0082\u0a9c\n\u0082\f\u0082\16\u0082\u0a9f\13\u0082\3"+
		"\u0082\3\u0082\3\u0083\3\u0083\5\u0083\u0aa5\n\u0083\3\u0084\3\u0084\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u0ab0\n"+
		"\u0084\f\u0084\16\u0084\u0ab3\13\u0084\3\u0085\3\u0085\3\u0085\7\u0085"+
		"\u0ab8\n\u0085\f\u0085\16\u0085\u0abb\13\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0ac7"+
		"\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0ace\n\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0ad4\n\u0087\3\u0087\3\u0087"+
		"\5\u0087\u0ad8\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\5\u0087\u0ae9\n\u0087\3\u0088\5\u0088\u0aec\n\u0088\3\u0088\3\u0088\3"+
		"\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0af5\n\u0089\3\u0089\5"+
		"\u0089\u0af8\n\u0089\3\u0089\5\u0089\u0afb\n\u0089\3\u0089\3\u0089\3\u008a"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b"+
		"\u0b08\n\u008b\3\u008c\3\u008c\5\u008c\u0b0c\n\u008c\3\u008d\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0b14\n\u008d\3\u008e\3\u008e\3"+
		"\u008e\3\u008e\5\u008e\u0b1a\n\u008e\3\u008f\3\u008f\3\u008f\3\u008f\7"+
		"\u008f\u0b20\n\u008f\f\u008f\16\u008f\u0b23\13\u008f\3\u008f\3\u008f\3"+
		"\u008f\3\u008f\5\u008f\u0b29\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5"+
		"\u008f\u0b2f\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3"+
		"\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u0b3e\n"+
		"\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090"+
		"\u0b47\n\u0090\3\u0090\3\u0090\3\u0091\3\u0091\5\u0091\u0b4d\n\u0091\3"+
		"\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0b53\n\u0092\3\u0092\5\u0092\u0b56"+
		"\n\u0092\3\u0092\3\u0092\5\u0092\u0b5a\n\u0092\3\u0092\3\u0092\3\u0092"+
		"\7\u0092\u0b5f\n\u0092\f\u0092\16\u0092\u0b62\13\u0092\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\5\u0093\u0b69\n\u0093\3\u0093\5\u0093\u0b6c\n"+
		"\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u0b72\n\u0093\3\u0093\3"+
		"\u0093\3\u0093\3\u0093\5\u0093\u0b78\n\u0093\5\u0093\u0b7a\n\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\5\u0093\u0b80\n\u0093\3\u0093\5\u0093\u0b83\n"+
		"\u0093\5\u0093\u0b85\n\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u0b8b"+
		"\n\u0093\5\u0093\u0b8d\n\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0b9b"+
		"\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0ba2\n\u0094"+
		"\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\5\u0095\u0ba9\n\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0bb0\n\u0095\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\3\u0096\5\u0096\u0bb7\n\u0096\3\u0096\3\u0096\3\u0097"+
		"\3\u0097\3\u0097\5\u0097\u0bbe\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\5\u0097\u0bc5\n\u0097\3\u0097\3\u0097\3\u0098\3\u0098\5\u0098"+
		"\u0bcb\n\u0098\3\u0099\3\u0099\3\u0099\5\u0099\u0bd0\n\u0099\3\u0099\3"+
		"\u0099\3\u009a\3\u009a\3\u009a\7\u009a\u0bd7\n\u009a\f\u009a\16\u009a"+
		"\u0bda\13\u009a\3\u009b\3\u009b\5\u009b\u0bde\n\u009b\3\u009c\3\u009c"+
		"\3\u009d\3\u009d\3\u009e\5\u009e\u0be5\n\u009e\3\u009e\3\u009e\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0bee\n\u009f\3\u00a0\3\u00a0"+
		"\5\u00a0\u0bf2\n\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0bf8\n"+
		"\u00a0\3\u00a0\5\u00a0\u0bfb\n\u00a0\3\u00a1\3\u00a1\5\u00a1\u0bff\n\u00a1"+
		"\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u0c04\n\u00a2\3\u00a2\3\u00a2\5\u00a2"+
		"\u0c08\n\u00a2\3\u00a2\3\u00a2\5\u00a2\u0c0c\n\u00a2\3\u00a2\3\u00a2\5"+
		"\u00a2\u0c10\n\u00a2\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0c17"+
		"\n\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\5\u00a6\u0c2a\n\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8\5\u00a8\u0c30\n"+
		"\u00a8\3\u00a8\2\3\u00ac\u00a9\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\2<\3\2\u0194\u0195\4\2\u0194\u0194"+
		"\u0197\u0197\4\2\u00f2\u00f2\u017a\u017a\4\2\u0194\u0195\u0197\u0197\4"+
		"\2ll~~\4\2\n\n\65\65\3\2\u0085\u0086\4\2\u0144\u0145\u0151\u0151\4\2\177"+
		"\177\u0160\u0160\5\2\u00fd\u00fd\u0163\u0163\u018a\u018a\5\2\u00a6\u00a6"+
		"\u00cd\u00cd\u00f7\u00f7\4\2qqss\5\2\u00ee\u00ee\u0113\u0113\u012d\u012d"+
		"\4\2\u010c\u010c\u0121\u0121\5\2\u00fb\u00fb\u013e\u013e\u0140\u0140\3"+
		"\2\u0153\u0154\5\2\u0131\u0131\u015b\u015b\u016b\u016b\5\2\u00c5\u00c5"+
		"\u00f8\u00f8\u0108\u0108\4\2\u0108\u0108\u016a\u016a\5\2OO\u00d7\u00d7"+
		"\u016a\u016a\5\2ll\u00dd\u00dd\u017b\u017b\4\2\u012d\u012d\u0166\u0166"+
		"\4\2\u00b8\u00b8\u0123\u0123\3\2\u0144\u0145\4\2\u00a6\u00a6\u00bb\u00bb"+
		"\3\2\u00ac\u00ad\6\2\u00d8\u00d8\u0146\u0146\u0167\u0167\u0197\u0197\4"+
		"\2\u0109\u0109\u0164\u0164\6\2\u00fa\u00fa\u0101\u0101\u011e\u011e\u016f"+
		"\u016f\5\2\u0142\u0142\u0153\u0153\u0165\u0165\4\2\u00c3\u00c3\u0158\u0158"+
		"\3\2\u01b4\u01b5\3\2\u01b1\u01b3\4\2\u01b4\u01b5\u01b7\u01b9\5\2\5\5\b"+
		"\b\u00a3\u00a3\4\2\5\5\67\67\4\2\u015e\u015e\u0160\u0160\4\2\u0105\u0105"+
		"\u0135\u0135\4\2{{\u0111\u0111\5\2hh\u00e1\u00e1\u0111\u0111\5\2hh\u0111"+
		"\u0111\u0124\u0124\4\2UU\u015f\u015f\4\2nn\u0194\u0195\5\2OOcc\u0093\u0093"+
		"\6\2hh\u0111\u0111\u0124\u0124\u0159\u0159\4\2\u0195\u0195\u0197\u0197"+
		"\5\2\u00f5\u00f5\u0150\u0150\u0161\u0161\7\2\u00d4\u00d4\u0126\u0126\u012c"+
		"\u012c\u0171\u0173\u0187\u0188\3\2\u00e5\u00e6\4\2\u014f\u014f\u0160\u0160"+
		"\5\2OOqq\u0153\u0153\4\2\32\32kk\4\2\u0126\u0126\u0195\u0195\3\2\u0199"+
		"\u019a\4\2\u0195\u0195\u0199\u0199-\2JJ\u00c3\u00c3\u00cb\u00cb\u00cd"+
		"\u00cd\u00d4\u00d5\u00d8\u00da\u00de\u00df\u00e1\u00e1\u00e3\u00e6\u00f2"+
		"\u00f2\u00f4\u00f5\u00f7\u00f7\u00fa\u00fa\u00fd\u00fd\u00ff\u0101\u0105"+
		"\u010a\u010c\u010f\u0111\u0111\u0114\u0114\u0116\u0116\u0118\u011a\u011c"+
		"\u0128\u012c\u012c\u0130\u0130\u0132\u0132\u0135\u0137\u0139\u0139\u013b"+
		"\u013c\u013f\u0146\u0148\u014d\u014f\u0151\u0153\u0153\u0155\u0155\u0158"+
		"\u015a\u015c\u0165\u0167\u0168\u016a\u016a\u016d\u0173\u0177\u017a\u017e"+
		"\u017e\u0180\u0184\u0186\u018d\u0196\u0196\3\2\u019f\u01a6\7\2\u010b\u010b"+
		"\u011b\u011b\u012a\u012a\u0176\u0176\u01b3\u01b3\u0e39\2\u0153\3\2\2\2"+
		"\4\u0158\3\2\2\2\6\u0160\3\2\2\2\b\u0168\3\2\2\2\n\u016e\3\2\2\2\f\u017f"+
		"\3\2\2\2\16\u01fe\3\2\2\2\20\u0207\3\2\2\2\22\u020a\3\2\2\2\24\u0240\3"+
		"\2\2\2\26\u0243\3\2\2\2\30\u0271\3\2\2\2\32\u0274\3\2\2\2\34\u0284\3\2"+
		"\2\2\36\u02bf\3\2\2\2 \u02d7\3\2\2\2\"\u02ea\3\2\2\2$\u02ec\3\2\2\2&\u031d"+
		"\3\2\2\2(\u0338\3\2\2\2*\u0361\3\2\2\2,\u0378\3\2\2\2.\u037a\3\2\2\2\60"+
		"\u0399\3\2\2\2\62\u03af\3\2\2\2\64\u03cd\3\2\2\2\66\u03cf\3\2\2\28\u03f5"+
		"\3\2\2\2:\u0422\3\2\2\2<\u0435\3\2\2\2>\u0437\3\2\2\2@\u0450\3\2\2\2B"+
		"\u0452\3\2\2\2D\u045a\3\2\2\2F\u045c\3\2\2\2H\u045f\3\2\2\2J\u0462\3\2"+
		"\2\2L\u0464\3\2\2\2N\u0466\3\2\2\2P\u0468\3\2\2\2R\u0485\3\2\2\2T\u0487"+
		"\3\2\2\2V\u048a\3\2\2\2X\u0493\3\2\2\2Z\u049b\3\2\2\2\\\u04a2\3\2\2\2"+
		"^\u04b9\3\2\2\2`\u04bb\3\2\2\2b\u04c6\3\2\2\2d\u04c8\3\2\2\2f\u04d6\3"+
		"\2\2\2h\u04e0\3\2\2\2j\u04ea\3\2\2\2l\u04f4\3\2\2\2n\u0505\3\2\2\2p\u050c"+
		"\3\2\2\2r\u0516\3\2\2\2t\u0518\3\2\2\2v\u051f\3\2\2\2x\u0545\3\2\2\2z"+
		"\u0561\3\2\2\2|\u058c\3\2\2\2~\u0590\3\2\2\2\u0080\u059d\3\2\2\2\u0082"+
		"\u05cf\3\2\2\2\u0084\u05eb\3\2\2\2\u0086\u0614\3\2\2\2\u0088\u0663\3\2"+
		"\2\2\u008a\u0665\3\2\2\2\u008c\u0669\3\2\2\2\u008e\u066e\3\2\2\2\u0090"+
		"\u0672\3\2\2\2\u0092\u067b\3\2\2\2\u0094\u0680\3\2\2\2\u0096\u068c\3\2"+
		"\2\2\u0098\u068e\3\2\2\2\u009a\u06bf\3\2\2\2\u009c\u06dd\3\2\2\2\u009e"+
		"\u0700\3\2\2\2\u00a0\u070c\3\2\2\2\u00a2\u0713\3\2\2\2\u00a4\u073a\3\2"+
		"\2\2\u00a6\u074b\3\2\2\2\u00a8\u0794\3\2\2\2\u00aa\u0798\3\2\2\2\u00ac"+
		"\u07c7\3\2\2\2\u00ae\u07e3\3\2\2\2\u00b0\u07e5\3\2\2\2\u00b2\u07e7\3\2"+
		"\2\2\u00b4\u07f4\3\2\2\2\u00b6\u0810\3\2\2\2\u00b8\u0812\3\2\2\2\u00ba"+
		"\u081a\3\2\2\2\u00bc\u0822\3\2\2\2\u00be\u082b\3\2\2\2\u00c0\u0867\3\2"+
		"\2\2\u00c2\u086e\3\2\2\2\u00c4\u087c\3\2\2\2\u00c6\u0889\3\2\2\2\u00c8"+
		"\u08b5\3\2\2\2\u00ca\u08df\3\2\2\2\u00cc\u08e1\3\2\2\2\u00ce\u08e8\3\2"+
		"\2\2\u00d0\u08ec\3\2\2\2\u00d2\u08ee\3\2\2\2\u00d4\u0927\3\2\2\2\u00d6"+
		"\u0929\3\2\2\2\u00d8\u092f\3\2\2\2\u00da\u094c\3\2\2\2\u00dc\u094e\3\2"+
		"\2\2\u00de\u095b\3\2\2\2\u00e0\u095d\3\2\2\2\u00e2\u0987\3\2\2\2\u00e4"+
		"\u0989\3\2\2\2\u00e6\u09ab\3\2\2\2\u00e8\u09ad\3\2\2\2\u00ea\u09cb\3\2"+
		"\2\2\u00ec\u09cd\3\2\2\2\u00ee\u09d6\3\2\2\2\u00f0\u0a39\3\2\2\2\u00f2"+
		"\u0a3b\3\2\2\2\u00f4\u0a40\3\2\2\2\u00f6\u0a46\3\2\2\2\u00f8\u0a4a\3\2"+
		"\2\2\u00fa\u0a4f\3\2\2\2\u00fc\u0a5c\3\2\2\2\u00fe\u0a69\3\2\2\2\u0100"+
		"\u0a95\3\2\2\2\u0102\u0a97\3\2\2\2\u0104\u0aa4\3\2\2\2\u0106\u0aa6\3\2"+
		"\2\2\u0108\u0ab4\3\2\2\2\u010a\u0ac6\3\2\2\2\u010c\u0ae8\3\2\2\2\u010e"+
		"\u0aeb\3\2\2\2\u0110\u0aef\3\2\2\2\u0112\u0afe\3\2\2\2\u0114\u0b07\3\2"+
		"\2\2\u0116\u0b0b\3\2\2\2\u0118\u0b13\3\2\2\2\u011a\u0b19\3\2\2\2\u011c"+
		"\u0b3d\3\2\2\2\u011e\u0b3f\3\2\2\2\u0120\u0b4c\3\2\2\2\u0122\u0b4e\3\2"+
		"\2\2\u0124\u0b63\3\2\2\2\u0126\u0ba1\3\2\2\2\u0128\u0baf\3\2\2\2\u012a"+
		"\u0bb6\3\2\2\2\u012c\u0bc4\3\2\2\2\u012e\u0bca\3\2\2\2\u0130\u0bcf\3\2"+
		"\2\2\u0132\u0bd3\3\2\2\2\u0134\u0bdd\3\2\2\2\u0136\u0bdf\3\2\2\2\u0138"+
		"\u0be1\3\2\2\2\u013a\u0be4\3\2\2\2\u013c\u0bed\3\2\2\2\u013e\u0bef\3\2"+
		"\2\2\u0140\u0bfe\3\2\2\2\u0142\u0c0f\3\2\2\2\u0144\u0c11\3\2\2\2\u0146"+
		"\u0c16\3\2\2\2\u0148\u0c18\3\2\2\2\u014a\u0c29\3\2\2\2\u014c\u0c2b\3\2"+
		"\2\2\u014e\u0c2d\3\2\2\2\u0150\u0152\5\4\3\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7\2\2\3\u0157\3\3\2\2\2\u0158\u015a"+
		"\5\6\4\2\u0159\u015b\5\u008aF\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2"+
		"\2\u015b\5\3\2\2\2\u015c\u015e\5\b\5\2\u015d\u015f\7\u01af\2\2\u015e\u015d"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015c\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\7\3\2\2\2"+
		"\u0164\u0169\5\n\6\2\u0165\u0169\5\f\7\2\u0166\u0169\5\16\b\2\u0167\u0169"+
		"\5\20\t\2\u0168\u0164\3\2\2\2\u0168\u0165\3\2\2\2\u0168\u0166\3\2\2\2"+
		"\u0168\u0167\3\2\2\2\u0169\t\3\2\2\2\u016a\u016f\5\22\n\2\u016b\u016f"+
		"\5\26\f\2\u016c\u016f\5\32\16\2\u016d\u016f\5\34\17\2\u016e\u016a\3\2"+
		"\2\2\u016e\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f"+
		"\13\3\2\2\2\u0170\u0180\5$\23\2\u0171\u0180\5&\24\2\u0172\u0180\5(\25"+
		"\2\u0173\u0180\5.\30\2\u0174\u0180\5\60\31\2\u0175\u0180\5n8\2\u0176\u0180"+
		"\5\62\32\2\u0177\u0180\5\66\34\2\u0178\u0180\58\35\2\u0179\u0180\5d\63"+
		"\2\u017a\u0180\5f\64\2\u017b\u0180\5h\65\2\u017c\u0180\5j\66\2\u017d\u0180"+
		"\5p9\2\u017e\u0180\5l\67\2\u017f\u0170\3\2\2\2\u017f\u0171\3\2\2\2\u017f"+
		"\u0172\3\2\2\2\u017f\u0173\3\2\2\2\u017f\u0174\3\2\2\2\u017f\u0175\3\2"+
		"\2\2\u017f\u0176\3\2\2\2\u017f\u0177\3\2\2\2\u017f\u0178\3\2\2\2\u017f"+
		"\u0179\3\2\2\2\u017f\u017a\3\2\2\2\u017f\u017b\3\2\2\2\u017f\u017c\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180\r\3\2\2\2\u0181\u0183"+
		"\7\r\2\2\u0182\u0184\7\u01af\2\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2"+
		"\2\u0184\u0186\3\2\2\2\u0185\u0187\5\6\4\2\u0186\u0185\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\7=\2\2\u0189\u018b\7\u01af\2"+
		"\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u01ff\3\2\2\2\u018c\u018e"+
		"\7\17\2\2\u018d\u018f\7\u01af\2\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u01ff\3\2\2\2\u0190\u0192\7$\2\2\u0191\u0193\7\u01af\2\2\u0192"+
		"\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u01ff\3\2\2\2\u0194\u0195\7Q"+
		"\2\2\u0195\u0197\5\u0146\u00a4\2\u0196\u0198\7\u01af\2\2\u0197\u0196\3"+
		"\2\2\2\u0197\u0198\3\2\2\2\u0198\u01ff\3\2\2\2\u0199\u019a\5\u0146\u00a4"+
		"\2\u019a\u019c\7\u01b0\2\2\u019b\u019d\7\u01af\2\2\u019c\u019b\3\2\2\2"+
		"\u019c\u019d\3\2\2\2\u019d\u01ff\3\2\2\2\u019e\u019f\7X\2\2\u019f\u01a0"+
		"\5\u00ba^\2\u01a0\u01a3\5\b\5\2\u01a1\u01a2\7<\2\2\u01a2\u01a4\5\b\5\2"+
		"\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a7"+
		"\7\u01af\2\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01ff\3\2\2"+
		"\2\u01a8\u01aa\7\u0090\2\2\u01a9\u01ab\5\u00acW\2\u01aa\u01a9\3\2\2\2"+
		"\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01ae\7\u01af\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01ff\3\2\2\2\u01af\u01b5\7\u0178"+
		"\2\2\u01b0\u01b1\t\2\2\2\u01b1\u01b2\7\u01ae\2\2\u01b2\u01b3\t\3\2\2\u01b3"+
		"\u01b4\7\u01ae\2\2\u01b4\u01b6\t\2\2\2\u01b5\u01b0\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b9\7\u01af\2\2\u01b8\u01b7\3\2\2"+
		"\2\u01b8\u01b9\3\2\2\2\u01b9\u01ff\3\2\2\2\u01ba\u01bb\7\r\2\2\u01bb\u01bd"+
		"\7\u017e\2\2\u01bc\u01be\7\u01af\2\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3"+
		"\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01c1\5\6\4\2\u01c0\u01bf\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\7=\2\2\u01c3\u01c5\7\u017e"+
		"\2\2\u01c4\u01c6\7\u01af\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c8\7\r\2\2\u01c8\u01ca\7\u00da\2\2\u01c9\u01cb"+
		"\7\u01af\2\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2"+
		"\2\u01cc\u01ce\5\6\4\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf"+
		"\3\2\2\2\u01cf\u01d0\7=\2\2\u01d0\u01d2\7\u00da\2\2\u01d1\u01d3\7\u01af"+
		"\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01ff\3\2\2\2\u01d4"+
		"\u01d5\7\u00bc\2\2\u01d5\u01d6\t\4\2\2\u01d6\u01d8\5\u00acW\2\u01d7\u01d9"+
		"\7\u01af\2\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01ff\3\2\2"+
		"\2\u01da\u01db\7\u00bf\2\2\u01db\u01e5\5\u00ba^\2\u01dc\u01e6\5\b\5\2"+
		"\u01dd\u01df\7\17\2\2\u01de\u01e0\7\u01af\2\2\u01df\u01de\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e6\3\2\2\2\u01e1\u01e3\7$\2\2\u01e2\u01e4\7\u01af"+
		"\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5"+
		"\u01dc\3\2\2\2\u01e5\u01dd\3\2\2\2\u01e5\u01e1\3\2\2\2\u01e6\u01ff\3\2"+
		"\2\2\u01e7\u01e8\7\u0084\2\2\u01e8\u01ea\5\u00acW\2\u01e9\u01eb\7\u01af"+
		"\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ff\3\2\2\2\u01ec"+
		"\u01ed\7\u0088\2\2\u01ed\u01ee\7\u01ac\2\2\u01ee\u01ef\t\5\2\2\u01ef\u01f0"+
		"\7\u01ae\2\2\u01f0\u01f1\5\u00aaV\2\u01f1\u01f2\7\u01ae\2\2\u01f2\u01f7"+
		"\5\u00aaV\2\u01f3\u01f4\7\u01ae\2\2\u01f4\u01f6\5\u00aaV\2\u01f5\u01f3"+
		"\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fc\7\u01ad\2\2\u01fb\u01fd"+
		"\7\u01af\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2"+
		"\2\u01fe\u0181\3\2\2\2\u01fe\u018c\3\2\2\2\u01fe\u0190\3\2\2\2\u01fe\u0194"+
		"\3\2\2\2\u01fe\u0199\3\2\2\2\u01fe\u019e\3\2\2\2\u01fe\u01a8\3\2\2\2\u01fe"+
		"\u01af\3\2\2\2\u01fe\u01ba\3\2\2\2\u01fe\u01d4\3\2\2\2\u01fe\u01da\3\2"+
		"\2\2\u01fe\u01e7\3\2\2\2\u01fe\u01ec\3\2\2\2\u01ff\17\3\2\2\2\u0200\u0208"+
		"\5x=\2\u0201\u0208\5z>\2\u0202\u0208\5|?\2\u0203\u0208\5\u0082B\2\u0204"+
		"\u0208\5\u0086D\2\u0205\u0208\5\u0088E\2\u0206\u0208\5\u008cG\2\u0207"+
		"\u0200\3\2\2\2\u0207\u0201\3\2\2\2\u0207\u0202\3\2\2\2\u0207\u0203\3\2"+
		"\2\2\u0207\u0204\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208"+
		"\21\3\2\2\2\u0209\u020b\5\u00b2Z\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020c\u0214\7\63\2\2\u020d\u020e\7\u00ab\2\2"+
		"\u020e\u020f\7\u01ac\2\2\u020f\u0210\5\u00acW\2\u0210\u0212\7\u01ad\2"+
		"\2\u0211\u0213\7\177\2\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0215\3\2\2\2\u0214\u020d\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2"+
		"\2\2\u0216\u0218\7N\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021b\5\24\13\2\u021a\u021c\5\u00fc\177\2\u021b\u021a"+
		"\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021f\5\36\20\2"+
		"\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u0221"+
		"\7N\2\2\u0221\u0223\5\u00dco\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2"+
		"\u0223\u0231\3\2\2\2\u0224\u022f\7\u00be\2\2\u0225\u0230\5\u00ba^\2\u0226"+
		"\u0227\7(\2\2\u0227\u022d\7p\2\2\u0228\u022a\7\u010c\2\2\u0229\u0228\3"+
		"\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022e\5\u0134\u009b"+
		"\2\u022c\u022e\7\u0194\2\2\u022d\u0229\3\2\2\2\u022d\u022c\3\2\2\2\u022e"+
		"\u0230\3\2\2\2\u022f\u0225\3\2\2\2\u022f\u0226\3\2\2\2\u0230\u0232\3\2"+
		"\2\2\u0231\u0224\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233"+
		"\u0235\5\u00caf\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237"+
		"\3\2\2\2\u0236\u0238\5\u00d2j\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2"+
		"\2\u0238\u023a\3\2\2\2\u0239\u023b\7\u01af\2\2\u023a\u0239\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\23\3\2\2\2\u023c\u0241\5\u00f8}\2\u023d\u0241\5\u012e"+
		"\u0098\2\u023e\u0241\5r:\2\u023f\u0241\7\u0194\2\2\u0240\u023c\3\2\2\2"+
		"\u0240\u023d\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u023f\3\2\2\2\u0241\25"+
		"\3\2\2\2\u0242\u0244\5\u00b2Z\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2"+
		"\2\u0244\u0245\3\2\2\2\u0245\u024d\7\\\2\2\u0246\u0247\7\u00ab\2\2\u0247"+
		"\u0248\7\u01ac\2\2\u0248\u0249\5\u00acW\2\u0249\u024b\7\u01ad\2\2\u024a"+
		"\u024c\7\177\2\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\3"+
		"\2\2\2\u024d\u0246\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\3\2\2\2\u024f"+
		"\u0251\7^\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0254\3\2"+
		"\2\2\u0252\u0255\5\u012e\u0098\2\u0253\u0255\5r:\2\u0254\u0252\3\2\2\2"+
		"\u0254\u0253\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0258\5\u00fc\177\2\u0257"+
		"\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025d\3\2\2\2\u0259\u025a\7\u01ac"+
		"\2\2\u025a\u025b\5\u0132\u009a\2\u025b\u025c\7\u01ad\2\2\u025c\u025e\3"+
		"\2\2\2\u025d\u0259\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f"+
		"\u0261\5\36\20\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3"+
		"\2\2\2\u0262\u0264\5\30\r\2\u0263\u0265\5\u00caf\2\u0264\u0263\3\2\2\2"+
		"\u0264\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0268\5\u00d2j\2\u0267"+
		"\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u026b\7\u01af"+
		"\2\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\27\3\2\2\2\u026c\u0272"+
		"\5\u0106\u0084\2\u026d\u0272\5\u00eex\2\u026e\u0272\5|?\2\u026f\u0270"+
		"\7\62\2\2\u0270\u0272\7\u00b9\2\2\u0271\u026c\3\2\2\2\u0271\u026d\3\2"+
		"\2\2\u0271\u026e\3\2\2\2\u0271\u026f\3\2\2\2\u0272\31\3\2\2\2\u0273\u0275"+
		"\5\u00b2Z\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2\2"+
		"\2\u0276\u0278\5\u00c2b\2\u0277\u0279\5\u00c8e\2\u0278\u0277\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a\u027c\5\u00caf\2\u027b\u027a"+
		"\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027f\5\u00d2j"+
		"\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280\u0282"+
		"\7\u01af\2\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282\33\3\2\2\2"+
		"\u0283\u0285\5\u00b2Z\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u028e\7\u00b5\2\2\u0287\u0288\7\u00ab\2\2\u0288\u0289"+
		"\7\u01ac\2\2\u0289\u028a\5\u00acW\2\u028a\u028c\7\u01ad\2\2\u028b\u028d"+
		"\7\177\2\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\3\2\2\2"+
		"\u028e\u0287\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u0293"+
		"\5\u012e\u0098\2\u0291\u0293\5r:\2\u0292\u0290\3\2\2\2\u0292\u0291\3\2"+
		"\2\2\u0293\u0295\3\2\2\2\u0294\u0296\5\u00fa~\2\u0295\u0294\3\2\2\2\u0295"+
		"\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\7\u00a0\2\2\u0298\u029d"+
		"\5\u00b6\\\2\u0299\u029a\7\u01ae\2\2\u029a\u029c\5\u00b6\\\2\u029b\u0299"+
		"\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e"+
		"\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a2\5\36\20\2\u02a1\u02a0\3"+
		"\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a4\7N\2\2\u02a4"+
		"\u02a6\5\u00dco\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02b4"+
		"\3\2\2\2\u02a7\u02b2\7\u00be\2\2\u02a8\u02b3\5\u00b8]\2\u02a9\u02aa\7"+
		"(\2\2\u02aa\u02b0\7p\2\2\u02ab\u02ad\7\u010c\2\2\u02ac\u02ab\3\2\2\2\u02ac"+
		"\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b1\5\u0134\u009b\2\u02af\u02b1"+
		"\7\u0194\2\2\u02b0\u02ac\3\2\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b3\3\2\2"+
		"\2\u02b2\u02a8\3\2\2\2\u02b2\u02a9\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02a7"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6\u02b8\5\u00caf"+
		"\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02bb"+
		"\5\u00d2j\2\u02ba\u02b9\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\3\2\2"+
		"\2\u02bc\u02be\7\u01af\2\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\35\3\2\2\2\u02bf\u02c0\7\u0145\2\2\u02c0\u02c5\5 \21\2\u02c1\u02c2\7"+
		"\u01ae\2\2\u02c2\u02c4\5 \21\2\u02c3\u02c1\3\2\2\2\u02c4\u02c7\3\2\2\2"+
		"\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02d3\3\2\2\2\u02c7\u02c5"+
		"\3\2\2\2\u02c8\u02cb\7^\2\2\u02c9\u02cc\7\u0194\2\2\u02ca\u02cc\5\u0128"+
		"\u0095\2\u02cb\u02c9\3\2\2\2\u02cb\u02ca\3\2\2\2\u02cc\u02d1\3\2\2\2\u02cd"+
		"\u02ce\7\u01ac\2\2\u02ce\u02cf\5\u0132\u009a\2\u02cf\u02d0\7\u01ad\2\2"+
		"\u02d0\u02d2\3\2\2\2\u02d1\u02cd\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4"+
		"\3\2\2\2\u02d3\u02c8\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\37\3\2\2\2\u02d5"+
		"\u02d8\5\"\22\2\u02d6\u02d8\5\u00acW\2\u02d7\u02d5\3\2\2\2\u02d7\u02d6"+
		"\3\2\2\2\u02d8\u02dd\3\2\2\2\u02d9\u02db\7\t\2\2\u02da\u02d9\3\2\2\2\u02da"+
		"\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02de\5\u0104\u0083\2\u02dd\u02da"+
		"\3\2\2\2\u02dd\u02de\3\2\2\2\u02de!\3\2\2\2\u02df\u02e3\7\u00f4\2\2\u02e0"+
		"\u02e3\7\u0119\2\2\u02e1\u02e3\5\u0128\u0095\2\u02e2\u02df\3\2\2\2\u02e2"+
		"\u02e0\3\2\2\2\u02e2\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e7\7\u01a7"+
		"\2\2\u02e5\u02e8\7\u01b1\2\2\u02e6\u02e8\5\u0146\u00a4\2\u02e7\u02e5\3"+
		"\2\2\2\u02e7\u02e6\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02eb\7\u018e\2\2"+
		"\u02ea\u02e2\3\2\2\2\u02ea\u02e9\3\2\2\2\u02eb#\3\2\2\2\u02ec\u02ed\7"+
		"&\2\2\u02ed\u02ee\7.\2\2\u02ee\u02f2\5\u0146\u00a4\2\u02ef\u02f0\7!\2"+
		"\2\u02f0\u02f1\7\u019b\2\2\u02f1\u02f3\t\6\2\2\u02f2\u02ef\3\2\2\2\u02f2"+
		"\u02f3\3\2\2\2\u02f3\u0300\3\2\2\2\u02f4\u02f6\7s\2\2\u02f5\u02f7\7\u0083"+
		"\2\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"+
		"\u02fd\5\u0120\u0091\2\u02f9\u02fa\7\u01ae\2\2\u02fa\u02fc\5\u0120\u0091"+
		"\2\u02fb\u02f9\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe"+
		"\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u02f4\3\2\2\2\u0300"+
		"\u0301\3\2\2\2\u0301\u030c\3\2\2\2\u0302\u0303\7g\2\2\u0303\u0304\7s\2"+
		"\2\u0304\u0309\5\u0120\u0091\2\u0305\u0306\7\u01ae\2\2\u0306\u0308\5\u0120"+
		"\u0091\2\u0307\u0305\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309"+
		"\u030a\3\2\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u0302\3\2"+
		"\2\2\u030c\u030d\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030f\7\34\2\2\u030f"+
		"\u0311\5\u0146\u00a4\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u031b"+
		"\3\2\2\2\u0312\u0313\7\u00c0\2\2\u0313\u0318\5\u011c\u008f\2\u0314\u0315"+
		"\7\u01ae\2\2\u0315\u0317\5\u011c\u008f\2\u0316\u0314\3\2\2\2\u0317\u031a"+
		"\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031c\3\2\2\2\u031a"+
		"\u0318\3\2\2\2\u031b\u0312\3\2\2\2\u031b\u031c\3\2\2\2\u031c%\3\2\2\2"+
		"\u031d\u031f\7&\2\2\u031e\u0320\7\u00b3\2\2\u031f\u031e\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u0322\3\2\2\2\u0321\u0323\5\u0138\u009d\2\u0322\u0321"+
		"\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\7Z\2\2\u0325"+
		"\u0326\5\u0146\u00a4\2\u0326\u0327\7s\2\2\u0327\u0328\5\u00e8u\2\u0328"+
		"\u0329\7\u01ac\2\2\u0329\u032b\5\u0132\u009a\2\u032a\u032c\t\7\2\2\u032b"+
		"\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032f\7\u01ad"+
		"\2\2\u032e\u0330\5\u009eP\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"\u0333\3\2\2\2\u0331\u0332\7s\2\2\u0332\u0334\5\u0146\u00a4\2\u0333\u0331"+
		"\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335\u0337\7\u01af\2"+
		"\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\'\3\2\2\2\u0338\u0339"+
		"\7&\2\2\u0339\u033a\t\b\2\2\u033a\u033d\5\u012c\u0097\2\u033b\u033c\7"+
		"\u01af\2\2\u033c\u033e\7\u0195\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2"+
		"\2\2\u033e\u034d\3\2\2\2\u033f\u0341\7\u01ac\2\2\u0340\u033f\3\2\2\2\u0340"+
		"\u0341\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0347\5*\26\2\u0343\u0344\7\u01ae"+
		"\2\2\u0344\u0346\5*\26\2\u0345\u0343\3\2\2\2\u0346\u0349\3\2\2\2\u0347"+
		"\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2"+
		"\2\2\u034a\u034c\7\u01ad\2\2\u034b\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c"+
		"\u034e\3\2\2\2\u034d\u0340\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0358\3\2"+
		"\2\2\u034f\u0350\7\u00c0\2\2\u0350\u0355\5,\27\2\u0351\u0352\7\u01ae\2"+
		"\2\u0352\u0354\5,\27\2\u0353\u0351\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353"+
		"\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0359\3\2\2\2\u0357\u0355\3\2\2\2\u0358"+
		"\u034f\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035c\3\2\2\2\u035a\u035b\7I"+
		"\2\2\u035b\u035d\7\u008d\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d"+
		"\u035e\3\2\2\2\u035e\u035f\7\t\2\2\u035f\u0360\5\6\4\2\u0360)\3\2\2\2"+
		"\u0361\u0365\7\u0194\2\2\u0362\u0363\5\u0146\u00a4\2\u0363\u0364\7\u01a7"+
		"\2\2\u0364\u0366\3\2\2\2\u0365\u0362\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u0368\3\2\2\2\u0367\u0369\7\t\2\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2"+
		"\2\2\u0369\u036a\3\2\2\2\u036a\u036c\5\u013e\u00a0\2\u036b\u036d\7\u00ba"+
		"\2\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u0370\3\2\2\2\u036e"+
		"\u036f\7\u019b\2\2\u036f\u0371\5\u0140\u00a1\2\u0370\u036e\3\2\2\2\u0370"+
		"\u0371\3\2\2\2\u0371\u0373\3\2\2\2\u0372\u0374\t\t\2\2\u0373\u0372\3\2"+
		"\2\2\u0373\u0374\3\2\2\2\u0374+\3\2\2\2\u0375\u0379\7\u00fd\2\2\u0376"+
		"\u0379\7\u0155\2\2\u0377\u0379\5\u008eH\2\u0378\u0375\3\2\2\2\u0378\u0376"+
		"\3\2\2\2\u0378\u0377\3\2\2\2\u0379-\3\2\2\2\u037a\u037b\7&\2\2\u037b\u037c"+
		"\7\u00a4\2\2\u037c\u037d\5\u0146\u00a4\2\u037d\u037e\7s\2\2\u037e\u037f"+
		"\5\u00e8u\2\u037f\u0380\7\u01ac\2\2\u0380\u0381\5\u0132\u009a\2\u0381"+
		"\u0394\7\u01ad\2\2\u0382\u0388\7\u00c0\2\2\u0383\u0389\7\u010a\2\2\u0384"+
		"\u0385\7\u0162\2\2\u0385\u0386\7\u0195\2\2\u0386\u0389\t\n\2\2\u0387\u0389"+
		"\7\u0170\2\2\u0388\u0383\3\2\2\2\u0388\u0384\3\2\2\2\u0388\u0387\3\2\2"+
		"\2\u0389\u038c\3\2\2\2\u038a\u038b\7\u01ae\2\2\u038b\u038d\7\u0139\2\2"+
		"\u038c\u038a\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u0392\3\2\2\2\u038e\u038f"+
		"\7\u01ae\2\2\u038f\u0390\7\u0117\2\2\u0390\u0391\7\u019b\2\2\u0391\u0393"+
		"\5\u0136\u009c\2\u0392\u038e\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0395\3"+
		"\2\2\2\u0394\u0382\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0397\3\2\2\2\u0396"+
		"\u0398\7\u01af\2\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2\2\2\u0398/\3\2"+
		"\2\2\u0399\u039a\7&\2\2\u039a\u039b\7\u00a6\2\2\u039b\u039c\5\u0128\u0095"+
		"\2\u039c\u039d\7\u01ac\2\2\u039d\u039f\5\u0094K\2\u039e\u03a0\7\u01ae"+
		"\2\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"+
		"\u03a5\7\u01ad\2\2\u03a2\u03a3\7s\2\2\u03a3\u03a6\5\u0146\u00a4\2\u03a4"+
		"\u03a6\7\62\2\2\u03a5\u03a2\3\2\2\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3"+
		"\2\2\2\u03a6\u03aa\3\2\2\2\u03a7\u03a8\7\u0177\2\2\u03a8\u03ab\5\u0146"+
		"\u00a4\2\u03a9\u03ab\7\62\2\2\u03aa\u03a7\3\2\2\2\u03aa\u03a9\3\2\2\2"+
		"\u03aa\u03ab\3\2\2\2\u03ab\u03ad\3\2\2\2\u03ac\u03ae\7\u01af\2\2\u03ad"+
		"\u03ac\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\61\3\2\2\2\u03af\u03b0\7&\2\2"+
		"\u03b0\u03b1\7\u00bb\2\2\u03b1\u03b6\5\u012a\u0096\2\u03b2\u03b3\7\u01ac"+
		"\2\2\u03b3\u03b4\5\u0132\u009a\2\u03b4\u03b5\7\u01ad\2\2\u03b5\u03b7\3"+
		"\2\2\2\u03b6\u03b2\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03c1\3\2\2\2\u03b8"+
		"\u03b9\7\u00c0\2\2\u03b9\u03be\5\64\33\2\u03ba\u03bb\7\u01ae\2\2\u03bb"+
		"\u03bd\5\64\33\2\u03bc\u03ba\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc\3"+
		"\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1"+
		"\u03b8\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\7\t"+
		"\2\2\u03c4\u03c8\5\32\16\2\u03c5\u03c6\7\u00c0\2\2\u03c6\u03c7\7\27\2"+
		"\2\u03c7\u03c9\7y\2\2\u03c8\u03c5\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb"+
		"\3\2\2\2\u03ca\u03cc\7\u01af\2\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2"+
		"\2\u03cc\63\3\2\2\2\u03cd\u03ce\t\13\2\2\u03ce\65\3\2\2\2\u03cf\u03d0"+
		"\7\6\2\2\u03d0\u03d1\7\u00a6\2\2\u03d1\u03f0\5\u0128\u0095\2\u03d2\u03d3"+
		"\7\u00a0\2\2\u03d3\u03d4\7\u01ac\2\2\u03d4\u03d5\7\u0122\2\2\u03d5\u03d6"+
		"\7\u019b\2\2\u03d6\u03d7\t\f\2\2\u03d7\u03f1\7\u01ad\2\2\u03d8\u03d9\7"+
		"\4\2\2\u03d9\u03f1\5\u0096L\2\u03da\u03db\7:\2\2\u03db\u03dc\7 \2\2\u03dc"+
		"\u03f1\5\u0146\u00a4\2\u03dd\u03de\7\u00c0\2\2\u03de\u03df\7\27\2\2\u03df"+
		"\u03e0\7\4\2\2\u03e0\u03e1\7 \2\2\u03e1\u03e2\5\u0146\u00a4\2\u03e2\u03e3"+
		"\7K\2\2\u03e3\u03e4\7a\2\2\u03e4\u03e5\7\u01ac\2\2\u03e5\u03e6\5\u0132"+
		"\u009a\2\u03e6\u03e7\7\u01ad\2\2\u03e7\u03e8\7\u008c\2\2\u03e8\u03e9\5"+
		"\u0128\u0095\2\u03e9\u03ea\7\u01ac\2\2\u03ea\u03eb\5\u0132\u009a\2\u03eb"+
		"\u03ec\7\u01ad\2\2\u03ec\u03f1\3\2\2\2\u03ed\u03ee\7\27\2\2\u03ee\u03ef"+
		"\7 \2\2\u03ef\u03f1\5\u0146\u00a4\2\u03f0\u03d2\3\2\2\2\u03f0\u03d8\3"+
		"\2\2\2\u03f0\u03da\3\2\2\2\u03f0\u03dd\3\2\2\2\u03f0\u03ed\3\2\2\2\u03f1"+
		"\u03f3\3\2\2\2\u03f2\u03f4\7\u01af\2\2\u03f3\u03f2\3\2\2\2\u03f3\u03f4"+
		"\3\2\2\2\u03f4\67\3\2\2\2\u03f5\u03f6\7\6\2\2\u03f6\u03f9\7.\2\2\u03f7"+
		"\u03fa\5\u0146\u00a4\2\u03f8\u03fa\7(\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03f8"+
		"\3\2\2\2\u03fa\u0407\3\2\2\2\u03fb\u03fc\7\u0130\2\2\u03fc\u03fd\7\u0132"+
		"\2\2\u03fd\u03fe\7\u019b\2\2\u03fe\u0408\5\u0146\u00a4\2\u03ff\u0400\7"+
		"\34\2\2\u0400\u0408\5\u0146\u00a4\2\u0401\u0402\7\u00a0\2\2\u0402\u0405"+
		"\5:\36\2\u0403\u0404\7\u00c0\2\2\u0404\u0406\5b\62\2\u0405\u0403\3\2\2"+
		"\2\u0405\u0406\3\2\2\2\u0406\u0408\3\2\2\2\u0407\u03fb\3\2\2\2\u0407\u03ff"+
		"\3\2\2\2\u0407\u0401\3\2\2\2\u0408\u040a\3\2\2\2\u0409\u040b\7\u01af\2"+
		"\2\u040a\u0409\3\2\2\2\u040a\u040b\3\2\2\2\u040b9\3\2\2\2\u040c\u0423"+
		"\5<\37\2\u040d\u0423\5> \2\u040e\u0423\5B\"\2\u040f\u0423\5D#\2\u0410"+
		"\u0423\5F$\2\u0411\u0423\5H%\2\u0412\u0423\5J&\2\u0413\u0423\5L\'\2\u0414"+
		"\u0423\5N(\2\u0415\u0423\5P)\2\u0416\u0423\5R*\2\u0417\u0418\7\u0104\2"+
		"\2\u0418\u0423\5\u011e\u0090\2\u0419\u0423\7\3\2\2\u041a\u0423\5T+\2\u041b"+
		"\u0423\5V,\2\u041c\u0423\5X-\2\u041d\u0423\5Z.\2\u041e\u0423\5\\/\2\u041f"+
		"\u0423\5^\60\2\u0420\u0423\5`\61\2\u0421\u0423\5b\62\2\u0422\u040c\3\2"+
		"\2\2\u0422\u040d\3\2\2\2\u0422\u040e\3\2\2\2\u0422\u040f\3\2\2\2\u0422"+
		"\u0410\3\2\2\2\u0422\u0411\3\2\2\2\u0422\u0412\3\2\2\2\u0422\u0413\3\2"+
		"\2\2\u0422\u0414\3\2\2\2\u0422\u0415\3\2\2\2\u0422\u0416\3\2\2\2\u0422"+
		"\u0417\3\2\2\2\u0422\u0419\3\2\2\2\u0422\u041a\3\2\2\2\u0422\u041b\3\2"+
		"\2\2\u0422\u041c\3\2\2\2\u0422\u041d\3\2\2\2\u0422\u041e\3\2\2\2\u0422"+
		"\u041f\3\2\2\2\u0422\u0420\3\2\2\2\u0422\u0421\3\2\2\2\u0423;\3\2\2\2"+
		"\u0424\u0425\7\u00cf\2\2\u0425\u0436\5\u0136\u009c\2\u0426\u0427\7\u00d0"+
		"\2\2\u0427\u0436\7q\2\2\u0428\u042d\7s\2\2\u0429\u042a\7\u0117\2\2\u042a"+
		"\u042b\7\u019b\2\2\u042b\u042e\7s\2\2\u042c\u042e\7q\2\2\u042d\u0429\3"+
		"\2\2\2\u042d\u042c\3\2\2\2\u042e\u0436\3\2\2\2\u042f\u0430\7\u00d1\2\2"+
		"\u0430\u0436\5\u0136\u009c\2\u0431\u0432\7\u00d2\2\2\u0432\u0436\5\u0136"+
		"\u009c\2\u0433\u0434\7\u00d3\2\2\u0434\u0436\t\r\2\2\u0435\u0424\3\2\2"+
		"\2\u0435\u0426\3\2\2\2\u0435\u0428\3\2\2\2\u0435\u042f\3\2\2\2\u0435\u0431"+
		"\3\2\2\2\u0435\u0433\3\2\2\2\u0436=\3\2\2\2\u0437\u0438\7\u00dc\2\2\u0438"+
		"\u0448\7\u019b\2\2\u0439\u0449\7q\2\2\u043a\u0445\7s\2\2\u043b\u0440\5"+
		"@!\2\u043c\u043d\7\u01ae\2\2\u043d\u043f\5@!\2\u043e\u043c\3\2\2\2\u043f"+
		"\u0442\3\2\2\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0444\3\2"+
		"\2\2\u0442\u0440\3\2\2\2\u0443\u043b\3\2\2\2\u0444\u0447\3\2\2\2\u0445"+
		"\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0449\3\2\2\2\u0447\u0445\3\2"+
		"\2\2\u0448\u0439\3\2\2\2\u0448\u043a\3\2\2\2\u0449?\3\2\2\2\u044a\u044b"+
		"\7\u00ce\2\2\u044b\u044c\7\u019b\2\2\u044c\u0451\5\u0136\u009c\2\u044d"+
		"\u044e\7\u00db\2\2\u044e\u044f\7\u019b\2\2\u044f\u0451\t\16\2\2\u0450"+
		"\u044a\3\2\2\2\u0450\u044d\3\2\2\2\u0451A\3\2\2\2\u0452\u0453\7!\2\2\u0453"+
		"\u0454\7\u019b\2\2\u0454\u0455\t\6\2\2\u0455C\3\2\2\2\u0456\u0457\7\u00e7"+
		"\2\2\u0457\u045b\5\u0136\u009c\2\u0458\u0459\7\u00e8\2\2\u0459\u045b\t"+
		"\17\2\2\u045a\u0456\3\2\2\2\u045a\u0458\3\2\2\2\u045bE\3\2\2\2\u045c\u045d"+
		"\7\u00ed\2\2\u045d\u045e\5\u0136\u009c\2\u045eG\3\2\2\2\u045f\u0460\7"+
		"\u00fd\2\2\u0460\u0461\5\u0136\u009c\2\u0461I\3\2\2\2\u0462\u0463\t\20"+
		"\2\2\u0463K\3\2\2\2\u0464\u0465\t\21\2\2\u0465M\3\2\2\2\u0466\u0467\t"+
		"\22\2\2\u0467O\3\2\2\2\u0468\u0469\7\u00f3\2\2\u0469\u046a\7\u019b\2\2"+
		"\u046a\u046b\t\23\2\2\u046bQ\3\2\2\2\u046c\u046d\7\u00ef\2\2\u046d\u0486"+
		"\5\u0136\u009c\2\u046e\u046f\7\u017d\2\2\u046f\u0486\5\u0136\u009c\2\u0470"+
		"\u0471\7\u00f1\2\2\u0471\u0474\7\u019b\2\2\u0472\u0475\5\u0146\u00a4\2"+
		"\u0473\u0475\7\u0197\2\2\u0474\u0472\3\2\2\2\u0474\u0473\3\2\2\2\u0475"+
		"\u0486\3\2\2\2\u0476\u0477\7\u00f0\2\2\u0477\u047a\7\u019b\2\2\u0478\u047b"+
		"\5\u0146\u00a4\2\u0479\u047b\7\u0197\2\2\u047a\u0478\3\2\2\2\u047a\u0479"+
		"\3\2\2\2\u047b\u0486\3\2\2\2\u047c\u047d\7\u0133\2\2\u047d\u047e\7\u019b"+
		"\2\2\u047e\u0486\t\r\2\2\u047f\u0480\7\u017c\2\2\u0480\u0481\7\u019b\2"+
		"\2\u0481\u0486\t\r\2\2\u0482\u0483\7\u017f\2\2\u0483\u0484\7\u019b\2\2"+
		"\u0484\u0486\7\u0195\2\2\u0485\u046c\3\2\2\2\u0485\u046e\3\2\2\2\u0485"+
		"\u0470\3\2\2\2\u0485\u0476\3\2\2\2\u0485\u047c\3\2\2\2\u0485\u047f\3\2"+
		"\2\2\u0485\u0482\3\2\2\2\u0486S\3\2\2\2\u0487\u0488\7\u012f\2\2\u0488"+
		"\u0489\t\r\2\2\u0489U\3\2\2\2\u048a\u048b\7\u0148\2\2\u048b\u048c\t\24"+
		"\2\2\u048cW\3\2\2\2\u048d\u048e\7\u0156\2\2\u048e\u0494\t\25\2\2\u048f"+
		"\u0490\7\u017b\2\2\u0490\u0494\5\u0136\u009c\2\u0491\u0492\7\u0147\2\2"+
		"\u0492\u0494\t\26\2\2\u0493\u048d\3\2\2\2\u0493\u048f\3\2\2\2\u0493\u0491"+
		"\3\2\2\2\u0494Y\3\2\2\2\u0495\u049c\7\u00fc\2\2\u0496\u049c\7\u00f9\2"+
		"\2\u0497\u049c\7\u0134\2\2\u0498\u049c\7\u00fe\2\2\u0499\u049a\7\u0112"+
		"\2\2\u049a\u049c\5\u0136\u009c\2\u049b\u0495\3\2\2\2\u049b\u0496\3\2\2"+
		"\2\u049b\u0497\3\2\2\2\u049b\u0498\3\2\2\2\u049b\u0499\3\2\2\2\u049c["+
		"\3\2\2\2\u049d\u049e\7\u00c6\2\2\u049e\u04a3\5\u0136\u009c\2\u049f\u04a0"+
		"\7\u0152\2\2\u04a0\u04a3\t\r\2\2\u04a1\u04a3\t\r\2\2\u04a2\u049d\3\2\2"+
		"\2\u04a2\u049f\3\2\2\2\u04a2\u04a1\3\2\2\2\u04a3]\3\2\2\2\u04a4\u04a5"+
		"\7\u00c8\2\2\u04a5\u04ba\5\u0136\u009c\2\u04a6\u04a7\7\u00c7\2\2\u04a7"+
		"\u04ba\5\u0136\u009c\2\u04a8\u04a9\7\u00c9\2\2\u04a9\u04ba\5\u0136\u009c"+
		"\2\u04aa\u04ab\7\u00ca\2\2\u04ab\u04ba\5\u0136\u009c\2\u04ac\u04ad\7\u00cc"+
		"\2\2\u04ad\u04ba\5\u0136\u009c\2\u04ae\u04af\7\u00e0\2\2\u04af\u04b0\7"+
		"\u019b\2\2\u04b0\u04ba\7\u0195\2\2\u04b1\u04b2\7\u00e2\2\2\u04b2\u04ba"+
		"\5\u0136\u009c\2\u04b3\u04b4\7\u013d\2\2\u04b4\u04ba\5\u0136\u009c\2\u04b5"+
		"\u04b6\7\u014e\2\2\u04b6\u04ba\5\u0136\u009c\2\u04b7\u04b8\7\u0157\2\2"+
		"\u04b8\u04ba\5\u0136\u009c\2\u04b9\u04a4\3\2\2\2\u04b9\u04a6\3\2\2\2\u04b9"+
		"\u04a8\3\2\2\2\u04b9\u04aa\3\2\2\2\u04b9\u04ac\3\2\2\2\u04b9\u04ae\3\2"+
		"\2\2\u04b9\u04b1\3\2\2\2\u04b9\u04b3\3\2\2\2\u04b9\u04b5\3\2\2\2\u04b9"+
		"\u04b7\3\2\2\2\u04ba_\3\2\2\2\u04bb\u04bc\7\u0175\2\2\u04bc\u04bd\7\u019b"+
		"\2\2\u04bd\u04be\7\u0195\2\2\u04be\u04bf\t\27\2\2\u04bfa\3\2\2\2\u04c0"+
		"\u04c1\7\u0094\2\2\u04c1\u04c2\7\u00c4\2\2\u04c2\u04c7\7\u0195\2\2\u04c3"+
		"\u04c4\7\u0094\2\2\u04c4\u04c7\7\u0115\2\2\u04c5\u04c7\7\u013a\2\2\u04c6"+
		"\u04c0\3\2\2\2\u04c6\u04c3\3\2\2\2\u04c6\u04c5\3\2\2\2\u04c7c\3\2\2\2"+
		"\u04c8\u04c9\7:\2\2\u04c9\u04cc\7Z\2\2\u04ca\u04cb\7X\2\2\u04cb\u04cd"+
		"\7B\2\2\u04cc\u04ca\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce"+
		"\u04d1\5\u0146\u00a4\2\u04cf\u04d0\7s\2\2\u04d0\u04d2\5\u0128\u0095\2"+
		"\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04d5"+
		"\7\u01af\2\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5e\3\2\2\2\u04d6"+
		"\u04d7\7:\2\2\u04d7\u04da\7\u0086\2\2\u04d8\u04d9\7X\2\2\u04d9\u04db\7"+
		"B\2\2\u04da\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc"+
		"\u04de\5\u012c\u0097\2\u04dd\u04df\7\u01af\2\2\u04de\u04dd\3\2\2\2\u04de"+
		"\u04df\3\2\2\2\u04dfg\3\2\2\2\u04e0\u04e1\7:\2\2\u04e1\u04e5\7\u00a4\2"+
		"\2\u04e2\u04e3\5\u0128\u0095\2\u04e3\u04e4\7\u01a7\2\2\u04e4\u04e6\3\2"+
		"\2\2\u04e5\u04e2\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7"+
		"\u04e8\5\u0146\u00a4\2\u04e8\u04e9\7\u01af\2\2\u04e9i\3\2\2\2\u04ea\u04eb"+
		"\7:\2\2\u04eb\u04ee\7\u00a6\2\2\u04ec\u04ed\7X\2\2\u04ed\u04ef\7B\2\2"+
		"\u04ee\u04ec\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f2"+
		"\5\u0128\u0095\2\u04f1\u04f3\7\u01af\2\2\u04f2\u04f1\3\2\2\2\u04f2\u04f3"+
		"\3\2\2\2\u04f3k\3\2\2\2\u04f4\u04f5\7:\2\2\u04f5\u04f8\7\u00bb\2\2\u04f6"+
		"\u04f7\7X\2\2\u04f7\u04f9\7B\2\2\u04f8\u04f6\3\2\2\2\u04f8\u04f9\3\2\2"+
		"\2\u04f9\u04fa\3\2\2\2\u04fa\u04ff\5\u012a\u0096\2\u04fb\u04fc\7\u01ae"+
		"\2\2\u04fc\u04fe\5\u012a\u0096\2\u04fd\u04fb\3\2\2\2\u04fe\u0501\3\2\2"+
		"\2\u04ff\u04fd\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0503\3\2\2\2\u0501\u04ff"+
		"\3\2\2\2\u0502\u0504\7\u01af\2\2\u0503\u0502\3\2\2\2\u0503\u0504\3\2\2"+
		"\2\u0504m\3\2\2\2\u0505\u0506\7&\2\2\u0506\u0507\7\u0180\2\2\u0507\u0508"+
		"\5\u012a\u0096\2\u0508\u0509\7N\2\2\u0509\u050a\5\u013e\u00a0\2\u050a"+
		"\u050b\5\u0140\u00a1\2\u050bo\3\2\2\2\u050c\u050d\7:\2\2\u050d\u0510\7"+
		"\u0180\2\2\u050e\u050f\7X\2\2\u050f\u0511\7B\2\2\u0510\u050e\3\2\2\2\u0510"+
		"\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\5\u012a\u0096\2\u0513q"+
		"\3\2\2\2\u0514\u0517\5t;\2\u0515\u0517\5v<\2\u0516\u0514\3\2\2\2\u0516"+
		"\u0515\3\2\2\2\u0517s\3\2\2\2\u0518\u0519\7v\2\2\u0519\u051a\7\u01ac\2"+
		"\2\u051a\u051b\5\u0146\u00a4\2\u051b\u051c\7\u01ae\2\2\u051c\u051d\7\u0197"+
		"\2\2\u051d\u051e\7\u01ad\2\2\u051eu\3\2\2\2\u051f\u0520\7u\2\2\u0520\u0521"+
		"\7\u01ac\2\2\u0521\u0522\7\u0197\2\2\u0522\u0523\7\u01ae\2\2\u0523\u0524"+
		"\7\u0197\2\2\u0524\u0525\7\u01ad\2\2\u0525\u0527\7\u01a7\2\2\u0526\u0528"+
		"\5\u0146\u00a4\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529\3"+
		"\2\2\2\u0529\u052b\7\u01a7\2\2\u052a\u052c\5\u0146\u00a4\2\u052b\u052a"+
		"\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052e\7\u01a7\2"+
		"\2\u052e\u052f\5\u0146\u00a4\2\u052fw\3\2\2\2\u0530\u0531\7\61\2\2\u0531"+
		"\u0533\7\u0194\2\2\u0532\u0534\7\t\2\2\u0533\u0532\3\2\2\2\u0533\u0534"+
		"\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0537\5\u0092J\2\u0536\u0538\7\u01af"+
		"\2\2\u0537\u0536\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0546\3\2\2\2\u0539"+
		"\u053a\7\61\2\2\u053a\u053f\5\u0090I\2\u053b\u053c\7\u01ae\2\2\u053c\u053e"+
		"\5\u0090I\2\u053d\u053b\3\2\2\2\u053e\u0541\3\2\2\2\u053f\u053d\3\2\2"+
		"\2\u053f\u0540\3\2\2\2\u0540\u0543\3\2\2\2\u0541\u053f\3\2\2\2\u0542\u0544"+
		"\7\u01af\2\2\u0543\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0546\3\2\2"+
		"\2\u0545\u0530\3\2\2\2\u0545\u0539\3\2\2\2\u0546y\3\2\2\2\u0547\u0549"+
		"\7\31\2\2\u0548\u054a\7\u010c\2\2\u0549\u0548\3\2\2\2\u0549\u054a\3\2"+
		"\2\2\u054a\u054b\3\2\2\2\u054b\u054d\5\u0134\u009b\2\u054c\u054e\7\u01af"+
		"\2\2\u054d\u054c\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0562\3\2\2\2\u054f"+
		"\u0551\7\60\2\2\u0550\u0552\7\u010c\2\2\u0551\u0550\3\2\2\2\u0551\u0552"+
		"\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0555\5\u0134\u009b\2\u0554\u0556\7"+
		"\u01af\2\2\u0555\u0554\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0562\3\2\2\2"+
		"\u0557\u0562\5\u00a2R\2\u0558\u0562\5\u00a6T\2\u0559\u055b\7t\2\2\u055a"+
		"\u055c\7\u010c\2\2\u055b\u055a\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055d"+
		"\3\2\2\2\u055d\u055f\5\u0134\u009b\2\u055e\u0560\7\u01af\2\2\u055f\u055e"+
		"\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0562\3\2\2\2\u0561\u0547\3\2\2\2\u0561"+
		"\u054f\3\2\2\2\u0561\u0557\3\2\2\2\u0561\u0558\3\2\2\2\u0561\u0559\3\2"+
		"\2\2\u0562{\3\2\2\2\u0563\u0566\7A\2\2\u0564\u0565\7\u0194\2\2\u0565\u0567"+
		"\7\u019b\2\2\u0566\u0564\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0568\3\2\2"+
		"\2\u0568\u0571\5\u012c\u0097\2\u0569\u056e\5~@\2\u056a\u056b\7\u01ae\2"+
		"\2\u056b\u056d\5~@\2\u056c\u056a\3\2\2\2\u056d\u0570\3\2\2\2\u056e\u056c"+
		"\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0572\3\2\2\2\u0570\u056e\3\2\2\2\u0571"+
		"\u0569\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574\3\2\2\2\u0573\u0575\7\u01af"+
		"\2\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u058d\3\2\2\2\u0576"+
		"\u0577\7A\2\2\u0577\u0578\7\u01ac\2\2\u0578\u057d\5\u0080A\2\u0579\u057a"+
		"\7\u01b4\2\2\u057a\u057c\5\u0080A\2\u057b\u0579\3\2\2\2\u057c\u057f\3"+
		"\2\2\2\u057d\u057b\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0580\3\2\2\2\u057f"+
		"\u057d\3\2\2\2\u0580\u0587\7\u01ad\2\2\u0581\u0583\7\t\2\2\u0582\u0581"+
		"\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0585\t\30\2\2"+
		"\u0585\u0586\7\u019b\2\2\u0586\u0588\7\u0197\2\2\u0587\u0582\3\2\2\2\u0587"+
		"\u0588\3\2\2\2\u0588\u058a\3\2\2\2\u0589\u058b\7\u01af\2\2\u058a\u0589"+
		"\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058d\3\2\2\2\u058c\u0563\3\2\2\2\u058c"+
		"\u0576\3\2\2\2\u058d}\3\2\2\2\u058e\u058f\7\u0194\2\2\u058f\u0591\7\u019b"+
		"\2\2\u0590\u058e\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u059b\3\2\2\2\u0592"+
		"\u0595\5\u00aaV\2\u0593\u0595\5\u0146\u00a4\2\u0594\u0592\3\2\2\2\u0594"+
		"\u0593\3\2\2\2\u0595\u0597\3\2\2\2\u0596\u0598\t\31\2\2\u0597\u0596\3"+
		"\2\2\2\u0597\u0598\3\2\2\2\u0598\u059c\3\2\2\2\u0599\u059c\7\62\2\2\u059a"+
		"\u059c\7n\2\2\u059b\u0594\3\2\2\2\u059b\u0599\3\2\2\2\u059b\u059a\3\2"+
		"\2\2\u059c\177\3\2\2\2\u059d\u059e\t\3\2\2\u059e\u0081\3\2\2\2\u059f\u05a1"+
		"\5\u008eH\2\u05a0\u05a2\7\u01af\2\2\u05a1\u05a0\3\2\2\2\u05a1\u05a2\3"+
		"\2\2\2\u05a2\u05d0\3\2\2\2\u05a3\u05af\7R\2\2\u05a4\u05a6\7\5\2\2\u05a5"+
		"\u05a7\7\u014d\2\2\u05a6\u05a5\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05b0"+
		"\3\2\2\2\u05a8\u05ad\5\u0084C\2\u05a9\u05aa\7\u01ac\2\2\u05aa\u05ab\5"+
		"\u0132\u009a\2\u05ab\u05ac\7\u01ad\2\2\u05ac\u05ae\3\2\2\2\u05ad\u05a9"+
		"\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05b0\3\2\2\2\u05af\u05a4\3\2\2\2\u05af"+
		"\u05a8\3\2\2\2\u05b0\u05b3\3\2\2\2\u05b1\u05b2\7s\2\2\u05b2\u05b4\5\u0128"+
		"\u0095\2\u05b3\u05b1\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5"+
		"\u05b6\7\u00aa\2\2\u05b6\u05ba\5\u0146\u00a4\2\u05b7\u05b8\7\u00c0\2\2"+
		"\u05b8\u05b9\7R\2\2\u05b9\u05bb\7y\2\2\u05ba\u05b7\3\2\2\2\u05ba\u05bb"+
		"\3\2\2\2\u05bb\u05be\3\2\2\2\u05bc\u05bd\7\t\2\2\u05bd\u05bf\5\u0146\u00a4"+
		"\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c1\3\2\2\2\u05c0\u05c2"+
		"\7\u01af\2\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05d0\3\2\2"+
		"\2\u05c3\u05ca\7\u0091\2\2\u05c4\u05c5\7\u01ac\2\2\u05c5\u05c6\7\u00c0"+
		"\2\2\u05c6\u05c7\7\u00e4\2\2\u05c7\u05c8\7\u019b\2\2\u05c8\u05c9\7\u0194"+
		"\2\2\u05c9\u05cb\7\u01ad\2\2\u05ca\u05c4\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb"+
		"\u05cd\3\2\2\2\u05cc\u05ce\7\u01af\2\2\u05cd\u05cc\3\2\2\2\u05cd\u05ce"+
		"\3\2\2\2\u05ce\u05d0\3\2\2\2\u05cf\u059f\3\2\2\2\u05cf\u05a3\3\2\2\2\u05cf"+
		"\u05c3\3\2\2\2\u05d0\u0083\3\2\2\2\u05d1\u05ec\7A\2\2\u05d2\u05d3\7\u00bb"+
		"\2\2\u05d3\u05ec\5\u0146\u00a4\2\u05d4\u05d5\7\u0174\2\2\u05d5\u05ec\5"+
		"\u0146\u00a4\2\u05d6\u05d8\7\u00e3\2\2\u05d7\u05d9\5\u0146\u00a4\2\u05d8"+
		"\u05d7\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05ec\3\2\2\2\u05da\u05db\7&"+
		"\2\2\u05db\u05ec\t\32\2\2\u05dc\u05ec\7\u0169\2\2\u05dd\u05ec\7\u0116"+
		"\2\2\u05de\u05ec\7\u009b\2\2\u05df\u05ec\7\u008c\2\2\u05e0\u05ec\7\\\2"+
		"\2\u05e1\u05e9\7\6\2\2\u05e2\u05e4\7\b\2\2\u05e3\u05e2\3\2\2\2\u05e3\u05e4"+
		"\3\2\2\2\u05e4\u05e7\3\2\2\2\u05e5\u05e8\5\u0146\u00a4\2\u05e6\u05e8\7"+
		".\2\2\u05e7\u05e5\3\2\2\2\u05e7\u05e6\3\2\2\2\u05e8\u05ea\3\2\2\2\u05e9"+
		"\u05e3\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05ec\3\2\2\2\u05eb\u05d1\3\2"+
		"\2\2\u05eb\u05d2\3\2\2\2\u05eb\u05d4\3\2\2\2\u05eb\u05d6\3\2\2\2\u05eb"+
		"\u05da\3\2\2\2\u05eb\u05dc\3\2\2\2\u05eb\u05dd\3\2\2\2\u05eb\u05de\3\2"+
		"\2\2\u05eb\u05df\3\2\2\2\u05eb\u05e0\3\2\2\2\u05eb\u05e1\3\2\2\2\u05ec"+
		"\u0085\3\2\2\2\u05ed\u05ee\7\u00a0\2\2\u05ee\u05f1\7\u0194\2\2\u05ef\u05f0"+
		"\7\u01a7\2\2\u05f0\u05f2\5\u0146\u00a4\2\u05f1\u05ef\3\2\2\2\u05f1\u05f2"+
		"\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\7\u019b\2\2\u05f4\u05f6\5\u00ac"+
		"W\2\u05f5\u05f7\7\u01af\2\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7"+
		"\u0615\3\2\2\2\u05f8\u05f9\7\u00a0\2\2\u05f9\u05fa\7\u0194\2\2\u05fa\u05fb"+
		"\5\u014c\u00a7\2\u05fb\u05fd\5\u00acW\2\u05fc\u05fe\7\u01af\2\2\u05fd"+
		"\u05fc\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u0615\3\2\2\2\u05ff\u0600\7\u00a0"+
		"\2\2\u0600\u0601\7\u0194\2\2\u0601\u0602\7\u019b\2\2\u0602\u0603\7-\2"+
		"\2\u0603\u060e\5\u00a4S\2\u0604\u060c\7I\2\2\u0605\u0606\7\u0089\2\2\u0606"+
		"\u060d\7\u0141\2\2\u0607\u060a\7\u00b5\2\2\u0608\u0609\7p\2\2\u0609\u060b"+
		"\5\u0132\u009a\2\u060a\u0608\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060d\3"+
		"\2\2\2\u060c\u0605\3\2\2\2\u060c\u0607\3\2\2\2\u060d\u060f\3\2\2\2\u060e"+
		"\u0604\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0611\3\2\2\2\u0610\u0612\7\u01af"+
		"\2\2\u0611\u0610\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0615\3\2\2\2\u0613"+
		"\u0615\5\u00a8U\2\u0614\u05ed\3\2\2\2\u0614\u05f8\3\2\2\2\u0614\u05ff"+
		"\3\2\2\2\u0614\u0613\3\2\2\2\u0615\u0087\3\2\2\2\u0616\u0617\7\r\2\2\u0617"+
		"\u0618\78\2\2\u0618\u061b\t\33\2\2\u0619\u061c\5\u0146\u00a4\2\u061a\u061c"+
		"\7\u0194\2\2\u061b\u0619\3\2\2\2\u061b\u061a\3\2\2\2\u061b\u061c\3\2\2"+
		"\2\u061c\u061e\3\2\2\2\u061d\u061f\7\u01af\2\2\u061e\u061d\3\2\2\2\u061e"+
		"\u061f\3\2\2\2\u061f\u0664\3\2\2\2\u0620\u0621\7\r\2\2\u0621\u062b\t\33"+
		"\2\2\u0622\u0625\5\u0146\u00a4\2\u0623\u0625\7\u0194\2\2\u0624\u0622\3"+
		"\2\2\2\u0624\u0623\3\2\2\2\u0625\u0629\3\2\2\2\u0626\u0627\7\u00c0\2\2"+
		"\u0627\u0628\7\u0125\2\2\u0628\u062a\7\u0197\2\2\u0629\u0626\3\2\2\2\u0629"+
		"\u062a\3\2\2\2\u062a\u062c\3\2\2\2\u062b\u0624\3\2\2\2\u062b\u062c\3\2"+
		"\2\2\u062c\u062e\3\2\2\2\u062d\u062f\7\u01af\2\2\u062e\u062d\3\2\2\2\u062e"+
		"\u062f\3\2\2\2\u062f\u0664\3\2\2\2\u0630\u0631\7\36\2\2\u0631\u063e\t"+
		"\33\2\2\u0632\u0635\5\u0146\u00a4\2\u0633\u0635\7\u0194\2\2\u0634\u0632"+
		"\3\2\2\2\u0634\u0633\3\2\2\2\u0635\u063c\3\2\2\2\u0636\u0637\7\u00c0\2"+
		"\2\u0637\u0638\7\u01ac\2\2\u0638\u0639\7\u00f3\2\2\u0639\u063a\7\u019b"+
		"\2\2\u063a\u063b\t\r\2\2\u063b\u063d\7\u01ad\2\2\u063c\u0636\3\2\2\2\u063c"+
		"\u063d\3\2\2\2\u063d\u063f\3\2\2\2\u063e\u0634\3\2\2\2\u063e\u063f\3\2"+
		"\2\2\u063f\u0641\3\2\2\2\u0640\u0642\7\u01af\2\2\u0641\u0640\3\2\2\2\u0641"+
		"\u0642\3\2\2\2\u0642\u0664\3\2\2\2\u0643\u0645\7\36\2\2\u0644\u0646\7"+
		"\u018b\2\2\u0645\u0644\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0648\3\2\2\2"+
		"\u0647\u0649\7\u01af\2\2\u0648\u0647\3\2\2\2\u0648\u0649\3\2\2\2\u0649"+
		"\u0664\3\2\2\2\u064a\u064b\7\u0094\2\2\u064b\u064e\t\33\2\2\u064c\u064f"+
		"\5\u0146\u00a4\2\u064d\u064f\7\u0194\2\2\u064e\u064c\3\2\2\2\u064e\u064d"+
		"\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0651\3\2\2\2\u0650\u0652\7\u01af\2"+
		"\2\u0651\u0650\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0664\3\2\2\2\u0653\u0655"+
		"\7\u0094\2\2\u0654\u0656\7\u018b\2\2\u0655\u0654\3\2\2\2\u0655\u0656\3"+
		"\2\2\2\u0656\u0658\3\2\2\2\u0657\u0659\7\u01af\2\2\u0658\u0657\3\2\2\2"+
		"\u0658\u0659\3\2\2\2\u0659\u0664\3\2\2\2\u065a\u065b\7\u0098\2\2\u065b"+
		"\u065e\t\33\2\2\u065c\u065f\5\u0146\u00a4\2\u065d\u065f\7\u0194\2\2\u065e"+
		"\u065c\3\2\2\2\u065e\u065d\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0661\3\2"+
		"\2\2\u0660\u0662\7\u01af\2\2\u0661\u0660\3\2\2\2\u0661\u0662\3\2\2\2\u0662"+
		"\u0664\3\2\2\2\u0663\u0616\3\2\2\2\u0663\u0620\3\2\2\2\u0663\u0630\3\2"+
		"\2\2\u0663\u0643\3\2\2\2\u0663\u064a\3\2\2\2\u0663\u0653\3\2\2\2\u0663"+
		"\u065a\3\2\2\2\u0664\u0089\3\2\2\2\u0665\u0667\7\u010d\2\2\u0666\u0668"+
		"\7\u0195\2\2\u0667\u0666\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u008b\3\2\2"+
		"\2\u0669\u066a\7\u00b7\2\2\u066a\u066c\5\u0146\u00a4\2\u066b\u066d\7\u01af"+
		"\2\2\u066c\u066b\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u008d\3\2\2\2\u066e"+
		"\u066f\7A\2\2\u066f\u0670\7\t\2\2\u0670\u0671\t\34\2\2\u0671\u008f\3\2"+
		"\2\2\u0672\u0674\7\u0194\2\2\u0673\u0675\7\t\2\2\u0674\u0673\3\2\2\2\u0674"+
		"\u0675\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0679\5\u013e\u00a0\2\u0677\u0678"+
		"\7\u019b\2\2\u0678\u067a\5\u00acW\2\u0679\u0677\3\2\2\2\u0679\u067a\3"+
		"\2\2\2\u067a\u0091\3\2\2\2\u067b\u067c\7\u00a6\2\2\u067c\u067d\7\u01ac"+
		"\2\2\u067d\u067e\5\u0094K\2\u067e\u067f\7\u01ad\2\2\u067f\u0093\3\2\2"+
		"\2\u0680\u0687\5\u0096L\2\u0681\u0683\7\u01ae\2\2\u0682\u0681\3\2\2\2"+
		"\u0682\u0683\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0686\5\u0096L\2\u0685"+
		"\u0682\3\2\2\2\u0686\u0689\3\2\2\2\u0687\u0685\3\2\2\2\u0687\u0688\3\2"+
		"\2\2\u0688\u0095\3\2\2\2\u0689\u0687\3\2\2\2\u068a\u068d\5\u0098M\2\u068b"+
		"\u068d\5\u009cO\2\u068c\u068a\3\2\2\2\u068c\u068b\3\2\2\2\u068d\u0097"+
		"\3\2\2\2\u068e\u0692\5\u0146\u00a4\2\u068f\u0693\5\u013e\u00a0\2\u0690"+
		"\u0691\7\t\2\2\u0691\u0693\5\u00acW\2\u0692\u068f\3\2\2\2\u0692\u0690"+
		"\3\2\2\2\u0693\u0696\3\2\2\2\u0694\u0695\7\34\2\2\u0695\u0697\5\u0146"+
		"\u00a4\2\u0696\u0694\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0699\3\2\2\2\u0698"+
		"\u069a\5\u013a\u009e\2\u0699\u0698\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u06b2"+
		"\3\2\2\2\u069b\u069c\7 \2\2\u069c\u069e\5\u0146\u00a4\2\u069d\u069b\3"+
		"\2\2\2\u069d\u069e\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a0\7\62\2\2\u06a0"+
		"\u06a3\5\u00aeX\2\u06a1\u06a2\7\u00c0\2\2\u06a2\u06a4\7\u00b9\2\2\u06a3"+
		"\u06a1\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06b3\3\2\2\2\u06a5\u06ab\7U"+
		"\2\2\u06a6\u06a7\7\u01ac\2\2\u06a7\u06a8\7\u0195\2\2\u06a8\u06a9\7\u01ae"+
		"\2\2\u06a9\u06aa\7\u0195\2\2\u06aa\u06ac\7\u01ad\2\2\u06ab\u06a6\3\2\2"+
		"\2\u06ab\u06ac\3\2\2\2\u06ac\u06b0\3\2\2\2\u06ad\u06ae\7m\2\2\u06ae\u06af"+
		"\7I\2\2\u06af\u06b1\7\u008d\2\2\u06b0\u06ad\3\2\2\2\u06b0\u06b1\3\2\2"+
		"\2\u06b1\u06b3\3\2\2\2\u06b2\u069d\3\2\2\2\u06b2\u06a5\3\2\2\2\u06b2\u06b3"+
		"\3\2\2\2\u06b3\u06b5\3\2\2\2\u06b4\u06b6\7\u0096\2\2\u06b5\u06b4\3\2\2"+
		"\2\u06b5\u06b6\3\2\2\2\u06b6\u06ba\3\2\2\2\u06b7\u06b9\5\u009aN\2\u06b8"+
		"\u06b7\3\2\2\2\u06b9\u06bc\3\2\2\2\u06ba\u06b8\3\2\2\2\u06ba\u06bb\3\2"+
		"\2\2\u06bb\u0099\3\2\2\2\u06bc\u06ba\3\2\2\2\u06bd\u06be\7 \2\2\u06be"+
		"\u06c0\5\u0146\u00a4\2\u06bf\u06bd\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c2"+
		"\3\2\2\2\u06c1\u06c3\5\u013a\u009e\2\u06c2\u06c1\3\2\2\2\u06c2\u06c3\3"+
		"\2\2\2\u06c3\u06d9\3\2\2\2\u06c4\u06c5\7\u0083\2\2\u06c5\u06c8\7a\2\2"+
		"\u06c6\u06c8\7\u00b3\2\2\u06c7\u06c4\3\2\2\2\u06c7\u06c6\3\2\2\2\u06c8"+
		"\u06ca\3\2\2\2\u06c9\u06cb\5\u0138\u009d\2\u06ca\u06c9\3\2\2\2\u06ca\u06cb"+
		"\3\2\2\2\u06cb\u06cd\3\2\2\2\u06cc\u06ce\5\u009eP\2\u06cd\u06cc\3\2\2"+
		"\2\u06cd\u06ce\3\2\2\2\u06ce\u06da\3\2\2\2\u06cf\u06d3\7\27\2\2\u06d0"+
		"\u06d1\7m\2\2\u06d1\u06d2\7I\2\2\u06d2\u06d4\7\u008d\2\2\u06d3\u06d0\3"+
		"\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d6\7\u01ac\2\2"+
		"\u06d6\u06d7\5\u00ba^\2\u06d7\u06d8\7\u01ad\2\2\u06d8\u06da\3\2\2\2\u06d9"+
		"\u06c7\3\2\2\2\u06d9\u06cf\3\2\2\2\u06da\u009b\3\2\2\2\u06db\u06dc\7 "+
		"\2\2\u06dc\u06de\5\u0146\u00a4\2\u06dd\u06db\3\2\2\2\u06dd\u06de\3\2\2"+
		"\2\u06de\u06fe\3\2\2\2\u06df\u06e0\7\u0083\2\2\u06e0\u06e3\7a\2\2\u06e1"+
		"\u06e3\7\u00b3\2\2\u06e2\u06df\3\2\2\2\u06e2\u06e1\3\2\2\2\u06e3\u06e5"+
		"\3\2\2\2\u06e4\u06e6\5\u0138\u009d\2\u06e5\u06e4\3\2\2\2\u06e5\u06e6\3"+
		"\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e8\7\u01ac\2\2\u06e8\u06ea\5\u0132"+
		"\u009a\2\u06e9\u06eb\t\7\2\2\u06ea\u06e9\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb"+
		"\u06ec\3\2\2\2\u06ec\u06ee\7\u01ad\2\2\u06ed\u06ef\5\u009eP\2\u06ee\u06ed"+
		"\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f2\3\2\2\2\u06f0\u06f1\7s\2\2\u06f1"+
		"\u06f3\5\u0146\u00a4\2\u06f2\u06f0\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06ff"+
		"\3\2\2\2\u06f4\u06f8\7\27\2\2\u06f5\u06f6\7m\2\2\u06f6\u06f7\7I\2\2\u06f7"+
		"\u06f9\7\u008d\2\2\u06f8\u06f5\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fa"+
		"\3\2\2\2\u06fa\u06fb\7\u01ac\2\2\u06fb\u06fc\5\u00ba^\2\u06fc\u06fd\7"+
		"\u01ad\2\2\u06fd\u06ff\3\2\2\2\u06fe\u06e2\3\2\2\2\u06fe\u06f4\3\2\2\2"+
		"\u06ff\u009d\3\2\2\2\u0700\u0701\7\u00c0\2\2\u0701\u0702\7\u01ac\2\2\u0702"+
		"\u0707\5\u00a0Q\2\u0703\u0704\7\u01ae\2\2\u0704\u0706\5\u00a0Q\2\u0705"+
		"\u0703\3\2\2\2\u0706\u0709\3\2\2\2\u0707\u0705\3\2\2\2\u0707\u0708\3\2"+
		"\2\2\u0708\u070a\3\2\2\2\u0709\u0707\3\2\2\2\u070a\u070b\7\u01ad\2\2\u070b"+
		"\u009f\3\2\2\2\u070c\u070d\5\u0148\u00a5\2\u070d\u0711\7\u019b\2\2\u070e"+
		"\u0712\5\u0148\u00a5\2\u070f\u0712\5\u0136\u009c\2\u0710\u0712\7\u0195"+
		"\2\2\u0711\u070e\3\2\2\2\u0711\u070f\3\2\2\2\u0711\u0710\3\2\2\2\u0712"+
		"\u00a1\3\2\2\2\u0713\u0714\7\61\2\2\u0714\u0734\5\u0134\u009b\2\u0715"+
		"\u071f\7-\2\2\u0716\u071d\5\u00a4S\2\u0717\u0718\7I\2\2\u0718\u071b\7"+
		"\u00b5\2\2\u0719\u071a\7p\2\2\u071a\u071c\5\u0132\u009a\2\u071b\u0719"+
		"\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071e\3\2\2\2\u071d\u0717\3\2\2\2\u071d"+
		"\u071e\3\2\2\2\u071e\u0720\3\2\2\2\u071f\u0716\3\2\2\2\u071f\u0720\3\2"+
		"\2\2\u0720\u0735\3\2\2\2\u0721\u0723\7\u0118\2\2\u0722\u0721\3\2\2\2\u0722"+
		"\u0723\3\2\2\2\u0723\u0725\3\2\2\2\u0724\u0726\7\u0164\2\2\u0725\u0724"+
		"\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0728\7-\2\2\u0728"+
		"\u0729\7I\2\2\u0729\u0732\5\32\16\2\u072a\u0730\7I\2\2\u072b\u072c\7\u0089"+
		"\2\2\u072c\u0731\7\u0141\2\2\u072d\u0731\7\u00b5\2\2\u072e\u072f\7p\2"+
		"\2\u072f\u0731\5\u0132\u009a\2\u0730\u072b\3\2\2\2\u0730\u072d\3\2\2\2"+
		"\u0730\u072e\3\2\2\2\u0731\u0733\3\2\2\2\u0732\u072a\3\2\2\2\u0732\u0733"+
		"\3\2\2\2\u0733\u0735\3\2\2\2\u0734\u0715\3\2\2\2\u0734\u0722\3\2\2\2\u0735"+
		"\u0737\3\2\2\2\u0736\u0738\7\u01af\2\2\u0737\u0736\3\2\2\2\u0737\u0738"+
		"\3\2\2\2\u0738\u00a3\3\2\2\2\u0739\u073b\t\17\2\2\u073a\u0739\3\2\2\2"+
		"\u073a\u073b\3\2\2\2\u073b\u073d\3\2\2\2\u073c\u073e\t\35\2\2\u073d\u073c"+
		"\3\2\2\2\u073d\u073e\3\2\2\2\u073e\u0740\3\2\2\2\u073f\u0741\t\36\2\2"+
		"\u0740\u073f\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0743\3\2\2\2\u0742\u0744"+
		"\t\37\2\2\u0743\u0742\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0746\3\2\2\2"+
		"\u0745\u0747\7\u0181\2\2\u0746\u0745\3\2\2\2\u0746\u0747\3\2\2\2\u0747"+
		"\u0748\3\2\2\2\u0748\u0749\7I\2\2\u0749\u074a\5\32\16\2\u074a\u00a5\3"+
		"\2\2\2\u074b\u0755\7E\2\2\u074c\u0753\7\u0135\2\2\u074d\u0753\7\u014c"+
		"\2\2\u074e\u0753\7\u0105\2\2\u074f\u0753\7\u011f\2\2\u0750\u0751\t \2"+
		"\2\u0751\u0753\5\u00acW\2\u0752\u074c\3\2\2\2\u0752\u074d\3\2\2\2\u0752"+
		"\u074e\3\2\2\2\u0752\u074f\3\2\2\2\u0752\u0750\3\2\2\2\u0752\u0753\3\2"+
		"\2\2\u0753\u0754\3\2\2\2\u0754\u0756\7N\2\2\u0755\u0752\3\2\2\2\u0755"+
		"\u0756\3\2\2\2\u0756\u0758\3\2\2\2\u0757\u0759\7\u010c\2\2\u0758\u0757"+
		"\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u075a\3\2\2\2\u075a\u0764\5\u0134\u009b"+
		"\2\u075b\u075c\7^\2\2\u075c\u0761\7\u0194\2\2\u075d\u075e\7\u01ae\2\2"+
		"\u075e\u0760\7\u0194\2\2\u075f\u075d\3\2\2\2\u0760\u0763\3\2\2\2\u0761"+
		"\u075f\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0765\3\2\2\2\u0763\u0761\3\2"+
		"\2\2\u0764\u075b\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0767\3\2\2\2\u0766"+
		"\u0768\7\u01af\2\2\u0767\u0766\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u00a7"+
		"\3\2\2\2\u0769\u076a\7\u00a0\2\2\u076a\u076e\5\u0146\u00a4\2\u076b\u076f"+
		"\5\u0146\u00a4\2\u076c\u076f\5\u00aaV\2\u076d\u076f\5\u0136\u009c\2\u076e"+
		"\u076b\3\2\2\2\u076e\u076c\3\2\2\2\u076e\u076d\3\2\2\2\u076f\u0771\3\2"+
		"\2\2\u0770\u0772\7\u01af\2\2\u0771\u0770\3\2\2\2\u0771\u0772\3\2\2\2\u0772"+
		"\u0795\3\2\2\2\u0773\u0774\7\u00a0\2\2\u0774\u0775\7\u00ad\2\2\u0775\u0776"+
		"\7\u011a\2\2\u0776\u077f\7\u0120\2\2\u0777\u0778\7\u0089\2\2\u0778\u0780"+
		"\7\u0183\2\2\u0779\u077a\7\u0089\2\2\u077a\u0780\7\u00df\2\2\u077b\u077c"+
		"\7\u015a\2\2\u077c\u0780\7\u0089\2\2\u077d\u0780\7\u016d\2\2\u077e\u0780"+
		"\7\u0168\2\2\u077f\u0777\3\2\2\2\u077f\u0779\3\2\2\2\u077f\u077b\3\2\2"+
		"\2\u077f\u077d\3\2\2\2\u077f\u077e\3\2\2\2\u0780\u0782\3\2\2\2\u0781\u0783"+
		"\7\u01af\2\2\u0782\u0781\3\2\2\2\u0782\u0783\3\2\2\2\u0783\u0795\3\2\2"+
		"\2\u0784\u0785\7\u00a0\2\2\u0785\u0786\7W\2\2\u0786\u0787\5\u0128\u0095"+
		"\2\u0787\u0789\5\u0136\u009c\2\u0788\u078a\7\u01af\2\2\u0789\u0788\3\2"+
		"\2\2\u0789\u078a\3\2\2\2\u078a\u0795\3\2\2\2\u078b\u078c\7\u00a0\2\2\u078c"+
		"\u078d\7\u00c7\2\2\u078d\u0795\5\u0136\u009c\2\u078e\u078f\7\u00a0\2\2"+
		"\u078f\u0790\7\u014e\2\2\u0790\u0795\5\u0136\u009c\2\u0791\u0792\7\u00a0"+
		"\2\2\u0792\u0793\7\u00c9\2\2\u0793\u0795\5\u0136\u009c\2\u0794\u0769\3"+
		"\2\2\2\u0794\u0773\3\2\2\2\u0794\u0784\3\2\2\2\u0794\u078b\3\2\2\2\u0794"+
		"\u078e\3\2\2\2\u0794\u0791\3\2\2\2\u0795\u00a9\3\2\2\2\u0796\u0799\5\u0142"+
		"\u00a2\2\u0797\u0799\7\u0194\2\2\u0798\u0796\3\2\2\2\u0798\u0797\3\2\2"+
		"\2\u0799\u00ab\3\2\2\2\u079a\u079b\bW\1\2\u079b\u07c8\7\62\2\2\u079c\u07c8"+
		"\7n\2\2\u079d\u07c8\7\u0194\2\2\u079e\u07c8\5\u0142\u00a2\2\u079f\u07c8"+
		"\5\u00f0y\2\u07a0\u07a1\7\24\2\2\u07a1\u07a3\5\u00acW\2\u07a2\u07a4\5"+
		"\u00f2z\2\u07a3\u07a2\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07a3\3\2\2\2"+
		"\u07a5\u07a6\3\2\2\2\u07a6\u07a9\3\2\2\2\u07a7\u07a8\7<\2\2\u07a8\u07aa"+
		"\5\u00acW\2\u07a9\u07a7\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ab\3\2\2"+
		"\2\u07ab\u07ac\7=\2\2\u07ac\u07c8\3\2\2\2\u07ad\u07af\7\24\2\2\u07ae\u07b0"+
		"\5\u00f4{\2\u07af\u07ae\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07af\3\2\2"+
		"\2\u07b1\u07b2\3\2\2\2\u07b2\u07b5\3\2\2\2\u07b3\u07b4\7<\2\2\u07b4\u07b6"+
		"\5\u00acW\2\u07b5\u07b3\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07b7\3\2\2"+
		"\2\u07b7\u07b8\7=\2\2\u07b8\u07c8\3\2\2\2\u07b9\u07c8\5\u0130\u0099\2"+
		"\u07ba\u07bb\7\u01ac\2\2\u07bb\u07bc\5\u00acW\2\u07bc\u07bd\7\u01ad\2"+
		"\2\u07bd\u07c8\3\2\2\2\u07be\u07bf\7\u01ac\2\2\u07bf\u07c0\5\u00b0Y\2"+
		"\u07c0\u07c1\7\u01ad\2\2\u07c1\u07c8\3\2\2\2\u07c2\u07c3\7\u01b6\2\2\u07c3"+
		"\u07c8\5\u00acW\b\u07c4\u07c5\t!\2\2\u07c5\u07c8\5\u00acW\6\u07c6\u07c8"+
		"\5\u0110\u0089\2\u07c7\u079a\3\2\2\2\u07c7\u079c\3\2\2\2\u07c7\u079d\3"+
		"\2\2\2\u07c7\u079e\3\2\2\2\u07c7\u079f\3\2\2\2\u07c7\u07a0\3\2\2\2\u07c7"+
		"\u07ad\3\2\2\2\u07c7\u07b9\3\2\2\2\u07c7\u07ba\3\2\2\2\u07c7\u07be\3\2"+
		"\2\2\u07c7\u07c2\3\2\2\2\u07c7\u07c4\3\2\2\2\u07c7\u07c6\3\2\2\2\u07c8"+
		"\u07d8\3\2\2\2\u07c9\u07ca\f\7\2\2\u07ca\u07cb\t\"\2\2\u07cb\u07d7\5\u00ac"+
		"W\b\u07cc\u07cd\f\5\2\2\u07cd\u07ce\t#\2\2\u07ce\u07d7\5\u00acW\6\u07cf"+
		"\u07d0\f\4\2\2\u07d0\u07d1\5\u014a\u00a6\2\u07d1\u07d2\5\u00acW\5\u07d2"+
		"\u07d7\3\2\2\2\u07d3\u07d4\f\16\2\2\u07d4\u07d5\7\34\2\2\u07d5\u07d7\5"+
		"\u0146\u00a4\2\u07d6\u07c9\3\2\2\2\u07d6\u07cc\3\2\2\2\u07d6\u07cf\3\2"+
		"\2\2\u07d6\u07d3\3\2\2\2\u07d7\u07da\3\2\2\2\u07d8\u07d6\3\2\2\2\u07d8"+
		"\u07d9\3\2\2\2\u07d9\u00ad\3\2\2\2\u07da\u07d8\3\2\2\2\u07db\u07e4\7n"+
		"\2\2\u07dc\u07e4\5\u0142\u00a2\2\u07dd\u07e4\5\u00f0y\2\u07de\u07e4\7"+
		"\u0194\2\2\u07df\u07e0\7\u01ac\2\2\u07e0\u07e1\5\u00aeX\2\u07e1\u07e2"+
		"\7\u01ad\2\2\u07e2\u07e4\3\2\2\2\u07e3\u07db\3\2\2\2\u07e3\u07dc\3\2\2"+
		"\2\u07e3\u07dd\3\2\2\2\u07e3\u07de\3\2\2\2\u07e3\u07df\3\2\2\2\u07e4\u00af"+
		"\3\2\2\2\u07e5\u07e6\5\32\16\2\u07e6\u00b1\3\2\2\2\u07e7\u07ea\7\u00c0"+
		"\2\2\u07e8\u07e9\7\u018d\2\2\u07e9\u07eb\7\u01ae\2\2\u07ea\u07e8\3\2\2"+
		"\2\u07ea\u07eb\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07f1\5\u00b4[\2\u07ed"+
		"\u07ee\7\u01ae\2\2\u07ee\u07f0\5\u00b4[\2\u07ef\u07ed\3\2\2\2\u07f0\u07f3"+
		"\3\2\2\2\u07f1\u07ef\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2\u00b3\3\2\2\2\u07f3"+
		"\u07f1\3\2\2\2\u07f4\u07f9\5\u0146\u00a4\2\u07f5\u07f6\7\u01ac\2\2\u07f6"+
		"\u07f7\5\u0132\u009a\2\u07f7\u07f8\7\u01ad\2\2\u07f8\u07fa\3\2\2\2\u07f9"+
		"\u07f5\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fc\7\t"+
		"\2\2\u07fc\u07fd\7\u01ac\2\2\u07fd\u07fe\5\32\16\2\u07fe\u07ff\7\u01ad"+
		"\2\2\u07ff\u00b5\3\2\2\2\u0800\u0803\5\u0130\u0099\2\u0801\u0803\7\u0194"+
		"\2\2\u0802\u0800\3\2\2\2\u0802\u0801\3\2\2\2\u0803\u0806\3\2\2\2\u0804"+
		"\u0807\7\u019b\2\2\u0805\u0807\5\u014c\u00a7\2\u0806\u0804\3\2\2\2\u0806"+
		"\u0805\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u0811\5\u00acW\2\u0809\u080a"+
		"\5\u0146\u00a4\2\u080a\u080b\7\u01a7\2\2\u080b\u080c\5\u0146\u00a4\2\u080c"+
		"\u080d\7\u01ac\2\2\u080d\u080e\5\u0108\u0085\2\u080e\u080f\7\u01ad\2\2"+
		"\u080f\u0811\3\2\2\2\u0810\u0802\3\2\2\2\u0810\u0809\3\2\2\2\u0811\u00b7"+
		"\3\2\2\2\u0812\u0817\5\u00ba^\2\u0813\u0814\7\u01ae\2\2\u0814\u0816\5"+
		"\u00ba^\2\u0815\u0813\3\2\2\2\u0816\u0819\3\2\2\2\u0817\u0815\3\2\2\2"+
		"\u0817\u0818\3\2\2\2\u0818\u00b9\3\2\2\2\u0819\u0817\3\2\2\2\u081a\u081f"+
		"\5\u00bc_\2\u081b\u081c\7z\2\2\u081c\u081e\5\u00bc_\2\u081d\u081b\3\2"+
		"\2\2\u081e\u0821\3\2\2\2\u081f\u081d\3\2\2\2\u081f\u0820\3\2\2\2\u0820"+
		"\u00bb\3\2\2\2\u0821\u081f\3\2\2\2\u0822\u0827\5\u00be`\2\u0823\u0824"+
		"\7\7\2\2\u0824\u0826\5\u00be`\2\u0825\u0823\3\2\2\2\u0826\u0829\3\2\2"+
		"\2\u0827\u0825\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u00bd\3\2\2\2\u0829\u0827"+
		"\3\2\2\2\u082a\u082c\7m\2\2\u082b\u082a\3\2\2\2\u082b\u082c\3\2\2\2\u082c"+
		"\u082d\3\2\2\2\u082d\u082e\5\u00c0a\2\u082e\u00bf\3\2\2\2\u082f\u0830"+
		"\7B\2\2\u0830\u0831\7\u01ac\2\2\u0831\u0832\5\u00b0Y\2\u0832\u0833\7\u01ad"+
		"\2\2\u0833\u0868\3\2\2\2\u0834\u0835\5\u00acW\2\u0835\u0836\5\u014a\u00a6"+
		"\2\u0836\u0837\5\u00acW\2\u0837\u0868\3\2\2\2\u0838\u0839\5\u00acW\2\u0839"+
		"\u083a\5\u014a\u00a6\2\u083a\u083b\t$\2\2\u083b\u083c\7\u01ac\2\2\u083c"+
		"\u083d\5\u00b0Y\2\u083d\u083e\7\u01ad\2\2\u083e\u0868\3\2\2\2\u083f\u0841"+
		"\5\u00acW\2\u0840\u0842\7m\2\2\u0841\u0840\3\2\2\2\u0841";
	private static final String _serializedATNSegment1 =
		"\u0842\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0844\7\16\2\2\u0844\u0845\5"+
		"\u00acW\2\u0845\u0846\7\7\2\2\u0846\u0847\5\u00acW\2\u0847\u0868\3\2\2"+
		"\2\u0848\u084a\5\u00acW\2\u0849\u084b\7m\2\2\u084a\u0849\3\2\2\2\u084a"+
		"\u084b\3\2\2\2\u084b\u084c\3\2\2\2\u084c\u084d\7Y\2\2\u084d\u0850\7\u01ac"+
		"\2\2\u084e\u0851\5\u00b0Y\2\u084f\u0851\5\u0108\u0085\2\u0850\u084e\3"+
		"\2\2\2\u0850\u084f\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0853\7\u01ad\2\2"+
		"\u0853\u0868\3\2\2\2\u0854\u0856\5\u00acW\2\u0855\u0857\7m\2\2\u0856\u0855"+
		"\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u0858\3\2\2\2\u0858\u0859\7d\2\2\u0859"+
		"\u085c\5\u00acW\2\u085a\u085b\7?\2\2\u085b\u085d\5\u00acW\2\u085c\u085a"+
		"\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u0868\3\2\2\2\u085e\u085f\5\u00acW"+
		"\2\u085f\u0860\7_\2\2\u0860\u0861\5\u013a\u009e\2\u0861\u0868\3\2\2\2"+
		"\u0862\u0863\7\u01ac\2\2\u0863\u0864\5\u00ba^\2\u0864\u0865\7\u01ad\2"+
		"\2\u0865\u0868\3\2\2\2\u0866\u0868\7\u0195\2\2\u0867\u082f\3\2\2\2\u0867"+
		"\u0834\3\2\2\2\u0867\u0838\3\2\2\2\u0867\u083f\3\2\2\2\u0867\u0848\3\2"+
		"\2\2\u0867\u0854\3\2\2\2\u0867\u085e\3\2\2\2\u0867\u0862\3\2\2\2\u0867"+
		"\u0866\3\2\2\2\u0868\u00c1\3\2\2\2\u0869\u086f\5\u00c6d\2\u086a\u086b"+
		"\7\u01ac\2\2\u086b\u086c\5\u00c2b\2\u086c\u086d\7\u01ad\2\2\u086d\u086f"+
		"\3\2\2\2\u086e\u0869\3\2\2\2\u086e\u086a\3\2\2\2\u086f\u0873\3\2\2\2\u0870"+
		"\u0872\5\u00c4c\2\u0871\u0870\3\2\2\2\u0872\u0875\3\2\2\2\u0873\u0871"+
		"\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u00c3\3\2\2\2\u0875\u0873\3\2\2\2\u0876"+
		"\u0878\7\u00b2\2\2\u0877\u0879\7\5\2\2\u0878\u0877\3\2\2\2\u0878\u0879"+
		"\3\2\2\2\u0879\u087d\3\2\2\2\u087a\u087d\7@\2\2\u087b\u087d\7]\2\2\u087c"+
		"\u0876\3\2\2\2\u087c\u087a\3\2\2\2\u087c\u087b\3\2\2\2\u087d\u0887\3\2"+
		"\2\2\u087e\u0888\5\u00c6d\2\u087f\u0880\7\u01ac\2\2\u0880\u0881\5\u00c2"+
		"b\2\u0881\u0882\7\u01ad\2\2\u0882\u0884\3\2\2\2\u0883\u087f\3\2\2\2\u0884"+
		"\u0885\3\2\2\2\u0885\u0883\3\2\2\2\u0885\u0886\3\2\2\2\u0886\u0888\3\2"+
		"\2\2\u0887\u087e\3\2\2\2\u0887\u0883\3\2\2\2\u0888\u00c5\3\2\2\2\u0889"+
		"\u088b\7\u009b\2\2\u088a\u088c\t%\2\2\u088b\u088a\3\2\2\2\u088b\u088c"+
		"\3\2\2\2\u088c\u0896\3\2\2\2\u088d\u088e\7\u00ab\2\2\u088e\u0890\5\u00ac"+
		"W\2\u088f\u0891\7\177\2\2\u0890\u088f\3\2\2\2\u0890\u0891\3\2\2\2\u0891"+
		"\u0894\3\2\2\2\u0892\u0893\7\u00c0\2\2\u0893\u0895\7\u0179\2\2\u0894\u0892"+
		"\3\2\2\2\u0894\u0895\3\2\2\2\u0895\u0897\3\2\2\2\u0896\u088d\3\2\2\2\u0896"+
		"\u0897\3\2\2\2\u0897\u0898\3\2\2\2\u0898\u089b\5\u00d8m\2\u0899\u089a"+
		"\7^\2\2\u089a\u089c\5\u0128\u0095\2\u089b\u0899\3\2\2\2\u089b\u089c\3"+
		"\2\2\2\u089c\u089f\3\2\2\2\u089d\u089e\7N\2\2\u089e\u08a0\5\u00dco\2\u089f"+
		"\u089d\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u08a3\3\2\2\2\u08a1\u08a2\7\u00be"+
		"\2\2\u08a2\u08a4\5\u00ba^\2\u08a3\u08a1\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4"+
		"\u08af\3\2\2\2\u08a5\u08a6\7S\2\2\u08a6\u08a7\7\22\2\2\u08a7\u08ac\5\u00d0"+
		"i\2\u08a8\u08a9\7\u01ae\2\2\u08a9\u08ab\5\u00d0i\2\u08aa\u08a8\3\2\2\2"+
		"\u08ab\u08ae\3\2\2\2\u08ac\u08aa\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08b0"+
		"\3\2\2\2\u08ae\u08ac\3\2\2\2\u08af\u08a5\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0"+
		"\u08b3\3\2\2\2\u08b1\u08b2\7T\2\2\u08b2\u08b4\5\u00ba^\2\u08b3\u08b1\3"+
		"\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u00c7\3\2\2\2\u08b5\u08b6\7{\2\2\u08b6"+
		"\u08b7\7\22\2\2\u08b7\u08bc\5\u00ceh\2\u08b8\u08b9\7\u01ae\2\2\u08b9\u08bb"+
		"\5\u00ceh\2\u08ba\u08b8\3\2\2\2\u08bb\u08be\3\2\2\2\u08bc\u08ba\3\2\2"+
		"\2\u08bc\u08bd\3\2\2\2\u08bd\u08ca\3\2\2\2\u08be\u08bc\3\2\2\2\u08bf\u08c0"+
		"\7\u013f\2\2\u08c0\u08c1\5\u00acW\2\u08c1\u08c8\t&\2\2\u08c2\u08c3\7E"+
		"\2\2\u08c3\u08c4\t\'\2\2\u08c4\u08c5\5\u00acW\2\u08c5\u08c6\t&\2\2\u08c6"+
		"\u08c7\7\u0141\2\2\u08c7\u08c9\3\2\2\2\u08c8\u08c2\3\2\2\2\u08c8\u08c9"+
		"\3\2\2\2\u08c9\u08cb\3\2\2\2\u08ca\u08bf\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb"+
		"\u00c9\3\2\2\2\u08cc\u08cd\7I\2\2\u08cd\u08e0\7\20\2\2\u08ce\u08cf\7I"+
		"\2\2\u08cf\u08d0\7\u018c\2\2\u08d0\u08d2\7\u00cd\2\2\u08d1\u08d3\5\u00cc"+
		"g\2\u08d2\u08d1\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u08e0\3\2\2\2\u08d4"+
		"\u08d5\7I\2\2\u08d5\u08d6\7\u018c\2\2\u08d6\u08da\7\u014a\2\2\u08d7\u08d8"+
		"\7\u01ac\2\2\u08d8\u08d9\7\u0197\2\2\u08d9\u08db\7\u01ad\2\2\u08da\u08d7"+
		"\3\2\2\2\u08da\u08db\3\2\2\2\u08db\u08dd\3\2\2\2\u08dc\u08de\5\u00ccg"+
		"\2\u08dd\u08dc\3\2\2\2\u08dd\u08de\3\2\2\2\u08de\u08e0\3\2\2\2\u08df\u08cc"+
		"\3\2\2\2\u08df\u08ce\3\2\2\2\u08df\u08d4\3\2\2\2\u08e0\u00cb\3\2\2\2\u08e1"+
		"\u08e6\7\u01ae\2\2\u08e2\u08e3\7\u0198\2\2\u08e3\u08e7\7\u00d5\2\2\u08e4"+
		"\u08e7\7\u0180\2\2\u08e5\u08e7\7\u015d\2\2\u08e6\u08e2\3\2\2\2\u08e6\u08e4"+
		"\3\2\2\2\u08e6\u08e5\3\2\2\2\u08e7\u00cd\3\2\2\2\u08e8\u08ea\5\u00acW"+
		"\2\u08e9\u08eb\t\7\2\2\u08ea\u08e9\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u00cf"+
		"\3\2\2\2\u08ec\u08ed\5\u00acW\2\u08ed\u00d1\3\2\2\2\u08ee\u08ef\7y\2\2"+
		"\u08ef\u08f0\7\u01ac\2\2\u08f0\u08f5\5\u00d4k\2\u08f1\u08f2\7\u01ae\2"+
		"\2\u08f2\u08f4\5\u00d4k\2\u08f3\u08f1\3\2\2\2\u08f4\u08f7\3\2\2\2\u08f5"+
		"\u08f3\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6\u08f8\3\2\2\2\u08f7\u08f5\3\2"+
		"\2\2\u08f8\u08f9\7\u01ad\2\2\u08f9\u00d3\3\2\2\2\u08fa\u08fb\7\u0100\2"+
		"\2\u08fb\u0928\7\u0195\2\2\u08fc\u08fd\t(\2\2\u08fd\u0928\7S\2\2\u08fe"+
		"\u08ff\t)\2\2\u08ff\u0928\7\u00b2\2\2\u0900\u0901\t*\2\2\u0901\u0928\7"+
		"`\2\2\u0902\u0903\7\u00ff\2\2\u0903\u0928\7\u0189\2\2\u0904\u0905\7\u0107"+
		"\2\2\u0905\u0928\7{\2\2\u0906\u0928\7\u0114\2\2\u0907\u0908\7\u011c\2"+
		"\2\u0908\u0928\7\u0081\2\2\u0909\u090a\7\u011d\2\2\u090a\u0928\7\u0081"+
		"\2\2\u090b\u090c\7\u0127\2\2\u090c\u0928\7\u0195\2\2\u090d\u090e\7\u0128"+
		"\2\2\u090e\u0928\7\u0195\2\2\u090f\u0910\7\u0143\2\2\u0910\u0911\7I\2"+
		"\2\u0911\u0912\7\u01ac\2\2\u0912\u0917\5\u00d6l\2\u0913\u0914\7\u01ae"+
		"\2\2\u0914\u0916\5\u00d6l\2\u0915\u0913\3\2\2\2\u0916\u0919\3\2\2\2\u0917"+
		"\u0915\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u091a\3\2\2\2\u0919\u0917\3\2"+
		"\2\2\u091a\u091b\7\u01ad\2\2\u091b\u0928\3\2\2\2\u091c\u091d\7\u0143\2"+
		"\2\u091d\u091e\7I\2\2\u091e\u0928\7\u0184\2\2\u091f\u0920\7\u0148\2\2"+
		"\u0920\u0928\t\24\2\2\u0921\u0928\7\u0155\2\2\u0922\u0923\7\u015c\2\2"+
		"\u0923\u0928\7\u0081\2\2\u0924\u0925\7\u00b7\2\2\u0925\u0926\7\u0081\2"+
		"\2\u0926\u0928\7\u0197\2\2\u0927\u08fa\3\2\2\2\u0927\u08fc\3\2\2\2\u0927"+
		"\u08fe\3\2\2\2\u0927\u0900\3\2\2\2\u0927\u0902\3\2\2\2\u0927\u0904\3\2"+
		"\2\2\u0927\u0906\3\2\2\2\u0927\u0907\3\2\2\2\u0927\u0909\3\2\2\2\u0927"+
		"\u090b\3\2\2\2\u0927\u090d\3\2\2\2\u0927\u090f\3\2\2\2\u0927\u091c\3\2"+
		"\2\2\u0927\u091f\3\2\2\2\u0927\u0921\3\2\2\2\u0927\u0922\3\2\2\2\u0927"+
		"\u0924\3\2\2\2\u0928\u00d5\3\2\2\2\u0929\u092d\7\u0194\2\2\u092a\u092e"+
		"\7\u0184\2\2\u092b\u092c\7\u019b\2\2\u092c\u092e\5\u0142\u00a2\2\u092d"+
		"\u092a\3\2\2\2\u092d\u092b\3\2\2\2\u092e\u00d7\3\2\2\2\u092f\u0934\5\u00da"+
		"n\2\u0930\u0931\7\u01ae\2\2\u0931\u0933\5\u00dan\2\u0932\u0930\3\2\2\2"+
		"\u0933\u0936\3\2\2\2\u0934\u0932\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u00d9"+
		"\3\2\2\2\u0936\u0934\3\2\2\2\u0937\u0938\5\u0128\u0095\2\u0938\u0939\7"+
		"\u01a7\2\2\u0939\u093b\3\2\2\2\u093a\u0937\3\2\2\2\u093a\u093b\3\2\2\2"+
		"\u093b\u093f\3\2\2\2\u093c\u0940\7\u01b1\2\2\u093d\u093e\7\u01ab\2\2\u093e"+
		"\u0940\t+\2\2\u093f\u093c\3\2\2\2\u093f\u093d\3\2\2\2\u0940\u094d\3\2"+
		"\2\2\u0941\u0942\5\u0104\u0083\2\u0942\u0943\7\u019b\2\2\u0943\u0944\5"+
		"\u00acW\2\u0944\u094d\3\2\2\2\u0945\u094a\5\u00acW\2\u0946\u0948\7\t\2"+
		"\2\u0947\u0946\3\2\2\2\u0947\u0948\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u094b"+
		"\5\u0104\u0083\2\u094a\u0947\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u094d\3"+
		"\2\2\2\u094c\u093a\3\2\2\2\u094c\u0941\3\2\2\2\u094c\u0945\3\2\2\2\u094d"+
		"\u00db\3\2\2\2\u094e\u0953\5\u00dep\2\u094f\u0950\7\u01ae\2\2\u0950\u0952"+
		"\5\u00dep\2\u0951\u094f\3\2\2\2\u0952\u0955\3\2\2\2\u0953\u0951\3\2\2"+
		"\2\u0953\u0954\3\2\2\2\u0954\u00dd\3\2\2\2\u0955\u0953\3\2\2\2\u0956\u095c"+
		"\5\u00e0q\2\u0957\u0958\7\u01ac\2\2\u0958\u0959\5\u00e0q\2\u0959\u095a"+
		"\7\u01ad\2\2\u095a\u095c\3\2\2\2\u095b\u0956\3\2\2\2\u095b\u0957\3\2\2"+
		"\2\u095c\u00df\3\2\2\2\u095d\u0961\5\u00e2r\2\u095e\u0960\5\u00e6t\2\u095f"+
		"\u095e\3\2\2\2\u0960\u0963\3\2\2\2\u0961\u095f\3\2\2\2\u0961\u0962\3\2"+
		"\2\2\u0962\u00e1\3\2\2\2\u0963\u0961\3\2\2\2\u0964\u0966\5\u00e8u\2\u0965"+
		"\u0967\5\u00f6|\2\u0966\u0965\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u0988"+
		"\3\2\2\2\u0968\u096a\5\u00eav\2\u0969\u096b\5\u00f6|\2\u096a\u0969\3\2"+
		"\2\2\u096a\u096b\3\2\2\2\u096b\u0988\3\2\2\2\u096c\u0971\5\u00eex\2\u096d"+
		"\u096f\5\u00f6|\2\u096e\u0970\5\u0102\u0082\2\u096f\u096e\3\2\2\2\u096f"+
		"\u0970\3\2\2\2\u0970\u0972\3\2\2\2\u0971\u096d\3\2\2\2\u0971\u0972\3\2"+
		"\2\2\u0972\u0988\3\2\2\2\u0973\u0974\5\u00e4s\2\u0974\u0975\5\u00f6|\2"+
		"\u0975\u0988\3\2\2\2\u0976\u0978\5\u00f0y\2\u0977\u0979\5\u00f6|\2\u0978"+
		"\u0977\3\2\2\2\u0978\u0979\3\2\2\2\u0979\u0988\3\2\2\2\u097a\u097c\7\u0194"+
		"\2\2\u097b\u097d\5\u00f6|\2\u097c\u097b\3\2\2\2\u097c\u097d\3\2\2\2\u097d"+
		"\u0988\3\2\2\2\u097e\u097f\7\u0194\2\2\u097f\u0980\7\u01a7\2\2\u0980\u0985"+
		"\5\u00f0y\2\u0981\u0983\5\u00f6|\2\u0982\u0984\5\u0102\u0082\2\u0983\u0982"+
		"\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0986\3\2\2\2\u0985\u0981\3\2\2\2\u0985"+
		"\u0986\3\2\2\2\u0986\u0988\3\2\2\2\u0987\u0964\3\2\2\2\u0987\u0968\3\2"+
		"\2\2\u0987\u096c\3\2\2\2\u0987\u0973\3\2\2\2\u0987\u0976\3\2\2\2\u0987"+
		"\u097a\3\2\2\2\u0987\u097e\3\2\2\2\u0988\u00e3\3\2\2\2\u0989\u098a\7\25"+
		"\2\2\u098a\u098b\7\u01ac\2\2\u098b\u098c\7\26\2\2\u098c\u098d\5\u0128"+
		"\u0095\2\u098d\u098e\7\u01ae\2\2\u098e\u098f\t,\2\2\u098f\u0990\7\u01ad"+
		"\2\2\u0990\u00e5\3\2\2\2\u0991\u0993\7[\2\2\u0992\u0991\3\2\2\2\u0992"+
		"\u0993\3\2\2\2\u0993\u0999\3\2\2\2\u0994\u0996\t-\2\2\u0995\u0997\7|\2"+
		"\2\u0996\u0995\3\2\2\2\u0996\u0997\3\2\2\2\u0997\u0999\3\2\2\2\u0998\u0992"+
		"\3\2\2\2\u0998\u0994\3\2\2\2\u0999\u099b\3\2\2\2\u099a\u099c\t.\2\2\u099b"+
		"\u099a\3\2\2\2\u099b\u099c\3\2\2\2\u099c\u099d\3\2\2\2\u099d\u099e\7`"+
		"\2\2\u099e\u099f\5\u00dep\2\u099f\u09a0\7s\2\2\u09a0\u09a1\5\u00ba^\2"+
		"\u09a1\u09ac\3\2\2\2\u09a2\u09a3\7\'\2\2\u09a3\u09a4\7`\2\2\u09a4\u09ac"+
		"\5\u00dep\2\u09a5\u09a6\7\'\2\2\u09a6\u09a7\7\u00cb\2\2\u09a7\u09ac\5"+
		"\u00dep\2\u09a8\u09a9\7|\2\2\u09a9\u09aa\7\u00cb\2\2\u09aa\u09ac\5\u00de"+
		"p\2\u09ab\u0998\3\2\2\2\u09ab\u09a2\3\2\2\2\u09ab\u09a5\3\2\2\2\u09ab"+
		"\u09a8\3\2\2\2\u09ac\u00e7\3\2\2\2\u09ad\u09af\5\u0128\u0095\2\u09ae\u09b0"+
		"\5\u00fa~\2\u09af\u09ae\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0\u00e9\3\2\2"+
		"\2\u09b1\u09b2\7w\2\2\u09b2\u09b3\7\u01ac\2\2\u09b3\u09b4\7\u0197\2\2"+
		"\u09b4\u09b5\7\u01ae\2\2\u09b5\u09b6\7\u0197\2\2\u09b6\u09b7\7\u01ae\2"+
		"\2\u09b7\u09b8\7\u0197\2\2\u09b8\u09cc\7\u01ad\2\2\u09b9\u09ba\7w\2\2"+
		"\u09ba\u09bb\7\u01ac\2\2\u09bb\u09bc\7\21\2\2\u09bc\u09bd\7\u0197\2\2"+
		"\u09bd\u09c7\7\u01ae\2\2\u09be\u09c3\5\u00ecw\2\u09bf\u09c0\7\u01ae\2"+
		"\2\u09c0\u09c2\5\u00ecw\2\u09c1\u09bf\3\2\2\2\u09c2\u09c5\3\2\2\2\u09c3"+
		"\u09c1\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c8\3\2\2\2\u09c5\u09c3\3\2"+
		"\2\2\u09c6\u09c8\5\u0146\u00a4\2\u09c7\u09be\3\2\2\2\u09c7\u09c6\3\2\2"+
		"\2\u09c8\u09c9\3\2\2\2\u09c9\u09ca\7\u01ad\2\2\u09ca\u09cc\3\2\2\2\u09cb"+
		"\u09b1\3\2\2\2\u09cb\u09b9\3\2\2\2\u09cc\u00eb\3\2\2\2\u09cd\u09ce\5\u0146"+
		"\u00a4\2\u09ce\u09cf\7\u019b\2\2\u09cf\u09d0\t/\2\2\u09d0\u00ed\3\2\2"+
		"\2\u09d1\u09d7\5\u00b0Y\2\u09d2\u09d3\7\u01ac\2\2\u09d3\u09d4\5\u00b0"+
		"Y\2\u09d4\u09d5\7\u01ad\2\2\u09d5\u09d7\3\2\2\2\u09d6\u09d1\3\2\2\2\u09d6"+
		"\u09d2\3\2\2\2\u09d7\u00ef\3\2\2\2\u09d8\u0a3a\5\u010a\u0086\2\u09d9\u0a3a"+
		"\5\u010c\u0087\2\u09da\u09db\5\u013c\u009f\2\u09db\u09dd\7\u01ac\2\2\u09dc"+
		"\u09de\5\u0108\u0085\2\u09dd\u09dc\3\2\2\2\u09dd\u09de\3\2\2\2\u09de\u09df"+
		"\3\2\2\2\u09df\u09e0\7\u01ad\2\2\u09e0\u0a3a\3\2\2\2\u09e1\u09e2\7\u00d6"+
		"\2\2\u09e2\u09e3\7\u01ac\2\2\u09e3\u09e4\7\u01b1\2\2\u09e4\u0a3a\7\u01ad"+
		"\2\2\u09e5\u09e6\7\u00d9\2\2\u09e6\u09e7\7\u01ac\2\2\u09e7\u09e8\5\u00ac"+
		"W\2\u09e8\u09e9\7\t\2\2\u09e9\u09ea\5\u013e\u00a0\2\u09ea\u09eb\7\u01ad"+
		"\2\2\u09eb\u0a3a\3\2\2\2\u09ec\u09ed\7%\2\2\u09ed\u09ee\7\u01ac\2\2\u09ee"+
		"\u09ef\5\u013e\u00a0\2\u09ef\u09f0\7\u01ae\2\2\u09f0\u09f3\5\u00acW\2"+
		"\u09f1\u09f2\7\u01ae\2\2\u09f2\u09f4\5\u00acW\2\u09f3\u09f1\3\2\2\2\u09f3"+
		"\u09f4\3\2\2\2\u09f4\u09f5\3\2\2\2\u09f5\u09f6\7\u01ad\2\2\u09f6\u0a3a"+
		"\3\2\2\2\u09f7\u09f8\7\u00dd\2\2\u09f8\u09f9\7\u01ac\2\2\u09f9\u09fa\7"+
		"\u01b1\2\2\u09fa\u0a3a\7\u01ad\2\2\u09fb\u09fc\7\33\2\2\u09fc\u09fd\7"+
		"\u01ac\2\2\u09fd\u09fe\5\u0108\u0085\2\u09fe\u09ff\7\u01ad\2\2\u09ff\u0a3a"+
		"\3\2\2\2\u0a00\u0a3a\7+\2\2\u0a01\u0a3a\7,\2\2\u0a02\u0a03\7\u00e9\2\2"+
		"\u0a03\u0a04\7\u01ac\2\2\u0a04\u0a05\7\u0196\2\2\u0a05\u0a06\7\u01ae\2"+
		"\2\u0a06\u0a07\5\u00acW\2\u0a07\u0a08\7\u01ae\2\2\u0a08\u0a09\5\u00ac"+
		"W\2\u0a09\u0a0a\7\u01ad\2\2\u0a0a\u0a3a\3\2\2\2\u0a0b\u0a0c\7\u00ea\2"+
		"\2\u0a0c\u0a0d\7\u01ac\2\2\u0a0d\u0a0e\7\u0196\2\2\u0a0e\u0a0f\7\u01ae"+
		"\2\2\u0a0f\u0a10\5\u00acW\2\u0a10\u0a11\7\u01ae\2\2\u0a11\u0a12\5\u00ac"+
		"W\2\u0a12\u0a13\7\u01ad\2\2\u0a13\u0a3a\3\2\2\2\u0a14\u0a15\7\u00eb\2"+
		"\2\u0a15\u0a16\7\u01ac\2\2\u0a16\u0a17\7\u0196\2\2\u0a17\u0a18\7\u01ae"+
		"\2\2\u0a18\u0a19\5\u00acW\2\u0a19\u0a1a\7\u01ad\2\2\u0a1a\u0a3a\3\2\2"+
		"\2\u0a1b\u0a1c\7\u00ec\2\2\u0a1c\u0a1d\7\u01ac\2\2\u0a1d\u0a1e\7\u0196"+
		"\2\2\u0a1e\u0a1f\7\u01ae\2\2\u0a1f\u0a20\5\u00acW\2\u0a20\u0a21\7\u01ad"+
		"\2\2\u0a21\u0a3a\3\2\2\2\u0a22\u0a23\7U\2\2\u0a23\u0a24\7\u01ac\2\2\u0a24"+
		"\u0a27\5\u013e\u00a0\2\u0a25\u0a26\7\u01ae\2\2\u0a26\u0a28\7\u0195\2\2"+
		"\u0a27\u0a25\3\2\2\2\u0a27\u0a28\3\2\2\2\u0a28\u0a2b\3\2\2\2\u0a29\u0a2a"+
		"\7\u01ae\2\2\u0a2a\u0a2c\7\u0195\2\2\u0a2b\u0a29\3\2\2\2\u0a2b\u0a2c\3"+
		"\2\2\2\u0a2c\u0a2d\3\2\2\2\u0a2d\u0a2e\7\u01ad\2\2\u0a2e\u0a3a\3\2\2\2"+
		"\u0a2f\u0a3a\7\u012e\2\2\u0a30\u0a31\7o\2\2\u0a31\u0a32\7\u01ac\2\2\u0a32"+
		"\u0a33\5\u00acW\2\u0a33\u0a34\7\u01ae\2\2\u0a34\u0a35\5\u00acW\2\u0a35"+
		"\u0a36\7\u01ad\2\2\u0a36\u0a3a\3\2\2\2\u0a37\u0a3a\7\u009f\2\2\u0a38\u0a3a"+
		"\7\u00a5\2\2\u0a39\u09d8\3\2\2\2\u0a39\u09d9\3\2\2\2\u0a39\u09da\3\2\2"+
		"\2\u0a39\u09e1\3\2\2\2\u0a39\u09e5\3\2\2\2\u0a39\u09ec\3\2\2\2\u0a39\u09f7"+
		"\3\2\2\2\u0a39\u09fb\3\2\2\2\u0a39\u0a00\3\2\2\2\u0a39\u0a01\3\2\2\2\u0a39"+
		"\u0a02\3\2\2\2\u0a39\u0a0b\3\2\2\2\u0a39\u0a14\3\2\2\2\u0a39\u0a1b\3\2"+
		"\2\2\u0a39\u0a22\3\2\2\2\u0a39\u0a2f\3\2\2\2\u0a39\u0a30\3\2\2\2\u0a39"+
		"\u0a37\3\2\2\2\u0a39\u0a38\3\2\2\2\u0a3a\u00f1\3\2\2\2\u0a3b\u0a3c\7\u00bd"+
		"\2\2\u0a3c\u0a3d\5\u00acW\2\u0a3d\u0a3e\7\u00a9\2\2\u0a3e\u0a3f\5\u00ac"+
		"W\2\u0a3f\u00f3\3\2\2\2\u0a40\u0a41\7\u00bd\2\2\u0a41\u0a42\5\u00ba^\2"+
		"\u0a42\u0a43\7\u00a9\2\2\u0a43\u0a44\5\u00acW\2\u0a44\u00f5\3\2\2\2\u0a45"+
		"\u0a47\7\t\2\2\u0a46\u0a45\3\2\2\2\u0a46\u0a47\3\2\2\2\u0a47\u0a48\3\2"+
		"\2\2\u0a48\u0a49\5\u00f8}\2\u0a49\u00f7\3\2\2\2\u0a4a\u0a4c\5\u0146\u00a4"+
		"\2\u0a4b\u0a4d\5\u00fa~\2\u0a4c\u0a4b\3\2\2\2\u0a4c\u0a4d\3\2\2\2\u0a4d"+
		"\u00f9\3\2\2\2\u0a4e\u0a50\7\u00c0\2\2\u0a4f\u0a4e\3\2\2\2\u0a4f\u0a50"+
		"\3\2\2\2\u0a50\u0a51\3\2\2\2\u0a51\u0a52\7\u01ac\2\2\u0a52\u0a57\5\u00fe"+
		"\u0080\2\u0a53\u0a54\7\u01ae\2\2\u0a54\u0a56\5\u00fe\u0080\2\u0a55\u0a53"+
		"\3\2\2\2\u0a56\u0a59\3\2\2\2\u0a57\u0a55\3\2\2\2\u0a57\u0a58\3\2\2\2\u0a58"+
		"\u0a5a\3\2\2\2\u0a59\u0a57\3\2\2\2\u0a5a\u0a5b\7\u01ad\2\2\u0a5b\u00fb"+
		"\3\2\2\2\u0a5c\u0a5d\7\u00c0\2\2\u0a5d\u0a5e\7\u01ac\2\2\u0a5e\u0a63\5"+
		"\u00fe\u0080\2\u0a5f\u0a60\7\u01ae\2\2\u0a60\u0a62\5\u00fe\u0080\2\u0a61"+
		"\u0a5f\3\2\2\2\u0a62\u0a65\3\2\2\2\u0a63\u0a61\3\2\2\2\u0a63\u0a64\3\2"+
		"\2\2\u0a64\u0a66\3\2\2\2\u0a65\u0a63\3\2\2\2\u0a66\u0a67\7\u01ad\2\2\u0a67"+
		"\u00fd\3\2\2\2\u0a68\u0a6a\7\u0137\2\2\u0a69\u0a68\3\2\2\2\u0a69\u0a6a"+
		"\3\2\2\2\u0a6a\u0a91\3\2\2\2\u0a6b\u0a6c\7Z\2\2\u0a6c\u0a6d\7\u01ac\2"+
		"\2\u0a6d\u0a72\5\u0100\u0081\2\u0a6e\u0a6f\7\u01ae\2\2\u0a6f\u0a71\5\u0100"+
		"\u0081\2\u0a70\u0a6e\3\2\2\2\u0a71\u0a74\3\2\2\2\u0a72\u0a70\3\2\2\2\u0a72"+
		"\u0a73\3\2\2\2\u0a73\u0a75\3\2\2\2\u0a74\u0a72\3\2\2\2\u0a75\u0a76\7\u01ad"+
		"\2\2\u0a76\u0a92\3\2\2\2\u0a77\u0a78\7Z\2\2\u0a78\u0a79\7\u019b\2\2\u0a79"+
		"\u0a92\5\u0100\u0081\2\u0a7a\u0a89\7J\2\2\u0a7b\u0a7c\7\u01ac\2\2\u0a7c"+
		"\u0a7d\5\u0100\u0081\2\u0a7d\u0a7e\7\u01ac\2\2\u0a7e\u0a83\7\u0196\2\2"+
		"\u0a7f\u0a80\7\u01ae\2\2\u0a80\u0a82\7\u0196\2\2\u0a81\u0a7f\3\2\2\2\u0a82"+
		"\u0a85\3\2\2\2\u0a83\u0a81\3\2\2\2\u0a83\u0a84\3\2\2\2\u0a84\u0a86\3\2"+
		"\2\2\u0a85\u0a83\3\2\2\2\u0a86\u0a87\7\u01ad\2\2\u0a87\u0a88\7\u01ad\2"+
		"\2\u0a88\u0a8a\3\2\2\2\u0a89\u0a7b\3\2\2\2\u0a89\u0a8a\3\2\2\2\u0a8a\u0a92"+
		"\3\2\2\2\u0a8b\u0a92\7\u0168\2\2\u0a8c\u0a92\7\u016d\2\2\u0a8d\u0a8e\7"+
		"\u016e\2\2\u0a8e\u0a8f\7\u019b\2\2\u0a8f\u0a92\7\u0195\2\2\u0a90\u0a92"+
		"\7\u0196\2\2\u0a91\u0a6b\3\2\2\2\u0a91\u0a77\3\2\2\2\u0a91\u0a7a\3\2\2"+
		"\2\u0a91\u0a8b\3\2\2\2\u0a91\u0a8c\3\2\2\2\u0a91\u0a8d\3\2\2\2\u0a91\u0a90"+
		"\3\2\2\2\u0a91\u0a92\3\2\2\2\u0a92\u00ff\3\2\2\2\u0a93\u0a96\5\u0146\u00a4"+
		"\2\u0a94\u0a96\7\u0195\2\2\u0a95\u0a93\3\2\2\2\u0a95\u0a94\3\2\2\2\u0a96"+
		"\u0101\3\2\2\2\u0a97\u0a98\7\u01ac\2\2\u0a98\u0a9d\5\u0104\u0083\2\u0a99"+
		"\u0a9a\7\u01ae\2\2\u0a9a\u0a9c\5\u0104\u0083\2\u0a9b\u0a99\3\2\2\2\u0a9c"+
		"\u0a9f\3\2\2\2\u0a9d\u0a9b\3\2\2\2\u0a9d\u0a9e\3\2\2\2\u0a9e\u0aa0\3\2"+
		"\2\2\u0a9f\u0a9d\3\2\2\2\u0aa0\u0aa1\7\u01ad\2\2\u0aa1\u0103\3\2\2\2\u0aa2"+
		"\u0aa5\5\u0146\u00a4\2\u0aa3\u0aa5\7\u0197\2\2\u0aa4\u0aa2\3\2\2\2\u0aa4"+
		"\u0aa3\3\2\2\2\u0aa5\u0105\3\2\2\2\u0aa6\u0aa7\7\u00b9\2\2\u0aa7\u0aa8"+
		"\7\u01ac\2\2\u0aa8\u0aa9\5\u0108\u0085\2\u0aa9\u0ab1\7\u01ad\2\2\u0aaa"+
		"\u0aab\7\u01ae\2\2\u0aab\u0aac\7\u01ac\2\2\u0aac\u0aad\5\u0108\u0085\2"+
		"\u0aad\u0aae\7\u01ad\2\2\u0aae\u0ab0\3\2\2\2\u0aaf\u0aaa\3\2\2\2\u0ab0"+
		"\u0ab3\3\2\2\2\u0ab1\u0aaf\3\2\2\2\u0ab1\u0ab2\3\2\2\2\u0ab2\u0107\3\2"+
		"\2\2\u0ab3\u0ab1\3\2\2\2\u0ab4\u0ab9\5\u00acW\2\u0ab5\u0ab6\7\u01ae\2"+
		"\2\u0ab6\u0ab8\5\u00acW\2\u0ab7\u0ab5\3\2\2\2\u0ab8\u0abb\3\2\2\2\u0ab9"+
		"\u0ab7\3\2\2\2\u0ab9\u0aba\3\2\2\2\u0aba\u0109\3\2\2\2\u0abb\u0ab9\3\2"+
		"\2\2\u0abc\u0abd\t\60\2\2\u0abd\u0abe\7\u01ac\2\2\u0abe\u0abf\7\u01ad"+
		"\2\2\u0abf\u0ac7\5\u0110\u0089\2\u0ac0\u0ac1\7\u013b\2\2\u0ac1\u0ac2\7"+
		"\u01ac\2\2\u0ac2\u0ac3\5\u00acW\2\u0ac3\u0ac4\7\u01ad\2\2\u0ac4\u0ac5"+
		"\5\u0110\u0089\2\u0ac5\u0ac7\3\2\2\2\u0ac6\u0abc\3\2\2\2\u0ac6\u0ac0\3"+
		"\2\2\2\u0ac7\u010b\3\2\2\2\u0ac8\u0ac9\t\61\2\2\u0ac9\u0aca\7\u01ac\2"+
		"\2\u0aca\u0acb\5\u010e\u0088\2\u0acb\u0acd\7\u01ad\2\2\u0acc\u0ace\5\u0110"+
		"\u0089\2\u0acd\u0acc\3\2\2\2\u0acd\u0ace\3\2\2\2\u0ace\u0ae9\3\2\2\2\u0acf"+
		"\u0ad0\t\62\2\2\u0ad0\u0ad3\7\u01ac\2\2\u0ad1\u0ad4\7\u01b1\2\2\u0ad2"+
		"\u0ad4\5\u010e\u0088\2\u0ad3\u0ad1\3\2\2\2\u0ad3\u0ad2\3\2\2\2\u0ad4\u0ad5"+
		"\3\2\2\2\u0ad5\u0ad7\7\u01ad\2\2\u0ad6\u0ad8\5\u0110\u0089\2\u0ad7\u0ad6"+
		"\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8\u0ae9\3\2\2\2\u0ad9\u0ada\7\u00de\2"+
		"\2\u0ada\u0adb\7\u01ac\2\2\u0adb\u0adc\5\u010e\u0088\2\u0adc\u0add\7\u01ad"+
		"\2\2\u0add\u0ae9\3\2\2\2\u0ade\u0adf\7\u010e\2\2\u0adf\u0ae0\7\u01ac\2"+
		"\2\u0ae0\u0ae1\5\u00acW\2\u0ae1\u0ae2\7\u01ad\2\2\u0ae2\u0ae9\3\2\2\2"+
		"\u0ae3\u0ae4\7\u010f\2\2\u0ae4\u0ae5\7\u01ac\2\2\u0ae5\u0ae6\5\u0108\u0085"+
		"\2\u0ae6\u0ae7\7\u01ad\2\2\u0ae7\u0ae9\3\2\2\2\u0ae8\u0ac8\3\2\2\2\u0ae8"+
		"\u0acf\3\2\2\2\u0ae8\u0ad9\3\2\2\2\u0ae8\u0ade\3\2\2\2\u0ae8\u0ae3\3\2"+
		"\2\2\u0ae9\u010d\3\2\2\2\u0aea\u0aec\t%\2\2\u0aeb\u0aea\3\2\2\2\u0aeb"+
		"\u0aec\3\2\2\2\u0aec\u0aed\3\2\2\2\u0aed\u0aee\5\u00acW\2\u0aee\u010f"+
		"\3\2\2\2\u0aef\u0af0\7}\2\2\u0af0\u0af4\7\u01ac\2\2\u0af1\u0af2\7\u0149"+
		"\2\2\u0af2\u0af3\7\22\2\2\u0af3\u0af5\5\u0108\u0085\2\u0af4\u0af1\3\2"+
		"\2\2\u0af4\u0af5\3\2\2\2\u0af5\u0af7\3\2\2\2\u0af6\u0af8\5\u00c8e\2\u0af7"+
		"\u0af6\3\2\2\2\u0af7\u0af8\3\2\2\2\u0af8\u0afa\3\2\2\2\u0af9\u0afb\5\u0112"+
		"\u008a\2\u0afa\u0af9\3\2\2\2\u0afa\u0afb\3\2\2\2\u0afb\u0afc\3\2\2\2\u0afc"+
		"\u0afd\7\u01ad\2\2\u0afd\u0111\3\2\2\2\u0afe\u0aff\t\63\2\2\u0aff\u0b00"+
		"\5\u0114\u008b\2\u0b00\u0113\3\2\2\2\u0b01\u0b08\5\u0118\u008d\2\u0b02"+
		"\u0b03\7\16\2\2\u0b03\u0b04\5\u0116\u008c\2\u0b04\u0b05\7\7\2\2\u0b05"+
		"\u0b06\5\u0116\u008c\2\u0b06\u0b08\3\2\2\2\u0b07\u0b01\3\2\2\2\u0b07\u0b02"+
		"\3\2\2\2\u0b08\u0115\3\2\2\2\u0b09\u0b0c\5\u0118\u008d\2\u0b0a\u0b0c\5"+
		"\u011a\u008e\2\u0b0b\u0b09\3\2\2\2\u0b0b\u0b0a\3\2\2\2\u0b0c\u0117\3\2"+
		"\2\2\u0b0d\u0b0e\7\u0182\2\2\u0b0e\u0b14\7\u014b\2\2\u0b0f\u0b10\7\u0195"+
		"\2\2\u0b10\u0b14\7\u014b\2\2\u0b11\u0b12\7(\2\2\u0b12\u0b14\7\u015e\2"+
		"\2\u0b13\u0b0d\3\2\2\2\u0b13\u0b0f\3\2\2\2\u0b13\u0b11\3\2\2\2\u0b14\u0119"+
		"\3\2\2\2\u0b15\u0b16\7\u0182\2\2\u0b16\u0b1a\7\u0106\2\2\u0b17\u0b18\7"+
		"\u0195\2\2\u0b18\u0b1a\7\u0106\2\2\u0b19\u0b15\3\2\2\2\u0b19\u0b17\3\2"+
		"\2\2\u0b1a\u011b\3\2\2\2\u0b1b\u0b1c\7\u0104\2\2\u0b1c\u0b21\5\u011e\u0090"+
		"\2\u0b1d\u0b1e\7\u01ae\2\2\u0b1e\u0b20\5\u011e\u0090\2\u0b1f\u0b1d\3\2"+
		"\2\2\u0b20\u0b23\3\2\2\2\u0b21\u0b1f\3\2\2\2\u0b21\u0b22\3\2\2\2\u0b22"+
		"\u0b3e\3\2\2\2\u0b23\u0b21\3\2\2\2\u0b24\u0b25\7\u00f1\2\2\u0b25\u0b28"+
		"\7\u019b\2\2\u0b26\u0b29\5\u0146\u00a4\2\u0b27\u0b29\7\u0197\2\2\u0b28"+
		"\u0b26\3\2\2\2\u0b28\u0b27\3\2\2\2\u0b29\u0b3e\3\2\2\2\u0b2a\u0b2b\7\u00f0"+
		"\2\2\u0b2b\u0b2e\7\u019b\2\2\u0b2c\u0b2f\5\u0146\u00a4\2\u0b2d\u0b2f\7"+
		"\u0197\2\2\u0b2e\u0b2c\3\2\2\2\u0b2e\u0b2d\3\2\2\2\u0b2f\u0b3e\3\2\2\2"+
		"\u0b30\u0b31\7\u0133\2\2\u0b31\u0b32\7\u019b\2\2\u0b32\u0b3e\t\r\2\2\u0b33"+
		"\u0b34\7\u017c\2\2\u0b34\u0b35\7\u019b\2\2\u0b35\u0b3e\t\r\2\2\u0b36\u0b37"+
		"\7\u017f\2\2\u0b37\u0b38\7\u019b\2\2\u0b38\u0b3e\7\u0195\2\2\u0b39\u0b3a"+
		"\7\u00ef\2\2\u0b3a\u0b3e\t\r\2\2\u0b3b\u0b3c\7\u017d\2\2\u0b3c\u0b3e\t"+
		"\r\2\2\u0b3d\u0b1b\3\2\2\2\u0b3d\u0b24\3\2\2\2\u0b3d\u0b2a\3\2\2\2\u0b3d"+
		"\u0b30\3\2\2\2\u0b3d\u0b33\3\2\2\2\u0b3d\u0b36\3\2\2\2\u0b3d\u0b39\3\2"+
		"\2\2\u0b3d\u0b3b\3\2\2\2\u0b3e\u011d\3\2\2\2\u0b3f\u0b46\7\u01ac\2\2\u0b40"+
		"\u0b41\7\u0138\2\2\u0b41\u0b42\7\u019b\2\2\u0b42\u0b47\t\64\2\2\u0b43"+
		"\u0b44\7\u00f6\2\2\u0b44\u0b45\7\u019b\2\2\u0b45\u0b47\7\u0197\2\2\u0b46"+
		"\u0b40\3\2\2\2\u0b46\u0b43\3\2\2\2\u0b47\u0b48\3\2\2\2\u0b48\u0b49\7\u01ad"+
		"\2\2\u0b49\u011f\3\2\2\2\u0b4a\u0b4d\5\u0122\u0092\2\u0b4b\u0b4d\5\u0124"+
		"\u0093\2\u0b4c\u0b4a\3\2\2\2\u0b4c\u0b4b\3\2\2\2\u0b4d\u0121\3\2\2\2\u0b4e"+
		"\u0b4f\7\u0102\2\2\u0b4f\u0b52\5\u0146\u00a4\2\u0b50\u0b51\7\"\2\2\u0b51"+
		"\u0b53\7\u0104\2\2\u0b52\u0b50\3\2\2\2\u0b52\u0b53\3\2\2\2\u0b53\u0b55"+
		"\3\2\2\2\u0b54\u0b56\7\62\2\2\u0b55\u0b54\3\2\2\2\u0b55\u0b56\3\2\2\2"+
		"\u0b56\u0b59\3\2\2\2\u0b57\u0b58\7\"\2\2\u0b58\u0b5a\7\u012b\2\2\u0b59"+
		"\u0b57\3\2\2\2\u0b59\u0b5a\3\2\2\2\u0b5a\u0b5b\3\2\2\2\u0b5b\u0b60\5\u0124"+
		"\u0093\2\u0b5c\u0b5d\7\u01ae\2\2\u0b5d\u0b5f\5\u0124\u0093\2\u0b5e\u0b5c"+
		"\3\2\2\2\u0b5f\u0b62\3\2\2\2\u0b60\u0b5e\3\2\2\2\u0b60\u0b61\3\2\2\2\u0b61"+
		"\u0123\3\2\2\2\u0b62\u0b60\3\2\2\2\u0b63\u0b64\7\u01ac\2\2\u0b64\u0b65"+
		"\7\u0132\2\2\u0b65\u0b68\7\u019b\2\2\u0b66\u0b69\5\u0146\u00a4\2\u0b67"+
		"\u0b69\7\u0197\2\2\u0b68\u0b66\3\2\2\2\u0b68\u0b67\3\2\2\2\u0b69\u0b6b"+
		"\3\2\2\2\u0b6a\u0b6c\7\u01ae\2\2\u0b6b\u0b6a\3\2\2\2\u0b6b\u0b6c\3\2\2"+
		"\2\u0b6c\u0b6d\3\2\2\2\u0b6d\u0b6e\7G\2\2\u0b6e\u0b6f\7\u019b\2\2\u0b6f"+
		"\u0b71\7\u0197\2\2\u0b70\u0b72\7\u01ae\2\2\u0b71\u0b70\3\2\2\2\u0b71\u0b72"+
		"\3\2\2\2\u0b72\u0b79\3\2\2\2\u0b73\u0b74\7\u016c\2\2\u0b74\u0b75\7\u019b"+
		"\2\2\u0b75\u0b77\5\u014e\u00a8\2\u0b76\u0b78\7\u01ae\2\2\u0b77\u0b76\3"+
		"\2\2\2\u0b77\u0b78\3\2\2\2\u0b78\u0b7a\3\2\2\2\u0b79\u0b73\3\2\2\2\u0b79"+
		"\u0b7a\3\2\2\2\u0b7a\u0b84\3\2\2\2\u0b7b\u0b7c\7\u0129\2\2\u0b7c\u0b7f"+
		"\7\u019b\2\2\u0b7d\u0b80\5\u014e\u00a8\2\u0b7e\u0b80\7\u0185\2\2\u0b7f"+
		"\u0b7d\3\2\2\2\u0b7f\u0b7e\3\2\2\2\u0b80\u0b82\3\2\2\2\u0b81\u0b83\7\u01ae"+
		"\2\2\u0b82\u0b81\3\2\2\2\u0b82\u0b83\3\2\2\2\u0b83\u0b85\3\2\2\2\u0b84"+
		"\u0b7b\3\2\2\2\u0b84\u0b85\3\2\2\2\u0b85\u0b8c\3\2\2\2\u0b86\u0b87\7\u0103"+
		"\2\2\u0b87\u0b88\7\u019b\2\2\u0b88\u0b8a\5\u014e\u00a8\2\u0b89\u0b8b\7"+
		"\u01ae\2\2\u0b8a\u0b89\3\2\2\2\u0b8a\u0b8b\3\2\2\2\u0b8b\u0b8d\3\2\2\2"+
		"\u0b8c\u0b86\3\2\2\2\u0b8c\u0b8d\3\2\2\2\u0b8d\u0b8e\3\2\2\2\u0b8e\u0b8f"+
		"\7\u01ad\2\2\u0b8f\u0125\3\2\2\2\u0b90\u0b91\5\u0146\u00a4\2\u0b91\u0b92"+
		"\7\u01a7\2\2\u0b92\u0b93\5\u0146\u00a4\2\u0b93\u0b94\7\u01a7\2\2\u0b94"+
		"\u0b95\5\u0146\u00a4\2\u0b95\u0b96\7\u01a7\2\2\u0b96\u0ba2\3\2\2\2\u0b97"+
		"\u0b98\5\u0146\u00a4\2\u0b98\u0b9a\7\u01a7\2\2\u0b99\u0b9b\5\u0146\u00a4"+
		"\2\u0b9a\u0b99\3\2\2\2\u0b9a\u0b9b\3\2\2\2\u0b9b\u0b9c\3\2\2\2\u0b9c\u0b9d"+
		"\7\u01a7\2\2\u0b9d\u0ba2\3\2\2\2\u0b9e\u0b9f\5\u0146\u00a4\2\u0b9f\u0ba0"+
		"\7\u01a7\2\2\u0ba0\u0ba2\3\2\2\2\u0ba1\u0b90\3\2\2\2\u0ba1\u0b97\3\2\2"+
		"\2\u0ba1\u0b9e\3\2\2\2\u0ba1\u0ba2\3\2\2\2\u0ba2\u0ba3\3\2\2\2\u0ba3\u0ba4"+
		"\5\u0146\u00a4\2\u0ba4\u0127\3\2\2\2\u0ba5\u0ba6\5\u0146\u00a4\2\u0ba6"+
		"\u0ba8\7\u01a7\2\2\u0ba7\u0ba9\5\u0146\u00a4\2\u0ba8\u0ba7\3\2\2\2\u0ba8"+
		"\u0ba9\3\2\2\2\u0ba9\u0baa\3\2\2\2\u0baa\u0bab\7\u01a7\2\2\u0bab\u0bb0"+
		"\3\2\2\2\u0bac\u0bad\5\u0146\u00a4\2\u0bad\u0bae\7\u01a7\2\2\u0bae\u0bb0"+
		"\3\2\2\2\u0baf\u0ba5\3\2\2\2\u0baf\u0bac\3\2\2\2\u0baf\u0bb0\3\2\2\2\u0bb0"+
		"\u0bb1\3\2\2\2\u0bb1\u0bb2\5\u0146\u00a4\2\u0bb2\u0129\3\2\2\2\u0bb3\u0bb4"+
		"\5\u0146\u00a4\2\u0bb4\u0bb5\7\u01a7\2\2\u0bb5\u0bb7\3\2\2\2\u0bb6\u0bb3"+
		"\3\2\2\2\u0bb6\u0bb7\3\2\2\2\u0bb7\u0bb8\3\2\2\2\u0bb8\u0bb9\5\u0146\u00a4"+
		"\2\u0bb9\u012b\3\2\2\2\u0bba\u0bbb\5\u0146\u00a4\2\u0bbb\u0bbd\7\u01a7"+
		"\2\2\u0bbc\u0bbe\5\u0146\u00a4\2\u0bbd\u0bbc\3\2\2\2\u0bbd\u0bbe\3\2\2"+
		"\2\u0bbe\u0bbf\3\2\2\2\u0bbf\u0bc0\7\u01a7\2\2\u0bc0\u0bc5\3\2\2\2\u0bc1"+
		"\u0bc2\5\u0146\u00a4\2\u0bc2\u0bc3\7\u01a7\2\2\u0bc3\u0bc5\3\2\2\2\u0bc4"+
		"\u0bba\3\2\2\2\u0bc4\u0bc1\3\2\2\2\u0bc4\u0bc5\3\2\2\2\u0bc5\u0bc6\3\2"+
		"\2\2\u0bc6\u0bc7\5\u0146\u00a4\2\u0bc7\u012d\3\2\2\2\u0bc8\u0bcb\5\u0126"+
		"\u0094\2\u0bc9\u0bcb\7\u0194\2\2\u0bca\u0bc8\3\2\2\2\u0bca\u0bc9\3\2\2"+
		"\2\u0bcb\u012f\3\2\2\2\u0bcc\u0bcd\5\u0128\u0095\2\u0bcd\u0bce\7\u01a7"+
		"\2\2\u0bce\u0bd0\3\2\2\2\u0bcf\u0bcc\3\2\2\2\u0bcf\u0bd0\3\2\2\2\u0bd0"+
		"\u0bd1\3\2\2\2\u0bd1\u0bd2\5\u0146\u00a4\2\u0bd2\u0131\3\2\2\2\u0bd3\u0bd8"+
		"\5\u0146\u00a4\2\u0bd4\u0bd5\7\u01ae\2\2\u0bd5\u0bd7\5\u0146\u00a4\2\u0bd6"+
		"\u0bd4\3\2\2\2\u0bd7\u0bda\3\2\2\2\u0bd8\u0bd6\3\2\2\2\u0bd8\u0bd9\3\2"+
		"\2\2\u0bd9\u0133\3\2\2\2\u0bda\u0bd8\3\2\2\2\u0bdb\u0bde\5\u0146\u00a4"+
		"\2\u0bdc\u0bde\7\u0194\2\2\u0bdd\u0bdb\3\2\2\2\u0bdd\u0bdc\3\2\2\2\u0bde"+
		"\u0135\3\2\2\2\u0bdf\u0be0\t\r\2\2\u0be0\u0137\3\2\2\2\u0be1\u0be2\t\65"+
		"\2\2\u0be2\u0139\3\2\2\2\u0be3\u0be5\7m\2\2\u0be4\u0be3\3\2\2\2\u0be4"+
		"\u0be5\3\2\2\2\u0be5\u0be6\3\2\2\2\u0be6\u0be7\7n\2\2\u0be7\u013b\3\2"+
		"\2\2\u0be8\u0bee\5\u012c\u0097\2\u0be9\u0bee\7\u0093\2\2\u0bea\u0bee\7"+
		"c\2\2\u0beb\u0bee\7\u00d6\2\2\u0bec\u0bee\7\u00dd\2\2\u0bed\u0be8\3\2"+
		"\2\2\u0bed\u0be9\3\2\2\2\u0bed\u0bea\3\2\2\2\u0bed\u0beb\3\2\2\2\u0bed"+
		"\u0bec\3\2\2\2\u0bee\u013d\3\2\2\2\u0bef\u0bf1\5\u0146\u00a4\2\u0bf0\u0bf2"+
		"\7U\2\2\u0bf1\u0bf0\3\2\2\2\u0bf1\u0bf2\3\2\2\2\u0bf2\u0bfa\3\2\2\2\u0bf3"+
		"\u0bf4\7\u01ac\2\2\u0bf4\u0bf7\t\66\2\2\u0bf5\u0bf6\7\u01ae\2\2\u0bf6"+
		"\u0bf8\7\u0195\2\2\u0bf7\u0bf5\3\2\2\2\u0bf7\u0bf8\3\2\2\2\u0bf8\u0bf9"+
		"\3\2\2\2\u0bf9\u0bfb\7\u01ad\2\2\u0bfa\u0bf3\3\2\2\2\u0bfa\u0bfb\3\2\2"+
		"\2\u0bfb\u013f\3\2\2\2\u0bfc\u0bff\7n\2\2\u0bfd\u0bff\5\u0142\u00a2\2"+
		"\u0bfe\u0bfc\3\2\2\2\u0bfe\u0bfd\3\2\2\2\u0bff\u0141\3\2\2\2\u0c00\u0c10"+
		"\7\u0197\2\2\u0c01\u0c10\7\u0198\2\2\u0c02\u0c04\5\u0144\u00a3\2\u0c03"+
		"\u0c02\3\2\2\2\u0c03\u0c04\3\2\2\2\u0c04\u0c05\3\2\2\2\u0c05\u0c10\7\u0195"+
		"\2\2\u0c06\u0c08\5\u0144\u00a3\2\u0c07\u0c06\3\2\2\2\u0c07\u0c08\3\2\2"+
		"\2\u0c08\u0c09\3\2\2\2\u0c09\u0c10\t\67\2\2\u0c0a\u0c0c\5\u0144\u00a3"+
		"\2\u0c0b\u0c0a\3\2\2\2\u0c0b\u0c0c\3\2\2\2\u0c0c\u0c0d\3\2\2\2\u0c0d\u0c0e"+
		"\7\u01ab\2\2\u0c0e\u0c10\t8\2\2\u0c0f\u0c00\3\2\2\2\u0c0f\u0c01\3\2\2"+
		"\2\u0c0f\u0c03\3\2\2\2\u0c0f\u0c07\3\2\2\2\u0c0f\u0c0b\3\2\2\2\u0c10\u0143"+
		"\3\2\2\2\u0c11\u0c12\t!\2\2\u0c12\u0145\3\2\2\2\u0c13\u0c17\5\u0148\u00a5"+
		"\2\u0c14\u0c17\7\u0192\2\2\u0c15\u0c17\7\u0193\2\2\u0c16\u0c13\3\2\2\2"+
		"\u0c16\u0c14\3\2\2\2\u0c16\u0c15\3\2\2\2\u0c17\u0147\3\2\2\2\u0c18\u0c19"+
		"\t9\2\2\u0c19\u0149\3\2\2\2\u0c1a\u0c2a\7\u019b\2\2\u0c1b\u0c2a\7\u019c"+
		"\2\2\u0c1c\u0c2a\7\u019d\2\2\u0c1d\u0c1e\7\u019d\2\2\u0c1e\u0c2a\7\u019b"+
		"\2\2\u0c1f\u0c20\7\u019c\2\2\u0c20\u0c2a\7\u019b\2\2\u0c21\u0c22\7\u019d"+
		"\2\2\u0c22\u0c2a\7\u019c\2\2\u0c23\u0c24\7\u019e\2\2\u0c24\u0c2a\7\u019b"+
		"\2\2\u0c25\u0c26\7\u019e\2\2\u0c26\u0c2a\7\u019c\2\2\u0c27\u0c28\7\u019e"+
		"\2\2\u0c28\u0c2a\7\u019d\2\2\u0c29\u0c1a\3\2\2\2\u0c29\u0c1b\3\2\2\2\u0c29"+
		"\u0c1c\3\2\2\2\u0c29\u0c1d\3\2\2\2\u0c29\u0c1f\3\2\2\2\u0c29\u0c21\3\2"+
		"\2\2\u0c29\u0c23\3\2\2\2\u0c29\u0c25\3\2\2\2\u0c29\u0c27\3\2\2\2\u0c2a"+
		"\u014b\3\2\2\2\u0c2b\u0c2c\t:\2\2\u0c2c\u014d\3\2\2\2\u0c2d\u0c2f\7\u0195"+
		"\2\2\u0c2e\u0c30\t;\2\2\u0c2f\u0c2e\3\2\2\2\u0c2f\u0c30\3\2\2\2\u0c30"+
		"\u014f\3\2\2\2\u01cd\u0153\u015a\u015e\u0162\u0168\u016e\u017f\u0183\u0186"+
		"\u018a\u018e\u0192\u0197\u019c\u01a3\u01a6\u01aa\u01ad\u01b5\u01b8\u01bd"+
		"\u01c0\u01c5\u01ca\u01cd\u01d2\u01d8\u01df\u01e3\u01e5\u01ea\u01f7\u01fc"+
		"\u01fe\u0207\u020a\u0212\u0214\u0217\u021b\u021e\u0222\u0229\u022d\u022f"+
		"\u0231\u0234\u0237\u023a\u0240\u0243\u024b\u024d\u0250\u0254\u0257\u025d"+
		"\u0260\u0264\u0267\u026a\u0271\u0274\u0278\u027b\u027e\u0281\u0284\u028c"+
		"\u028e\u0292\u0295\u029d\u02a1\u02a5\u02ac\u02b0\u02b2\u02b4\u02b7\u02ba"+
		"\u02bd\u02c5\u02cb\u02d1\u02d3\u02d7\u02da\u02dd\u02e2\u02e7\u02ea\u02f2"+
		"\u02f6\u02fd\u0300\u0309\u030c\u0310\u0318\u031b\u031f\u0322\u032b\u032f"+
		"\u0333\u0336\u033d\u0340\u0347\u034b\u034d\u0355\u0358\u035c\u0365\u0368"+
		"\u036c\u0370\u0373\u0378\u0388\u038c\u0392\u0394\u0397\u039f\u03a5\u03aa"+
		"\u03ad\u03b6\u03be\u03c1\u03c8\u03cb\u03f0\u03f3\u03f9\u0405\u0407\u040a"+
		"\u0422\u042d\u0435\u0440\u0445\u0448\u0450\u045a\u0474\u047a\u0485\u0493"+
		"\u049b\u04a2\u04b9\u04c6\u04cc\u04d1\u04d4\u04da\u04de\u04e5\u04ee\u04f2"+
		"\u04f8\u04ff\u0503\u0510\u0516\u0527\u052b\u0533\u0537\u053f\u0543\u0545"+
		"\u0549\u054d\u0551\u0555\u055b\u055f\u0561\u0566\u056e\u0571\u0574\u057d"+
		"\u0582\u0587\u058a\u058c\u0590\u0594\u0597\u059b\u05a1\u05a6\u05ad\u05af"+
		"\u05b3\u05ba\u05be\u05c1\u05ca\u05cd\u05cf\u05d8\u05e3\u05e7\u05e9\u05eb"+
		"\u05f1\u05f6\u05fd\u060a\u060c\u060e\u0611\u0614\u061b\u061e\u0624\u0629"+
		"\u062b\u062e\u0634\u063c\u063e\u0641\u0645\u0648\u064e\u0651\u0655\u0658"+
		"\u065e\u0661\u0663\u0667\u066c\u0674\u0679\u0682\u0687\u068c\u0692\u0696"+
		"\u0699\u069d\u06a3\u06ab\u06b0\u06b2\u06b5\u06ba\u06bf\u06c2\u06c7\u06ca"+
		"\u06cd\u06d3\u06d9\u06dd\u06e2\u06e5\u06ea\u06ee\u06f2\u06f8\u06fe\u0707"+
		"\u0711\u071b\u071d\u071f\u0722\u0725\u0730\u0732\u0734\u0737\u073a\u073d"+
		"\u0740\u0743\u0746\u0752\u0755\u0758\u0761\u0764\u0767\u076e\u0771\u077f"+
		"\u0782\u0789\u0794\u0798\u07a5\u07a9\u07b1\u07b5\u07c7\u07d6\u07d8\u07e3"+
		"\u07ea\u07f1\u07f9\u0802\u0806\u0810\u0817\u081f\u0827\u082b\u0841\u084a"+
		"\u0850\u0856\u085c\u0867\u086e\u0873\u0878\u087c\u0885\u0887\u088b\u0890"+
		"\u0894\u0896\u089b\u089f\u08a3\u08ac\u08af\u08b3\u08bc\u08c8\u08ca\u08d2"+
		"\u08da\u08dd\u08df\u08e6\u08ea\u08f5\u0917\u0927\u092d\u0934\u093a\u093f"+
		"\u0947\u094a\u094c\u0953\u095b\u0961\u0966\u096a\u096f\u0971\u0978\u097c"+
		"\u0983\u0985\u0987\u0992\u0996\u0998\u099b\u09ab\u09af\u09c3\u09c7\u09cb"+
		"\u09d6\u09dd\u09f3\u0a27\u0a2b\u0a39\u0a46\u0a4c\u0a4f\u0a57\u0a63\u0a69"+
		"\u0a72\u0a83\u0a89\u0a91\u0a95\u0a9d\u0aa4\u0ab1\u0ab9\u0ac6\u0acd\u0ad3"+
		"\u0ad7\u0ae8\u0aeb\u0af4\u0af7\u0afa\u0b07\u0b0b\u0b13\u0b19\u0b21\u0b28"+
		"\u0b2e\u0b3d\u0b46\u0b4c\u0b52\u0b55\u0b59\u0b60\u0b68\u0b6b\u0b71\u0b77"+
		"\u0b79\u0b7f\u0b82\u0b84\u0b8a\u0b8c\u0b9a\u0ba1\u0ba8\u0baf\u0bb6\u0bbd"+
		"\u0bc4\u0bca\u0bcf\u0bd8\u0bdd\u0be4\u0bed\u0bf1\u0bf7\u0bfa\u0bfe\u0c03"+
		"\u0c07\u0c0b\u0c0f\u0c16\u0c29\u0c2f";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}