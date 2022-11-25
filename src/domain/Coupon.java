package domain;

import discount.CouponDisountPolicy;
import domain.Money;
import domain.Product;


public class Coupon {
// Coupon - 할인의 종류를 결정하는 책임을 가진다.
    private CouponDisountPolicy couponDiscountPolicy;

    public Coupon(CouponDisountPolicy couponDiscountPolicy) {
        this.couponDiscountPolicy = couponDiscountPolicy;
    }

    public CouponDisountPolicy getCouponDiscountPolicy() {
        return this.couponDiscountPolicy;
    }
    public Money getDiscountPrice(Product product){
        return couponDiscountPolicy.calculateDiscountAmount(product);
    }
}
