package ru.timokhina.algorithm.lesson25;

import java.util.*;

public class FilteredMapDemo {

    public static void main(String[] args) {

        FilteredMap fm = new FilteredMap();
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("Вася", "Иванов");
        map1.put("Пётр", "Петров");
        map1.put("Виктор", "Сидоров");
        map1.put("Сергей", "Савельев");
        map1.put("Вадим", "Викторов");
        System.out.println(fm.isUnique(map1));

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("Вася", "Иванов");
        map2.put("Пётр", "Петров");
        map2.put("Виктор", "Иванов");
        map2.put("Сергей", "Савельев");
        map2.put("Вадим", "Петров");
        System.out.println(fm.isUnique(map2));
    }
}
