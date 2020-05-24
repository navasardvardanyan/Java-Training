package homework4;

import java.util.Scanner;

public class Task10 {

    // Task 4.10

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Task7.randomInitializationOfMatrix(matrix);
        Task7.printMatrix(matrix);
        displayMenu(matrix);
    }

    public static void displayMenu(int[][] matrix) {
        System.out.println("--------------- MENU ---------------- \n" +
                "1. For rotating 90* \n" +
                "2. For rotating 180* \n" +
                "3. For rotating 270* \n" +
                "4. For Exit \n");
        Scanner scanner = new Scanner(System.in);
        int[][] rotatedMatrix;
        int number = scanner.nextInt();
        while (true) {
            if(number == 1) {
                rotatedMatrix = Task7.rotateMatrixClockwise90(matrix,5,5);
                Task7.printMatrix(rotatedMatrix);
            }
            else if(number == 2) {
                rotatedMatrix = Task8.rotateMatrixClockwise180degrees(matrix,5,5);
                Task8.printMatrix(rotatedMatrix);
            }
            else if(number == 3) {
                rotatedMatrix = Task9.rotateMatrixClockwise270degrees(matrix,5,5);
                Task9.printMatrix(rotatedMatrix);
            }
            else if(number == 4) {
                return;
            }
            System.out.println("———————- MENU —————- \n" +
                    "1. For rotating 90* \n" +
                    "2. For rotating 180* \n" +
                    "3. For rotating 270* \n" +
                    "4. For Exit \n");
            number = scanner.nextInt();
        }
    }

}
