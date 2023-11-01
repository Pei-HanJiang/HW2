package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalculator {
    public static String calculateTomorrowDate(String inputDate) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(inputDate);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_MONTH, 1);

            Date tomorrow = calendar.getTime();
            return dateFormat.format(tomorrow);
        } catch (ParseException e) {
            return "日期格式不正确";
        }
    }
}
