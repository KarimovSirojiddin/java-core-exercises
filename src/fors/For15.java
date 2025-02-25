package fors;

import java.util.Scanner;

public class For15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();

        int s = 1;

        for (int i = 0; i < n; i++) {
            s = s * a;
        }

        System.out.println(s);
    }
}
