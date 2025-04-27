import java.util.*;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter the elements of the 3x3 matrix (row by row):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int ldSum = 0;
        int rdSum = 0;
        for (int i = 0; i < 3; i++) {
            ldSum += matrix[i][i];
        }
        for (int i = 0; i < 3; i++) {
            rdSum += matrix[i][2 - i];
        }
        System.out.println("Sum of left diagonal = " + ldSum);
        System.out.println("Sum of right diagonal = " + rdSum);
    }
}

