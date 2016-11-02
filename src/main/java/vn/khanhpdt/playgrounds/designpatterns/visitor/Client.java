package vn.khanhpdt.playgrounds.designpatterns.visitor;

public class Client {

    public static void main(String[] args) {
        Operand operand = new BigDecimalOperand();

        DoubleOperationVisitor doubleOperationVisitor = new DoubleOperationVisitor();

        operand.accept(doubleOperationVisitor);
    }

}
