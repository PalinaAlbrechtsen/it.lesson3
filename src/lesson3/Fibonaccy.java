package lesson3;

import java.util.Scanner;

public class Fibonaccy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();

        System.out.print("Fibonaccy to " + num + ": ");
        fibonaccyLoop(num);
        System.out.println(" (loop FOR).");

        System.out.print("Fibonaccy to " + num + ": ");
        fibonaccyWhile(num);
        System.out.println(" (loop WHILE).");

        System.out.print("Fibonaccy to " + num + ": ");
        fibonaccyRecursion(num, 1, 0);
        System.out.println(" (recursive call).");
    }

    private static void fibonaccyLoop(int value) {
        int next = 1;
        int current = 0;
        for (; next < value; ) {
            int previous = current;
            current = next;
            System.out.print(" " + current);
            next = current + previous;
        }
    }

    private static void fibonaccyWhile(int val) {
        int next = 1;
        int current = 0;
        while (next < val) {
            int previous = current;
            current = next;
            System.out.print(" " + current);
            next = current + previous;
        }
    }

    private static void fibonaccyRecursion(int val, int next, int current) {
        if (next < val) {
            int previous = current;
            current = next;
            System.out.print(" " + current);
            next = current + previous;
            fibonaccyRecursion(val, next, current);
        }
    }
}
