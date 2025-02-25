package booleans;

import java.util.Scanner;

public class Bool03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println(n % 2 == 0);
    }
}
