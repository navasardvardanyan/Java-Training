package homework4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

    // Task 4.4

    public static void main(String[] args) {
        int[] array = new int[10];
        initializeRandomArray(array);
        printArray(array);
        int indexOfNumber = findIndexOfNumberInArray(inputNumber(),array);
        System.out.println(indexOfNumber);
    }


    public static int[] initializeRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number:");
        return scanner.nextInt();
    }
    
    public static int findIndexOfNumberInArray(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number) {
                return i;
            }
        }
        return -1;
    }


}
