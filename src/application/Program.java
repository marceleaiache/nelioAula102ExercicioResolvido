package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer number to create a matrix: ");
        int n = sc.nextInt();
        sc.nextLine();

        //INSTACIANDO A MATRIZ NA MEMÓRIA
        int[][] mat = new int[n][n];

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();

        int countNegativeNumbers = 0;

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    countNegativeNumbers++;
                }
            }
        }

        System.out.println("Negative numbers =  " + countNegativeNumbers);

        sc.close();
    }
}
