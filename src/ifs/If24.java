package ifs;

import java.util.Scanner;

public class If24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x = ");
        int x = scanner.nextInt();

        if(x > 0){
            System.out.println(2 * x);
        } else {
            System.out.println(6 - x);
        }
    }
}
