package org.khanhpdt.designpatterns.visitor;

import java.math.BigDecimal;

public class BigDecimalOperand implements Operand {
    @Override
    public void accept(OperationVisitor v) {
        v.visit(this);
    }

    public BigDecimal bigDecimalValue() {
        return BigDecimal.TEN;
    }
}
