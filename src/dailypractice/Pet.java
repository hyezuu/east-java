package dailypractice;

public class Pet {
    private String name;
    private String acting;
    private int weight;

    public Pet(String name, String acting) {
        this.name = name;
        this.acting = acting;
        this.weight = 1;
    }

    public void gainWeight() {
        this.weight++;
        System.out.println(this.name + "(이)가 배 불러 졌다 !");
        System.out.println("현재 몸무게 : " +this.weight);
    }

    public void acting(){
        System.out.println(name+" 은 "+acting+" 중입니다");
    }

    public String getName() {
        return name;
    }

}
