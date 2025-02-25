package arrays;

import java.util.Scanner;

public class Arr027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean t = true;
        int a = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if((arr[i] > 0 && arr[i + 1] > 0) || (arr[i] < 0 && arr[i + 1] < 0)){
                a = i;
                t = false;
                break;
            }
        }

        if(t){
            System.out.println("0");
        } else {
            System.out.println("a = " + a);
        }

    }
}
