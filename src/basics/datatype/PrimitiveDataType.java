package basics.datatype;

public class PrimitiveDataType {
    public static void main(String[] args) {
        boolean bool = false;
        byte byteStartRange = -128;
        byte byteEndRange = 127;
        short shortStartRange = -32768;
        short shortEndRange = 32767;
        int intStartRange = -2147483648;
        int intEndRange = 2147483647;
        long longStartRange = -9223372036854775808L;
        long longEndRange = 9223372036854775807L;
        float floatMaxDecimalValue = 2.1234567f;
        double doubleMaxDecimalValue = 2.1234567890123456d;
        char charLowestValue = '\u0000';
        char charHighestValue = '\uFFFF';

        System.out.println("Boolean SIZE: 1bit   | boolean with def. value: " + bool);
        System.out.println("Byte SIZE:    1Byte  | Byte Start Range: " + byteStartRange + " & Byte End Range: " + byteEndRange );
        System.out.println("Short SIZE:   2bytes | Short Start Range: " + shortStartRange + " & Short End Range: " + shortEndRange );
        System.out.println("Int SIZE:     4bytes | Int Start Range: " + intStartRange + " & Integer End range: " + intEndRange );
        System.out.println("Long SIZE:    8bytes | Long Start Range: " + longStartRange + " & Long End range: " + longEndRange );
        System.out.println("Float SIZE:   4bytes | Float can hold upto 7 Decimal Values: " + floatMaxDecimalValue);
        System.out.println("Double SIZE:  8bytes | Double can hold upto 16 Decimal Values: " + doubleMaxDecimalValue);
        System.out.println("Character :   2bytes | Character uses UNICODE");
        System.out.println("Character Lowest value in UNICODE is " + charLowestValue + " & Character Highest Range in UNICODE is " + charHighestValue);
    }
}
