package co.com.demoblaze.tests.utils;

import java.time.Duration;

public class Time {
    public static Duration duration(int seconds) {
        return Duration.ofSeconds(seconds);
    }
}