package ifs;

import java.util.Scanner;

public class If05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("n2 = ");
        int n2 = scanner.nextInt();
        System.out.print("n3 = ");
        int n3 = scanner.nextInt();

        int counter = 0, counter2 = 0;
        if(n > 0)
        {
            counter++;
        }
        else if(n < 0)
        {
            counter2++;
        }

        if(n2 > 0)
        {
            counter++;
        }
        else if(n2 < 0)
        {
            counter2++;
        }

        if(n3 > 0)
        {
            counter++;
        }
        else if(n3 < 0)
        {
            counter2++;
        }

        System.out.println("positives = " + counter);
        System.out.println("negatives = " + counter2);
    }
}
