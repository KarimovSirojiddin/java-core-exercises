package cases;

import java.util.Scanner;

public class Case08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date: ");
        int d = scanner.nextInt();
        System.out.print("Enter month: ");
        int m = scanner.nextInt();

        switch(m){
            case 1,2,4,6,9,11:
                if(d == 1){
                    d = 31;
                    m--;
                    break;
                } else {
                    d--;
                    break;
                }
            case 5,7,8,10,12:
                if(d == 1){
                    d = 30;
                    m--;
                    break;
                } else{
                    d--;
                    break;
                }
            case 3:
                if(d == 1){
                    d = 28;
                    m--;
                    break;
                } else{
                    d--;
                    break;
                }
        }

        System.out.println("day: ");
        System.out.println("month: ");
    }
}
