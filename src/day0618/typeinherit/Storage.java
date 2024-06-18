package day0618.typeinherit;

public interface Storage<T> {
    void add(T item, int index);

    T get(int index);
}
