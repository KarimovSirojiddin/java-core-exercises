package begins;

import java.util.Scanner;

public class Begin04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("d: ");
        float d = scanner.nextFloat();
        double l = d * Math.PI;

        System.out.println("Length = " + l);
    }
}
