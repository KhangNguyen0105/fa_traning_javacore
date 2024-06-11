import java.lang.Math;
import java.util.Scanner;

public class Quadratic {
    private double a;
    private double b;
    private double c;

    public Quadratic() {

    }

    public boolean checkA(double a) {
        if (a == 0)
            return false;
        return true;
    }

    public Quadratic(double a) {
            this.a = a;
            this.b = 0;
            this.c = 0;
    }

    public Quadratic(double a, double b) {
            this.a = a;
            this.b = b;
            this.c = 0;
    }

    public Quadratic(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public double delta() {
        return b * b - 4 * a * c;
    }

    public void solve() {
        System.out.println("(" + a + "^2)*x + " + b + "*x + " + c + " = 0");
        if (!checkA(a)) {
            System.out.println("Invalid value of a");
            return;
        }
        if (delta() < 0) {
            System.out.println("The equation has no solution");
            return;
        }          
        if (delta() == 0) {
            double x = -b / (2*a);
            System.out.println("x = " + x);
        }
        if (delta() > 0) {
            double x1 = (-b + Math.sqrt(delta())) / (2*a);
            double x2 = (-b - Math.sqrt(delta())) / (2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients of the quadratic equation");
        System.out.print("a = "); double a = sc.nextDouble();
        System.out.print("b = "); double b = sc.nextDouble();
        System.out.print("c = "); double c = sc.nextDouble();

        Quadratic f = new Quadratic(a, b, c);
        f.solve();

        sc.close();
    }
}
