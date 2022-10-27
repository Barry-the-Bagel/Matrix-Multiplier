/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package csu.cis260_york_homework8_and_9_question1;

import java.util.Scanner;

/**
 *
 * @author spenceryork
 */
public class CIS260_York_Homework8_and_9_Question1 {

    public static void main(String[] args) {
        
        // Matrix element variables
        int row = 3;
        int col = 3;


        // Create matrices
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] matrix3 = new int[row][col];


        // User input for matrix values
        System.out.println("Enter the values for the matrices: " );
        Scanner input = new Scanner(System.in);

        // Add values to matrix1
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
         // Add values to matrix2
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrix2[i][j] = input.nextInt();
                
                // multiply matrix 1 and 2
                matrix3[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        System.out.println();
         // Print matrix3
         for (int i = 0; i < col; i++) {
             for (int j = 0; j < row; j++) {
                System.out.print(
                                    matrix1[0][i] + " " + matrix1[0][j+1] + " " + matrix1[0][j+2] + " "
                                    + " * " +
                                    matrix2[1][j] + " " + matrix2[1][j+1] + " " + matrix2[1][j+2] + " "
                                    + " = " +
                                    matrix3[2][j] + " " + matrix3[2][j+1] + " " + matrix3[2][j+2] + " "
                                );
                break;
             }
             System.out.println();
         }
         System.out.println();

        // Display matrices and the result
        
    }
}
