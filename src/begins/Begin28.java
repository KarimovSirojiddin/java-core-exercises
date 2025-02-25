package begins;

import java.util.Scanner;

public class Begin28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        float x = scanner.nextFloat();

        float a = x * x * x;
        float b = a * a;
        b = b * b * x;

        System.out.println(b);
    }
}
