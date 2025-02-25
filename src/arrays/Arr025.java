package arrays;

import java.util.Scanner;

public class Arr025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int arr0 = arr[0];
        int arr1 = arr[1];
        int counter = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if((arr1 / arr0) == (arr[i + 1] / arr[i])){
                counter++;
            }
        }

        if(counter == (n - 1)){
            System.out.println("Действительная прогрессия");
            System.out.println("Шаг прогрессий: " + (arr1 / arr0));
        } else {
            System.out.println("0");
        }
    }
}
