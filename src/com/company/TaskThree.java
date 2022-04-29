package com.company;

// Given integer number N. A pawn is placed on the most left bottom cell of the 2Nx2N chessboard.
// The part of the chessboard of size NxN on the right bottom corner is totally scratched and the pawn cannot step to that part.
// Find the number of ways of pawn to get to the top right cell if it only can move one step right or one step up.

public class TaskThree {
    static int n = 2;

    public static void main(String[] args) {
        System.out.println(pathCounter(0, 0, n));
    }

    public static int pathCounter(int n, int m, int num) {
        if (n == num && m == num) {
            return 0;
        }
        if (n == num || m == num) {
            return 1;
        }
        if (n >= num / 2 || m >= num /2) {
            return 1;
        }
        return pathCounter(n + 1, m, num) + pathCounter(n, m + 1, num);
    }
}

