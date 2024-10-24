package com.comarch.szkolenia.kolekcje.mapy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Janusz", 44);
        map.put("Zbyszek", 50);

        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.get("Zbyszek"));

        map.put("Janusz", 60);

        System.out.println(map.get("Janusz"));

        System.out.println(map);

        Set<String> keys = map.keySet();
        System.out.println(keys);

        Collection<Integer> values = map.values();
        System.out.println(values);

        map.put("Mateusz", 39);
        map.put("Wiesiek", 70);

        Set<Map.Entry<String, Integer>> pary = map.entrySet();

        for (Map.Entry<String, Integer> para : pary) {
            System.out.println("klucz: " + para.getKey() + " wartosc: " + para.getValue());
        }

        Map<String, String> properties = new HashMap<>();

        properties.put("db.ip","234.234.234.234");
        properties.put("db.user","admin");
        properties.put("db.pass","tajne");
        properties.put("certificate","jhsdSZDF2345AGsd");
        properties.put("remote.host.ip","123.123.123.123");

        System.out.println(properties.get("db.user"));

        System.out.println(properties.get("remote.host.ip"));
    }
}
