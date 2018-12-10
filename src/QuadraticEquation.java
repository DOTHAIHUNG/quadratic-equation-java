import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        double aPut = sc.nextDouble();
        System.out.println("Enter b");
        double bPut = sc.nextDouble();
        System.out.println("Enter c");
        double cPut = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(aPut, bPut, cPut);
        if (equation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        }
        if (equation.getDiscriminant() == 0) {
            System.out.println("The equation has one root " + equation.getRoot1());
        }
        if (equation.getDiscriminant() > 0) {
            System.out.println("The equation has two roots " + equation.getRoot1() + " " + equation.getRoot2());
        }
    }
}
