package arrays;

import java.util.Scanner;

public class Arr015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Четные:");

        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("Нечетные:");

        for(int i = n - 1; i > 0; i--) {
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
