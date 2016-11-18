public abstract class BinOperation implements Expression {
    protected Expression value;
    protected Expression valu;

    protected BinOperation(Expression value, Expression valu){
        this.value=value;
        this.valu=valu;
    }

    public double calculate() {

        return doCalculate(value.calculate(),valu.calculate());
    }

    protected abstract double doCalculate (double e, double f);

    public String toString() {
        return dotoString(value,valu);
    }

    protected abstract String dotoString(Expression n, Expression t);
}

