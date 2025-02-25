package begins;

import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("kg: ");
        float a = scanner.nextFloat();
        System.out.print("summa: ");
        float s = scanner.nextFloat();

        float kg_per = a / s;
        System.out.print("y kg: ");
        float y = scanner.nextFloat();

        System.out.println(y * kg_per);

    }
}
