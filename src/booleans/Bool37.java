package booleans;

import java.util.Scanner;

public class Bool37 {
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

        int x = Math.abs(x2 - x1);
        int y = Math.abs(y2 - y1);

        System.out.println(x <= 2 && y <= 2);
    }
}
