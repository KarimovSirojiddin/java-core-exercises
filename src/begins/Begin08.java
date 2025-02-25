package begins;

import java.util.Scanner;

public class Begin08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        float a = scanner.nextFloat();
        System.out.print("b: ");
        float b = scanner.nextFloat();

        float ad = (a * b) / 2;
        System.out.println("Average = " + ad);
    }
}
