package strings;

import java.util.Scanner;

public class Str23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("str = ");
        String str = scanner.nextLine();

        int s = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                if(i != str.length() - 1 && str.charAt(i + 1) == '+'){
                    s = s + (str.charAt(i) - '0');
                } else if(i != str.length() - 1 && str.charAt(i + 1) == '-'){
                    s = s - (str.charAt(i) - '0');
                }
            }
        }

        System.out.println(s);
    }
}
