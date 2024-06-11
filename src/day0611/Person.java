package day0611;

public class Person {
    private String name;
    private int phoneNum;
    private int money;
    private int age;

    public Person(String name, int phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public Person(String name, int phoneNum, int money, int age) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.money = money;
        this.age = age;
    }

    public void sayHello(){
        System.out.println("Hello, " + name + "!");
    }
    public void sayMoney(){
        System.out.println("money: " + money*10000);
    }

    public void teaching(Student student){
        System.out.println(this.name + " teached " + student.name + "!" );
        student.levelUp();
    }

    public void cheating(Student student){
        student.levelDown();
    }
}
