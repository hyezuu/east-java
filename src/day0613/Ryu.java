package day0613;

public class Ryu {
    String name;

    public Ryu(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + "이 밥을 먹습니다.");
    }
    public void coding() {
        System.out.println(name + "이 코딩을 합니다.");
    }
}