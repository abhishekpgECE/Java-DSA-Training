package com.advanced.collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class APILog {
    public static void main(String[] args) {
        Map<String,String> logs=new LinkedHashMap<>();
        logs.put("1","Signup");
        logs.put("2", "login");
        logs.put("4","Browser Instagram reels");
        logs.put("3","up and down");
        logs.put("5","logout");
        System.out.println("Api logs "+ logs);
    }
}