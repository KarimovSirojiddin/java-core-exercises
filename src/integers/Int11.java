package integers;

import java.util.Scanner;

public class Int11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        if (n > 99 && n < 1000) {
            int s1, s2, s3;
            s1 = n / 100;
            s2 = n / 10 % 10;
            s3 = n % 10;

            System.out.println("summa = " + (s1 + s2 + s3));
            System.out.print("quotation = " + (s1 * s2 * s3));
        }
    }
}
