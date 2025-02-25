package arrays;

import java.util.Scanner;

public class Arr007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = i;
        }

        for(int i = n - 1; i > 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
