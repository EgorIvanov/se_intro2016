/**
 * Created by Admin2 on 18.11.2016.
 */
public abstract class UnOperation implements Expression {
    protected Expression value;

    public UnOperation(Expression value) {

        this.value = value;
    }
    public double calculate() {

        return doCalculate(value);
    }
    protected abstract double doCalculate(Expression e);

    public String toString() {
        return dotoString(value);
    }

    protected abstract String dotoString(Expression n);

}
