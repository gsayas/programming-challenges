package me.giocode;

public class FormatNumber {


    public static String solution(String input) {

        String cleanedInput = input.replace(" ", "").replace("-", "");
        StringBuilder result = new StringBuilder();
        int currentIndex = 0;
        int len = cleanedInput.length();
        int remaining;
        int increment;

        while (currentIndex < len) {
            remaining = len - currentIndex;

            if (currentIndex > 0) {
                result.append("-");
            }

            if (remaining > 4 || remaining == 3) {
                increment = 3;
            } else {
                increment = 2;
            }
            result.append(cleanedInput.substring(currentIndex, currentIndex + increment));
            currentIndex += increment;

        }

        return result.toString();
    }
}
