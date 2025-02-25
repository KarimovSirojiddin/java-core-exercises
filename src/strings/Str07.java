package strings;

import java.util.Scanner;

public class Str07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("s = ");
        String s = scanner.nextLine();

        System.out.println(s.substring(0,1));
        System.out.println(s.substring(s.length() - 1));

    }
}
