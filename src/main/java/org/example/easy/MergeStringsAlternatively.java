package org.example.easy;

public class MergeStringsAlternatively {
    public String mergeAlternately(String word1, String word2) {

        String longest = word1.length() >= word2.length() ? word1 : word2;
        String shortest = word2.length() <= word1.length() ? word2 : word1;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < longest.length(); i++) {
            if(i < shortest.length()){
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }else{
                result.append(longest.charAt(i));
            }
        }

        return result.toString();
    }
}
