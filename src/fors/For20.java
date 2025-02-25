package fors;

import java.util.Scanner;

public class For20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        int s = 1, c = 0;

        for (int i = 1; i <= n; i++) {
            s *= i;
            c = c + s;
        }


        System.out.println(c);
    }
}
