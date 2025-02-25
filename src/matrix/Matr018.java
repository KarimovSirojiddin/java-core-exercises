package matrix;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Matr018 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("m: ");
        int m = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = random.nextInt(1,10);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("k: ");
        int k = scanner.nextInt();

        int a = 0, b = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(j == k){
                    a += arr[i][j];
                    b *= arr[i][j];
                }
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
