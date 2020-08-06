package ru.timokhina.algorithm.lesson25;

import java.util.*;

public class FilteredMap {
    HashMap<String, String> map;

    public boolean isUnique(Map<String, String> map)    {
        HashSet<String> uniqueValues = new HashSet<String>(map.values());
        if (map.size() == uniqueValues.size()) {
            return true;
        }
        else {
            return false;
        }
    }
}
