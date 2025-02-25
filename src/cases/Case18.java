package cases;

import java.util.Scanner;

public class Case18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yoshingizni kiriting: ");
        int n = scanner.nextInt();
        int s1 = n / 100;
        int s2 = n / 10 % 10;
        int s3 = n % 10;


        String a,b,c;

        switch(s1){
            case 1 -> c = "Bir yuz ";
            case 2 -> c = "Ikki yuz ";
            case 3 -> c = "Uch yuz ";
            case 4 -> c = "To'rt yuz ";
            case 5 -> c = "Besh yuz ";
            case 6 -> c = "Olti yuz ";
            case 7 -> c = "Yetti yuz ";
            case 8 -> c = "Sakkiz yuz ";
            case 9 -> c = "To'qiz yuz ";
            default -> c = "Yuz ";

        }

        switch(s2){
            case 1 -> a = "o'n ";
            case 2 -> a = "yigirma ";
            case 3 -> a = "o'ttiz ";
            case 4 -> a = "qirq ";
            case 5 -> a = "ellik ";
            case 6 -> a = "oltmish ";
            case 7 -> a = "yetmish ";
            case 8 -> a = "saksoon ";
            case 9 -> a = "to'qson ";
            default -> a = "yuz ";

        }
        switch(s3){
            case 1 -> b = "bir";
            case 2 -> b = "ikki";
            case 3 -> b = "uch";
            case 4 -> b = "to'rt";
            case 5 -> b = "besh";
            case 6 -> b = "olti";
            case 7 -> b = "yetti";
            case 8 -> b = "sakkiz";
            case 9 -> b = "to'qqiz";
            default -> b = "o'n";
        }
        System.out.println(c + a + b);
    }
}
