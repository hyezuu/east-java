package multitest;

public interface Interface2 {
    default void defaultMethod() {
        System.out.println("Interface2's default method.");
    }
}
