package com.company;

public class StringUtils {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static int countVowels(String str) {
        str += " ";
        String regex = "[aeiouAEIOU]";
        return Math.max(str.split(regex).length - 1, 0);
    }

    public static int countConsonants(String str) {
        str += " ";
        String regex = "[^aeiouAEIOU]";
        return Math.max(str.split(regex).length - 1, 0);
    }

    public static int countSubstring(String str, String subStr) {
        int count = 0;
        int index = str.indexOf(subStr);
        while (index != -1) {
            count++;
            index = str.indexOf(subStr, index + 1);
        }
        return count;
    }

}
