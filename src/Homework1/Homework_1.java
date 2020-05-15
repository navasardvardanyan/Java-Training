package Homework1;

import java.util.Scanner;

public class Homework_1 {

    public static void main(String[] args) {
        // Task 1.1
        System.out.println("Task 1.1");

        int number_1 = 76;
        int number_2 = 34;
        System.out.println(number_1 + number_2);

        // Task 1.2
        System.out.println("Task 1.2");

        int firstNumber = 50;
        int secondNumber = 3;
        int result = firstNumber / secondNumber;
        System.out.println(result);

        // Task 1.3
        System.out.println("Task 1.3");

        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        // Task 1.4
        System.out.println("Task 1.4");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int number2 = scanner.nextInt();

        System.out.println(number1 + "*" + number2 + "=" + number1 * number2);

        // Task 1.5
        System.out.println("Task 1.5");

        int inputNumber = scanner.nextInt();
        System.out.println("Input a number: ");
        for(int i = 1; i <= 10; i++) {
            System.out.println(inputNumber + "*" + i + "=" + inputNumber * i);
        }

        // Task 1.6
        System.out.println("Task 1.6");

        double Radius = 7.5;
        double pi = 3.1415926535897932;

        System.out.println("Perimeter is " + 2 * pi * Radius);
        System.out.println("Area is " + pi * Radius * Radius);

        // Task 1.7
        System.out.println("Task 1.7");

        System.out.print("Input a degree in Fahrenheit: " );
        int farenheit = scanner.nextInt();
        double celsius = (double) (farenheit - 32) * 5 / 9;
        System.out.println((double) farenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

        // Task 1.8
        System.out.println("Task 1.8");


        System.out.print("input a value for inch: " );
        double value = scanner.nextInt();
        System.out.println(value + " inch is " + value * 0.0254 + " meters.");

        // Task 1.9
        System.out.println("Task 1.9");


        System.out.print("Input number: ");
        int number = scanner.nextInt();

        if(number > 0) {
            System.out.println("number is positive.");
        } else if (number < 0) {
            System.out.println("number is negative.");
        }else System.out.println("number is 0");

        // Task 1.10
        System.out.println("Task 1.10");

        int greatest;
        System.out.print("Input the 1st number: ");
        int numberFirst = scanner.nextInt();
        System.out.print("Input the 2nd number: ");
        int numberSecond = scanner.nextInt();
        System.out.print("Input the 3rd number: ");
        int numberThird = scanner.nextInt();

        if (numberFirst >= numberSecond && numberFirst >= numberThird) {
            greatest = numberFirst;
        } else if (numberSecond >= numberFirst && numberSecond >= numberThird) {
            greatest = numberSecond;
        } else {
            greatest = numberThird;
        }
        System.out.println("The greatest: " + greatest);

        // Task 1.11
        System.out.println("Task 1.11");

        System.out.println("Input 5 numbers: ");

        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += scanner.nextInt();
        }

        double average = (double) sum / 5;
        System.out.println("The sum of 5 numbers is " + sum);
        System.out.println("The average is " + average);

        // Task 1.12
        System.out.println("Task 1.12");

        System.out.print("Input number: ");
        int givenNumber = scanner.nextInt();

        if(givenNumber % 2 == 0) {
            System.out.println("Even");
        }else System.out.println("Odd");



















    }
}
