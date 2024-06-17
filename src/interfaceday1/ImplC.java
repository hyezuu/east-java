package interfaceday1;

public class ImplC implements InterfaceC{

    @Override
    public void methodC() {
        System.out.println("C실행");
    }

    @Override
    public void methodA() {
        System.out.println("A실행");

    }

    @Override
    public void methodB() {

        System.out.println("B실행");
    }
}
