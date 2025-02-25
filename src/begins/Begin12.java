package begins;

import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        float a = scanner.nextFloat();
        System.out.print("b: ");
        float b = scanner.nextFloat();

        double c = Math.sqrt(a * a + b * b);
        System.out.println("c = " + c);
        double p = a + b + c;
        System.out.println("p = " + p);
    }
}
