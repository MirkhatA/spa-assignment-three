package com.company;

// Given integer number N. Let’s consider spaceship placed on coordinates (0;0;0).
// It can move only along the axes, and only for 1 parsec for one warp.
// How many ways it can get to the position (N;N;N) in parsecs if it have to spend minimum amount of warps?
public class TaskFive {
    static int res = 0;
    public static void main(String[] args) {
        int n = 4;

        System.out.println(pathCounter(0, 0, 0, n - 1) * 2);
    }

    public static int pathCounter(int n, int m, int l, int num) {
        if (n == num && m == num && l == num) {
            return 0;
        }
        if (n == num || m == num || l == num) {
            return 1;
        }

        return pathCounter(n + 1, m, l, num) + pathCounter(n, m + 1, l, num) + pathCounter(n, m, l + 1, num);
    }
}
