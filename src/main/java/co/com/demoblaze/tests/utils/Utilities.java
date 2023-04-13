package co.com.demoblaze.tests.utils;

public class Utilities {
    public static String getDriver() {
        String[] drivers = { "chrome","firefox", "egde"};
        int i = (int) (Math.random() * drivers.length);
        return drivers[i];
    }
}
