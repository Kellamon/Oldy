package org.example.cw2;

import java.util.Scanner;

public class Ex2 {
    // Найти количество положительных чисел, после которых следует отрицательное число.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.printf("result = %d", someFunction(length));
    }

    public static int someFunction(int n) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int lastNum = -1;
        for (int i = 0; i < n; i++) {
            int currentNum = scanner.nextInt();
            if (lastNum >= 0 && currentNum < 0) {
                counter++;
            }
            lastNum = currentNum;
        }
        return counter;
    }
}