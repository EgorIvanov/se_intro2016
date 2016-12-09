import java.util.Arrays;

public class Vector1 {
    private int dim;
    private double[][] cord = new double[dim][dim];

    public Vector1(int dim, double[][] cord) {
        this.dim = dim;
        this.cord = cord;
    }

    double[] plus(double[][] cord, int kolvo) {
        double[] plus = new double[dim];
        for (int j = 0; j < kolvo; j++) {
            for (int i = 0; i < dim; i++) {
                plus[j] = plus[j] + cord[j][i];
            }
        }
        System.out.print(Arrays.toString(plus));
        return plus;
    }


    double[] minus(double[][] cord, int kolvo) {
        double[] minus = new double[dim];
        cord[1][1] = -cord[1][1];
        for (int j = 0; j < kolvo; j++) {
            for (int i = 1; i < dim; i++) {
                minus[j] = minus[j] - cord[j][i];
            }
        }
        System.out.print(Arrays.toString(minus));
        return minus;
    }

    double[] mult(double[][] cord, double con, int j) {
        double[] mult = new double[dim];
        for (int i = 1; i < dim; i++) {
            mult[i] = cord[j][i] * con;
        }
        System.out.print(Arrays.toString(mult));
        return mult;
    }

    double modul(double[][] cord, int j) {
        double modul = 0;
        for (int i = 1; i < dim; i++) {
            modul = +cord[j][i] * cord[j][i];
        }
        modul = Math.sqrt(modul);
        System.out.print(modul);
        return modul;
    }

    double scal(double[][] cord, int kolvo) {
        double scal = 0;
        for (int j = 0; j < dim; j++) {
            for (int i = 1; i < dim; i++) {
                scal = +cord[j][i] * cord[j][i];
            }
        }
        System.out.print(scal);
        return scal;
    }
}


