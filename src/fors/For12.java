package fors;

import java.util.Scanner;

public class For12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        float s = 1;

        for(float i = 1.1F; i < n; i += 0.1F) {
            s = s * i;
        }

    }
}
