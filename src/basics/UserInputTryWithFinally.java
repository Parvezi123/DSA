package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputTryWithFinally {
    public static void main(String[] args) throws IOException {
        System.out.println("UserInput: Scanner with Try with Finally");
        BufferedReader br = null;
        int num = 0;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter number: ");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }

        finally {
            assert br != null;
            br.close();
        }
    }
}
