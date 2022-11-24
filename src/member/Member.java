package member;

import discount.CouponDisountPolicy;
import discount.CouponNoneDiscount;
import purchase.Payment;

public class Member {
    private Coupon coupon;
    private Payment payment;

    public Member(Coupon coupon, Payment payment) {
        this.coupon = coupon;
        this.payment = payment;
    }


    public Coupon useCoupon() {
        Coupon coupon = this.coupon;
        this.coupon = new Coupon(new CouponNoneDiscount());
        return coupon;
    }

}
