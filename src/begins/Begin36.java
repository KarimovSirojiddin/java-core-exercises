package begins;

import java.util.Scanner;

public class Begin36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter v1: ");
        int v1 = scanner.nextInt();
        System.out.print("Enter v2: ");
        int v2 = scanner.nextInt();
        System.out.print("Enter s: ");
        int s = scanner.nextInt();
        System.out.print("Enter t: ");
        int t = scanner.nextInt();

        int sNew = s + (v1 + v2) * t;

        System.out.println(sNew);
    }
}
