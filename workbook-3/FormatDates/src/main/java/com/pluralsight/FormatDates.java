package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter;

        DateTimeFormatter mDY = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String monthDayYear = today.format(mDY);

        DateTimeFormatter mDFY = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String monthDayFullYear = today.format(mDFY);

        DateTimeFormatter dMFY = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        String dayMonthDayFullYear = today.format(dMFY);

        System.out.println();
        System.out.println(today);
        System.out.println(monthDayFullYear);
        System.out.println(dayMonthDayFullYear);


    }
}
