package com.basics.strings;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Tripillar Solutions";
        System.out.println("Length: " + str.length());
        System.out.println("Char at index 2: "+ str.charAt(2));
        System.out.println("Char at last index:" + str.charAt(str.length()- 1));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring(0,9): " + str.substring(0,9));
        System.out.println("Equals(Tripillar Solutions): " + str.equals("Tripillar Solutions"));

        System.out.println("Equals (Case does'nt matter): " + str.equalsIgnoreCase("Tripillar Solutions"));
        String jumbled = "Abhishek1Is1FromECE1Sec1A";
        // "Abhishek, Is, From, ECE, Sec, B";
        String[] words = jumbled.split("1");
        System.out.println(words[3]);
        String name = "  GM Manu  ";
        System.out.println(name.trim());
        char[] letters = {'A', 'b', 'h', 'i', 's', 'h', 'e', 'k'};
        String word = new String(letters);
        System.out.println(word);
    }
}
