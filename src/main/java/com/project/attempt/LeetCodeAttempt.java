package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(countPrefixAndSuffixPairs(new String[] {"a","aba","ababa","aa"}));
        System.out.println(countPrefixAndSuffixPairs(new String[] {"pa","papa","ma","mama"}));
        System.out.println(countPrefixAndSuffixPairs(new String[] {"abab","ab"}));

    }

    // This method counts the number of elements that are both prefixes and suffixes of another element.
    public static int countPrefixAndSuffixPairs(String[] words) {

        int answer = 0;

        // We loop through words[], and for each element do another loop
        // where (i < j) as per challenge specifications to find the
        // number of prefix/suffix combinations among the elements.
        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {

                if (isPrefixAndSuffix(words[i], words[j])) { answer++; }

            }

        }

        return answer;

    }

    // A helper method that returns true if str1 is both a prefix and suffix of str2.
    private static boolean isPrefixAndSuffix(String str1, String str2) {

        if (str1.length() > str2.length()) { return false; }

        String str2Prefix = str2.substring(0, str1.length());
        String str2Suffix = str2.substring(str2.length() - str1.length());

        if (str2Prefix.equals(str1) && str2Suffix.equals(str1)) { return true; }

        return false;

    }

}
