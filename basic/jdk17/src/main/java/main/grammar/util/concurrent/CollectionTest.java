package main.grammar.util.concurrent;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionTest {

    @Test
    void list() {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(111);
        System.out.println(copyOnWriteArrayList);
    }

    @Test
    void map() {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("map", "122");
        System.out.println(concurrentHashMap);
    }

}
