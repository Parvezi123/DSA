package basics.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UserInputOutputBR {
    public static void main(String[] args) throws IOException {
        System.out.println("User Input with BufferedReader from java.io Package");

        System.out.println("Enter a Number");

        InputStream is = System.in;
        InputStreamReader in = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(in);

        int num =  Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();
    }
}
