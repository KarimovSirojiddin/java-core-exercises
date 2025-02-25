package integers;

import java.util.Scanner;

public class Int21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println(n % 60);
    }
}
