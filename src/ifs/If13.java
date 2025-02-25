package ifs;

import java.util.Scanner;

public class If13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        if((a > b && a < c) || (a < b && a > c)){
            System.out.println(a);
        } else if((b > a && b < c) || (b < a && b > c)){
            System.out.println(b);
        } else{
            System.out.println(c);
        }
    }
}
