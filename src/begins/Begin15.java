package begins;

import java.util.Scanner;

public class Begin15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("s: ");
        float s = scanner.nextFloat();

        double d = (4 * s) / Math.PI;
        d = Math.sqrt(d);
        double l = Math.PI * d;

        System.out.println("d = " + d);
        System.out.println("L = " + l);
    }
}
