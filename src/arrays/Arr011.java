package arrays;

import java.util.Scanner;

public class Arr011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("k = ");
        int k = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for(int i = 0; i < n; i++) {
            if(arr[i] % k == 0){
                System.out.print(arr[i] + "[" + (i - 1) + "]" + " ");
            }
        }
    }
}
