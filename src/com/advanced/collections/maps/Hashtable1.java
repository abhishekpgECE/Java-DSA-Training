package com.advanced.collections.maps;
import  java.util.Hashtable;

public class Hashtable1 {
    static void main() {
        Hashtable<Integer, String> ht = new Hashtable<>();ht.put(106, "Anushree");
        ht.put(117,"Naveen ");
        ht.put(128, " Meghana");
        ht.put(102, " Punith");
        ht.put(100, " Sinchana");
        ht.put(99, "Kavana");
        ht.put(98, " Sheetal Gowda");
        System.out.println(ht.getOrDefault(99, "Not Found"));
        System.out.println(ht.getOrDefault(101,   " Not found"));
        System.out.println("Update Table: " + ht);
        ht.putIfAbsent(102,"Sampath");
        System.out.println("Update Tbable: " + ht);




    }

}