package shoppingmall;

import shoppingmall.product.Product;
import shoppingmall.product.subproduct.Clothing;
import shoppingmall.product.subproduct.Electronics;
import shoppingmall.product.subproduct.Food;
import shoppingmall.product.subproduct.Size;
import shoppingmall.shoppingmall.PremiumShoppingMall;

import java.time.LocalDateTime;

public class ShoppingMallApplication {
    public static void main(String[] args) {
        PremiumShoppingMall shoppingMall = new PremiumShoppingMall(new Product[]{
                //애플 추가요금 적용
                new Electronics(1L, "맥북", 2000000, 10, "Apple"),
                //애플 추가요금 x
                new Electronics(2L, "갤럭시노트", 800000, 10, "SamSung"),
                //유통기한 할인 x
                new Food(3L, "삼각김밥", 700, 20, LocalDateTime.now().plusWeeks(2)),
                //유통기한 할인 적용
                new Food(4L, "삼각김밥", 700, 20, LocalDateTime.now()),
                //사이즈 추가요금 적용
                new Clothing(5L, "회색후드집업", 20000, 10, Size.L),
                //사이즈 추가요금 x
                new Clothing(6L, "회색후드집업", 20000, 10, Size.M),
        });

        System.out.println();
        System.out.println("기존 크기 : " + shoppingMall.getProducts().length);

        shoppingMall.addProduct(new Clothing(5L, "회색후드집업", 20000, 10, Size.L));
        shoppingMall.addProduct(new Clothing(8L, "노란색후드집업", 20000, 10, Size.L));
        shoppingMall.addProduct(new Clothing(9L, "검정색후드집업", 20000, 9, Size.L));


        System.out.println("증가된 크기 : " + shoppingMall.getProducts().length);

        System.out.println();
        //제품 삭제
        shoppingMall.removeProduct(shoppingMall.findById(1L));

        System.out.println();
        //상품 목록 출력
        shoppingMall.displayProducts();
        System.out.println();

        //재고 10미만
        System.out.println("재고 10미만 : " + shoppingMall.checkOrderAvailability(shoppingMall.findById(9L)));
        //재고 10이상
        System.out.println("재고 10이상 : " + shoppingMall.checkOrderAvailability(shoppingMall.findById(8L)));
    }
}
