package homework4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    // Task 4.1

    public static void main(String[] args) {
        int[] array = new int[10];
         initializeRandomArray(array);
        printArray(array);
        boolean check = isElementBelongToArray(inputNumber(),array);
        System.out.println(check);
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

    public static boolean isElementBelongToArray(int element, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(element == array[i]) return true;
        }
        return false;
    }



}
