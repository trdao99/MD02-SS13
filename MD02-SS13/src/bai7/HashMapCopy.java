package bai7;

import java.util.HashMap;

public class HashMapCopy {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            hashMap.put((int) (Math.random() * 100), 0);
        }
        System.out.println(hashMap);

        HashMap<Integer, Integer> hashMapCopy = new HashMap<>();
        hashMapCopy.putAll(hashMap);
        System.out.println(hashMapCopy);
    }
}
