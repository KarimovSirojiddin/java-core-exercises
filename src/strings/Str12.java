package strings;

import java.util.Scanner;

public class Str12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("s = ");
        String s = scanner.nextLine();
        System.out.print("n = ");
        int n = scanner.nextInt();

        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            temp += s.substring(i,i + 1);
            for (int j = 0; j < n; j++) {
                temp += "*";
            }
        }

        System.out.println(temp);
    }
}
