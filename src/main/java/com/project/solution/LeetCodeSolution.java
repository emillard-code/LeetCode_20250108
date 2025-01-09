package com.project.solution;

public class LeetCodeSolution {

    public static void main(String[] args) {

        System.out.println(countPrefixSuffixPairs(new String[] {"a","aba","ababa","aa"}));
        System.out.println(countPrefixSuffixPairs(new String[] {"pa","papa","ma","mama"}));
        System.out.println(countPrefixSuffixPairs(new String[] {"abab","ab"}));

    }

    public static int countPrefixSuffixPairs(String[] words) {

        int n = words.length;
        int count = 0;

        // Step 1: Iterate through each pair of words
        for (int i = 0; i < n; ++i) {

            for (int j = i + 1; j < n; ++j) {

                String str1 = words[i];
                String str2 = words[j];

                // Step 2: Skip if the first string is larger than the second
                if (str1.length() > str2.length()) continue;

                // Step 3: Check if str1 is both the prefix and suffix of str2
                if (str2.startsWith(str1) && str2.endsWith(str1)) { ++count; }

            }

        }

        // Step 4: Return the total count of prefix-suffix pairs
        return count;

    }

}
