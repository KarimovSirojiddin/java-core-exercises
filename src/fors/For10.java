package fors;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        float s = 0;

        for(float i = 1F; i < n; i++){
            s = s + (1/i);
        }

        System.out.println(s);
    }
}
