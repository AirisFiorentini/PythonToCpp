from my_grammarVisitor import my_grammarVisitor
from my_grammarParser import my_grammarParser

class PythonToCppVisitor(my_grammarVisitor):
    def visitFile_input(self, ctx:my_grammarParser.File_inputContext):
        result = ""
        for stmt in ctx.stmt():
            result += self.visit(stmt)

        return result

    def visitFuncdef(self, ctx:my_grammarParser.FuncdefContext):
        name = ctx.NAME().getText()
        args = self.visit(ctx.parameters())
        body = self.visit(ctx.suite())

        return f"void {name}({args}) {{\n{body}}}\n"

    def visitParameters(self, ctx:my_grammarParser.ParametersContext):
        args = []
        for typedargslist in ctx.typedargslist():
            for i, arg in enumerate(typedargslist.tfpdef()):
                if i == 0:
                    args.append(f"{arg.getText()}")
                else:
                    args.append(f", {arg.getText()}")

        return "".join(args)

    def visitSuite(self, ctx:my_grammarParser.SuiteContext):
        result = ""
        for stmt in ctx.stmt():
            result += self.visit(stmt)

        return result

    def visitStmt(self, ctx:my_grammarParser.StmtContext):
        if ctx.simple_stmt():
            return self.visit(ctx.simple_stmt())
        elif ctx.compound_stmt():
            return self.visit(ctx.compound_stmt())

    def visitSimple_stmt(self, ctx:my_grammarParser.Simple_stmtContext):
        result = ""
        for small_stmt in ctx.small_stmt():
            result += self.visit(small_stmt)

        return result

    def visitSmall_stmt(self, ctx:my_grammarParser.Small_stmtContext):
        if ctx.expr_stmt():
            return self.visit(ctx.expr_stmt())

    def visitExpr_stmt(self, ctx:my_grammarParser.Expr_stmtContext):
        result = ""
        for i, testlist_star_expr in enumerate(ctx.testlist_star_expr()):
            if i > 0:
                result += ", "

            result += self.visit(testlist_star_expr)

        if ctx.augassign():
            result += " " + self.visit(ctx.augassign()) + "= " + self.visit(ctx.testlist_star_expr()[-1])
        else:
            result += " = " + self.visit(ctx.testlist_star_expr()[-1])

        result += ";\n"

        return result

    def visitTestlist_star_expr(self, ctx:my_grammarParser.Testlist_star_exprContext):
        result = ""
        for i, test in enumerate(ctx.test()):
            if i > 0:
                result += ", "

            result += self.visit(test)

        return result

    def visitAugassign(self, ctx:my_grammarParser.AugassignContext):
        if ctx.ADD_ASSIGN():
            return "+"
        elif ctx.SUB_ASSIGN():
            return "-"
        elif ctx.MULT_ASSIGN():
            return "*"
        elif ctx.DIV_ASSIGN():
            return "/"
        elif ctx.MOD_ASSIGN():
            return "%"
        elif ctx.AND_ASSIGN():
            return "&"
        elif ctx.OR_ASSIGN():
            return "|"
        elif ctx.XOR_ASSIGN():
            return "^"
        elif ctx.LEFT_SHIFT_ASSIGN():
            return "<<"
        elif ctx.RIGHT_SHIFT_ASSIGN():
            return ">>"
        elif ctx.POWER_ASSIGN():
            return "**"
        elif ctx.IDIV_ASSIGN():
            return "//"