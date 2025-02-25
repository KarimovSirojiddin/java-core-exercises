package arrays;

import java.util.Scanner;

public class Arr022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int s = 0;

        for(int i = 0; i < arr.length; i++) {
            if(i > a && i <= b){
                s += arr[i];
            }
        }
        System.out.println(s);
    }
}
