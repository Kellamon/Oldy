package org.example.hw1;

import java.util.Scanner;

public class Ex1 {
//    Given an input string s, reverse the order of the words.
//    A word is defined as a sequence of non-space characters.
//    The words in s will be separated by at least one space.
//    Return a string of the words in reverse order concatenated by a single space.
//    Note that s may contain leading or trailing spaces or multiple spaces between two words.
//    The returned string should only have a single space separating the words.
//    Do not include any extra spaces.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(reverseText(text));

    }

    public static String reverseText(String inputText){
        String Text = inputText.replaceAll("\\s+", " ").trim();
        String[] textArr = Text.split(" ");
        String outputText = "";
        for (String word : textArr) {
            outputText = word + " " + outputText;
        }
        return outputText;
    }
}
