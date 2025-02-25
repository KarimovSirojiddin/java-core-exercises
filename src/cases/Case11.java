package cases;

import java.util.Scanner;

public class Case11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Direction = " );
        String s = scanner.nextLine();
        System.out.print("n1 = ");
        int n1 = scanner.nextInt();
        System.out.print("n2 = ");
        int n2 = scanner.nextInt();

        switch(n1){
            case 1 -> {
                switch(s){
                    case "N" -> s = "W";
                    case "W" -> s = "S";
                    case "S" -> s = "E";
                    case "E" -> s = "N";
                }
            }
            case -1 -> {
                switch(s){
                    case "N" -> s = "E";
                    case "E" -> s = "S";
                    case "S" -> s = "W";
                    case "W" -> s = "N";
                }
            }
            case 2 -> {
                switch(s){
                    case "N" -> s = "S";
                    case "S" -> s = "N";
                    case "E" -> s = "W";
                    case "W" -> s = "E";
                }
            }
        }
        switch(n2){
            case 1 -> {
                switch(s){
                    case "N" -> s = "W";
                    case "W" -> s = "S";
                    case "S" -> s = "E";
                    case "E" -> s = "N";
                }
            }
            case -1 -> {
                switch(s){
                    case "N" -> s = "E";
                    case "E" -> s = "S";
                    case "S" -> s = "W";
                    case "W" -> s = "N";
                }
            }
            case 3 -> {
                switch(s){
                    case "N" -> s = "S";
                    case "S" -> s = "N";
                    case "E" -> s = "W";
                    case "W" -> s = "E";
                }
            }
        }

        System.out.println("The current direction of the locator is " + s);
    }
}
