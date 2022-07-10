package ua.nix.kahamlyk.hw2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnteringOfSymbolsTest {

    @Test
    void amountOfEnterings() {
        String actual = EnteringOfSymbols.AmountOfEnterings("1w4tt!7");
        String expected = "t – 2\n" + "w - 1\n";
        assertEquals(actual,expected);
    }
}