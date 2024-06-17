package day0617generic;

public class Test {
    public static void main(String[] args) {
        Box<String> boxString = Util.boxing("123");
        Integer a = boxString.getT(123);
    }
}
