package shoppingmall.shoppingmall;

import shoppingmall.exception.ProductNotFoundException;
import shoppingmall.product.Product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public abstract class ShoppingMall {
    private Product[] products;

    public ShoppingMall(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    //addProduct 메소드는 Product 객체를 매개변수로 받아 배열에 추가하는 기능을 할 것
    public void addProduct(Product product) {
        addProductToArray(product);
    }

    //removeProduct 메소드는 Product 객체 또는 상품명을 매개변수로 받아 배열에서 해당 상품을 삭제하는 기능을 할 것
    public void removeProduct(Product product) {
        delete(item -> item.equals(product));
    }

    public void removeProduct(String name) {
        delete(item -> item.getName().equals(name));
    }

    //displayProducts 메소드는 현재 배열에 있는 모든 상품의 정보를 출력하는 기능을 할 것
    public void displayProducts() {
        System.out.println("-------현재 상품 목록-------");
        for (Product product : this.products) {
            if (product == null) {
                break;
            }

            System.out.println("제품 번호 : " + product.getId());
            System.out.println("제품 명 : " + product.getName());
            System.out.println("제품 가격 : " + product.calculatePrice());
            System.out.println("제품 수량 : " + product.getStock());
            getAdditionalInformation(product);
            System.out.println("----------------------");
        }
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
        throw new ProductNotFoundException("해당 상품이 존재하지 않습니다.");
    }

    private void addInitialStock(Product product) {
        this.products[findIdxById(product.getId())]
                .setStock(this.products[findIdxById(product.getId())].getStock() + product.getStock());
    }

    //제품 추가 시 배열이 꽉 찼다면 기존 배열 크기의 2배로 새로운 배열을 생성하고 기존 상품들을 복사한 후 새 상품을 추가할 것
    private void setNewProducts() {
        Product[] newProducts = new Product[this.products.length * 2];
        System.arraycopy(this.products, 0, newProducts, 0, this.products.length);
        this.products = newProducts;
    }

    private void addToArray(Product product) {
        products[this.products.length - 1] = product;
        Arrays.sort(this.products, Comparator.nullsLast(Comparator.comparing(Product::getId)));
    }

    private void delete(Predicate<Product> condition) {
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i] == null) throw new ProductNotFoundException("해당 상품이 존재하지 않습니다.");
            if (condition.test(this.products[i])) {
                this.products[i] = null;
                Arrays.sort(this.products, Comparator.nullsLast(Comparator.comparing(Product::getId)));
                System.out.println("상품이 삭제되었습니다.");
                break;
            }
        }
    }


//    private void delete(Product product) {
//        for (int i = 0; i < this.products.length; i++) {
//            if (this.products[i] == null) throw new ProductNotFoundException("해당 상품이 존재하지 않습니다.");
//            if (this.products[i].equals(product)) {
//                this.products[i] = null;
//                Arrays.sort(this.products, Comparator.nullsLast(Comparator.comparing(Product::getId)));
//                System.out.println("상품이 삭제되었습니다.");
//                break;
//            }
//        }
//    }
//
//    private void deleteByName(String name) {
//        for (int i = 0; i < this.products.length; i++) {
//            if (this.products[i] == null) throw new ProductNotFoundException("해당 상품이 존재하지 않습니다.");
//            if (this.products[i].getName().equals(name)) {
//                this.products[i] = null;
//                Arrays.sort(this.products, Comparator.nullsLast(Comparator.comparing(Product::getId)));
//                System.out.println("상품이 삭제되었습니다.");
//                break;
//            }
//        }
//    }


    public void getAdditionalInformation(Product product) {
        product.printAdditionalInformation();
    }

    public abstract boolean checkOrderAvailability(Product product);
}
