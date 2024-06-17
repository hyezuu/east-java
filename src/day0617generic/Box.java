package day0617generic;

public class Box<T> {
    private T t;

    public void set(T t){
        this.t = t;
    };

    public T get() {
        return t;
    }

    public <t> t getT(t t){
        return t;
    }
}
