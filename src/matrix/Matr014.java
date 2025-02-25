package matrix;

import java.util.Scanner;

public class Matr014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("m: ");
        int m = scanner.nextInt();

        int[][] arr = new int[m][m];

        int i = 0, j = 0, counter = 1;
        int rightlimit = m - 1, leftlimit = 0;
        int bottomlimit = m - 1, toplimit = 0;

        while (counter <= m * m) {
            while (i <= bottomlimit) { // Двигаемся вниз
                arr[i][j] = counter++;
                i++;
            }
            i--;
            j++;

            while (j <= rightlimit) { // Двигаемся вправо
                arr[i][j] = counter++;
                j++;
            }
            j--;
            i--;

            while (i >= toplimit) { // Двигаемся вверх
                arr[i][j] = counter++;
                i--;
            }
            i++;
            j--;

            while (j > leftlimit) { // Двигаемся влево
                arr[i][j] = counter++;
                j--;
            }
            j++;
            i++;

            leftlimit++;
            toplimit++;
            bottomlimit--;
            rightlimit--;
        }

        print(arr);
    }

    static void print(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
