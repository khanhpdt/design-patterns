package org.khanhpdt.designpatterns.visitor;

public interface OperationVisitor {
    void visit(BigDecimalOperand c);
    void visit(IntegerOperand concreteOperandB);
}
