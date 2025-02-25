package arrays;

import java.util.Scanner;

public class Arr001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
