package dailypractice;

public class Person {
    private String name;
    private String action;

    public Person(String name, String action) {
        this.name = name;
        this.action = action;
    }

    public void feeding(Pet pet){
        System.out.println(pet.getName() + "아.. 밥먹자.. ");
        pet.gainWeight();
    }

    public void acting(){
        System.out.println(this.name+"은 "+ this.action+" 중입니다");
    }
}
