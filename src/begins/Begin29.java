package begins;

import java.util.Scanner;

public class Begin29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter alpha in gradus: ");
        int alphaInGradus = scanner.nextInt();

        System.out.println(alphaInGradus * (3.14 / 180));
    }
}
