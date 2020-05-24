package homework4;

import java.util.Random;

public class Task8 {

    // Task 4.8

    public static void main(String[] args) {
        int[][] matrix = new int[10][15];
        randomInitializationOfMatrix(matrix);
        printMatrix(matrix);
        System.out.println();
        int[][] rotatedMatrix = rotateMatrixClockwise180degrees(matrix,10,15);
        printMatrix(rotatedMatrix);
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

    public static int[][] rotateMatrixClockwise180degrees(int[][] matrix, int row,int column) {
        int[][] rotatedMatrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                rotatedMatrix[i][j] = matrix[row-1-i][column-1-j];
            }
        }
        return rotatedMatrix;
    }


}
