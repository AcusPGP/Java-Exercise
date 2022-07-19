package exercise;

import java.util.Scanner;

/**
 * Exercise 12: Find the estimation of an integer by recursive method
 */
public class IntegerEstimation {
    /**
     * Get input
     * @param input
     * @return
     */
    public static String getInput(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.print(input);
        return sc.nextLine();
    }

    /**
     * Check and find the estimation of the intger
     * @param n
     * @param i
     * @return
     */
    static int checkInteger(int n, int i) {
        if (n == i) {
            System.out.print(n);
            return n;
        }
        if (n % i == 0) {
            System.out.print(i + " ");
            return checkInteger(n, i + 1);
        }
        return checkInteger(n, i + 1);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println(" ");
            int n = Integer.parseInt(getInput("Please input a number: "));
            System.out.print("The estimation of the number " + n + " is ");
            int i = 1;
            int t = checkInteger(n, i);
        }
    }
}
