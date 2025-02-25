package cases;

import java.util.Scanner;

public class Case14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = " );
        int n = scanner.nextInt();
        System.out.print("Значение = " );
        int a = scanner.nextInt();

        switch(n){
            case 1 -> {
                System.out.println("R1 = " + a * Math.sqrt(3) / 6);
                System.out.println("R2 = " + a * Math.sqrt(3) / 3);
                System.out.println("S = " + a * a * Math.sqrt(3) / 4);
            }
            case 2 -> {
                System.out.println("a = " + a / (Math.sqrt(3) / 6));
                System.out.println("R2 = " + a * 2);
                System.out.println("S = " + (a / (Math.sqrt(3) / 6)) * (a / (Math.sqrt(3) / 6)) * (Math.sqrt(3) / 4));
            }
            case 4 -> {
                double t = Math.sqrt(3);
                double s = Math.sqrt(a / t / 4);

                System.out.println("a = " + s);
                System.out.println("R1 = " + (Math.sqrt(3) / 6) * s);
                System.out.println("R2 = " + 2 * (Math.sqrt(3) / 6) * s);
            }
        }
    }
}
