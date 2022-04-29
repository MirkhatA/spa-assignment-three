package com.company;

import javax.swing.*;

// Given integer numbers N, K, and coordinates array of K meteors. Coordinates are integer numbers in 2 dimensions.
// Let’s consider spaceship placed on coordinates (0;0).
// It can move only along the axes, and only for 1 parsec for one warp.
// How many ways it can get to the position (N;N) in parsecs with the minimum amount of warps and not colliding with meteors?
public class TaskFour {

    public static void main(String[] args) {
        int n = 4;
        int k = 3;

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }

        arr[k - 1][k - 1] = 8;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println(pathCounter(0, 0, n, k));
    }

    public static int pathCounter(int n, int m, int num, int k) {
        if (n == num && m == num) {
            return 0;
        }
        if (n == num || m == num) {
            return 1;
        }
        if (n == k || m == k ) {
            return 1;
        }
        return pathCounter(n + 1, m, num, k) + pathCounter(n, m + 1, num, k);
    }
}
