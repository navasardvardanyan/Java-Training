package Homework1;

import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {

        // Task 3.1
        System.out.println("Task 3.1");

        for(int i = 1; i <= 20; i++ ) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 3.2
        System.out.println("Task 3.2");

        for(int i = 1; i <= 20; i++ ) {
            if(i % 3 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 3.3
        System.out.println("Task 3.3");

        for(int i = -20; i <= 60; i++ ) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Task 3.4
        System.out.println("Task 3.4");

        for (int i = -60; i < -20; i++) {
            if(i % 2 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 3.5
        System.out.println("Task 3.5");

        int sum = 0;
        for(int i = 1; i <= 100; i++) {
                sum += i;
        }
        System.out.println(sum);

        // Task 3.6
        System.out.println("Task 3.6");

        int sumOfOddNumbers = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) continue;
            sumOfOddNumbers += i;
        }
        System.out.println(sumOfOddNumbers);

        // Task 3.7
        System.out.println("Task 3.7");

        int sumOfEvenNumbers = 0;
        int average;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 != 0) continue;
            sumOfEvenNumbers += i;
        }
        average = sumOfEvenNumbers / 50;
        System.out.println(average);

        // Task 3.8
        System.out.println("Task 3.8");

        Scanner scanner = new Scanner(System.in);

        int sumOfInputNumbers = 0;
        double averageOfInputNumbers;
        System.out.println("Input 10 numbers: ");
        for(int i = 1; i <= 10; i++) {
            sumOfInputNumbers += scanner.nextInt();
        }
        averageOfInputNumbers = (double) sumOfInputNumbers / 10;

        System.out.println(sumOfInputNumbers);
        System.out.println(averageOfInputNumbers);

        // Task 3.9
        System.out.println("Task 3.9");

        System.out.println("Input number of terms: ");
        int inputNumber = scanner.nextInt();

        int cube = 1;
        for(int i = 1; i <= inputNumber; i++) {
            cube = i * i * i;
            System.out.println("Number is: " + i + " and cube of the " + i + " is " + cube);
        }

        // Task 3.10
        System.out.println("Task 3.10");

        System.out.println("Input number (Table to be calculated): ");
        int givenNumber = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(givenNumber + " X " + i +" = " + givenNumber * i);
        }

        // Task 3.11
        System.out.println("Task 3.11");

        System.out.println("Input number:");
        int number = scanner.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime && number != 1) {
            System.out.println(number + " is a prime number");
        } else System.out.println(number + " isn't a prime number");

        // Task 3.12
        System.out.println("Task 3.12");

        System.out.println("Input number of terms to display: ");
        int quantityOfNumbers = scanner.nextInt();

        int currentNUmber_1 = 0;
        int currentNUmber_2 = 1;

        if(quantityOfNumbers > 0){
            System.out.println("Here is the Fibonacci series up to "+ quantityOfNumbers + "terms:");
            System.out.print(currentNUmber_1 + " ");
            if(quantityOfNumbers > 1){
                System.out.print(currentNUmber_2 + " ");
            }
        }

        for(int i = 2; i < quantityOfNumbers; i++) {
            System.out.print(currentNUmber_1 + currentNUmber_2 + " ");
            currentNUmber_2 = currentNUmber_1 + currentNUmber_2;
            currentNUmber_1 = currentNUmber_2 - currentNUmber_1;
        }
        System.out.println();

        if(quantityOfNumbers < 1) {
            System.out.println("Wrong input.");
        }

        // Task 3.13
        System.out.println("Task 3.13");

        String text = "ROBOTS_WILL_KILL_ALL_HUMANZ";
        String reverseText = "";
        for(int i = 0; i < text.length(); i++) {
            reverseText += text.charAt(text.length() - 1 - i);
        }
        System.out.println(reverseText);

    }
}
