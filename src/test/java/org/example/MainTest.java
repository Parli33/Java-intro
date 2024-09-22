package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fizz() {
        int n = 35;
        List<String> list = Main.fizz(n);
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        expected.add("4");
        expected.add("fizz");
        expected.add("6");
        expected.add("buzz");
        expected.add("8");
        expected.add("9");
        expected.add("fizz");
        expected.add("11");
        expected.add("12");
        expected.add("13");
        expected.add("buzz");
        expected.add("fizz");
        expected.add("16");
        expected.add("17");
        expected.add("18");
        expected.add("19");
        expected.add("fizz");
        expected.add("buzz");
        expected.add("22");
        expected.add("23");
        expected.add("24");
        expected.add("fizz");
        expected.add("26");
        expected.add("27");
        expected.add("buzz");
        expected.add("29");
        expected.add("fizz");
        expected.add("31");
        expected.add("32");
        expected.add("33");
        expected.add("34");
        expected.add("fizzbuzz");
        assertEquals(expected, list);
    }

    @Test
    void reversedLine() {
        String initialLine = "make install";
        String reversedLine = "llatsni ekam";
        assertEquals(reversedLine, Main.reversedLine(initialLine));
    }

    @Test
    void equation() {
        List<String> list1 = Main.equation(1,4,3); // d > 0
        List<String> list2 = List.of("-1.0","-3.0");
        assertEquals(list2, list1);
        list1 = Main.equation(1,-2,1); // d = 0
        list2 = List.of("1.0");
        assertEquals(list2, list1);
    }

    @Test
    void sum() {
        double sum = Main.sum();
        double expected = 0.6101121094474383;
        assertEquals(expected, sum);
    }

    @Test
    void palindrome() {
        String line1 = ".ci v!Ic";
        String line2 = "not-a-palindrome";
        assertTrue(Main.palindrome(line1));
        assertFalse(Main.palindrome(line2));
    }
}