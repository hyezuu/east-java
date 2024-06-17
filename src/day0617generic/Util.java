package day0617generic;

public class Util {
    public static <T> Box<T> boxing(T value) {
        Box<T> box = new Box<>();
        box.set(value);
        return box;
    }
}
