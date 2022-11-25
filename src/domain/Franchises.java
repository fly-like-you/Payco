package domain;

import domain.Money;
import member.Coupon;
import member.Member;

import java.time.LocalDateTime;

public class Franchises {

    private Product product;
    private double percent;
    private String storeName;
    public Franchises(String storeName, Product product, double percent) {
        this.storeName = storeName;
        this.product = product;
        this.percent = percent;

    }

    public String getStoreName() {
        return storeName;
    }

    public Selling sell(Member member){
        // 책임: 물건을 팔고 구매 내역을 작성함

        //member
        Coupon coupon = member.useCoupon();
        Money price = calculatePrice(coupon);

        member.pay(this, price);
        return new Selling(member, this, price);
    }
    public Product getProduct() {
        return product;
    }

    public double getPercent() {
        return percent;
    }

    private Money calculatePrice(Coupon coupon) {
        return product.calculateProductPrice(coupon);
    }
    @Override
    public String toString(){
        return "가맹점 상호명: " + storeName + "\n 구매 상품 이름: " + product.toString() + "\n 가맹점 적립 비율: "+ this.getPercent();
    }

}
