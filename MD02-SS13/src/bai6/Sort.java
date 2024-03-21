package bai6;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            hashMap.put((int) (Math.random() * 100), i);
        }
        System.out.println("Original HashMap: " + hashMap);
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        Collections.sort(entryList, Comparator.comparing(Map.Entry::getValue));
        System.out.println("Sorted HashMap: " + entryList);

    }
}