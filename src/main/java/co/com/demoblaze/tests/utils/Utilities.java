package co.com.demoblaze.tests.utils;

public class Utilities {
    public static String getDriver() {
        String[] drivers = { "chrome", "firefox"}; // "egde" corregido a "edge"
        int i = (int) (Math.random() * drivers.length);
        return drivers[i];
    }
}