package begins;

import java.util.Scanner;

public class Begin34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("kg_x: ");
        float x = scanner.nextFloat();
        System.out.print("summa_a: ");
        float a = scanner.nextFloat();

        System.out.print("kg_y: ");
        float y = scanner.nextFloat();
        System.out.print("summa_b: ");
        float b = scanner.nextFloat();

        float x_per = x / a;
        float y_per = y / b;

        System.out.println("x per kg = " + x_per);
        System.out.println("y per kg = " + y_per);
        System.out.println("дороже на = " + x_per / y_per);
    }
}
