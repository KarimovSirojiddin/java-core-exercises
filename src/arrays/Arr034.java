package arrays;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class Arr034 {
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
        int s = MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if((arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) && i != arr.length - 1){
               if(arr[i] > s){
                   s = arr[i];
               }
            }
        }

        System.out.println(s);

    }
}
