package shoppingmall.product.subproduct;

import shoppingmall.product.Product;

import java.util.HashMap;
import java.util.Map;

public class Electronics extends Product {
    private String brand;
    private static final Map<String, Double> BRAND_SURCHARGE_RATES;

    static {
        BRAND_SURCHARGE_RATES = new HashMap<>();
        BRAND_SURCHARGE_RATES.put("Apple", 1.2);
        BRAND_SURCHARGE_RATES.put("Samsung", 1.1);
        // 다른 브랜드와 비율 추가
    }

    public Electronics(String name, int price, int stock, String brand) {
        super(name, price, stock);
        this.brand = brand;
    }

    @Override
    public double calculatePrice() {
        double surchargeRate = BRAND_SURCHARGE_RATES.getOrDefault(this.brand, 1.0);
        return super.getPrice() * surchargeRate;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
