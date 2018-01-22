package lesson3;

import java.util.Scanner;

public class SumOfFigures {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = in.nextInt();

        System.out.println("Sum of figures is " + getSumOfFiguresOfNumberFor(num) + ". (loop FOR)");
        System.out.println("Sum of figures is " + getSumOfFiguresOfNumberWhile(num) + ". (loop WHILE)");
    }

    private static int getSumOfFiguresOfNumberFor(int value) {
        int sum = 0;
        int remainder;
        for (; value != 0; ) {
            remainder = value % 10;
            sum += remainder;
            value /= 10;
        }
        return sum;
    }

    private static int getSumOfFiguresOfNumberWhile(int value){
        int sum = 0;
        while(value != 0){
            int remainder = value % 10;
            sum += remainder;
            value /= 10;
        }
        return sum;
    }


}
