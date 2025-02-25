package booleans;

import java.util.Scanner;

public class Bool16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();

        System.out.println(a > 9 && a < 100 && a % 2 == 1);
    }
}
