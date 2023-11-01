package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekCalculator {
    public static String calculateDayOfWeek(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.toString();
    }
}