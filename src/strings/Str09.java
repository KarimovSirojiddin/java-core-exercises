package strings;

import java.util.Scanner;

public class Str09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("s = ");
        String s = scanner.nextLine();
        System.out.print("s2 = ");
        String s2 = scanner.nextLine();
        System.out.print("n = ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            s = s + s2;
        }

        System.out.println(s);
    }
}
