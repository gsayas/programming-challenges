package org.example.medium;

public class StringCompression {

    public int compress(char[] chars) {

        char curr = ' ';
        int i = 0;
        int outLen = 0;
        int countOfRepetitions = 0;
        int currentSlotsNeeded = 0;
        char pushRightChar = ' ';
        int arrayLen = chars.length;
        int k;

        while (i < arrayLen) {

            if (chars[i] != curr) { // found a new char
                curr = chars[i];
                outLen++; // needs to write char to output
                countOfRepetitions = 1;
                currentSlotsNeeded = 0;
            } else { // found same char as last one
                countOfRepetitions++;
                if (needsAnAdditionalSlotToWrite(countOfRepetitions, currentSlotsNeeded)) { // new count needs an additional position in the array (number of digits)
                    currentSlotsNeeded = String.valueOf(countOfRepetitions).length();
                    outLen++;
                    if(i + 1 < arrayLen && countOfRepetitions != 2 && countOfRepetitions != 10 && countOfRepetitions != 100){
                        i++;
                    }
                }

                if (isCurrentElementAfterOutputLength(chars, i, outLen)) { // processing posterior adjacent duplicate:
                    pushRightChar = chars[i];
                    k = i;
                    while (k < chars.length - 1 && k < arrayLen - 1) { // push it outside the output
                        chars[k] = chars[k + 1];
                        chars[k + 1] = pushRightChar;
                        k++;
                    }
                    if (i >= outLen){ // process new element in the i position
                        i--;
                        arrayLen--;
                    }
                }

                for (int j = 0; j < currentSlotsNeeded; j++) {
                    chars[outLen - currentSlotsNeeded + j] = String.valueOf(countOfRepetitions).charAt(j); // write count in the array
                }
            }
            i++;
        }


        return outLen;
    }

    private static boolean isCurrentElementAfterOutputLength(char[] chars, int i, int outLen) {
        return i >= outLen && i < chars.length - 1;
    }

    private static boolean needsAnAdditionalSlotToWrite(int countRepeated, int lengthRepeatedString) {
        return String.valueOf(countRepeated).length() != lengthRepeatedString || countRepeated == 1;
    }

}
