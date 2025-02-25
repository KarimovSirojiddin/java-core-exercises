package begins;

import java.util.Scanner;

public class Begin31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in F: ");
        float tempF = scanner.nextFloat();

        float tempC = (tempF - 32) * 5 / 9;

        System.out.println("Temperature in C degrees: " + tempC);
    }
}
