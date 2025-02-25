package cases;

import java.util.Scanner;

public class Case06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        System.out.print("l = ");
        int l = scanner.nextInt();

        switch(n){
            case 1 -> System.out.println(l * 10);
            case 2 -> System.out.println(l / 100);
            case 3 -> System.out.println(l);
            case 4 -> System.out.println(l * 1000);
            case 5 -> System.out.println(l * 100);
            default -> System.out.println("Error");
        }
    }
}
