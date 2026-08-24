package me.giocode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatNumberTest {

    @Test
    void case1() {
        String result = new FormatNumber().solution("00-44 48 5555 8361");
        assertEquals("004-448-555-583-61", result);
    }

    @Test
    void case2() {
        String result = new FormatNumber().solution("0 - 22 1985--324");
        assertEquals("022-198-53-24", result);
    }

    @Test
    void case3() {
        String result = new FormatNumber().solution("555372654");
        assertEquals("555-372-654", result);
    }
}