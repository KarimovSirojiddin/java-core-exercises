package begins;

import java.util.Scanner;

public class Begin27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        float x = scanner.nextFloat();

        float a = x * x;
        a = a * a * a;

        System.out.println(a);
    }
}
