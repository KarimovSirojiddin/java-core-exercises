package strings;

import java.util.Scanner;

public class Str19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("str = ");
        String str = scanner.nextLine();

        char[] arr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if(arr[i] >= '0' && arr[i] <= '9' && arr[i + 1] != '.'){
                System.out.println("1");
                return;
            } else if(arr[i] >= '0' && arr[i] <= '9' && arr[i + 1] == '.'){
                System.out.println("2");
                return;
            }
        }

        System.out.println("0");
    }
}
