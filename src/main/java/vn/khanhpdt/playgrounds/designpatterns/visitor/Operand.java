package vn.khanhpdt.playgrounds.designpatterns.visitor;

public interface Operand {
    void accept(OperationVisitor v);
}
