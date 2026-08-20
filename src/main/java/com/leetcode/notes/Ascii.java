package com.leetcode.notes;

public class Ascii {

    public static void main(String[] args) {

        // convert char to ASCII
//        char aChar = 'a';
//        int ascii = aChar;              // auto cast char to int
//        System.out.println(ascii);      // 97
//
//        // convert ASCII to char
//        char[] chars = Character.toChars(ascii);
//        System.out.println(chars);      // a
//
//        char aChar2 = (char) ascii;     // or downcast int to char, it works.
//        System.out.println(aChar2);     // a

//        char numChar2 = (char) 1;     // or downcast int to char, it works.
//        System.out.println(numChar2);     // a

        char[] out = new char[2];
        out[0] = String.valueOf(12).charAt(0);
        out[1] = String.valueOf(12).charAt(1);
        System.out.println(out);
    }
}
