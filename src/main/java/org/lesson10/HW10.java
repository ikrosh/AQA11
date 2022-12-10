package org.lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HW10 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(123, "Apple");
        map.put(324, "Juice");
        map.put(132, "Lemon");
        map.put(743, "Tomato");
        mapPrint(map);
    }

    private static void mapPrint(Map<Integer, String> map) {
        Set<Integer> order = new TreeSet<>(map.keySet());
        for (Integer o : order) {
            System.out.println(o + " = " + map.get(o));
        }
    }
}
