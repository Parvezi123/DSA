package basics.IO;

import java.util.Scanner;

public class UserInputOutputSC {
    public static void main(String[]  args) {
        System.out.println("User Input with Scanner from java.util Package");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        System.out.println(num);
    }
}
