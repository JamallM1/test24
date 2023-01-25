package com.galvanize;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
    public class Browser {
        private URI currentPage;
        private ArrayList<String> history;
        private LocalDateTime visitedAt;
        private HashMap<String, Integer> visitCount;
        private boolean on;
    }
}
