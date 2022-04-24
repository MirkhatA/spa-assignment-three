package com.company;

public class TaskOne {
    public static void main(String[] args) {
        int num = 3;

        System.out.println(pathCounter(0, 0, num - 1));
    }

    public static int pathCounter(int n, int m, int num) {
        if (n == num && m == num) {
            return 0;
        }
        if (n == num || m == num) {
            return 1;
        }
        return pathCounter(n + 1, m, num) + pathCounter(n, m + 1, num) + pathCounter(n + 1, m + 1, num);
    }
}