package begins;

import java.util.Scanner;

public class Begin21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        float a = scanner.nextFloat();
        System.out.print("b: ");
        float b = scanner.nextFloat();

        float c = a;
        a = b;
        b = c;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
