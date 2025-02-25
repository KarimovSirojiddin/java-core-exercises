package begins;

import java.util.Scanner;

public class Begin14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("l: ");
        float l = scanner.nextFloat();

        double r = l / (2 * Math.PI);
        double s = Math.PI * r * r;

        System.out.println("Radius = " + r);
        System.out.println("S = " + s);
    }
}
