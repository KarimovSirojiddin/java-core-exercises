package begins;

import java.util.Scanner;

public class Begin09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        float a = scanner.nextFloat();
        System.out.print("b: ");
        float b = scanner.nextFloat();

        double ad = Math.sqrt(a * b);
        System.out.println("Geometrical mean = " + ad);
    }
}
