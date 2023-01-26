package com.galvanize;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Stats {
    public static void stats() {
        java.time.LocalDateTime  now = java.time.LocalDateTime.now( );

    }
    public int computeMode(List<Integer> data){
        List<Integer> ata = new ArrayList<Integer>();
        ata.add(2);
        ata.add(3);
        ata.add(4);
        ata.add(4);
        ata.add(8);
    }
    public static double computeAverage(List<Integer> avg) {
        avg.add(2);
        avg.add(7);
        avg.add(9);
        avg.add(11);
        int sum = 0;
        for (int num :avg){
            sum += num;
        }
        return (double) sum / avg.size();
    }

}
