package ru.clevertec.edu.ykv.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null) {
            return false;
        }
        try {
            double number = Double.parseDouble(str);
            return number > 0;
        } catch (NumberFormatException exception) {
            return false;
        }
    }
}