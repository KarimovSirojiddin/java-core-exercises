package begins;

import java.util.Scanner;

public class Begin05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        float a = scanner.nextFloat();

        float v = a * a * a;
        float s = 6 * a * a;
        System.out.println("Volume = " + v);
        System.out.println("Square = " + s);
    }
}
