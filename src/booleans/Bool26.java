package booleans;

import java.util.Scanner;

public class Bool26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();

        System.out.println(x > 0 && y < 0);
    }
}
