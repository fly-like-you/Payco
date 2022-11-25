package discount;

import domain.Money;
import domain.Product;

public interface CouponDisountPolicy {
    /**
     * @return 할인 대상 금액
     */
    Money calculateDiscountAmount(Product product);


}
