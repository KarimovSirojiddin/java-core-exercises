package strings;

import java.util.Scanner;

public class Str16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("str = ");
        String str = scanner.nextLine();

        char[] arr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if(arr[i] >= 'A' && arr[i] <= 'Z'){
                arr[i] = Character.toLowerCase(arr[i]);
;            }
        }

        System.out.println(arr);
    }
}
