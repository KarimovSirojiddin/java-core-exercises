package integers;

import java.util.Scanner;

public class Int08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        if(n > 9 && n < 100){
            int s1,s2;
            s1 = n / 10;
            s2 = n % 10;
            System.out.print(s2);
            System.out.print(s1);
        }
    }
}
