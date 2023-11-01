package org.example;

//import org.junit.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeekCalculatorTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/date.csv")
    public void testCalculateDayOfWeek(int year, int month, int day, String expectedDayOfWeek) {
        String calculatedDayOfWeek = DayOfWeekCalculator.calculateDayOfWeek(year, month, day);
        assertEquals(expectedDayOfWeek, calculatedDayOfWeek);
    }
}