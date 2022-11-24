package domain;

import domain.Money;
import member.Coupon;
import member.Member;

import java.time.LocalDateTime;

public class Franchises {

    private Product product;


    public Franchises(Product product) {
        this.product = product;
    }

    public Selling sell(Member member){
        Coupon coupon = member.useCoupon();
        return new Selling(member, this, product.calculateProductPrice(coupon));
    }





}
