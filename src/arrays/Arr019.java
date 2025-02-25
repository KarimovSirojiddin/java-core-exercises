package arrays;

import java.util.Scanner;

public class Arr019 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }

        int a = 0;

        for (int i = 0; i < 10; i++) {
            if(arr[i] < arr[9] && arr[i] > arr[0]){
                a = i;
            }
        }

        System.out.println(a);
    }
}
