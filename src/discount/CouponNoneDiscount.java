package discount;

import domain.Money;
import domain.Product;

import java.math.BigDecimal;

public class CouponNoneDiscount implements CouponDisountPolicy{
    @Override
    public Money calculateDiscountAmount(Product product) {
        return new Money(BigDecimal.ZERO);
    }
}
