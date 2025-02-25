package strings;

import java.util.Scanner;

public class Str22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("str = ");
        String str = scanner.nextLine();

        int s = 0;

        for (int i = 0; i < str.length(); i++) {
            s = s + str.charAt(i) - '0';
        }

        System.out.println(s);
    }
}
