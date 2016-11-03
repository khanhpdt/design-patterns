package vn.khanhpdt.playgrounds.designpatterns.visitor;

import java.math.BigDecimal;

class BigDecimalOperand implements Operand {

	@Override
	public void accept(OperationVisitor v) {
		v.visit(this);
	}

	BigDecimal bigDecimalValue() {
		return BigDecimal.TEN;
	}

}
