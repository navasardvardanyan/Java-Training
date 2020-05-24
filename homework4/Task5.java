package homework4;

import java.util.Random;

public class Task5 {

    // Task 4.5

    public static void main(String[] args) {

        int[][] matrix = new int[10][15];
        randomInitializationOfMatrix(matrix);
        printMatrix(matrix);
        findAndPrintMaximumElementOfMatrix(matrix);

    }

    public static int[][] randomInitializationOfMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(90) + 10;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findAndPrintMaximumElementOfMatrix(int[][] matrix) {
        int maximum = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > maximum) {
                    maximum = matrix[i][j];
                }
            }
        }
        System.out.println(maximum);
    }
}
