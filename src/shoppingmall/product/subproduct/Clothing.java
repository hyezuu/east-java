package shoppingmall.product.subproduct;

import shoppingmall.product.Product;

public class Clothing extends Product {
    private final Size size;
    private static final double OVERSIZE_CHARGE_RATE = 1.1;
    private static final Size OVERSIZE_STANDARD = Size.L;

    public Clothing(Long id, String name, double price, int stock, Size size) {
        super(id, name, price, stock);
        this.size = size;
    }

    @Override
    public double calculatePrice() {
        if (this.size.ordinal() >= OVERSIZE_STANDARD.ordinal()) {
            return super.getPrice() * OVERSIZE_CHARGE_RATE;
        }
        return this.getPrice();
    }

    @Override
    public void printAdditionalInformation() {
        System.out.println("사이즈 :" + getSize());
    }

    public Size getSize() {
        return size;
    }
}
