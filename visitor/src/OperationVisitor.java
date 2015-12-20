public interface OperationVisitor {
    void visit(BigDecimalOperand c);
    void visit(IntegerOperand concreteOperandB);
}
