package homework4;

import java.util.Random;

public class Task9 {

    // Task 4.9

    public static void main(String[] args) {
        int[][] matrix = new int[10][15];
        randomInitializationOfMatrix(matrix);
        printMatrix(matrix);
        printMatrix(rotateMatrixClockwise270degrees(matrix,10,15));
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

    public static int[][] rotateMatrixClockwise270degrees(int[][] matrix, int row,int column) {
        int[][] rotatedMatrix = new int[column][row];
        for (int i = 0; i < column; i++) {
            for(int j = 0; j < row; j++) {
                rotatedMatrix[i][j] = matrix[j][column-1-i];
            }
        }
        return rotatedMatrix;
    }
}
