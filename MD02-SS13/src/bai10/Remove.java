package bai10;

import java.util.TreeMap;

public class Remove {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < 100; i++) {
            treeMap.put((int) (Math.random() * 100), 0);
        }
        System.out.println(treeMap);
        treeMap.remove(98);
        System.out.println(treeMap);

    }
}
