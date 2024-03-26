import java.util.Scanner;

public class ArithmeticGeometricSeries {
    int definiteNumber = 0;
    int a = 1;

    public static void main(String args[]) {
        ArithmeticGeometricSeries ag = new ArithmeticGeometricSeries();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Definite value: ");
        ag.definiteNumber = sc.nextInt();
        System.out.println("Arithmetic Series: " + ag.arithmeticSeries());
        System.out.println("Geometric Series: " + ag.geometricSeries());
    }

    public String arithmeticSeries() {
        String arithmetic = a + "," + (a + definiteNumber) + "," + (a + 2 * definiteNumber) + "," + (a + 3 * definiteNumber) + ",...";
        return arithmetic;
    }

    public String geometricSeries() {
        String geometric = a + "," + (a * definiteNumber) + "," + (a * definiteNumber * definiteNumber) + ","
                + (a * definiteNumber * definiteNumber * definiteNumber) + ",...";
        return geometric;
    }
}
