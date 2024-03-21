package bai8;

import java.util.HashMap;

public class CheckExit {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            hashMap.put((int) (Math.random() * 100), 0);
        }

        System.out.println(hashMap.containsKey(6));
    }
}
