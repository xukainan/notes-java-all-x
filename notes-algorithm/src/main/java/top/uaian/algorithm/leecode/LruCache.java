package top.uaian.algorithm.leecode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache {
    public static void main(String[] args) {
        SimpleLinkedHashMap simpleLinkedHashMap = new SimpleLinkedHashMap(2);
        simpleLinkedHashMap.put(1, 1);
        simpleLinkedHashMap.put(2, 2);
        simpleLinkedHashMap.get(1);
        simpleLinkedHashMap.put(3, 3);
        simpleLinkedHashMap.put(4, 4);
        simpleLinkedHashMap.put(5, 5);
        simpleLinkedHashMap.values().forEach(System.out::println);
    }
}


class SimpleLinkedHashMap extends LinkedHashMap<Integer, Integer> {

    private int capacity;

    public SimpleLinkedHashMap(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> entry) {
        return super.size() > capacity;
    }
}