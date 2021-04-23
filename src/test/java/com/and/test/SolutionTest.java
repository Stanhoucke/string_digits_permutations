package com.and.test;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SolutionTest {
    Solution solution;

    @Test
    public void removeAlpha_returnsNumbersOnly(){
        assertEquals("326", solution.removeAlpha("A32 B6"));
    }

    @Test
    public void solutionFor3Numbers(){
        assertEquals("632,623,362,326,263,236", solution.solution("326"));
    }

    @Test
    public void solutionFor3NumbersWithLettersAndSpaces(){
        assertEquals("632,623,362,326,263,236", solution.solution("A 3B2 C6D"));
    }

    @Test
    public void solutionFor4Numbers(){
        assertEquals("4321,4312,4231,4213,4132,4123,3421,3412,3241,3214,3142,3124,2431,2413,2341,2314,2143,2134,1432,1423,1342,1324,1243,1234", solution.solution("2143"));
    }

    @Test
    public void solutionWithDuplicateNumbers(){
        assertEquals("3211,3121,3112,2311,2131,2113,1321,1312,1231,1213,1132,1123", solution.solution("1213"));
    }

    @Test
    public void solutionFor1Number(){
        assertEquals("9", solution.solution("9"));
    }

    @Test(expected = NumberFormatException.class)
    public void solutionThrowsNumberException(){
        solution.solution("ABC");
    }

    @Test
    public void solutionRunsForLargeNumberWithDuplicates(){
        solution.solution("48276270146");
    }
}
