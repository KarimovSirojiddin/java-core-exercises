package integers;

import java.util.Scanner;

public class Int09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        if(n > 99 && n < 1000){
            int s1,s2;
            s1 = n / 100;
            System.out.print(s1);
        }
    }
}
