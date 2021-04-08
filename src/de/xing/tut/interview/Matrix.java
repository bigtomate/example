package de.xing.tut.interview;

public class Matrix {

    private static String findIndex(int [][] nrs, int target) {
        int x = 0;
        int y = nrs[0].length - 1;
        while(x < nrs.length - 1  && y >0) {
            if (nrs[x][y] < target) {
                x++;
            } else {
                y--;
            }
            if (nrs[x][y] == target) {
                return String.format("the index of the nr %s is [%s][%s]", target, x, y);
            }
        }
     return String.format("nr %s is not inside of the matrix", target);
    }

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,5},{7,9,10,21},{13,20,31,40}};
        String message = findIndex(matrix, 8);
        System.out.println(message);
    }
}
