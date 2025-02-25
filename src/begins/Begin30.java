package begins;

import java.util.Scanner;

public class Begin30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter alpha in Radians: ");
        int alphaInRadians = scanner.nextInt();

        System.out.println(alphaInRadians * (180 / 3.14));
    }
}
