package de.xing.tut.interview;

public class Matrix {

    private static String findIndex(int [][] nrs, int target) {
        int x = 0;
        int y = nrs[0].length - 1;
        while(x < nrs.length && y >0) {
            if (nrs[x][y] < target) {
                x++;
            } else {
                y--;
            }
            if (nrs[x][y] == target) {
                return String.format("the index of the nr %s is (%s, %s) \n", target, x, y);
            }
        }
     return String.format("nr %s is not inside of the matrix \n", target);
    }

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,5},{7,9,10,21},{13,20,31,40}};
        System.out.println(findIndex(matrix, 7));
        System.out.println(findIndex(matrix, 1));
        System.out.println(findIndex(matrix, 4));
        System.out.println(findIndex(matrix, 21));
        System.out.println(findIndex(matrix, 40));
        System.out.println(findIndex(matrix, 6));
        System.out.println(findIndex(matrix, 31));
    }
}
