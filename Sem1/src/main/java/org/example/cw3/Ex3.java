package org.example.cw3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.printf("result = %s", swapParts(line));
    }

    public static String swapParts(String inputString) {
        String part1 = "";
        String part2 = "";
        String part3 = "";
        if (inputString.length() % 2 == 0) {
            part1 = inputString.substring(0, inputString.length() / 2);
            part3 = inputString.substring(inputString.length() / 2);
        }
        else {
            part1 = inputString.substring(0, inputString.length() / 2);
            part3 = inputString.substring(inputString.length() / 2 + 1);
            part2 = inputString.substring(inputString.length() / 2, inputString.length() / 2 + 1);
            return part3 + part2 + part1;
        }
        return part3 + part2 + part1;
    }
}
