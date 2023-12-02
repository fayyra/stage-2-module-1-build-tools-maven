package com.epam.utils;


import static java.util.Objects.isNull;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return !isNull(str) && !str.isEmpty() && !str.startsWith("-") && !str.equals("0");
    }
}
