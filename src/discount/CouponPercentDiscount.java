package discount;

import domain.Money;
import domain.Product;

public class CouponPercentDiscount implements CouponDisountPolicy{



    private double percent;

    public CouponPercentDiscount(double percent) {
        this.percent = percent;
    }
    @Override
    public Money calculateDiscountAmount(Product product) {
        return product.getPrice().times(percent);
    }
}
