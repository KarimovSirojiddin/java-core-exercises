package ifs;

import java.util.Scanner;

public class If11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        int c = Math.max(a,b);
        if(a != b) {
            a = c;
            b = c;
        } else {
            a = 0;
            b = 0;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
