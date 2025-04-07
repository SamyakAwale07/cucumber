package com.aiotests.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static WebDriver d;
    public static WebDriver get() {
        if(d == null) {
            d = new ChromeDriver();
        }
        return d;
    }

    public void quit() {
        d.quit();
    }
}
