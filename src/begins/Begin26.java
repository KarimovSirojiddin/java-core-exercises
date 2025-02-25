package begins;

import java.util.Scanner;

public class Begin26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        float x = scanner.nextFloat();

        System.out.println(4 * Math.pow(x-3,6) - 7 * Math.pow(x-3, 3) + 2);

    }
}
