package org.example.easy;

import java.util.stream.Collectors;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(""))return true;

        /*String diff = t.chars().filter(a -> s.contains(Character.toString(a))).boxed().map(b -> String.valueOf((char)b.intValue()))
                .collect(Collectors.joining(""));

        System.out.println(diff);*/

        char[] diffChars = t.toCharArray();
        char[] sChars = s.toCharArray();
        int k = 0;

        for (int i = 0; i < diffChars.length; i++) {
            if(diffChars[i] == sChars[k]){
                k++;
            }

            if(k == sChars.length) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
        System.out.println(isSubsequence.isSubsequence("b", "c"));
    }
}
