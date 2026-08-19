package org.example.easy;

public class GCDStrings {
    public String gcdOfStrings(String str1, String str2) {

        String longest = str1.length() >= str2.length() ? str1 : str2;
        String shortest = str2.length() <= str1.length() ? str2 : str1;
        String out = "";
        String t = "";

        if (longest.indexOf(shortest) == -1) return out;

        for (int i = 0; i < shortest.length(); i++) {
            t = shortest.substring(0, i + 1);
            if( isMultiple(longest, shortest, t.length()) && multiplies(t, longest) && multiplies(t, shortest) ){
                out = t;
            }
        }

        return out;
    }

    private boolean multiplies(String t, String str){
        return t.repeat(str.length() / t.length()).equals(str);
    }

    private boolean isMultiple(String longest, String shortest, int k){
        return longest.length() % k == 0 && shortest.length() % k == 0;
    }

    public static void main(String[] args) {
        GCDStrings gcd = new GCDStrings();

        System.out.println(gcd.gcdOfStrings("ABCABC", "ABC"));
    }
}



/*
- Classify longest and shortest string
- Check if shortest is a substring of longest. If not, then return ""
- take longest, start with increasingly
*/
