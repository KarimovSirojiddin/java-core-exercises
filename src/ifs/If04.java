package ifs;

import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("n2 = ");
        int n2 = scanner.nextInt();
        System.out.print("n3 = ");
        int n3 = scanner.nextInt();

        int counter = 0;
        if(n > 0)
        {
            counter++;
        }
        if(n2 > 0)
        {
            counter++;
        }
        if(n3 > 0)
        {
            counter++;
        }

        System.out.println(counter);
    }
}
