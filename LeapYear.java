package com.bhuvesh;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        boolean isLeapYearTrue = year >= 1 && year <= 9999;
        if (isLeapYearTrue) {
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                return true;
            } return false;
        } return false;
    }

}