package Homework1;

import java.util.Random;
import java.util.Scanner;

public class Homework_2 {

    public static void main(String[] args) {

        // Task 2.1
        System.out.println("Task 2.1");

        Random random = new Random();
        int number1 = random.nextInt(90) + 10;
        int number2 = random.nextInt(90) + 10;
        int sum =  (number1 + number2);
        System.out.println((long) sum);

        // Task 2.2
        System.out.println("Task 2.2");

        int number_1 = random.nextInt(90) + 10;
        int number_2 = random.nextInt(90) + 10;
        int product =  (number1 * number2);
        if(product % 2 == 0){
            System.out.println((long) product);
        }else System.out.println((double) product);

        // Task 2.3
        System.out.println("Task 2.3");

        int number = random.nextInt(90) + 10;
        System.out.println(String.valueOf(Math.pow(number,2)));

        // Task 2.4
        System.out.println("Task 2.4");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int givenNumber = scanner.nextInt();
        int randomNumber;
        if(givenNumber >= 100) {
            randomNumber = random.nextInt(givenNumber-50) + 50;
        }else randomNumber = random.nextInt(50);

        System.out.println(String.valueOf(randomNumber));

        // Task 2.5
        System.out.println("Task 2.5");

        System.out.print("Input operator: ");
        String operator = scanner.next();

        int randomNumber1 = random.nextInt();
        int randomNumber2 = random.nextInt();
        int result;

        switch (operator){
            case "+":
                result = randomNumber1 + randomNumber2;
                System.out.println(result);
                break;
            case "-":
                result = randomNumber1 - randomNumber2;
                System.out.println(result);
                break;
            case "*":
                result = randomNumber1 * randomNumber2;
                System.out.println(result);
                break;
            case "/":
                result = randomNumber1 / randomNumber2; // if randomNumber2 is not 0. :D
                System.out.println(result);
                break;
            default:
                System.out.println("Wrong input.");
        }

        // Task 2.6
        System.out.println("Task 2.6");

        System.out.print("Input week number: ");
        int weekNumber = scanner.nextByte();

        switch(weekNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong input");
        }

        // Task 2.7
        System.out.println("Task 2.7");

        System.out.print("Input monthName: ");
        String monthName = scanner.next();
        switch (monthName) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("Number of days: 31");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("Number of days: 30");
                break;
            case "february":
                System.out.println("Number of days: 28 or 29");
                break;
            default:
                System.out.println("Wrong input");
        }

        // Task 2.8
        System.out.println("Task 2.8");

        System.out.println("------------MENU-----------");
        System.out.println("---> enter 1 for calculating area of the circle");
        System.out.println("---> enter 2 for calculating perimeter of the circle");
        System.out.println("---> enter 3 for exit.");

        int inputNumber = scanner.nextInt();

        int Radius = 5;
        double pi = 3.14;
        double area;
        double perimeter;

        switch(inputNumber) {
            case 1:
                area = pi * Radius * Radius;
                System.out.println("The area of the circle: " + area);
                break;
            case 2:
                perimeter = 2 * pi * Radius;
                System.out.println("The perimeter of the circle: " + perimeter);
                break;
            case 3:
                break;
            default:
                System.out.println("Wrong input");

        }

















    }
}
