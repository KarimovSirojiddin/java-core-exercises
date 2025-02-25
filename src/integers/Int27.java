package integers;

import java.util.Scanner;

public class Int27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int n = k % 7;

        if(n == 0){
            System.out.println("Shanba");
        }
        else if(n == 1){
            System.out.println("Yakshanba");
        }
        else if(n == 2){
            System.out.println("Dushanba");
        }
        else if(n == 3){
            System.out.println("Seshanba");
        }
        else if(n == 4){
            System.out.println("Chorshanba");
        }
        else if(n == 5){
            System.out.println("Payshanba");
        } else {
            System.out.println("Juma");
        }
    }
}
