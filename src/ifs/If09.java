package ifs;

import java.util.Scanner;

public class If09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        int c = Math.min(a,b);
        int d = Math.max(a,b);

        System.out.println("a = " + c);
        System.out.println("b = " + d);
    }
}
