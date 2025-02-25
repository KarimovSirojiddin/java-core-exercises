package begins;

import java.util.Scanner;

public class Begin35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter v: ");
        int v = scanner.nextInt();
        System.out.print("Enter u: ");
        int u = scanner.nextInt();
        System.out.print("Enter t1: ");
        int t1 = scanner.nextInt();
        System.out.print("Enter t2: ");
        int t2 = scanner.nextInt();

        int s1 = v * t1;
        int s2 = (v - u) * t2;
        int s = s1 + s2;

        System.out.println("Area: " + s);
    }
}
