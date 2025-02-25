package fors;

import java.util.Scanner;

public class For13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        float s = 0;

        for(float i = 0.1F; i < n; i += 0.1F) {
            i *= -1;
            s += i;
        }
    }
}
