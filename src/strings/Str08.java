package strings;

import java.util.Scanner;

public class Str08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("s = ");
        String s = scanner.nextLine();
        System.out.print("n = ");
        int n = scanner.nextInt();

        System.out.println(s.substring(0,n));

    }
}
