package fors;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();

        int s1 = Math.max(a,b);
        int s2 = Math.min(a,b);

        for(int i = s1 - 1; i < s2; i--){
            System.out.println(i);
        }

        System.out.println("counter = " + (s1 - s2));
    }
}
