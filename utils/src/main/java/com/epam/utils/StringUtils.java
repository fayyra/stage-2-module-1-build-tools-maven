package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (!str.isEmpty())
            return Integer.parseInt(str) > 0;
        return false;
    }
}
