package day0613;

public class Dog extends Animal {

    int age;

    void sleep(int times) {
        System.out.println(name + " zzz...." + times + " hours");
    }

    public Dog(int age){
        super("okay","남");
        this.age = age;

        // new Animal();
    }

    void sleep(int times, int a) {}
}
