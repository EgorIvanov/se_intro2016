
public class Value implements Expression{
    double value;

    public Value (double value) {
        this.value=value;
    }

    public double calculate() {
        return value;
    }

    public String toString() {
        if (value > 0) {
            return "" + value;
        }
        return "("+value+")";
    }
}

