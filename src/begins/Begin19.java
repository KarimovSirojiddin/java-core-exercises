package begins;

import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x1: ");
        float x1 = scanner.nextFloat();
        System.out.print("y1: ");
        float y1 = scanner.nextFloat();

        System.out.print("x2: ");
        float x2 = scanner.nextFloat();
        System.out.print("y2: ");
        float y2 = scanner.nextFloat();

        float a = Math.abs(x2 - x1);
        float b = Math.abs(y2 - y1);

        float area = a * b;
        float p = 2 * (a + b);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + p);
    }
}
