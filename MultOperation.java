
public class MultOperation extends BinOperation {

    MultOperation (Expression value, Expression valu) {
        super(value,valu);
    }

    protected double doCalculate(double e, double f ) {
        double r=value.calculate();
        double c=valu.calculate();
        return(r*c);
    }

    protected String dotoString(Expression n, Expression t){
        return value+"*"+valu;
    }
}
