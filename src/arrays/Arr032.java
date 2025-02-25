package arrays;

import java.util.Scanner;

public class Arr032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 1; i < arr.length; i++) {
            if((arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) && i != arr.length - 1){
                System.out.println("\narr[" + i + "]");
                break;
            }
        }

    }
}
