from CalcVisitor import CalcVisitor

class EvalVisitor(CalcVisitor):

    # Visita la regla: prog : expr EOF
    def visitProg(self, ctx):
        print("Estoy en visitProg")
        return self.visit(ctx.expr())

    # Visit a parse tree produced by CalcParser#Numero.
    def visitNumero(self, ctx):
        print ("Estoy en visitNum")
        return float(ctx.NUM().getText())

        return 0

    def visitSumRes(self, ctx):
        print("Estoy en visitSumRes")   
        izq = self.visit(ctx.expr(0))
        der = self.visit(ctx.expr(1))
        if ctx.op.text == '+':
            return izq + der
        else:
            return izq - der