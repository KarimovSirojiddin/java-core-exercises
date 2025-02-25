package arrays;

import java.util.Scanner;

public class Arr021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();

        int[] arr = new int[n];

        int s = 0,counter = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }


        for(int i = 0; i < arr.length; i++) {
            if(i >= a && i <= b){
                s += arr[i];
                counter++;
            }
        }

        System.out.println(s / b);
    }
}
