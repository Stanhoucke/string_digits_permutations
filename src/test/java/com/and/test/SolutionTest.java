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

    @Test(expected = NumberFormatException.class)
    public void solutionThrowsNumberException(){
        solution.solution("ABC");
    }
}
