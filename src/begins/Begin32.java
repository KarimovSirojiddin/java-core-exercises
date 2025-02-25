package begins;

import java.util.Scanner;

public class Begin32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in gradus: ");
        float tempC = scanner.nextFloat();

        float tempF = (tempC * 9 / 5) + 32;

        System.out.println("Temperature in F: " + tempF);
    }
}
