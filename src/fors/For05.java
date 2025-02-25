package fors;

import java.util.Scanner;

public class For05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        for(float i = 0.1F; i < 1; i += 0.1F) {
            System.out.println(i + "кг конфет = " + (n * i));
        }
    }
}
