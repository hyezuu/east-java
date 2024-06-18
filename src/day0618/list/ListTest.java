package day0618.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("arrayList 걸린시간: " + (endTime - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("linkList 걸린시간: " + (endTime - startTime));

    }
}
