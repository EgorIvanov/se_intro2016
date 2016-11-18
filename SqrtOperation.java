/**
 * Created by Admin2 on 18.11.2016.
 */
public class SqrtOperation extends UnOperation {
    public SqrtOperation(Expression value) {
        super(value);
    }

    protected double
    doCalculate(Expression e) {
        double v = value.calculate();
        return Math.sqrt(v);
    }

    protected String dotoString(Expression n) {
        return "sqrt("+value+")";
    }
}

