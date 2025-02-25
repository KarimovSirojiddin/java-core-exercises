package strings;

import java.util.Scanner;

public class Str14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("str = ");

        int counter = 0;

        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
