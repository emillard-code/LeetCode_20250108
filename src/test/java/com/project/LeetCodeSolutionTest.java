package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void countPrefixAndSuffixPairsTest() {

        assertEquals(4, LeetCodeSolution.countPrefixSuffixPairs(new String[] {"a","aba","ababa","aa"}));
        assertEquals(2, LeetCodeSolution.countPrefixSuffixPairs(new String[] {"pa","papa","ma","mama"}));
        assertEquals(0, LeetCodeSolution.countPrefixSuffixPairs(new String[] {"abab","ab"}));

    }

}
