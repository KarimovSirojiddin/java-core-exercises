package cases;

import java.util.Scanner;

public class Case04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        switch(a){
            case 1,3,5,8,10,12 -> System.out.println("31");
            case 2 -> System.out.println("28");
            case 4,6,7,9,11 -> System.out.println("30");
            default -> System.out.println("Error");
        }
    }
}
