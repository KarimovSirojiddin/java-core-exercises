package cases;

import java.util.Scanner;

public class Case03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        switch(a){
            case 1,2,12 -> System.out.println("Winter");
            case 3,4,5 -> System.out.println("Spring");
            case 6,7,8 -> System.out.println("Summer");
            case 9,10,11 -> System.out.println("Autumn");
            default -> System.out.println("Error");
        }
    }
}
