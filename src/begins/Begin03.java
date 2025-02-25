package begins;

import java.util.Scanner;

public class Begin03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        float a = scanner.nextFloat();
        System.out.print("b: ");
        float b = scanner.nextFloat();

        float s = a * b;
        float p = 2 * (a + b);

        System.out.println("Square = " + s);
        System.out.println("Perimeter = " + p);
    }
}
