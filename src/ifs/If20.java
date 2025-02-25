package ifs;

import java.util.Scanner;

public class If20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();

        if(b - a < c - a){
            System.out.println("b");
            System.out.println("расстояние между b и a: " + b);
        } else if(b - a > c - a){
            System.out.println("c");
            System.out.println("расстояние между c и a: " + c);
        }
    }
}
