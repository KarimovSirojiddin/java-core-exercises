package arrays;

import java.util.Scanner;

public class Arr005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = i;

        }

        for(int i = 0; i < n; i++) {
            arr[0] = 0;
            arr[1] = 1;
            if(i > 2){
                arr[i] = arr[i - 2] + arr[i - 1];
            }
            System.out.print(arr[i] + " ");
        }
    }
}
