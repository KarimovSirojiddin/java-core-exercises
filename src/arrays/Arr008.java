package arrays;

import java.util.Scanner;

public class Arr008 {
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
        int counter = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
                counter++;
            }
        }

        System.out.println(counter);

    }
}
