package arrays;

import java.util.Scanner;

public class Arr018 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            if(arr[i] < arr[9]){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
