package edu.nirahsab.samples.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MainUtil {
    public static String getEvent(int limit) {
        return "This is the limit of requested page size: " + limit;
    }
}
