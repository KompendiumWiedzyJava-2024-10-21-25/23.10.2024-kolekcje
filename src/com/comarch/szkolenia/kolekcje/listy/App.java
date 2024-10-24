package com.comarch.szkolenia.kolekcje.listy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();

        System.out.println(lista.size());

        lista.add("Janusz");

        System.out.println(lista.size());

        lista.add("Mateusz");
        lista.add("Zbyszek");
        lista.add("Mateusz");

        System.out.println(lista.size());

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));

        System.out.println(lista);

        lista.remove("Mateusz");
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);


        System.out.println(lista.contains("Karol"));

        cos1(lista);
        cos2(lista);
        cos3(lista);

        Pair<String, Double> para = new Pair<>();
        Pair<Integer, Boolean> para2 = new Pair<>();

    }

    public static void cos1(List<String> lista) {
        //??
        //??
        //??
    }

    public static void cos2(List<String> lista) {
        //??
        //??
        //??
    }

    public static void cos3(List<String> lista) {
        //??
        //??
        //??
    }
}
