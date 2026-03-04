package com.basics.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E6 {
    public static void main(String[] args) throws IOException {
        String str;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("enter the data");
            str = br.readLine();
            System.out.println(str);
        }
    }
}