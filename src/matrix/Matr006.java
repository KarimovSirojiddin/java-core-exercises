package matrix;

import java.util.Scanner;

public class Matr006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("m: ");
        int m = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int)(Math.random() * 10);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int[] arrM = new int[n];
        for (int i = 0; i < n; i++) {
            arrM[i] = scanner.nextInt();
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][0] = arrM[i];
            }
        }
        System.out.print("d = ");
        int d = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i][j] + d;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
