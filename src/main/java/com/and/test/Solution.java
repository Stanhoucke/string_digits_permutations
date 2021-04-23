package com.and.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {

    /**
     * The following is the method where the solution shall be written
     */

    public static String solution(String input) throws NumberFormatException {
        // Check if input does not contain numbers
            // Iterate through chars of string
            // If number found, add to new string
            // If no numbers found, throw exception

        // Select first digit in number string
        // Select next digit
        // repeat until no digits remain (string length is 0)
        // go to previous digit, replace with last digit
            // base case, no remaining digits
            // recursive case, selected digits + remaining digits
            // add each recursion to results list

        // Sort results in descending order
        // return string

        return null;
    }

    public static void getAndSiblings(ArrayList<String> results, String selectedDigits, String remainingDigits) {
        // base case
        if (remainingDigits.length() == 0){
            results.add(selectedDigits);
            return;
        }

        for (int i = 0; i < remainingDigits.length(); i++) {
            String newSelectedDigits = selectedDigits + remainingDigits.charAt(i);
            String newRemainingDigits = remainingDigits.substring(0, i) + remainingDigits.substring(i + 1);
            getAndSiblings(results, newSelectedDigits, newRemainingDigits);
        }
    }

    public static String removeAlpha(String input) {
        StringBuilder inputNumbers = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentElement = input.charAt(i);
            if (Character.isDigit(currentElement) ){
                inputNumbers.append(currentElement);
            }

        }

        return inputNumbers.toString();
    }

    public static void main(String args[]) {
        solution("326");
//        ArrayList<String> results = new ArrayList<String>();
//        getAndSiblings(results, "","326");
//        System.out.println(results);
    }

}
