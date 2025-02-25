package integers;

import java.util.Scanner;

public class Int23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int a = n / 60;
        System.out.println(a % 60);
    }
}
