package fors;

import java.util.Scanner;

public class For16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();

        for (int i = a + 1; i < n; i++) {
            System.out.println(i);
        }
    }
}
