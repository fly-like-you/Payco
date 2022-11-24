package member;

import discount.CouponDisountPolicy;
import domain.Money;
import domain.Product;


public class Coupon {

    private CouponDisountPolicy couponDiscountPolicy;

    public Coupon(CouponDisountPolicy couponDiscountPolicy) {

        this.couponDiscountPolicy = couponDiscountPolicy;

    }


    public void setCouponDiscountPolicy(CouponDisountPolicy couponDiscountPolicy) {
        this.couponDiscountPolicy = couponDiscountPolicy;
    }

    public Money getDiscountPrice(Product product){
        return couponDiscountPolicy.calculateDiscountAmount(product);
    }




}
