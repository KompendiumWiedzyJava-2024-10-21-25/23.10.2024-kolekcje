package com.comarch.szkolenia.kolekcje.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("Janusz");

        System.out.println(set.size());

        set.add("Mateusz");
        set.add("Wiesiek");
        set.add("Zbyszek");
        set.add("Adam");
        set.add("Bogdan");

        System.out.println(set.size());

        System.out.println(set);

        set.add("Mateusz");
        set.add("Wiesiek");

        System.out.println(set);

        for(String s : set) {
            System.out.println(s);
        }
    }
}
