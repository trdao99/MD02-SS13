package bai2;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class FindNlangest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 100; i++) {
            stack.push((int) (Math.random() * 100));
        }
        System.out.println(stack);
        int value = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < stack.size(); i++) {
            map.put(stack.get(i), value);
        }
        System.out.println("bạn muốn số lớn thứ bao nhiêu: ");
        int input = Integer.parseInt(sc.nextLine());
        int max = map.lastKey();
        for (int i = 0; i < input-1; i++) {
            max = map.lowerKey(max);
        }
        System.out.println(map);
        System.out.println("số lớn thứ " + input + " là " + max );
    }
}
