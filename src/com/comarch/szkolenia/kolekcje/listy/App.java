package com.comarch.szkolenia.kolekcje.listy;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

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
    }
}
