package org.example.cw1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("result = " + subtractProductAndSum(number));
    }

    /**
     * @param inputNumber some number
     * @return subtraction between product and sum of digits of inputNumber
     */
    public static int subtractProductAndSum(int inputNumber) {
        int sum = 0, prod = 1;
        while (inputNumber != 0) {
            sum += inputNumber % 10;
            prod *= inputNumber % 10;
            inputNumber /= 10;
        }
        return prod - sum;
    }
}
