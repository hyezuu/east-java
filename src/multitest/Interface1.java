package multitest;

public interface Interface1 extends Interface0{
    default void defaultMethod() {
        System.out.println("Interface1's default method.");
    }
}

