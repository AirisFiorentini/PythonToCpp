# Generated from GP.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GPParser import GPParser
else:
    from GPParser import GPParser

# This class defines a complete listener for a parse tree produced by GPParser.
class GPListener(ParseTreeListener):

    # Enter a parse tree produced by GPParser#program.
    def enterProgram(self, ctx:GPParser.ProgramContext):
        pass

    # Exit a parse tree produced by GPParser#program.
    def exitProgram(self, ctx:GPParser.ProgramContext):
        pass


    # Enter a parse tree produced by GPParser#ifStmt.
    def enterIfStmt(self, ctx:GPParser.IfStmtContext):
        pass

    # Exit a parse tree produced by GPParser#ifStmt.
    def exitIfStmt(self, ctx:GPParser.IfStmtContext):
        pass


    # Enter a parse tree produced by GPParser#forStmt.
    def enterForStmt(self, ctx:GPParser.ForStmtContext):
        pass

    # Exit a parse tree produced by GPParser#forStmt.
    def exitForStmt(self, ctx:GPParser.ForStmtContext):
        pass


    # Enter a parse tree produced by GPParser#whileStmt.
    def enterWhileStmt(self, ctx:GPParser.WhileStmtContext):
        pass

    # Exit a parse tree produced by GPParser#whileStmt.
    def exitWhileStmt(self, ctx:GPParser.WhileStmtContext):
        pass


    # Enter a parse tree produced by GPParser#functionDef.
    def enterFunctionDef(self, ctx:GPParser.FunctionDefContext):
        pass

    # Exit a parse tree produced by GPParser#functionDef.
    def exitFunctionDef(self, ctx:GPParser.FunctionDefContext):
        pass


    # Enter a parse tree produced by GPParser#functionCall.
    def enterFunctionCall(self, ctx:GPParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by GPParser#functionCall.
    def exitFunctionCall(self, ctx:GPParser.FunctionCallContext):
        pass


    # Enter a parse tree produced by GPParser#assign.
    def enterAssign(self, ctx:GPParser.AssignContext):
        pass

    # Exit a parse tree produced by GPParser#assign.
    def exitAssign(self, ctx:GPParser.AssignContext):
        pass


    # Enter a parse tree produced by GPParser#exprStmt.
    def enterExprStmt(self, ctx:GPParser.ExprStmtContext):
        pass

    # Exit a parse tree produced by GPParser#exprStmt.
    def exitExprStmt(self, ctx:GPParser.ExprStmtContext):
        pass


    # Enter a parse tree produced by GPParser#stringExpr.
    def enterStringExpr(self, ctx:GPParser.StringExprContext):
        pass

    # Exit a parse tree produced by GPParser#stringExpr.
    def exitStringExpr(self, ctx:GPParser.StringExprContext):
        pass


    # Enter a parse tree produced by GPParser#parens.
    def enterParens(self, ctx:GPParser.ParensContext):
        pass

    # Exit a parse tree produced by GPParser#parens.
    def exitParens(self, ctx:GPParser.ParensContext):
        pass


    # Enter a parse tree produced by GPParser#intExpr.
    def enterIntExpr(self, ctx:GPParser.IntExprContext):
        pass

    # Exit a parse tree produced by GPParser#intExpr.
    def exitIntExpr(self, ctx:GPParser.IntExprContext):
        pass


    # Enter a parse tree produced by GPParser#addExpr.
    def enterAddExpr(self, ctx:GPParser.AddExprContext):
        pass

    # Exit a parse tree produced by GPParser#addExpr.
    def exitAddExpr(self, ctx:GPParser.AddExprContext):
        pass


    # Enter a parse tree produced by GPParser#divExpr.
    def enterDivExpr(self, ctx:GPParser.DivExprContext):
        pass

    # Exit a parse tree produced by GPParser#divExpr.
    def exitDivExpr(self, ctx:GPParser.DivExprContext):
        pass


    # Enter a parse tree produced by GPParser#subExpr.
    def enterSubExpr(self, ctx:GPParser.SubExprContext):
        pass

    # Exit a parse tree produced by GPParser#subExpr.
    def exitSubExpr(self, ctx:GPParser.SubExprContext):
        pass


    # Enter a parse tree produced by GPParser#multExpr.
    def enterMultExpr(self, ctx:GPParser.MultExprContext):
        pass

    # Exit a parse tree produced by GPParser#multExpr.
    def exitMultExpr(self, ctx:GPParser.MultExprContext):
        pass


    # Enter a parse tree produced by GPParser#idExpr.
    def enterIdExpr(self, ctx:GPParser.IdExprContext):
        pass

    # Exit a parse tree produced by GPParser#idExpr.
    def exitIdExpr(self, ctx:GPParser.IdExprContext):
        pass


    # Enter a parse tree produced by GPParser#param.
    def enterParam(self, ctx:GPParser.ParamContext):
        pass

    # Exit a parse tree produced by GPParser#param.
    def exitParam(self, ctx:GPParser.ParamContext):
        pass


    # Enter a parse tree produced by GPParser#arg.
    def enterArg(self, ctx:GPParser.ArgContext):
        pass

    # Exit a parse tree produced by GPParser#arg.
    def exitArg(self, ctx:GPParser.ArgContext):
        pass



del GPParser