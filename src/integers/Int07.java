package integers;

import java.util.Scanner;

public class Int07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        if(n > 9 && n < 100){
            int s1,s2;
            s1 = n / 10;
            s2 = n % 10;

            System.out.println("summa = " + (s1 + s2));
            System.out.println("quotation = " + (s1 * s2));
        }
    }
}
