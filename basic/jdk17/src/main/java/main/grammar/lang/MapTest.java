package main.grammar.lang;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class MapTest {

    @Test
    void map() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("map", "123");
        System.out.println(hashMap);
    }

}
