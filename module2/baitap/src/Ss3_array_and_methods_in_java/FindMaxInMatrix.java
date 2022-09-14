package Ss3_array_and_methods_in_java;

public class FindMaxInMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int max = matrix[0][0];

        //random số trong mảng
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 25);
            }
        }

        //in mảng
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        // duyệt và tìm max
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("số lớn nhất trong ma trận là : " + max);

    }
}
