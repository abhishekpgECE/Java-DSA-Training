package com.basics.arrays;

public class E3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9};// 1 dimensional array
        //2D array or Matrix or [array of arrays]
        System.out.println(arr.length);
        int[][] matrix = {{1, 2, 3},//0
                {3, 4, 5},//1
                {7, 6, 7},//2
                {4, 5, 6, 7}};//3
        //total no of rows = total number of mATRIX
        System.out.println(matrix.length);//total no of rows
        System.out.println(matrix[0].length);//length of first colume
        for (int r = 0; r < matrix.length; r++) {//row
            for (int c = 0; c < matrix[0].length; c++) {//coloum
                System.out.println(matrix[r][c] + " ");//cell[n],[c]
            }
            System.out.println();
        }
        // when in 2d array or atrix the rows are not equal
        // this type of an array is called "jagged array"8
        char[][] languages = {{'j', 'n', 'h', 'a', 't'},
                {'j', 't', 'a', 'k', 'a'},
                {'b', 'a', 'h', 't',},
                {'g', 'o', 'd', 'a'}};
        System.out.println(languages[0].length);//length of 1st row
        System.out.println(languages[3].length);//length of 2nd row
        System.out.println(languages[2].length);//length of 3rd row
        for (int r = 0; r < languages.length; r++) {//row 0 till 3
            for(int c=0;c<languages[r].length;c++){
                System.out.print(languages[r][c] + " ");
            }
            System.out.println();
        }
    }
}