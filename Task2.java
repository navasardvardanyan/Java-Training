package homework4;

import java.util.Random;

public class Task2 {

    // Task 4.2

    public static void main(String[] args) {
        int[] array = new int[10];
        initializeRandomArray(array);
        printArray(array);
        printArray(sortArrayInAscendingOrder(array));
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

    public static int[] sortArrayInAscendingOrder(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for(int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    swap(array, j, j+1);
                }
            }
        }
        return array;
    }

    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int thirdVariable = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = thirdVariable;
    }


}
