package com.rayhanuddinchy;

import java.awt.*;
import java.sql.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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

//    public static void main(String[] args) {
//// ****** Casting
//// ****** Implicit Casting / automatic casting
//// ****** byte -> short -> int -> long -> float -> double
//    short x = 1;
//    int y = x + 2;
//    System.out.println(y);
//
//    double a = 1;
//    double b = a + 2; // 2.0
//    System.out.println(b);
//
//    double c = 1;
//    int d = (int)c + 2;
//    System.out.println(d);
//
//    String e = "1";
////    Integer.parseInt() // int
////    Short.parseShort(); // int
////    Float.parseFloat(); // int
//        int f = Integer.parseInt(e)+ 2;
//        System.out.println(f);
//
//    String g = "1.1";
//    double h = Double.parseDouble(g)+ 2;
//    System.out.println(h);
//    }


//    public static void main(String[] args) {
//// ****** The Math Class
////    int result = Math.round(1.1F);
////    int result = (int)Math.ceil(1.1F);
////    int result = (int)Math.floor(1.1F);
////    int result = Math.max(1, 2);
////    int result = Math.min(1, 2);
////    double result = Math.round(Math.random() * 100);
//    int result = (int) (Math.random() * 100);
//    System.out.println(result);
//    }


//    public static void main(String[] args) {
//// ****** Formatting Numbers
////        NumberFormat currency = NumberFormat.getCurrencyInstance();
////        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = NumberFormat.getPercentInstance().format(0.1);;
//        System.out.println(result);
//    }

//    public static void main(String[] args) {
//// ****** Reading Input
//    Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//    String name = scanner.nextLine().trim();
//        System.out.println("You are " + name);
//    }

//    public static void main(String[] args) {
//// ****** Solution: Mortgage Calculator
//    final byte MONTHS_IN_YEAR = 12;
//    final byte PERCENT = 100;
//
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.println("Principal: ");
//    int principal = scanner.nextInt();
//
//        System.out.println("Annual Interest Rate: ");
//        float annualInterest = scanner.nextFloat();
//        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//
//        System.out.println("Period (Years): ");
//        byte years = scanner.nextByte();
//        int numberOfPayments = years * MONTHS_IN_YEAR;
//
//        double mortgage = principal
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
//
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.print("Mortgage:" + mortgageFormatted);
//    }



//        public static void main(String[] args) {
//// ****** Comparison Operators
//    int x = 1;
//    int y = 1;
////            System.out.println(x == y);
//            System.out.println(x != y);
//    }

//    public static void main(String[] args) {
//// ****** Logical Operators
//        // *** Example 1
////    int temperature = 22;
////    int temperature = 12;
////    boolean isWarm = temperature > 20 && temperature < 30;
////        System.out.println(isWarm);
//
////   ***   Example 2
//        boolean hasHighIncome = false;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible  = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        System.out.println(isEligible);
//    }

//    public static void main(String[] args) {
//// ****** If Statements
//     int temp = 32;
//     if (temp > 30) {
//         System.out.println("It's a hot day");
//         System.out.println("Drink water");
//     } else if(temp > 20) {
//         System.out.println("Beautiful day");
//     } else {
//         System.out.println("Cold day");
//     }
//
//    int temp2 = 32;
//    if (temp2 > 30) {
//        System.out.println("It's a hot day");
//        System.out.println("Drink water");
//        }
//        else if(temp2 > 20)
//            System.out.println("Beautiful day");
//        else
//            System.out.println("Cold day");//
//    }

//    public static void main(String[] args) {
//// ****** Simplifying If Statements
////        int income = 120_000;
////        boolean hasHighIncome = false;
////        if (income > 100_000)
////           hasHighIncome = true;
////        System.out.println(hasHighIncome);
//
//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000);
//        System.out.println(hasHighIncome);
//    }

    public static void main(String[] args) {
// ****** The Ternary Operator
//        Example 1
//    int income = 120_000;
//    String className;
//    if (income > 100_000)
//        className = "Fist class";
//    else
//        className = "Economy";
//    }

//  Example 2
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
    }
}
