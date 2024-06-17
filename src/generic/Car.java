package generic;

public class Car <T>{
    private T data;

    public T get() {
        return data;
    }

    public void set(T type) {
        this.data = type;
    }

    public boolean isIns(){
        return data instanceof String;
    }
}
