package begins;

import java.util.Scanner;

public class Begin07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius: ");
        float r = scanner.nextFloat();

        double l = 2 * Math.PI * r;
        double s = r * r * Math.PI;

        System.out.println("Length = "  + l);
        System.out.println("Square = "  + s);
    }
}
