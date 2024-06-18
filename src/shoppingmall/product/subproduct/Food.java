package shoppingmall.product.subproduct;

import shoppingmall.product.Product;

import java.time.Duration;
import java.time.LocalDateTime;

public class Food extends Product {
    private LocalDateTime expirationDate;
    private static final double DISCOUNT_RATE = 0.8;
    private static final long DISCOUNT_THRESHOLD_DAYS = 7;

    public Food(Long id, String name, int price, int stock, LocalDateTime expirationDate) {
        super(id, name, price, stock);
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

        double discountRate = daysUntilExpiration <= DISCOUNT_THRESHOLD_DAYS ? DISCOUNT_RATE : 1;
        return super.getPrice() * discountRate;
    }

    @Override
    public void printAdditionalInformation() {
        System.out.println("유통기한 :" + getExpirationDate().toLocalDate());
    }
}
