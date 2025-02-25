package strings;

import java.util.Scanner;

public class Str10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("s = ");
        String s = scanner.nextLine();

        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            temp = s.substring(i,i + 1) + temp;
        }

        System.out.println(temp);
    }
}
