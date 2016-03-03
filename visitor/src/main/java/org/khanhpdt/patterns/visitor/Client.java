package org.khanhpdt.patterns.visitor;

public class Client {

    public static void main(String[] args) {
        Operand operand = new BigDecimalOperand();

        DoubleOperationVisitor doubleOperationVisitor = new DoubleOperationVisitor();

        operand.accept(doubleOperationVisitor);
    }

}
