
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Размерность:");
        int dim = console.nextInt();
        double[][] cord = new double[dim][dim];
        System.out.println("Кол-во векторов");
        int kolvo = console.nextInt();
        for (int i = 0; i < dim; i++ ) {
            System.out.println("Координаты" + i + "вектора");
            for (int j = 0; j < dim; j++) {
                cord[i][j] = console.nextDouble();
            }
        }
        Vector1 h = new Vector1(dim, cord);
        System.out.println("1 - сложение, 2 - вычитание, 3 - вычисление нормы, 4 - скалярное произведение, 5 - умножение на константу");
        System.out.println("Номер операции");
        int c = console.nextInt();
        switch(c) {
            case 1:
                h.plus(cord,kolvo);
                break;
            case 2:
                h.minus(cord,kolvo);
                break;
            case 3:
                System.out.print("Номер вектора среди введенных");
                int j = console.nextInt();
                h.modul(cord,j);
                break;
            case 4:
                h.scal(cord, kolvo);
                break;
            case 5:
                System.out.print("Номер вектора среди введенных");
                int j1 = console.nextInt();
                System.out.print("Константа:");
                double b = console.nextDouble();
                h.mult(cord,b,j1);
                break;
        }
    }
}
