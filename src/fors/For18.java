package fors;

import java.util.Scanner;

public class For18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();

        int s = 1,c = 0;

        for (int i = 0; i < n; i++) {
            s *= a;
            c += s;
            c *= -1;
            System.out.println(c);

        }
        int b;
        if(n % 2 == 0) b = 1;
        else b = -1;

        System.out.println(1 - (c * -1) + b * s);
    }
}
