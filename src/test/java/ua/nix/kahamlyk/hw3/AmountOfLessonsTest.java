package ua.nix.kahamlyk.hw3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmountOfLessonsTest {


    @Test
    void lastLessonTime() {
        String actual = AmountOfLessons.LastLessonTime(4);
        String expected = "12 25";
        assertEquals(actual, expected);
    }


}