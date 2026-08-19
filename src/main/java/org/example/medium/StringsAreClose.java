package org.example.medium;

public class StringsAreClose {

    //Constraints:
    //
    //1 <= word1.length, word2.length <= 105
    //word1 and word2 contain only lowercase English letters.

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
        }

        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }

        int[] freqCount1 = new int[26];
        int[] freqCount2 = new int[26];

        for (int i = 0; i < 26; i++) {
            freqCount1[freq1[i]]++;
            freqCount2[freq2[i]]++;
        }

        for (int i = 0; i < 26; i++) {
            if ((freqCount1[i] == 0 && freqCount2[i] != 0) || (freqCount1[i] != 0 && freqCount2[i] == 0)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        StringsAreClose stringsAreClose = new StringsAreClose();
        String word1 = "abc";
        String word2 = "bca";
        System.out.println(stringsAreClose.closeStrings(word1, word2));

        //word1 = "a", word2 = "aa"
        word1 = "a";
        word2 = "aa";
        System.out.println(stringsAreClose.closeStrings(word1, word2));

        //word1 = "cabbba", word2 = "abbccc"
        word1 = "cabbba";
        word2 = "abbccc";
        System.out.println(stringsAreClose.closeStrings(word1, word2));
    }
}
