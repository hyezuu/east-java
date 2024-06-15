package shoppingmall.shoppingmall;

import shoppingmall.product.Product;
import shoppingmall.product.subproduct.Clothing;
import shoppingmall.product.subproduct.Electronics;
import shoppingmall.product.subproduct.Food;

import java.util.Arrays;

public class ShoppingMall {
    private Product[] products;
    private double totalPrice;

    public ShoppingMall(Product[] products) {
        this.products = products;
    }

    public void addProduct(Clothing clothing) {
        addProductToArray(clothing);
    }

    public void addProduct(Electronics electronics) {
        addProductToArray(electronics);
    }

    public void addProduct(Food food) {
        addProductToArray(food);
    }

    private void addProductToArray(Product product) {
        if (this.products[this.products.length - 1] != null) {
            setNewProducts();
        }
        addToArray(product);
    }

    private void setNewProducts() {
        Product[] newProducts = new Product[this.products.length * 2];
        System.arraycopy(this.products, 0, newProducts, 0, this.products.length);
        this.products = newProducts;
    }

    private void addToArray(Product product) {
        products[this.products.length - 1] = product;
        Arrays.sort(this.products);
    }


    public void removeProduct(Clothing clothing) {
    }

    public void removeProduct(Electronics electronics) {
    }

    public void removeProduct(Food food) {
    }

    public void displayProducts() {
    }

    public void calculateTotalPrice(Product[] products) {

    }
}
