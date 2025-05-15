// 13.WAP to find a Multiplication of 2 Matrix (dimension and value should be entered by user) 

import java.util.*;

class Thirteen{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of 1st Matrix : ");
        int rows1 = sc.nextInt();
        System.out.print("Enter columns of 1st Matrix : ");
        int cols1 = sc.nextInt();

        int[][] matrix1 = new int[rows1][cols1];

        for(int i = 0; i < rows1; i++){
            for (int j = 0; j < cols1; j++) {
                System.out.print("Enter [" + i + "][" + j + "] Element : ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows1; i++){
            for (int j = 0; j < cols1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter rows of 2nd Matrix : ");
        int rows2 = sc.nextInt();
        System.out.print("Enter columns of 2nd Matrix : ");
        int cols2 = sc.nextInt();

        int[][] matrix2 = new int[rows2][cols2];

        for(int i = 0; i < rows2; i++){
            for (int j = 0; j < cols2; j++) {
                System.out.print("Enter [" + i + "][" + j + "] Element : ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows2; i++){
            for (int j = 0; j < cols2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        int[][] result = new int[rows1][cols2];
        for(int i = 0 ; i < rows1; i++){
            for(int j = 0 ; j < cols2; j++){
                for(int k = 0 ; k < rows2 ; k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j]; 
                }
            }
        }

        System.out.println("Result :");
        for(int i = 0; i < rows1; i++){
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}