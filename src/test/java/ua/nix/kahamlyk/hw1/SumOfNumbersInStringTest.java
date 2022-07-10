package ua.nix.kahamlyk.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersInStringTest {

    @Test
    void sumOfNumbers() {
        int actual = SumOfNumbersInString.SumOfNumbers("1w4tt!7");
        int expected = 12;
        assertEquals(expected, actual);
    }
}