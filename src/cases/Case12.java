package cases;

import java.util.Scanner;

public class Case12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = " );
        int n = scanner.nextInt();
        System.out.print("Значение = " );
        int a = scanner.nextInt();

        switch(n){
            case 1 -> {
                System.out.println("d = " + 2 * a);
                System.out.println("l = " + 2 * a * 3.14);
                System.out.println("s = " + a * a * 3.14);
            }
            case 2 -> {
                System.out.println("r = " + a / 2);
                System.out.println("l = " + a * 3.14);
                System.out.println("s = " + (a / 32) * (a / 32)  * 3.14);
            }
            case 3 -> {
                System.out.println("r = " + a / (2 * 3.14));
                System.out.println("d = " + 2 * (a / (2 * 3.14)));
                System.out.println("s = " + (a / (2 * 3.14)) * (a / (2 * 3.14))  * 3.14);
            }
            case 4 -> {
                System.out.println("r = " + Math.sqrt(a / 3.14));
                System.out.println("d = " + 2 * Math.sqrt(a / 3.14));
                System.out.println("l = " + Math.sqrt(a / 3.14) * 2 * 3.14);
            }
        }
    }
}
