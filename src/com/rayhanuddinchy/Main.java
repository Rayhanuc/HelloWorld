package com.rayhanuddinchy;

import java.awt.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.Date;

public class Main {
//    public static void main(String[] args) {
//        int age = 30;
//        age = 35;

//        int myAge = 30;
//        int herAge = myAge;
//        System.out.println(herAge);

//        byte age = 30;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = flash;

// ****** Reference Types
//        byte age = 30;
//        Date now = new Date();
//        System.out.println("Now");
//        System.out.println(now);

// ****** Primitive Types vs Reference Types


//    }

//     public static void main(String[] args) {
//// ****** Primitive Types vs Reference Types
////         byte x = 1;
////         byte y = x;
////         x = 2;
////         System.out.println(y);
//
//         Point point1 = new Point(1, 1);
//         Point point2 = point1;
//         point1.x = 2;
//         System.out.println(point2);
//     }

//    public static void main(String[] args) {
//// ****** String
////        String message = new String("Hello World");
//        String message = "Hello World" + " !!";
//        String message2 = "   Hello World 2" + " !!  ";
////        System.out.println(message);
//        System.out.println(message.startsWith("!!"));
//        System.out.println(message.endsWith("!!"));
//        System.out.println(message.length());
//        System.out.println(message.indexOf("H"));
//        System.out.println(message.indexOf("e"));
//        System.out.println(message.indexOf("sky"));
//        System.out.println(message.replace("!", "*"));
//        System.out.println(message.toLowerCase());
//        System.out.println(message.toUpperCase());
//        System.out.println(message2.trim());
//        System.out.println(message);
//        System.out.println(message2);
//    }

//    public static void main(String[] args) {
//// ****** Escape Sequences
//        String message = "Hello \"Kosh\"";
//        System.out.println(message);
//
////        c:windows\....
//        String message2 = "c:\\windows\\....";
//        System.out.println(message2);
//
////        line break
//        String message3 = "Jumpi \nlahiri";
//        System.out.println(message3);
//
////      Tab
//        String message4 = "Jumpi \tlahiri";
//        System.out.println(message4);
//    }



//    public static void main(String[] args) {
//// ****** Array
//    int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 4;
//        Arrays.toString(numbers);
//        System.out.println(Arrays.toString(numbers));
//    }
//      int[] numbers = {2, 3, 5, 1, 4 };
//        System.out.println(numbers.length);
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//    }


//    public static void main(String[] args) {
//// ****** Multi-Dimensional Arrays
//    int[][] numbers = {{1, 2, 3}, { 4, 5, 6 }};
//    System.out.println(Arrays.deepToString(numbers));
//    }

//    public static void main(String[] args) {
//// ****** Constants
//        final float PI = 3.14F;
//    }

//    public static void main(String[] args) {
//// ****** Arithmetic Expressions
////        int result = 10 + 3;
////        int result = 10 - 3;
////        int result = 10 * 3;
////        int result = 10 / 3;
////        double result = (double)10 / (double) 3;
////        System.out.println(result);
//        int x = 1;
////        x = x + 2;
//        x += 2;
////        x -= 2;
////        x *= 2;
////        x /= 2;
//        System.out.println(x);
//    }

//    public static void main(String[] args) {
//// ****** Order of Operations
////        int x = 10 + 3 * 2;
//        int x = (10 + 3) * 2;
//        System.out.println(x);
//    }

    public static void main(String[] args) {
// ****** Casting
// ****** Implicit Casting / automatic casting
// ****** byte -> short -> int -> long -> float -> double
    short x = 1;
    int y = x + 2;
    System.out.println(y);

    double a = 1;
    double b = a + 2; // 2.0
    System.out.println(b);

    double c = 1;
    int d = (int)c + 2;
    System.out.println(d);

    String e = "1";
//    Integer.parseInt() // int
//    Short.parseShort(); // int
//    Float.parseFloat(); // int
        int f = Integer.parseInt(e)+ 2;
        System.out.println(f);

    String g = "1.1";
    double h = Double.parseDouble(g)+ 2;
    System.out.println(h);
    }



}
