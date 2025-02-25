package fors;

import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        int s = 0;

        for (int i = 0; i < n; i++) {
            s = s + ((n + i) * (n + i));
        }

        System.out.println(s);

    }
}
