package integers;

import java.util.Scanner;

public class Int24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("k = ");
        int k = scanner.nextInt();
        int a = k % 7;

        if(a == 0 && k != 0){
            System.out.println("Sunday");
        }
        else if(a == 1){
            System.out.println("Monday");
        }
        else if(a == 2){
            System.out.println("Tuesday");
        }
        else if(a == 3){
            System.out.println("Wednesday");
        }
        else if(a == 4){
            System.out.println("Thursday");
        }
        else if(a == 5){
            System.out.println("Friday");
        }
        else if(a == 6){
            System.out.println("Saturday");
        }
    }
}
