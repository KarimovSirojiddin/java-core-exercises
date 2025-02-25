package booleans;

import java.util.Scanner;

public class Bool24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        int d = (b * b) - 4 * a * c;

        System.out.println(d > 0);
    }
}
