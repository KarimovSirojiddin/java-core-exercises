package cases;

import java.util.Scanner;

public class Case07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        System.out.print("m = ");
        int m = scanner.nextInt();

        switch(n){
            case 1 -> System.out.println(m);
            case 2 -> System.out.println(m * 100000);
            case 3 -> System.out.println(m * 1000);
            case 4 -> System.out.println(m / 1000);
            case 5 -> System.out.println(m / 100);
            default -> System.out.println("Error");
        }
    }
}
