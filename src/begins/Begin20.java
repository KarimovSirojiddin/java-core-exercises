package begins;

import java.util.Scanner;

public class Begin20 {
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

        System.out.println(Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))));
    }
}
