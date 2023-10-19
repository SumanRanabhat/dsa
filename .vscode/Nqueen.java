

import java.util.Scanner;

public class Nqueen {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of queens (n):");
        int n = sc.nextInt();
        Integer[][] matrix = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }

        if (findSolution(matrix, n, 0)) {
            System.out.println("Solution found:");
            printMatrix(matrix);
        } else {
            System.out.println("No solution found.");
        }

        sc.close();
    }

    public static boolean findSolution(Integer[][] matrix, int n, int col) {
        if (col >= n) {
            return true;
        }

        for (int i = 0; i < n; i++) {
            if (isSafe(matrix, i, col, n)) {
                matrix[i][col] = 1;
                if (findSolution(matrix, n, col + 1)) {
                    return true;
                }
                matrix[i][col] = 0; // Backtrack
            }
        }
        return false;
    }

    public static boolean isSafe(Integer[][] matrix, int row, int col, int n) {
        for (int i = 0; i < col; i++) {
            if (matrix[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (matrix[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void printMatrix(Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

