package cases;

import java.util.Scanner;

public class Case17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yoshingizni kiriting: ");
        int n = scanner.nextInt();
        int s1 = n / 10;
        int s2 = n % 10;

        String a,b;

        switch(s1){
            case 1 -> a = "O'n ";
            case 2 -> a = "Yigirma ";
            case 3 -> a = "O'ttiz ";
            case 4 -> a = "Qirq ";
            case 5 -> a = "Ellik ";
            case 6 -> a = "Oltmish ";
            case 7 -> a = "Yetmish ";
            case 8 -> a = "Saksoon ";
            case 9 -> a = "To'qson ";
            default -> a = "Yuz ";

        }
        switch(s2){
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
        System.out.println(a + b + " ta masalalar");
    }
}
