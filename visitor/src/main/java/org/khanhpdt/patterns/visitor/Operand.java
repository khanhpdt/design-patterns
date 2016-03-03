package org.khanhpdt.patterns.visitor;

public interface Operand {
    void accept(OperationVisitor v);
}
