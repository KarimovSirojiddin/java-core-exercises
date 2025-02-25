package arrays;

import java.util.Scanner;

public class Arr006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = i;
        }

        int s = 0;

        arr[0] = a;
        arr[1] = b;

        for(int i = 0; i < n; i++) {
            s += arr[i];
            System.out.print(arr[i] + " ");
        }
    }
}
