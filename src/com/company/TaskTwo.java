package com.company;

// Given integer numbers M and N. A pawn is placed on the most left upper cell of the MxN chessboard.
// Find the number of ways of pawn to get to the bottom right cell if it only can move one or two steps right or one step down.
public class TaskTwo {
    static int res = 0;
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        System.out.println(pathCounter(0, 0, x - 1, y -1, 2));
    }

    public static int pathCounter(int n, int m, int x, int y, int i) {
        if (n == x && m == y) {
            return res + pathCounter(0, 0, x, y, 1);
        }
        if (n == x || m == y) {
            return 1;
        }
        return res + pathCounter(n + 1, m, x, y, i) + pathCounter(n, m + 1, x, y, i);
    }
}
