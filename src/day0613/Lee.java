package day0613;

public class Lee extends Person{
    String name;

//    public Lee(String name) {
//        super(name);
//        this.name = name;
//    }

    @Override
    public void eat() {
        System.out.println(name + "이 고기를 먹습니다.");
    }

    public void write() {
        System.out.println(name + "이 문서를 작성합니다.");
    }
}