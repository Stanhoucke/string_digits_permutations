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
        // Remove non-numeric characters from input
        String numbersInput = removeAlpha(input);

        // If no numbers found, throw exception
        if (numbersInput.length() == 0){
            throw new NumberFormatException("Input must contain at least one number");
        }

        // Create ArrayList to store AND Siblings
        ArrayList<String> results = new ArrayList<String>();

        // Recursively get AND Siblings
        getAndSiblings(results, "", numbersInput);

        // Sort results in descending order
        List<String> sortedResults = results
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // Return the sorted results as a string
        return String.join(",", sortedResults);
    }

    public static void getAndSiblings(ArrayList<String> results, String selectedDigits, String remainingDigits) {
        // base case
        if (remainingDigits.length() == 0){
            results.add(selectedDigits);
            return;
        }

        // Iterate through remaining digits
        for (int i = 0; i < remainingDigits.length(); i++) {
                // Select next digit, update remaining digits without selected digit
                String newSelectedDigits = selectedDigits + remainingDigits.charAt(i);
                String newRemainingDigits = remainingDigits.substring(0, i) + remainingDigits.substring(i + 1);

                // Check results for duplicates
                if (results.contains(newSelectedDigits + newRemainingDigits)){
                    continue;
                }
                // Recursive call with updated arguments
                getAndSiblings(results, newSelectedDigits, newRemainingDigits);
        }
    }

    public static String removeAlpha(String input) {
        // Create StringBuilder to store updated input
        StringBuilder inputNumbers = new StringBuilder();

        // Iterate through input adding digits to inputNumbers
        for (int i = 0; i < input.length(); i++) {
            char currentElement = input.charAt(i);
            if (Character.isDigit(currentElement)){
                inputNumbers.append(currentElement);
            }
        }
        // Return updated inputNumbers as string
        return inputNumbers.toString();
    }

    public static void main(String args[]) {
        solution("326");
    }

}
