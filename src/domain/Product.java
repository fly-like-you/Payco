package domain;

import discount.CouponDisountPolicy;
import member.Coupon;
import member.Member;

public class Product {


    private String name;
    private Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
    public Money calculateProductPrice(Coupon coupon) {

        return price.minus(coupon.getDiscountPrice(this));
    }
}
