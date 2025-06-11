package org.Niccolo.exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CheckIntervalBetweenDatesAlt {
    public static boolean checkIntervalBetweenDatesAlt(String begin, String end){
        try {
            LocalDate beginDate = LocalDate.parse(begin, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            LocalDate endDate = LocalDate.parse(end, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return beginDate.isBefore(endDate);
        } catch (DateTimeParseException e){
            e.printStackTrace();
            return false;
        }
    }
}
