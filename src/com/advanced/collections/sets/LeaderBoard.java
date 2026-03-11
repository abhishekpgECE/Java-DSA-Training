package com.advanced.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class LeaderBoard {
    public static void main(String[] args) {
        Set<Integer> scores = new HashSet<>();
        scores.add(100);
        scores.add(200);
        scores.add(23);
        scores.add(21);
        System.out.println("Leaderboard Status: "+scores);
    }
}