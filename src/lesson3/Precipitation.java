package lesson3;

import java.util.Scanner;

public class Precipitation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int days = in.nextInt();
        int sum = 0;
        int maxValue = 0;
        for (int i = 1; i <= days; i++) {
            System.out.print("Enter value for the " + i + " day: ");
            int current = in.nextInt();
            sum += current;
            if (current > maxValue) {
                maxValue = current;
            }
        }
        System.out.println("______________________________");
        System.out.println("SUMMARY:");
        System.out.println("______________________________");
        System.out.println("Days: " + days);
        System.out.println("Precipitation sum: " + sum);
        System.out.println("Average precipitation: " + (float) sum / days);
        System.out.println("Max precipitation: " + maxValue);
        System.out.println("______________________________");
    }
}
