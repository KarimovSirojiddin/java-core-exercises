package cases;

import java.util.Scanner;

public class Case15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = " );
        int n = scanner.nextInt();
        System.out.print("Значение = " );
        int c = scanner.nextInt();

        String a;
        String b;

        switch(n){
            case 6 -> a = "olti";
            case 7 -> a = "yetti";
            case 8 -> a = "sakkiz";
            case 9 -> a = "to'qqiz";
            case 10 -> a = "o'n";
            case 11 -> a = "valet";
            case 12 -> a = "dama";
            case 13 -> a = "karol";
            case 14 -> a = "tuz";
        }
        switch(c){
            case 1 -> b = "qizil_1";
            case 2 -> b = "qizil_2";
            case 3 -> b = "qora_1";
            case 4 -> b = "qora_2";
        }
    }
}
