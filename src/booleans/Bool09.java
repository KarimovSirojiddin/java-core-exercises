package booleans;

import java.util.Scanner;

public class Bool09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();

        System.out.println(a % 2 == 0 || b % 2 == 0);
    }
}
