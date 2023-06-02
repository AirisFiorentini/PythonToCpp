# Generated from my_grammar.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .my_grammarParser import my_grammarParser
else:
    from my_grammarParser import my_grammarParser

# This class defines a complete generic visitor for a parse tree produced by my_grammarParser.

class my_grammarVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by my_grammarParser#file_input.
    def visitFile_input(self, ctx:my_grammarParser.File_inputContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#stmt.
    def visitStmt(self, ctx:my_grammarParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#simple_stmt.
    def visitSimple_stmt(self, ctx:my_grammarParser.Simple_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#small_stmt.
    def visitSmall_stmt(self, ctx:my_grammarParser.Small_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#expr_stmt.
    def visitExpr_stmt(self, ctx:my_grammarParser.Expr_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#assign_expr.
    def visitAssign_expr(self, ctx:my_grammarParser.Assign_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#testlist_star_expr.
    def visitTestlist_star_expr(self, ctx:my_grammarParser.Testlist_star_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#augassign.
    def visitAugassign(self, ctx:my_grammarParser.AugassignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#test.
    def visitTest(self, ctx:my_grammarParser.TestContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#or_test.
    def visitOr_test(self, ctx:my_grammarParser.Or_testContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#and_test.
    def visitAnd_test(self, ctx:my_grammarParser.And_testContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#not_test.
    def visitNot_test(self, ctx:my_grammarParser.Not_testContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#comparison.
    def visitComparison(self, ctx:my_grammarParser.ComparisonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#comp_op.
    def visitComp_op(self, ctx:my_grammarParser.Comp_opContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#star_expr.
    def visitStar_expr(self, ctx:my_grammarParser.Star_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#expr.
    def visitExpr(self, ctx:my_grammarParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#xor_expr.
    def visitXor_expr(self, ctx:my_grammarParser.Xor_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#and_expr.
    def visitAnd_expr(self, ctx:my_grammarParser.And_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#shift_expr.
    def visitShift_expr(self, ctx:my_grammarParser.Shift_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#arith_expr.
    def visitArith_expr(self, ctx:my_grammarParser.Arith_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#term.
    def visitTerm(self, ctx:my_grammarParser.TermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#factor.
    def visitFactor(self, ctx:my_grammarParser.FactorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#power.
    def visitPower(self, ctx:my_grammarParser.PowerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#atom_expr.
    def visitAtom_expr(self, ctx:my_grammarParser.Atom_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#trailer.
    def visitTrailer(self, ctx:my_grammarParser.TrailerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#arglist.
    def visitArglist(self, ctx:my_grammarParser.ArglistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#argument.
    def visitArgument(self, ctx:my_grammarParser.ArgumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#compound_stmt.
    def visitCompound_stmt(self, ctx:my_grammarParser.Compound_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#while_stmt.
    def visitWhile_stmt(self, ctx:my_grammarParser.While_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#for_stmt.
    def visitFor_stmt(self, ctx:my_grammarParser.For_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#range_func.
    def visitRange_func(self, ctx:my_grammarParser.Range_funcContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#funcdef.
    def visitFuncdef(self, ctx:my_grammarParser.FuncdefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#parameters.
    def visitParameters(self, ctx:my_grammarParser.ParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#typedargslist.
    def visitTypedargslist(self, ctx:my_grammarParser.TypedargslistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#variadicargs.
    def visitVariadicargs(self, ctx:my_grammarParser.VariadicargsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#tfpdef.
    def visitTfpdef(self, ctx:my_grammarParser.TfpdefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#yield_expr.
    def visitYield_expr(self, ctx:my_grammarParser.Yield_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#testlist.
    def visitTestlist(self, ctx:my_grammarParser.TestlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#lambdef.
    def visitLambdef(self, ctx:my_grammarParser.LambdefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#subscriptlist.
    def visitSubscriptlist(self, ctx:my_grammarParser.SubscriptlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#comp_for.
    def visitComp_for(self, ctx:my_grammarParser.Comp_forContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#if_stmt.
    def visitIf_stmt(self, ctx:my_grammarParser.If_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#suite.
    def visitSuite(self, ctx:my_grammarParser.SuiteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#subscript.
    def visitSubscript(self, ctx:my_grammarParser.SubscriptContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#exprlist.
    def visitExprlist(self, ctx:my_grammarParser.ExprlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#print_statement.
    def visitPrint_statement(self, ctx:my_grammarParser.Print_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by my_grammarParser#expression.
    def visitExpression(self, ctx:my_grammarParser.ExpressionContext):
        return self.visitChildren(ctx)



del my_grammarParser