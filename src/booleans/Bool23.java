package booleans;

import java.util.Scanner;

public class Bool23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();

        int s1,s2,s3,s4;
        s1 = a / 1000;
        s2 = a / 100 % 10;
        s3 = a / 10 % 10;
        s4 = a % 10;

        System.out.println(s1 == s4 && s2 == s3);

    }
}
