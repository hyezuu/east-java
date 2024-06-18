package shoppingmall.shoppingmall;

import shoppingmall.exception.BusinessLogicException;
import shoppingmall.product.Product;
import shoppingmall.product.subproduct.Clothing;
import shoppingmall.product.subproduct.Electronics;
import shoppingmall.product.subproduct.Food;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Comparator;

public abstract class ShoppingMall {
    private Product[] products;

    public ShoppingMall(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
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
        if (findIdxById(product.getId()) >= 0) {
            addInitialStock(product);
            return;
        }
        if (this.products[this.products.length - 1] != null) {
            setNewProducts();
        }
        addToArray(product);
    }

    public int findIdxById(Long id) {
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] == null) break;
            if (this.products[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public Product findById(Long id) {
        for (Product product : this.products) {
            if (product == null) break;
            if (product.getId().equals(id)) {
                return product;
            }
        }
        throw new BusinessLogicException("해당 상품이 존재하지 않습니다.");
    }

    private void addInitialStock(Product product) {
        this.products[findIdxById(product.getId())]
                .setStock(this.products[findIdxById(product.getId())].getStock() + product.getStock());
    }

    private void setNewProducts() {
        Product[] newProducts = new Product[this.products.length * 2];
        System.arraycopy(this.products, 0, newProducts, 0, this.products.length);
        this.products = newProducts;
    }

    private void addToArray(Product product) {
        products[this.products.length - 1] = product;
        Arrays.sort(this.products, Comparator.nullsLast(Comparator.comparing(Product::getName)));
    }

    public void removeProduct(Product product) {
        deleteById(product.getId());
    }


    public void removeProduct(Clothing clothing) {
        deleteById(clothing.getId());
    }

    public void removeProduct(Electronics electronics) {
        deleteById(electronics.getId());
    }

    public void removeProduct(Food food) {
        deleteById(food.getId());
    }

    private void deleteById(Long id) {
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i].getId().equals(id)) {
                this.products[i] = null;
                Arrays.sort(this.products, Comparator.nullsLast(Comparator.comparing(Product::getName)));
                System.out.println("상품이 삭제되었습니다.");
                break;
            }
            if (this.products[i] == null) throw new BusinessLogicException("해당 상품이 존재하지 않습니다.");
        }
    }

    public void displayProducts() {
        System.out.println("-------현재 상품 목록-------");
        for (Product product : this.products) {
            if (product == null) {
                break;
            }
            System.out.println("제품 명 : " + product.getName());
            System.out.println("제품 가격 : " + product.calculatePrice());
            System.out.println("제품 수량 : " + product.getStock());
            getAdditionalInformation(product);
            System.out.println("----------------------");
        }
    }

    public void displayProducts(Type type) {
        for (Product product : this.products) {
            if (product.getClass().equals(type)) {
                System.out.println(product.getName());
            }
        }
    }

    public void displayProducts(Product[] products) {
        System.out.println("-------현재 상품 목록-------");
        for (Product product : products) {
            System.out.println("제품 명 : " + product.getName());
            System.out.println("제품 번호 : " + product.getId());
            System.out.println("----------------------");
        }
    }

    public void getAdditionalInformation(Product product) {
        product.printAdditionalInformation();
    }

    public abstract boolean checkOrderAvailability(Product product);
}
