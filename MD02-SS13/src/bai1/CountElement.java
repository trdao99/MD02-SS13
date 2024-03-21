package bai1;

import java.util.HashMap;
import java.util.Map;


public class CountElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,2,6,1,2,3,9,8,7,5,1,23,6,4,5,8};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i],map.get(array[i])+1);
            }
            else {
                map.put(array[i],1);
            }
        }
        System.out.println(map);
    }
}