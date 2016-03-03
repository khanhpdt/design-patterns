package org.khanhpdt.designpatterns.visitor;

public interface Operand {
    void accept(OperationVisitor v);
}
