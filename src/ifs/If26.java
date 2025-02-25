package ifs;

import java.util.Scanner;

public class If26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x = ");
        int x = scanner.nextInt();

        if(x < 0){
            System.out.println(-1 * x);
        } else if(x > 0 && x < 2){
            System.out.println(x * x);
        } else if(x >= 2){
            System.out.println("4");
        }
    }
}
