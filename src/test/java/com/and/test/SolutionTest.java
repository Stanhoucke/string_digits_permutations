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

    
}
