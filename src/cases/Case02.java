package cases;

import java.util.Scanner;

public class Case02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        switch(a){
            case 1 -> System.out.println("bad");
            case 2 -> System.out.println("unsatisfactory");
            case 3 -> System.out.println("mediocre");
            case 4 -> System.out.println("good");
            case 5 -> System.out.println("excellent");
            default -> System.out.println("Error");
        }
    }
}
