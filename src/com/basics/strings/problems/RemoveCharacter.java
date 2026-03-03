package com.basics.STRINGS.PROBLEMS;

import java.util.Locale;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str ="programmming";
        System.out.println(str);
        char ch='m';
        String result=" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ch){
                result +=str.charAt(i);

            }
        }
        System.out.println(result);
    }
}