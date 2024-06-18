package day0618.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("홍길동");
        arrayList.add("홍길동2");
        arrayList.add("홍길동2");
        arrayList.add("홍길동2");
        arrayList.add("홍길동2");
        arrayList.add("홍길동2");

//        arrayList.removeIf(s->s.equals("홍길동2"));
        //전체지우기

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//        System.out.println("===================");
        for (String str : arrayList) {
            System.out.println(str);
        }

        LinkedList<String> linkedList = new LinkedList<>();


    }
}
