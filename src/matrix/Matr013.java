package matrix;

import java.util.Scanner;

public class Matr013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("m: ");
        int m = scanner.nextInt();

        int[][] arr = new int[m][m];

        int i = 0,j = 0, counter = 1;
        int rightlimit = m, leflimit = 0;
        int bottomlimit = m, toplimit = 1;
        while(counter <= m * m){
            while(j < rightlimit){
                arr[i][j] = counter++;
                j++;
            }
            j--;
            i++;
            while(i < bottomlimit){
                arr[i][j] = counter++;
                i++;
            }
            i--;
            j--;
            while(j >= leflimit){
                arr[i][j] = counter++;
                j--;
            }
            j++;
            i--;
            while(i >= toplimit){
                arr[i][j] = counter++;
                i--;
            }

            i++;
            j++;
            leflimit++;
            toplimit++;
            bottomlimit--;
            rightlimit--;
        }
        print(arr);
    }
    static void print(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
