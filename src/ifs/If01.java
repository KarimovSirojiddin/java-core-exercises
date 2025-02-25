package ifs;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        if(n > 0){
            n -= 8;
            System.out.println(n);
        } else {
            System.out.println(n);
        }
    }
}
