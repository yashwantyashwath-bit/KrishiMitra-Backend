package com.krishimitra.util;

public class SuitabilittyCalculator {
    public static boolean isSuitable(double value, double min, double max) {
        return value >= min && value <= max;
    }
}
