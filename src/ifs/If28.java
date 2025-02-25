package ifs;

import java.util.Scanner;

public class If28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x = ");
        int x = scanner.nextInt();

        if(x % 400 == 0){
            System.out.println("Високосный год");
        } else{
            System.out.println("Не високосный год");
        }

    }
}
