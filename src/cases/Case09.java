package cases;

import java.util.Scanner;

public class Case09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date: ");
        int d = scanner.nextInt();
        System.out.print("Enter month: ");
        int m = scanner.nextInt();

        switch(m){
            case 1,3,5,8:
                if(d == 31){
                    d = 1;
                    m++;
                    break;
                } else {
                    d++;
                    break;
                }
            case 4,6,7,9,11:
                if(d == 30){
                    d = 1;
                    m++;
                    break;
                } else{
                    d++;
                    break;
                }
            case 2:
                if(d == 28){
                    d = 1;
                    m++;
                    break;
                } else{
                    d++;
                    break;
                }
        }
        System.out.println("day: " + d);
        System.out.println("month: " + m);
    }
}
