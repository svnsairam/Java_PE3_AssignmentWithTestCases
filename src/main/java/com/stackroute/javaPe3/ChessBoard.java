/*
Write a program to create a ChessBoard pattern with the help of multidimensional array, where WWrepresents white color and BB represents Black color.
 Output:
 My Chess Board
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
 */
package com.stackroute.javaPe3;

public class ChessBoard {
    public static void main(String arg[]) {
        String row1 = "WW|BB|WW|BB|WW|BB|WW|BB|";
        String row2 = "BB|WW|BB|WW|BB|WW|BB|WW|";
        // add the above 2 row patterns  to chessBoard array alternatively.
        String chessBoard[][] = new String[8][];
        for (int i = 0; i < 8; ) {
            chessBoard[i] = row1.split("");
            chessBoard[i + 1] = row2.split("");
            i = i + 2;
        }
        // Print the pattern present in chessBoard array
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < row1.length(); j++) {
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }
}
