package begins;

import java.util.Scanner;

public class Begin10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        float a = scanner.nextFloat();
        System.out.print("b: ");
        float b = scanner.nextFloat();

        float s = (a * a) + (b * b);
        float d = (a * a) - (b * b);
        float p = (a * a) * (b * b);
        float q = (a * a) / (b * b);

        System.out.println("Sum = " + s);
        System.out.println("Difference = " + d);
        System.out.println("Product = " + p);
        System.out.println("Quotient = " + q);
    }
}
