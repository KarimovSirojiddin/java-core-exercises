package ifs;

import java.util.Scanner;

public class If19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();
        System.out.print("d: ");
        int d = scanner.nextInt();

        if(a != b && a != c && a != d){
            System.out.println("1");
        } else if(b != a && b != c && b != d){
            System.out.println("2");
        } else if(c != b && a != c && c != d){
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
