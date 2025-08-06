package com.multi.object.util;

import java.util.Properties;

public class UtilEx8 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("numbers", "1,2,3,4,5,6,7,8,9,10");
        properties.setProperty("max", "10");
        properties.setProperty("min", "5");
        System.out.println("Properties: " + properties);
        System.out.println(properties.getProperty("max"));
        System.out.println("Properties: " + properties.getProperty("numbers"));
    }
}
