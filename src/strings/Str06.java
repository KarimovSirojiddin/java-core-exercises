package strings;

import java.io.IOException;

public class Str06 {
    public static void main(String[] args) throws IOException {
        System.out.print("c = ");
        int c = (int)(System.in.read());
        if(c >= 48 && c <= 57){
            System.out.println("digit");
        } else if(c >= 65 && c <= 90){
            System.out.println("capital");
        } else if(c >= 97 && c <= 122){
            System.out.println("small");
        }

    }
}
