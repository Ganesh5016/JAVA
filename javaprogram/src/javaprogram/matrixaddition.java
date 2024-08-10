package javaprogram;

public class matrixaddition {
    public static void main(String[] args) {
        int[][] mat1 = { {1, 2}, {5, 3} };
        int[][] mat2 = { {2, 3}, {4, 1} };
        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Matrix Addition Result:");
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
