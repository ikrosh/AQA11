package org.lesson9;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Set;
import java.util.TreeSet;

public class HW9 {

    public static void main(String[] args) {
        String text = "масло, масло, колбаса, молоко";
        transformer(text);
    }

    private static void transformer(String text) {
        String[] strs = text.split(", ");
        Set<String> words = new TreeSet<>();
        for(String str : strs) {
            words.add(str);
        }
        for (String w : words) {
            System.out.println(StringUtils.capitalize(w));
        }
    }


}

