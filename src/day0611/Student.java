package day0611;

public class Student {
    int level;
    String name;

    public Student(String name) {
        this.level = 1;
        this.name = name;
    }

    public void levelUp(){
        this.level++;
        System.out.println("레벨이 1 증가 했습니다.");
        System.out.println("현재 레벨은 " + this.level + "입니다");
    }

    public void levelDown(){
        if(this.level > 1){
            this.level--;
            System.out.println("레벨이 1 감소 했습니다.");
            System.out.println("현재 레벨은 " + this.level + "입니다");
        }
        else System.out.println("최소 레벨 상태입니다");


    }
}
