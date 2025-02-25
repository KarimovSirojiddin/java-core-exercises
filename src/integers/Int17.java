package integers;

import java.util.Scanner;

public class Int17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        if(n > 999 && n < 10000){
            System.out.println(n / 100 % 10);
        }
    }
}
