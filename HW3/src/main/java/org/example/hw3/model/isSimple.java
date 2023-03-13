package org.example.hw3.model;

/**
 * Алгоритм проверки числа на простоту
 *
 * @param number - число, проверяемое на простоту
 * @return - true = число простое, false = число составное
 */

public class isSimple {
    public static boolean isSimplee(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
