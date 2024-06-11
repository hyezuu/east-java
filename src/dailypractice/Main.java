package dailypractice;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("강혜주", "잠자기");
        Pet pet = new Pet("강대장", "잠자기");

//        me.acting();
        me.feeding(pet);
        me.feeding(pet);
        me.feeding(pet);
//        pet.acting();
    }
}
