package org.example;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Java is cool!");
        int a = 20;
        int b = 10;
        int sum = a + b;
        //System.out.println("Sum: " + sum);

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;

        System.out.println("Sum: " + addition);
        System.out.println("Difference: " + subtraction);
        System.out.println("Product: " + multiplication);
        System.out.println("Quotient: " + division);

        boolean greaterThan = a > b;
        boolean lessThan = a < b;
        boolean equals = a == b;

        System.out.println(a +" is greater than "+b+ " is: " + greaterThan);
        System.out.println(a +" is less than "+b+ " is: " + lessThan);
        System.out.println(a +" equals "+b+ " is: " + equals);

        float d = 40.5F;
        float e = 22.3F;

        double f = 11.7;
        double g = 40.5;


        float floatAddition = d + e;
        float floatSubtraction = d - e;
        float floatMultiplication = d * e;
        float floatDivision = d / e;

        double doubleAddition = f + g;
        double doubleSubtraction = f - g;
        double doubleMultiplication = f * g;
        double doubleDivision = f / g;

        System.out.println("Float-Sum: " + floatAddition);
        System.out.println("Float-Difference: " + floatSubtraction);
        System.out.println("Float-Product: " + floatMultiplication);
        System.out.println("Float-Quotient: " + floatDivision);

        System.out.println("Double-Sum: " + doubleAddition);
        System.out.println("Double-Difference: " + doubleSubtraction);
        System.out.println("Double-Product: " + doubleMultiplication);
        System.out.println("Double-Quotient: " + doubleDivision);

        boolean floatGreaterThan = d > e;
        boolean floatLessThan = d < e;
        boolean floatEquals = d == e;

        boolean doubleGreaterThan = f > g;
        boolean doubleLessThan = f < g;
        boolean doubleEquals = f == g;

        System.out.println("float:");
        System.out.println(d +" is greater than "+e+ " is: " + floatGreaterThan);
        System.out.println(d +" is less than "+e+ " is: " + floatLessThan);
        System.out.println(d +" equals "+e+ " is: " + floatEquals);
        System.out.println("double:");
        System.out.println(f +" is greater than "+g+ " is: " + doubleGreaterThan);
        System.out.println(f +" is less than "+g+ " is: " + doubleLessThan);
        System.out.println(f +" equals "+g+ " is: " + doubleEquals);

    }
}
