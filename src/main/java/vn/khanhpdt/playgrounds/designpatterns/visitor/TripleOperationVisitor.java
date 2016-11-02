package vn.khanhpdt.playgrounds.designpatterns.visitor;

import java.math.BigDecimal;

public class TripleOperationVisitor implements OperationVisitor {
    @Override
    public void visit(BigDecimalOperand c) {
        System.out.println("Triple BigDecimal Operand: " + (c.bigDecimalValue().multiply(new BigDecimal("3"))));
    }

    @Override
    public void visit(IntegerOperand c) {
        System.out.println("Triple Integer Operand: " + (c.intValue() * 3));
    }
}
