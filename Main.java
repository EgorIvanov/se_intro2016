public class Main {

    public static void main(String[] args) {
        Expression l= new SumOperation((new MultOperation((new SumOperation(new Value(2), new Value(3))),(new Value(-10)))),(new SqrOperation(new Value(5))));
        System.out.println(l.calculate());
        System.out.println(l.toString());}
}
