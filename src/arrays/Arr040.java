package arrays;

import java.util.Scanner;

public class Arr040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("r = ");
        int r = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }

        int s = 0;

        for (int i = 1; i < arr.length - 1; i++) {
           if(Math.abs(r - arr[i]) < Math.abs(r - arr[i + 1])){
               s = arr[i];
           }
        }

        System.out.println("\ns = " + s);
    }
}
