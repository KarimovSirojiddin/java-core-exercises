package matrix;

import java.util.Scanner;

public class Matr012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("m: ");
        int m = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0){
                System.out.print(arr[i][0] + "\t");
            } else {
                System.out.print(arr[0][i] + "\t");
            }
            System.out.println();
        }
    }
}
