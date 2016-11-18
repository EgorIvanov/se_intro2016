public class SqrOperation extends UnOperation {
    public SqrOperation(Expression value) {
        super(value);
    }

    protected double doCalculate(Expression e) {
        double v = value.calculate();
        return v * v;
    }

    protected String dotoString(Expression n){
        return "("+value+"^"+"2)";
    }
}
