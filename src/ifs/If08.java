package ifs;

import java.util.Scanner;

public class If08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("n2 = ");
        int n2 = scanner.nextInt();
        if(n > n2){
            System.out.println(n);
            System.out.println(n2);
        } else {
            System.out.println(n2);
            System.out.println(n);
        }
    }
}
