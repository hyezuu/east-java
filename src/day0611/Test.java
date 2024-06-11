package day0611;

public class Test {

    public static void main(String[] args) {
        Person person = new Person("가내주1", 11112222);
        Person person1 = new Person("가내주2", 11112222);
        Person person2 = new Person("강헤주", 12341234, 100000, 20);
        Student student = new Student("학생1");

//        person2.sayHello();
//        person2.sayMoney();
        person2.teaching(student);
        person2.cheating(student);
        person2.cheating(student);
    }
}
