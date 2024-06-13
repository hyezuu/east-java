package day0613;

public class Person {
    private String name;
//    private String ssn;

//    public Person(String name) {
//        this.name = name;
////        this.ssn = ssn;
//    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println(this.name+"이 밥을 먹습니다.");
    }

//    public String getSsn() {
////        return ssn;
//    }


}
