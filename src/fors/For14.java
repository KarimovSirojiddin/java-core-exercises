package fors;

import java.util.Scanner;

public class For14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        int s = 0;

        for (int i = 0; i < n; i++) {
            if(i % 2 != 0){
                s += i;
            }
        }

        System.out.println("квадрат n = " + (s + (2 * n - 1)));
    }
}
