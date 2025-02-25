package begins;

import java.util.Scanner;

public class Begin06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        float a = scanner.nextFloat();

        System.out.print("b: ");
        float b = scanner.nextFloat();

        System.out.print("c: ");
        float c = scanner.nextFloat();

        float V = a * b * c;
        float s = 2 * (a * b + b * c + a * c);

        System.out.println("Volume = " + V);
        System.out.println("Square = " + s);
    }
}
