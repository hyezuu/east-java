package interfaceday1;

public interface InterfaceA {
    void methodA();

    default void showA() {
        System.out.println("okay");
    }
}
