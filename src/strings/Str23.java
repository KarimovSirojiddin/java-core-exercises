package strings;

import java.util.Scanner;

public class Str23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("str = ");
        String str = scanner.nextLine();

        char[] c = str.toCharArray();
        int s = 0;

        for (int i = 0; i < str.length(); i++) {
            if(i % 2 == 0){
                    if(c[i + 1] == '+'){
                        s = s + (c[i] - '0');
                    } else if(c[i + 1] == '-'){
                        s = s - (c[i] - '0');
                    }
            }
        }
        System.out.println(s);
    }
}
