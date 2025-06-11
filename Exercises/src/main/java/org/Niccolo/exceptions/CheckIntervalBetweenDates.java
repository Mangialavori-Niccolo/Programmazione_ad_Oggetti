package org.Niccolo.exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end) throws DateTimeParseException {
        LocalDate beginDate = LocalDate.parse(begin, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate endDate = LocalDate.parse(end, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        return beginDate.isBefore(endDate);
    }
}
