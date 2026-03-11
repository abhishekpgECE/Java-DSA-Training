package com.advanced.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class LoginSystem {
    public static void main(String[] args) {
        Map<String, String> users=new HashMap<>();
        users.put("admin","admin@123");
        users.put("admin1","admin@234");
        users.put("admin2","Admin@345");
        System.out.println(users);
        users.put("admin","admin@456");
        System.out.println(users);
    }
}