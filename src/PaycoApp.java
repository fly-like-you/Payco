import discount.CouponFixedDiscount;
import domain.Franchises;
import domain.Money;
import domain.Product;
import domain.Selling;
import member.Coupon;
import member.Member;
import purchase.Payment;
import purchase.PaymentCredit;

import java.math.BigDecimal;

public class PaycoApp {
    public static void main(String[] args) {
        Payment paymentCredit = new PaymentCredit();
        Coupon coupon = new Coupon(new CouponFixedDiscount(new Money(new BigDecimal(1000))));
        Member member = new Member(coupon, paymentCredit);


        Product product = new Product("꼬깔칩",
                new Money(new BigDecimal (10000)));
        Franchises franchises = new Franchises(product);


        Selling selling = franchises.sell(member);
        selling.getSellInfo();

    }
}
