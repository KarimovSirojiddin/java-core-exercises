package matrix;

import java.util.Scanner;

public class Matr005 {
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

        int[] arrM = new int[m];
        for (int i = 0; i < m; i++) {
            arrM[i] = scanner.nextInt();
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = arrM[j];
            }
        }
        System.out.print("d = ");
        int d = scanner.nextInt();
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
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
