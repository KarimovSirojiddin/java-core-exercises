package booleans;

import java.util.Scanner;

public class Bool35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("y1 = ");
        int y1 = scanner.nextInt();
        System.out.print("x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("y2 = ");
        int y2 = scanner.nextInt();

        boolean a = x1 % 2 != 0 && y1 % 2 != 0;
        boolean b = x2 % 2 != 0 && y2 % 2 != 0;

        System.out.println(a == b);
    }
}
