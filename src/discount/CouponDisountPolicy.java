package discount;

import domain.Money;
import domain.Product;
import member.Coupon;
import member.Member;

public interface CouponDisountPolicy {
    /**
     * @return 할인 대상 금액
     */
    Money calculateDiscountAmount(Product product);


}
