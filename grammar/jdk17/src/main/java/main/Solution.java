package main;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * @author: axemc
 * @dateTime: 2022/04/25 22:13:52
 */
public class Solution {

    static class Node {
        String value;
        int count;
        Node(String string, int count) {
            this.value = string;
            this.count = count;
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        FileInputStream inputStream = new FileInputStream("content.txt");
        String content = new String(inputStream.readAllBytes());
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str : content.split(",")) {
            if (hashMap.containsKey(str)) {
                hashMap.put(str, hashMap.get(str) + 1);
            } else {
                hashMap.put(str, 1);
            }
        }

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a.count));
        hashMap.forEach((key, value) -> priorityQueue.add(new Node(key, value)));
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll().value + "," + Objects.requireNonNull(priorityQueue.poll()).value);
        }
    }

}
