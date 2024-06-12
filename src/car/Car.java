package car;

public class Car {
    private int speed;

    public void setSpeed(int speed) {
        this.speed = Math.max(speed, 0);
    }

    public void checkSpeed(){
        System.out.println(this.speed);
    }
}
