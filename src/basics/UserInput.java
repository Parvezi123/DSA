package basics;

import java.io.IOException;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a Number");
        int num = System.in.read();

        System.out.println(num - 48);
    }
}
