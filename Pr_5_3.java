package ru.mirea.Lab5.Pr_5_3;

public class Pr_5_3 {
    public static String recursion(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a + 1, b);
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(5, 0));
        System.out.println(recursion(0, 5));
    }
}
