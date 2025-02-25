package strings;

import java.util.Scanner;

public class Str17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("str = ");
        String str = scanner.nextLine();

        char[] arr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if(arr[i] >= 'a' && arr[i] <= 'z'){
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }

        System.out.println(arr);
    }
}
