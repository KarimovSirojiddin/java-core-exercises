package begins;

import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x1: ");
        float x1 = scanner.nextFloat();
        System.out.print("x2: ");
        float x2 = scanner.nextFloat();

        System.out.println(Math.abs(x2 - x1));
    }
}
