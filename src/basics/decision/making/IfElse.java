package basics.decision.making;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        byte value1;
        byte value2;
        byte value3;

        try(Scanner in = new Scanner(System.in)) {
            System.out.println("Enter value 1: ");
            value1 =  Byte.parseByte(in.next());

            System.out.println("Enter value 2: ");
            value2 =  Byte.parseByte(in.next());

            System.out.println("Enter value 3: ");
            value3 =  Byte.parseByte(in.next());

            if (value1 > value2 && value1 > value3) {
                System.out.println("Value1 : " + value1 + " is greater among other values");
            }
            else if (value2 > value3 && value2 > value1) {
                System.out.println("Value2 : " + value2 + " is greater among other values");
            }
            else {
                System.out.println("Value3 : " + value3 + " is greater among other values");
            }
        }

        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }
}
