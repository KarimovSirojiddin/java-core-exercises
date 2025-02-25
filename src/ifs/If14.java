package ifs;

import java.util.Scanner;

public class If14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        System.out.println("наименьшее - " + Math.min(a,Math.min(b,c)));
        System.out.println("наибольшее - " + Math.max(a,Math.min(b,c)));
    }
}
