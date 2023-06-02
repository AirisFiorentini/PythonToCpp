// Generated from my_grammar.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link my_grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface my_grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(my_grammarParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(my_grammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(my_grammarParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(my_grammarParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(my_grammarParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#assign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr(my_grammarParser.Assign_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_star_expr(my_grammarParser.Testlist_star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugassign(my_grammarParser.AugassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(my_grammarParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(my_grammarParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(my_grammarParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(my_grammarParser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(my_grammarParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(my_grammarParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expr(my_grammarParser.Star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(my_grammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#xor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr(my_grammarParser.Xor_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(my_grammarParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr(my_grammarParser.Shift_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(my_grammarParser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(my_grammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(my_grammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(my_grammarParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_expr(my_grammarParser.Atom_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(my_grammarParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(my_grammarParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(my_grammarParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(my_grammarParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(my_grammarParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(my_grammarParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#range_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_func(my_grammarParser.Range_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(my_grammarParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(my_grammarParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedargslist(my_grammarParser.TypedargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#variadicargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariadicargs(my_grammarParser.VariadicargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#tfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfpdef(my_grammarParser.TfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#yield_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_expr(my_grammarParser.Yield_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(my_grammarParser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#lambdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef(my_grammarParser.LambdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(my_grammarParser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(my_grammarParser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(my_grammarParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(my_grammarParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(my_grammarParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link my_grammarParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(my_grammarParser.ExprlistContext ctx);
}