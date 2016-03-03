package org.khanhpdt.designpatterns.visitor;

public class IntegerOperand implements Operand {
    @Override
    public void accept(OperationVisitor v) {
        v.visit(this);
    }

    public int intValue() {
        return 10;
    }
}
