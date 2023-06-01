# Generated from my_grammar.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .my_grammarParser import my_grammarParser
else:
    from my_grammarParser import my_grammarParser

# This class defines a complete listener for a parse tree produced by my_grammarParser.
class my_grammarListener(ParseTreeListener):

    # Enter a parse tree produced by my_grammarParser#file_input.
    def enterFile_input(self, ctx:my_grammarParser.File_inputContext):
        pass

    # Exit a parse tree produced by my_grammarParser#file_input.
    def exitFile_input(self, ctx:my_grammarParser.File_inputContext):
        pass


    # Enter a parse tree produced by my_grammarParser#stmt.
    def enterStmt(self, ctx:my_grammarParser.StmtContext):
        pass

    # Exit a parse tree produced by my_grammarParser#stmt.
    def exitStmt(self, ctx:my_grammarParser.StmtContext):
        pass


    # Enter a parse tree produced by my_grammarParser#simple_stmt.
    def enterSimple_stmt(self, ctx:my_grammarParser.Simple_stmtContext):
        pass

    # Exit a parse tree produced by my_grammarParser#simple_stmt.
    def exitSimple_stmt(self, ctx:my_grammarParser.Simple_stmtContext):
        pass


    # Enter a parse tree produced by my_grammarParser#small_stmt.
    def enterSmall_stmt(self, ctx:my_grammarParser.Small_stmtContext):
        pass

    # Exit a parse tree produced by my_grammarParser#small_stmt.
    def exitSmall_stmt(self, ctx:my_grammarParser.Small_stmtContext):
        pass


    # Enter a parse tree produced by my_grammarParser#expr_stmt.
    def enterExpr_stmt(self, ctx:my_grammarParser.Expr_stmtContext):
        pass

    # Exit a parse tree produced by my_grammarParser#expr_stmt.
    def exitExpr_stmt(self, ctx:my_grammarParser.Expr_stmtContext):
        pass


    # Enter a parse tree produced by my_grammarParser#assign_expr.
    def enterAssign_expr(self, ctx:my_grammarParser.Assign_exprContext):
        pass

    # Exit a parse tree produced by my_grammarParser#assign_expr.
    def exitAssign_expr(self, ctx:my_grammarParser.Assign_exprContext):
        pass


    # Enter a parse tree produced by my_grammarParser#testlist_star_expr.
    def enterTestlist_star_expr(self, ctx:my_grammarParser.Testlist_star_exprContext):
        pass

    # Exit a parse tree produced by my_grammarParser#testlist_star_expr.
    def exitTestlist_star_expr(self, ctx:my_grammarParser.Testlist_star_exprContext):
        pass


    # Enter a parse tree produced by my_grammarParser#augassign.
    def enterAugassign(self, ctx:my_grammarParser.AugassignContext):
        pass

    # Exit a parse tree produced by my_grammarParser#augassign.
    def exitAugassign(self, ctx:my_grammarParser.AugassignContext):
        pass


    # Enter a parse tree produced by my_grammarParser#test.
    def enterTest(self, ctx:my_grammarParser.TestContext):
        pass

    # Exit a parse tree produced by my_grammarParser#test.
    def exitTest(self, ctx:my_grammarParser.TestContext):
        pass


    # Enter a parse tree produced by my_grammarParser#or_test.
    def enterOr_test(self, ctx:my_grammarParser.Or_testContext):
        pass

    # Exit a parse tree produced by my_grammarParser#or_test.
    def exitOr_test(self, ctx:my_grammarParser.Or_testContext):
        pass


    # Enter a parse tree produced by my_grammarParser#and_test.
    def enterAnd_test(self, ctx:my_grammarParser.And_testContext):
        pass

    # Exit a parse tree produced by my_grammarParser#and_test.
    def exitAnd_test(self, ctx:my_grammarParser.And_testContext):
        pass


    # Enter a parse tree produced by my_grammarParser#not_test.
    def enterNot_test(self, ctx:my_grammarParser.Not_testContext):
        pass

    # Exit a parse tree produced by my_grammarParser#not_test.
    def exitNot_test(self, ctx:my_grammarParser.Not_testContext):
        pass


    # Enter a parse tree produced by my_grammarParser#comparison.
    def enterComparison(self, ctx:my_grammarParser.ComparisonContext):
        pass

    # Exit a parse tree produced by my_grammarParser#comparison.
    def exitComparison(self, ctx:my_grammarParser.ComparisonContext):
        pass


    # Enter a parse tree produced by my_grammarParser#comp_op.
    def enterComp_op(self, ctx:my_grammarParser.Comp_opContext):
        pass

    # Exit a parse tree produced by my_grammarParser#comp_op.
    def exitComp_op(self, ctx:my_grammarParser.Comp_opContext):
        pass


    # Enter a parse tree produced by my_grammarParser#star_expr.
    def enterStar_expr(self, ctx:my_grammarParser.Star_exprContext):
        pass

    # Exit a parse tree produced by my_grammarParser#star_expr.
    def exitStar_expr(self, ctx:my_grammarParser.Star_exprContext):
        pass


    # Enter a parse tree produced by my_grammarParser#expr.
    def enterExpr(self, ctx:my_grammarParser.ExprContext):
        pass

    # Exit a parse tree produced by my_grammarParser#expr.
    def exitExpr(self, ctx:my_grammarParser.ExprContext):
        pass


    # Enter a parse tree produced by my_grammarParser#xor_expr.
    def enterXor_expr(self, ctx:my_grammarParser.Xor_exprContext):
        pass

    # Exit a parse tree produced by my_grammarParser#xor_expr.
    def exitXor_expr(self, ctx:my_grammarParser.Xor_exprContext):
        pass


    # Enter a parse tree produced by my_grammarParser#and_expr.
    def enterAnd_expr(self, ctx:my_grammarParser.And_exprContext):
        pass

    # Exit a parse tree produced by my_grammarParser#and_expr.
    def exitAnd_expr(self, ctx:my_grammarParser.And_exprContext):
        pass


    # Enter a parse tree produced by my_grammarParser#shift_expr.
    def enterShift_expr(self, ctx:my_grammarParser.Shift_exprContext):
        pass

    # Exit a parse tree produced by my_grammarParser#shift_expr.
    def exitShift_expr(self, ctx:my_grammarParser.Shift_exprContext):
        pass


    # Enter a parse tree produced by my_grammarParser#arith_expr.
    def enterArith_expr(self, ctx:my_grammarParser.Arith_exprContext):
        pass

    # Exit a parse tree produced by my_grammarParser#arith_expr.
    def exitArith_expr(self, ctx:my_grammarParser.Arith_exprContext):
        pass


    # Enter a parse tree produced by my_grammarParser#term.
    def enterTerm(self, ctx:my_grammarParser.TermContext):
        pass

    # Exit a parse tree produced by my_grammarParser#term.
    def exitTerm(self, ctx:my_grammarParser.TermContext):
        pass


    # Enter a parse tree produced by my_grammarParser#factor.
    def enterFactor(self, ctx:my_grammarParser.FactorContext):
        pass

    # Exit a parse tree produced by my_grammarParser#factor.
    def exitFactor(self, ctx:my_grammarParser.FactorContext):
        pass


    # Enter a parse tree produced by my_grammarParser#power.
    def enterPower(self, ctx:my_grammarParser.PowerContext):
        pass

    # Exit a parse tree produced by my_grammarParser#power.
    def exitPower(self, ctx:my_grammarParser.PowerContext):
        pass


    # Enter a parse tree produced by my_grammarParser#atom_expr.
    def enterAtom_expr(self, ctx:my_grammarParser.Atom_exprContext):
        pass

    # Exit a parse tree produced by my_grammarParser#atom_expr.
    def exitAtom_expr(self, ctx:my_grammarParser.Atom_exprContext):
        pass


    # Enter a parse tree produced by my_grammarParser#trailer.
    def enterTrailer(self, ctx:my_grammarParser.TrailerContext):
        pass

    # Exit a parse tree produced by my_grammarParser#trailer.
    def exitTrailer(self, ctx:my_grammarParser.TrailerContext):
        pass


    # Enter a parse tree produced by my_grammarParser#arglist.
    def enterArglist(self, ctx:my_grammarParser.ArglistContext):
        pass

    # Exit a parse tree produced by my_grammarParser#arglist.
    def exitArglist(self, ctx:my_grammarParser.ArglistContext):
        pass


    # Enter a parse tree produced by my_grammarParser#argument.
    def enterArgument(self, ctx:my_grammarParser.ArgumentContext):
        pass

    # Exit a parse tree produced by my_grammarParser#argument.
    def exitArgument(self, ctx:my_grammarParser.ArgumentContext):
        pass


    # Enter a parse tree produced by my_grammarParser#compound_stmt.
    def enterCompound_stmt(self, ctx:my_grammarParser.Compound_stmtContext):
        pass

    # Exit a parse tree produced by my_grammarParser#compound_stmt.
    def exitCompound_stmt(self, ctx:my_grammarParser.Compound_stmtContext):
        pass


    # Enter a parse tree produced by my_grammarParser#while_stmt.
    def enterWhile_stmt(self, ctx:my_grammarParser.While_stmtContext):
        pass

    # Exit a parse tree produced by my_grammarParser#while_stmt.
    def exitWhile_stmt(self, ctx:my_grammarParser.While_stmtContext):
        pass


    # Enter a parse tree produced by my_grammarParser#for_stmt.
    def enterFor_stmt(self, ctx:my_grammarParser.For_stmtContext):
        pass

    # Exit a parse tree produced by my_grammarParser#for_stmt.
    def exitFor_stmt(self, ctx:my_grammarParser.For_stmtContext):
        pass


    # Enter a parse tree produced by my_grammarParser#range_func.
    def enterRange_func(self, ctx:my_grammarParser.Range_funcContext):
        pass

    # Exit a parse tree produced by my_grammarParser#range_func.
    def exitRange_func(self, ctx:my_grammarParser.Range_funcContext):
        pass


    # Enter a parse tree produced by my_grammarParser#funcdef.
    def enterFuncdef(self, ctx:my_grammarParser.FuncdefContext):
        pass

    # Exit a parse tree produced by my_grammarParser#funcdef.
    def exitFuncdef(self, ctx:my_grammarParser.FuncdefContext):
        pass


    # Enter a parse tree produced by my_grammarParser#parameters.
    def enterParameters(self, ctx:my_grammarParser.ParametersContext):
        pass

    # Exit a parse tree produced by my_grammarParser#parameters.
    def exitParameters(self, ctx:my_grammarParser.ParametersContext):
        pass


    # Enter a parse tree produced by my_grammarParser#typedargslist.
    def enterTypedargslist(self, ctx:my_grammarParser.TypedargslistContext):
        pass

    # Exit a parse tree produced by my_grammarParser#typedargslist.
    def exitTypedargslist(self, ctx:my_grammarParser.TypedargslistContext):
        pass


    # Enter a parse tree produced by my_grammarParser#variadicargs.
    def enterVariadicargs(self, ctx:my_grammarParser.VariadicargsContext):
        pass

    # Exit a parse tree produced by my_grammarParser#variadicargs.
    def exitVariadicargs(self, ctx:my_grammarParser.VariadicargsContext):
        pass


    # Enter a parse tree produced by my_grammarParser#tfpdef.
    def enterTfpdef(self, ctx:my_grammarParser.TfpdefContext):
        pass

    # Exit a parse tree produced by my_grammarParser#tfpdef.
    def exitTfpdef(self, ctx:my_grammarParser.TfpdefContext):
        pass


    # Enter a parse tree produced by my_grammarParser#yield_expr.
    def enterYield_expr(self, ctx:my_grammarParser.Yield_exprContext):
        pass

    # Exit a parse tree produced by my_grammarParser#yield_expr.
    def exitYield_expr(self, ctx:my_grammarParser.Yield_exprContext):
        pass


    # Enter a parse tree produced by my_grammarParser#testlist.
    def enterTestlist(self, ctx:my_grammarParser.TestlistContext):
        pass

    # Exit a parse tree produced by my_grammarParser#testlist.
    def exitTestlist(self, ctx:my_grammarParser.TestlistContext):
        pass


    # Enter a parse tree produced by my_grammarParser#lambdef.
    def enterLambdef(self, ctx:my_grammarParser.LambdefContext):
        pass

    # Exit a parse tree produced by my_grammarParser#lambdef.
    def exitLambdef(self, ctx:my_grammarParser.LambdefContext):
        pass


    # Enter a parse tree produced by my_grammarParser#subscriptlist.
    def enterSubscriptlist(self, ctx:my_grammarParser.SubscriptlistContext):
        pass

    # Exit a parse tree produced by my_grammarParser#subscriptlist.
    def exitSubscriptlist(self, ctx:my_grammarParser.SubscriptlistContext):
        pass


    # Enter a parse tree produced by my_grammarParser#comp_for.
    def enterComp_for(self, ctx:my_grammarParser.Comp_forContext):
        pass

    # Exit a parse tree produced by my_grammarParser#comp_for.
    def exitComp_for(self, ctx:my_grammarParser.Comp_forContext):
        pass


    # Enter a parse tree produced by my_grammarParser#if_stmt.
    def enterIf_stmt(self, ctx:my_grammarParser.If_stmtContext):
        pass

    # Exit a parse tree produced by my_grammarParser#if_stmt.
    def exitIf_stmt(self, ctx:my_grammarParser.If_stmtContext):
        pass


    # Enter a parse tree produced by my_grammarParser#suite.
    def enterSuite(self, ctx:my_grammarParser.SuiteContext):
        pass

    # Exit a parse tree produced by my_grammarParser#suite.
    def exitSuite(self, ctx:my_grammarParser.SuiteContext):
        pass


    # Enter a parse tree produced by my_grammarParser#subscript.
    def enterSubscript(self, ctx:my_grammarParser.SubscriptContext):
        pass

    # Exit a parse tree produced by my_grammarParser#subscript.
    def exitSubscript(self, ctx:my_grammarParser.SubscriptContext):
        pass


    # Enter a parse tree produced by my_grammarParser#exprlist.
    def enterExprlist(self, ctx:my_grammarParser.ExprlistContext):
        pass

    # Exit a parse tree produced by my_grammarParser#exprlist.
    def exitExprlist(self, ctx:my_grammarParser.ExprlistContext):
        pass



del my_grammarParser