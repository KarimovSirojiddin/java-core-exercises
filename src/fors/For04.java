package fors;

import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        for(int i = 1; i < 10; i++) {
            System.out.println(i + "кг конфет = " + (n * i));
        }
    }
}
