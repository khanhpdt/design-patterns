package vn.khanhpdt.playgrounds.designpatterns.visitor;

interface OperationVisitor {

	void visit(BigDecimalOperand c);

	void visit(IntegerOperand concreteOperandB);

}
