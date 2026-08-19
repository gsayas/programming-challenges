package org.example.notes;

import java.util.Set;
import java.util.stream.Collectors;

public class CharUtils {

    public String removeDuplicates(String s) {

        Set<Character> noDups = s.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

        return noDups.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        CharUtils charUtils = new CharUtils();
        String s = "abcabc";
        System.out.println(charUtils.removeDuplicates(s)); // Output: abc
    }
}
