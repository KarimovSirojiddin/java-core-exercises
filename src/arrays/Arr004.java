package arrays;

import java.util.Scanner;

public class Arr004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("d = ");
        int d = scanner.nextInt();

        int[] arr = new int[n];

        int s = d;

        for (int i = 0; i < arr.length; i++) {
            for(int j = 1; j < i; j++){
                d *= d;
            }
            arr[i] = a + d;
            d = s;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
