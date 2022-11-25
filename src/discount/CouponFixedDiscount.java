package discount;

import domain.Money;
import domain.Product;

public class CouponFixedDiscount implements CouponDisountPolicy {


    Money discountFixAmount;
    public CouponFixedDiscount(Money discountFixAmount) {
        this.discountFixAmount = discountFixAmount;
    }
    @Override
    public Money calculateDiscountAmount(Product product) {
        return discountFixAmount;
    }
}
