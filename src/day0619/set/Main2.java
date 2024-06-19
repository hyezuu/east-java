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
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
//    stringSet.clear();

    if(stringSet.isEmpty()){
        System.out.println("비었습니다.");
    }else{
        System.out.println("비지 않았습니다.");
    }

}
}
