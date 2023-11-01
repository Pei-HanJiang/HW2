package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateCalculatorTest {
    @ParameterizedTest
    @CsvSource({
            "2023-02-10, 2023-02-11",
            "2023-12-31, 2024-01-01",
            "2024-02-28, 2024-02-29",
            "2021-12-31, 2022-01-01"
    })
    void testCalculateTomorrowDate(String inputDate, String expectedTomorrowDate) {
        String tomorrowDate = DateCalculator.calculateTomorrowDate(inputDate);
        assertEquals(expectedTomorrowDate, tomorrowDate);
    }
}
