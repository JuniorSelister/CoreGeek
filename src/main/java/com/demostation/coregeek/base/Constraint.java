package com.demostation.coregeek.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Constraint {

    public static String POSTALCODE(String postalCode) {
        return postalCode.replaceAll("[^\\d.]", "");
    }

    public static String POSTALCODEFORMATTED(String postalCode) {
        return postalCode.substring(0, 5) + "-" + postalCode.substring(5, 8);
    }

    public static String setDateNow() throws ParseException {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date inputDate = sdf.parse(sdf.format(new Date()));

        return sdf.format(inputDate);
    }

    public static String getDate(Date dateRecord) {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        return sdf.format(dateRecord);
    }

    public static String setNewDateRecord(String dateRecord) throws ParseException {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date inputDate = sdf.parse(dateRecord);

        return sdf.format(inputDate);
    }

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

}
