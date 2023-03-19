package org.example.cw1;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<Character, Integer> mapCh = new HashMap<>();
        String str = "are you okay you really crazy";
//        for (int i = 0; i < str.length(); i++) {
//            if (mapCh.containsKey(i)) {
//                mapCh.put(str.charAt(i), 1);
//            } else {
//                mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
//            }
//        }

        for (char c: str.toCharArray()) {
            mapCh.merge(c,1,Integer::sum);
        }
        for (var entry : mapCh.entrySet()) {
            System.out.println(entry.getKey() + " встретился " + entry.getValue() + "  раз");
        }
    }
}


