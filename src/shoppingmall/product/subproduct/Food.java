package shoppingmall.product.subproduct;

import shoppingmall.product.Product;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Food extends Product {
    private LocalDateTime expirationDate;
    private static final Map<Long, Double> DISCOUNT_RATE;

    static {
        DISCOUNT_RATE = new HashMap<>();
        DISCOUNT_RATE.put(7L, 0.8);
    }

    public Food(String name, int price, int stock, LocalDateTime expirationDate) {
        super(name, price, stock);
        this.expirationDate = expirationDate;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public double calculatePrice() {
        LocalDateTime now = LocalDateTime.now();
        long daysUntilExpiration = Duration.between(now, expirationDate).toDays();
        double discountRate = DISCOUNT_RATE.getOrDefault(daysUntilExpiration, 1.0);
        return super.getPrice() * discountRate;
    }
}
