package discount;

import domain.Money;
import domain.Product;

public class CouponNoneDiscount implements CouponDisountPolicy{
    @Override
    public Money calculateDiscountAmount(Product product) {
        return product.getPrice();
    }
}
