package arrays;

import java.util.Scanner;

public class Arr030 {
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

        int s = 0;

        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1] && i != arr.length - 2){
                System.out.print("arr[" + i + "], ");
                s++;
            } else if(arr[i] > arr[i + 1] && i == arr.length - 2){
                System.out.print("arr[" + i + "]");
                s++;
            }
        }

        System.out.println("\nсумма: " + s);

    }
}
