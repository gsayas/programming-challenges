package org.example.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    @Test
    void case1() {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int result = new StringCompression().compress(chars);
        char [] resultArray = new char[result];
        System.arraycopy(chars, 0, resultArray, 0, result);

        for (char c : resultArray){
            System.out.print(c);
            System.out.print(", ");
        }
        assertEquals(6, result);
        assertTrue(Arrays.equals(new char[]{'a','2','b','2','c','3'}, resultArray));
    }

    @Test
    void case2() {
        char[] chars = {'a','b','b','b','b','b','a','b','b','b','b','b','b'};
        int result = new StringCompression().compress(chars);
        char [] resultArray = new char[result];
        System.arraycopy(chars, 0, resultArray, 0, result);

        assertEquals(6, result);
        assertTrue(Arrays.equals(new char[]{'a','b','5','a', 'b','6'}, resultArray));
    }

    @Test
    void case3() {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b','a','a','a'};
        int result = new StringCompression().compress(chars);
        char [] resultArray = new char[result];
        System.arraycopy(chars, 0, resultArray, 0, result);
        for (char c : resultArray){
            System.out.print(c);
            System.out.print(", ");
        }
        assertEquals(6, result);
        assertTrue(Arrays.equals(new char[]{'a','b', '1','2','a','3'}, resultArray));
    }

    @Test
    void case4() {
        char[] chars = {'a', 'a', 'a', 'b', 'b', 'b', 'b', 'a', 'a'};
        int result = new StringCompression().compress(chars);
        char [] resultArray = new char[result];
        System.arraycopy(chars, 0, resultArray, 0, result);
        for (char c : resultArray){
            System.out.print(c);
            System.out.print(", ");
        }
        assertEquals(6, result);
        assertTrue(Arrays.equals(new char[]{'a','3', 'b', '4', 'a', '2'}, resultArray));
    }

    @Test
    void case5() {
        char[] chars = {'a','a','a','a','a','a','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','c','c','c','c','c','c','c','c','c'};
        int result = new StringCompression().compress(chars);
        char [] resultArray = new char[result];
        System.arraycopy(chars, 0, resultArray, 0, result);
        for (char c : resultArray){
            System.out.print(c);
            System.out.print(", ");
        }
        assertEquals(7, result);
        assertTrue(Arrays.equals(new char[]{'a','6', 'b', '2', '1', 'c', '9'}, resultArray));
    }

    @Test
    void case6() {
        char[] chars = {'o','o','o','o','o','o','o','o','o','o'};
        int result = new StringCompression().compress(chars);
        char [] resultArray = new char[result];
        System.arraycopy(chars, 0, resultArray, 0, result);

        for (char c : resultArray){
            System.out.print(c);
            System.out.print(", ");
        }
        assertEquals(3, result);
        assertTrue(Arrays.equals(new char[]{'o','1', '0'}, resultArray));
    }

    @Test
    void case7() {
        char[] chars = {'w','w','w','w','w','w','w','w','w','w','w','w','b','b','g','g','g','g','a','a','a','i','i','i','i','y','y','p','v','v','v','u','u','u','y','y','y','y','y','y','y','y','y','s','q','q','q','q','q','q','q','q','q','q','n','n','n'};
        int result = new StringCompression().compress(chars);
        char [] resultArray = new char[result];
        System.arraycopy(chars, 0, resultArray, 0, result);

        for (char c : resultArray){
            System.out.print(c);
            System.out.print(", ");
        }
        assertEquals(26, result);
        assertTrue(Arrays.equals(new char[]{'w','1','2','b','2','g','4','a','3','i','4','y','2','p','v','3','u','3','y','9','s','q','1','0','n','3'}, resultArray));
    }

}