package animal;

public class Dog extends Animal{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "삐뽀";
        dog.sound = "왈왈";
        System.out.println(dog.name + "는 "+dog.sound +" 소리를 냅니다");
    }
}
