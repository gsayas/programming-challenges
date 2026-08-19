package org.example.medium;

public class ReverseWordsString {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                result.append(words[i]).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWordsString reverseWordsString = new ReverseWordsString();
        System.out.println(reverseWordsString.reverseWords("the sky is blue"));
    }


}
