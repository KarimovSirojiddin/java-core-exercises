package arrays;

import java.util.Scanner;

public class Arr012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0){
                arr[i] = i;
                System.out.print(arr[i] + " ");
            }
        }
    }
}
