package com.company;

public class TaskEight {
    public static void main(String[] args) {
        int num = 4;

        System.out.println(pathCounter(0, 0, num - 1));
    }


    public static int pathCounter(int n, int m, int num) {
        if (n == num && m == num) {
            return 0;
        }
        if (n == num || m == num) {
            return 1;
        }
        if (n + 2 >= num && m + 1 >= num) {
            return 1;
        }
        if (n + 1 >= num && m + 2 >= num){
            return 1;
        }
        return pathCounter(n + 1, m, num) + pathCounter(n, m + 1, num);
    }
}
