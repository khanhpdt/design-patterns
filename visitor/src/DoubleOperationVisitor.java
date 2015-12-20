import java.math.BigDecimal;

public class DoubleOperationVisitor implements OperationVisitor {
    @Override
    public void visit(BigDecimalOperand c) {
        System.out.println("Double BigDecimal Operand: " + (c.bigDecimalValue().multiply(new BigDecimal("2"))));
    }

    @Override
    public void visit(IntegerOperand c) {
        System.out.println("Double Integer Operand: " + (c.intValue() * 2));
    }
}
