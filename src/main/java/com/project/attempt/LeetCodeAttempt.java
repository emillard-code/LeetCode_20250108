package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(countPrefixAndSuffixPairs(new String[] {"a","aba","ababa","aa"}));
        System.out.println(countPrefixAndSuffixPairs(new String[] {"pa","papa","ma","mama"}));
        System.out.println(countPrefixAndSuffixPairs(new String[] {"abab","ab"}));

    }

    public static int countPrefixAndSuffixPairs(String[] words) {

        int answer = 0;

        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {

                if (isPrefixAndSuffix(words[i], words[j])) { answer++; }

            }

        }

        return answer;

    }

    private static boolean isPrefixAndSuffix(String str1, String str2) {

        if (str1.length() > str2.length()) { return false; }

        String str2Prefix = str2.substring(0, str1.length());
        String str2Suffix = str2.substring(str2.length() - str1.length());

        if (str2Prefix.equals(str1) && str2Suffix.equals(str1)) { return true; }

        return false;

    }

}
