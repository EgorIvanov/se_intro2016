
    public class AbsOperation extends UnOperation {

        public AbsOperation(Expression value) {
            super(value);
        }
        protected double
        doCalculate(Expression e) {
            double v=value.calculate();
            if (v>0) {
                return (v);
            }
            return(-v);
        }
        protected String dotoString(Expression n){
            return "|"+value+"|";
        }
    }


