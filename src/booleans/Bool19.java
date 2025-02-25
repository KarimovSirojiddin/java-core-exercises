package booleans;

import java.util.Scanner;

public class Bool19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        System.out.println(a == b * -1 || b == c * -1 || c == a * -1);
    }
}
