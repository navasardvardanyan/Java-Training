package homework4;

import java.util.Random;
import java.util.Scanner;

public class Task6 {

    // Task 4.6

    public static void main(String[] args) {
        int[][] matrix = new int[10][15];
        randomInitializationOfMatrix(matrix);
        printMatrix(matrix);
        int sumOfRow = sumOfGivenRoxOfMatrix(matrix,getRowNumberFromConsole());
        System.out.println(sumOfRow);
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

    public static int getRowNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the row:");
        return scanner.nextInt();
    }

    public static int sumOfGivenRoxOfMatrix(int[][] matrix, int row) {
        int sum = 0;
        for (int i = 0; i < matrix[row].length; i++) {
            sum += matrix[row][i];
        }
        return sum;
    }
}
