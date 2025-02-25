package strings;

import java.util.Scanner;

public class Str26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("s = ");
        String s = scanner.nextLine();
        System.out.print("n = ");
        int n = scanner.nextInt();

        String temp = "";
        
        if(s.length() > n){
            for (int i = n; i < s.length(); i++) {
                temp += s.charAt(i);
            }
            System.out.println(temp);
        } else if(n > s.length()){
            for (int i = 0; i < n - s.length(); i++) {
                temp += '.';
            }
            System.out.println(temp.concat(s));
        }
    }
}
