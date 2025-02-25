package ifs;

import java.util.Scanner;

public class If30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x = ");
        int x = scanner.nextInt();
        String s = "";
        if(x > 0 && x < 10){
            s = "однозначное";
        } else if(x > 9 && x < 100){
            s = "двузначное";
        } else if(x > 99 && x < 1000){
            s = "трехзначное";
        }

        String s2 = "";

        if(x % 2 == 0){
            s2 = " четное число";
        } else{
            s2 = " нечетное число";
        }

        System.out.println(s + s2);
    }
}
