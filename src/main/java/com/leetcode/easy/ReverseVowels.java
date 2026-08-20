package com.leetcode.easy;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseVowels {
    public String reverseVowels(String s) {

        List<Integer> chars = s.chars().boxed().collect(Collectors.toList());
        List<Character> vowels = chars.stream().filter(ReverseVowels::isVowel).map(a -> (char) a.intValue()).collect(Collectors.toList());
        Collections.reverse(vowels);
        int k = 0;

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < chars.size(); i++) {

            if (isVowel(chars.get(i))) {
                out.append(Character.isUpperCase(chars.get(i)) ? vowels.get(k) : vowels.get(k));
                k++;
            } else {
                out.append((char) chars.get(i).intValue());
            }
        }

        return out.toString();

    }

    private static boolean isVowel(int ch) {
        return ch == 65 || ch == 69 || ch == 73 || ch == 79 || ch == 85 ||
                ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117;
    }

    public static void main(String[] args) {
        String str = "aeiHU";

        System.out.println(new ReverseVowels().reverseVowels(str));
    }
}
