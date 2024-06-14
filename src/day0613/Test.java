package day0613;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog(123);

        dog.setName("용팔이");

        dog.sleep();
        dog.sleep(100);

        Student student = new Student("승조", "a", 1);

        Ryu ryu = new Ryu("류상욱");
        ryu.eat();
        ryu.coding();

        Lee lee = new Lee();
        lee.name = "이상해씨";
        lee.eat();
//        lee.write();


        System.out.println(student.getName());
//        System.out.println(student.getSsn());
        System.out.println();


    }
}
