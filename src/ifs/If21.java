package ifs;

import java.util.Scanner;

public class If21 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("y1 = ");
        int y1 = scanner.nextInt();

        System.out.print("x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("y2 = ");
        int y2 = scanner.nextInt();

        if(x1 == x2 && y1 == y2){
            System.out.println("0");
        } else if(x1 != x2 && y1 == 0 && y2 == 0){
            System.out.println("1");
        } else if(y1 != y2 && x1 == 0 && x2 == 0){
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}
