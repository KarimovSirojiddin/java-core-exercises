package cases;

import java.util.Scanner;

public class Case13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = " );
        int n = scanner.nextInt();
        System.out.print("Значение = " );
        int a = scanner.nextInt();

        switch(n){
            case 1 -> {
                System.out.println("c = " + a * Math.sqrt(2));
                System.out.println("h = " + a * Math.sqrt(2) / 2);
                System.out.println("s = " + a * Math.sqrt(2) * (a * Math.sqrt(2) / 2) / 2);
            }
            case 2 -> {
                System.out.println("a = " + a / Math.sqrt(2));
                System.out.println("h = " + a / 2);
                System.out.println("s = " + a * a);
            }
            case 3 -> {
                System.out.println("c = " + a * 2);
                System.out.println("a = " + a * Math.sqrt(2));
                System.out.println("c = " + a *  a);
            }
        }
    }
}
