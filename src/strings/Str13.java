package strings;

import java.util.Scanner;

public class Str13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("str = ");

        int counter = 0;

        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
