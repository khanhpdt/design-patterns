package vn.khanhpdt.playgrounds.designpatterns.visitor;

class IntegerOperand implements Operand {

	@Override
	public void accept(OperationVisitor v) {
		v.visit(this);
	}

	int intValue() {
		return 10;
	}

}
