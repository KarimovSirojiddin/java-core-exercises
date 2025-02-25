package booleans;

import java.util.Scanner;

public class Bool15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        int t = 0;
        if(a > 0){
            t++;
        }
        if(b > 0){
            t++;
        }
        if(c > 0){
            t++;
        }
        System.out.println(t >= 2);
    }
}
