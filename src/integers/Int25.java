package integers;

import java.util.Scanner;

public class Int25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int n = k % 7;

        if(n == 0){
            System.out.println("Chorshanba");
        }
        else if(n == 1){
            System.out.println("Payshanba");
        }
        else if(n == 2){
            System.out.println("Juma");
        }
        else if(n == 3){
            System.out.println("Shanba");
        }
        else if(n == 4){
            System.out.println("Yakshanba");
        }
        else if(n == 5){
            System.out.println("Dushanba");
        } else {
            System.out.println("Seshanba");
        }
    }
}
