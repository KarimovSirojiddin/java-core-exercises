package begins;

import java.util.Scanner;

public class Begin25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        float x = scanner.nextFloat();

        System.out.println(3 * Math.pow(x,6) - 6 * (x * x) - 7);
    }
}
