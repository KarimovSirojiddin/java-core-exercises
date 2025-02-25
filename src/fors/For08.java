package fors;

import java.util.Scanner;

public class For08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();

        int s1 = Math.max(a,b);
        int s2 = Math.min(a,b);

        int s = 1;

        for(int i = s2; i <= s1; i++){
            s *= i;
        }

        System.out.println(s);
    }
}
