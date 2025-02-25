package strings;

import java.util.Scanner;

public class Str27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("s1 = ");
        String s1 = scanner.nextLine();
        System.out.print("n1 = ");
        int n1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("s2 = ");
        String s2 = scanner.nextLine();
        System.out.print("n2 = ");
        int n2 = scanner.nextInt();

        String temp = "";

        for (int i = 0; i < n1; i++) {
            temp += s1.charAt(i);
        }
        for (int i = s2.length() - n2; i < s2.length(); i++) {
            temp += s2.charAt(i);
        }
        System.out.println(temp);
    }
}
