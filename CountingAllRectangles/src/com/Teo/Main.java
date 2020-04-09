package com.Teo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Instance variables. Represents the number of points and indexes of the for I am gonna use
         * Reading the points from the keyboard and entering them in a matrix
         * Counting the number of rectangles using the method defined in the Count class
         */
        int Points, i, j;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of points");

        Points = in.nextInt();

        int Matrix[][] = new int[Points][2];

        System.out.println("Enter the elements of the matrix");
        for (i = 0; i < Points; i++)
            for (j = 0; j < 2; j++)
                Matrix[i][j] = in.nextInt();

        Count NumberOf = new Count();
        System.out.println("The number of rectangles are: " + NumberOf.getRectangles(Matrix));
    }
}

