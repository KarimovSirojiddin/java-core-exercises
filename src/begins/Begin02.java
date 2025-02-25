package begins;

import java.util.Scanner;

public class Begin02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        float a = scanner.nextFloat();

        float s = a * a;
        System.out.println("Square = " + s);
    }
}
