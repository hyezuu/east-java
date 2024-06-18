package shoppingmall.product.subproduct;

import shoppingmall.product.Product;

import java.util.HashMap;
import java.util.Map;

public class Electronics extends Product {
    private final String brand;
    private static final Map<String, Double> BRAND_SURCHARGE_RATES;

    static {
        BRAND_SURCHARGE_RATES = new HashMap<>();
        BRAND_SURCHARGE_RATES.put("Apple", 1.2);
    }

    public Electronics(Long id, String name, int price, int stock, String brand) {
        super(id, name, price, stock);
        this.brand = brand;
    }

    @Override
    public double calculatePrice() {
        double surchargeRate = BRAND_SURCHARGE_RATES.getOrDefault(this.brand, 1.0);
        return super.getPrice() * surchargeRate;
    }

    @Override
    public void printAdditionalInformation() {
        System.out.println("브랜드 :" + this.getBrand());
    }

    public String getBrand() {
        return brand;
    }
}
