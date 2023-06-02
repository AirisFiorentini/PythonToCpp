// Generated from my_grammar.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link my_grammarParser}.
 */
public interface my_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(my_grammarParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(my_grammarParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(my_grammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(my_grammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(my_grammarParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(my_grammarParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(my_grammarParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(my_grammarParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(my_grammarParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(my_grammarParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(my_grammarParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(my_grammarParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(my_grammarParser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(my_grammarParser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(my_grammarParser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(my_grammarParser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(my_grammarParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(my_grammarParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(my_grammarParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(my_grammarParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(my_grammarParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(my_grammarParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(my_grammarParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(my_grammarParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(my_grammarParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(my_grammarParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(my_grammarParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(my_grammarParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(my_grammarParser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(my_grammarParser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(my_grammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(my_grammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(my_grammarParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(my_grammarParser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(my_grammarParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(my_grammarParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(my_grammarParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(my_grammarParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(my_grammarParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(my_grammarParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(my_grammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(my_grammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(my_grammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(my_grammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(my_grammarParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(my_grammarParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(my_grammarParser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(my_grammarParser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(my_grammarParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(my_grammarParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(my_grammarParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(my_grammarParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(my_grammarParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(my_grammarParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(my_grammarParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(my_grammarParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(my_grammarParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(my_grammarParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(my_grammarParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(my_grammarParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#range_func}.
	 * @param ctx the parse tree
	 */
	void enterRange_func(my_grammarParser.Range_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#range_func}.
	 * @param ctx the parse tree
	 */
	void exitRange_func(my_grammarParser.Range_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(my_grammarParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(my_grammarParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(my_grammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(my_grammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(my_grammarParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(my_grammarParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#variadicargs}.
	 * @param ctx the parse tree
	 */
	void enterVariadicargs(my_grammarParser.VariadicargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#variadicargs}.
	 * @param ctx the parse tree
	 */
	void exitVariadicargs(my_grammarParser.VariadicargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(my_grammarParser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(my_grammarParser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(my_grammarParser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(my_grammarParser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(my_grammarParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(my_grammarParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void enterLambdef(my_grammarParser.LambdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void exitLambdef(my_grammarParser.LambdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(my_grammarParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(my_grammarParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(my_grammarParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(my_grammarParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(my_grammarParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(my_grammarParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(my_grammarParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(my_grammarParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(my_grammarParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(my_grammarParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_grammarParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(my_grammarParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_grammarParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(my_grammarParser.ExprlistContext ctx);
}