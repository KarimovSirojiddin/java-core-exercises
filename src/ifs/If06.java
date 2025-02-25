package ifs;

import java.util.Scanner;

public class If06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("n2 = ");
        int n2 = scanner.nextInt();
        if(n > n2){
            System.out.println(n);
        } else {
            System.out.println(n2);
        }
    }
}
