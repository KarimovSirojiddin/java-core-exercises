package booleans;

import java.util.Scanner;

public class Bool13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        System.out.println(a > 0 || b > 0 || c > 0);
    }
}
