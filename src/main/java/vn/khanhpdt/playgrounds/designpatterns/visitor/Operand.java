package vn.khanhpdt.playgrounds.designpatterns.visitor;

interface Operand {

	void accept(OperationVisitor v);

}
