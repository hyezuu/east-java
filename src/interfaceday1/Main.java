package interfaceday1;

public class Main {
    public static void main(String[] args) {
//    Phone applePhone = new ApplePhone();
//    Phone samsungPhone = new SamsungPhone();
//
//    System.out.println(applePhone.call());
//    System.out.println(samsungPhone.call());
//
//    System.out.println(applePhone.answerThePhone());
//    System.out.println(samsungPhone.answerThePhone());
        InterfaceC impleC = new ImplC();

        InterfaceA interfaceA = impleC;
        interfaceA.methodA();
        System.out.println("=================");

        InterfaceB interfaceB = impleC;
        interfaceB.methodB();
        System.out.println("=================");

        impleC.methodA();
        impleC.methodB();
        impleC.methodC();

    }
}
