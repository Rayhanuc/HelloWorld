package com.rayhanuddinchy;

import java.awt.*;
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

    public static void main(String[] args) {
// ****** String
//        String message = new String("Hello World");
        String message = "Hello World" + " !!";
        String message2 = "   Hello World 2" + " !!  ";
//        System.out.println(message);
        System.out.println(message.startsWith("!!"));
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message2.trim());
        System.out.println(message);
        System.out.println(message2);
    }
}
