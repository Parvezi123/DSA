package basics.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputOutputTryWithResources {
    public static void main(String[] args) throws IOException {
        System.out.println("UserInput: BufferedReader Try with Resources");
        int num = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))   {
            System.out.println("Enter number: ");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
