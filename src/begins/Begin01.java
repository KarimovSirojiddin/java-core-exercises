package begins;

import java.util.Scanner;

public class Begin01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        float a = scanner.nextFloat();

        float p = 4 * a;
        System.out.println("Perimeter = " + p);
    }
}
