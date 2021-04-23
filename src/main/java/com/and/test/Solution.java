package com.and.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    /**
     * The following is the method where the solution shall be written
     */

    public static String solution(String input) throws NumberFormatException {
        // Check if input does not contain numbers
        String numbersInput = removeAlpha(input);
        // If no numbers found, throw exception
        if (numbersInput.length() == 0){
            throw new NumberFormatException("Input must contain at least one number");
        }

        // recursively get AND siblings
        ArrayList<String> results = new ArrayList<String>();
        getAndSiblings(results, "", numbersInput);

        // Sort results in descending order
        List<String> sortedResults = results
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // return string
        return String.join(",", sortedResults);
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
