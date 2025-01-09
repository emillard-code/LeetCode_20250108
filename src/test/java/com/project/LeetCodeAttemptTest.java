package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void countPrefixAndSuffixPairsTest() {

        assertEquals(4, LeetCodeAttempt.countPrefixAndSuffixPairs(new String[] {"a","aba","ababa","aa"}));
        assertEquals(2, LeetCodeAttempt.countPrefixAndSuffixPairs(new String[] {"pa","papa","ma","mama"}));
        assertEquals(0, LeetCodeAttempt.countPrefixAndSuffixPairs(new String[] {"abab","ab"}));

    }

}
