package discount;

import domain.Money;
import domain.Product;
import member.Coupon;
import member.Member;

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
