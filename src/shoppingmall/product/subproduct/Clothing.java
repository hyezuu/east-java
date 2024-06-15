package shoppingmall.product.subproduct;

import shoppingmall.product.Product;

public class Clothing extends Product {
    private Size size;
    private static final double OVERSIZE_CHARGE_RATE = 1.1;

    public Clothing(String name, int price, int stock, Size size) {
        super(name, price, stock);
        this.size = size;
    }

    @Override
    public double calculatePrice() {
        if (this.size.ordinal() >= Size.L.ordinal()) {
            return super.getPrice() * OVERSIZE_CHARGE_RATE;
        }
        return this.getPrice();
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
