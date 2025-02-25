package arrays;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Arr029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int s = MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 != 0 && (arr[i] > s)){
                s = i;
            }
        }

        System.out.println(s);
    }
}
