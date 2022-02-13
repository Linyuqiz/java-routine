package main.grammar.lang;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ListTest {

    @Test
    void list() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(123);
        System.out.println(arrayList);
    }

}
