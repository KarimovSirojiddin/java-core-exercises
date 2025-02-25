package ifs;

import java.util.Scanner;

public class If15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        if((Math.min(a,Math.min(b,c))) == a){
            System.out.println(b + c);
        } else if((Math.min(a,Math.min(b,c))) == b) {
            System.out.println(a + c);
        } else{
            System.out.println(a + b);
        }
    }
}
