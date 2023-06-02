# Generated from GP.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .GPParser import GPParser
else:
    from GPParser import GPParser

# This class defines a complete generic visitor for a parse tree produced by GPParser.

class GPVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by GPParser#program.
    def visitProgram(self, ctx:GPParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GPParser#ifStmt.
    def visitIfStmt(self, ctx:GPParser.IfStmtContext):
        
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GPParser#forStmt.
    def visitForStmt(self, ctx:GPParser.ForStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GPParser#whileStmt.
    def visitWhileStmt(self, ctx:GPParser.WhileStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GPParser#functionDef.
    def visitFunctionDef(self, ctx:GPParser.FunctionDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GPParser#functionCall.
    def visitFunctionCall(self, ctx:GPParser.FunctionCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GPParser#assign.
    def visitAssign(self, ctx:GPParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GPParser#exprStmt.
    def visitExprStmt(self, ctx:GPParser.ExprStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GPParser#parens.
    def visitParens(self, ctx:GPParser.ParensContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GPParser#intExpr.
    def visitIntExpr(self, ctx:GPParser.IntExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GPParser#addExpr.
    def visitAddExpr(self, ctx:GPParser.AddExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GPParser#divExpr.
    def visitDivExpr(self, ctx:GPParser.DivExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GPParser#subExpr.
    def visitSubExpr(self, ctx:GPParser.SubExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GPParser#multExpr.
    def visitMultExpr(self, ctx:GPParser.MultExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GPParser#idExpr.
    def visitIdExpr(self, ctx:GPParser.IdExprContext):
        return self.visitChildren(ctx)



del GPParser