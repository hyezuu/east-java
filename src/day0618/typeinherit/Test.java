package day0618.typeinherit;

public class Test {
    public static void main(String[] args) {
        ChildProduct<Tv, String, String> product = new ChildProduct<>();
        product.setKind(new Tv());
        product.setModel("Smart TV");
        product.setCompany("Samsung");

        StorageImpl<Tv> tvStorage = new StorageImpl<>(5);
        tvStorage.add(new Tv(), 0);
    }
}
