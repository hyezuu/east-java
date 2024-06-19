package day0619.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {  public static void main(String[] args) {
    Set<String> stringSet = new HashSet<>();

    stringSet.add("Java");
    stringSet.add("Spring");
    stringSet.add("JSP");
    stringSet.add("Java");
    stringSet.add("DBMS");

    System.out.println(stringSet.size());

    stringSet.remove("Java");

    Iterator<String> iterator = stringSet.iterator();

    while (iterator.hasNext()) {   // 저장된 객체 수만큼 루핑
        iterator.remove();           // 객체 제거 -> 런타임에러 remove() 메서드는 next()와 함께 써야함
    }
//
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
//
    iterator = stringSet.iterator(); //이미 한번 다 돌았으므로 재 초기화 해 주어야 한다.
    while(iterator.hasNext()){
        iterator.next();
        iterator.remove();
    }

    if(stringSet.isEmpty()){
        System.out.println("비었습니다.");
    }else{
        System.out.println("비지 않았습니다.");
    }

}
}
