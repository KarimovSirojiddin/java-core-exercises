package begins;

import java.util.Scanner;

public class Begin39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        float a = scanner.nextFloat();
        System.out.print("b = ");
        float b = scanner.nextFloat();
        System.out.print("c = ");
        float c = scanner.nextFloat();

        double d = Math.sqrt(b * b - 4 * a * c);
        double x1 = (-b + d) / 2 * a;
        double x2 = (-b - d) / 2 * a;

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
