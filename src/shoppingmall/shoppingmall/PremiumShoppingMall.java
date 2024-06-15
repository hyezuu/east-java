package shoppingmall.shoppingmall;

import shoppingmall.product.Product;

public class PremiumShoppingMall extends ShoppingMall{
    public PremiumShoppingMall(Product[] products) {
        super(products);
    }

    @Override
    public boolean checkOrderAvailability(Product product) {
        return product.getStock() >= 10;
    }
}
