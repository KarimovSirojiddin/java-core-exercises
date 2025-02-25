package begins;

import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("r1: ");
        float r1 = scanner.nextFloat();
        System.out.print("r2: ");
        float r2 = scanner.nextFloat();

        double s1 = Math.PI * (r1 * r1);
        double s2 = Math.PI * (r2 * r2);
        double s3 = s1 - s2;

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }
}
