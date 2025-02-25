package integers;

import java.util.Scanner;

public class Int16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        if(n > 99 && n < 1000){
            int s1,s2,s3;
            s1 = n / 100;
            s2 = n / 10 % 10;
            s3 = n % 10;

            System.out.print(s1);
            System.out.print(s3);
            System.out.print(s2);
        }
    }
}
