package member;

import discount.CouponNoneDiscount;
import domain.Franchises;
import domain.Money;
import purchase.Cash;
import purchase.Credit;
import purchase.Payment;
import purchase.Point;

public class Member {
    private Long id;
    private Coupon coupon;
    private Credit credit;
    private Cash cash;
    private Point point;

    private Payment selected;

    public Member(Long id, Coupon coupon, Credit credit, Cash cash, Point point) {
        this.id = id;
        this.coupon = coupon;
        this.credit = credit;
        this.cash = cash;
        this.point = point;

    }
    public boolean couponFull(){
        return !(this.coupon.getCouponDiscountPolicy() instanceof  CouponNoneDiscount);
    }
    public void addCoupon(Coupon coupon){
        this.coupon = coupon;
    }

    public Coupon useCoupon() {
        Coupon coupon = this.coupon;
        this.coupon = new Coupon(new CouponNoneDiscount());
        return coupon;
    }

    public void setSelected(Payment payment){
        this.selected = payment;
    }
    public Payment getSelected(){
        return this.selected;
    }
    public void pay(Franchises franchises, Money money){
        selected.usePaymentAmount(franchises, money);
        point.savePointsAmount(franchises,money);
    }
    public void deposit(Money price){
        selected.depositPaymentAmount(price);
    }
    public Long getId() {
        return id;
    }
    public Money getCreditAmount(){
        return this.credit.getAmount();
    }
    public Money getCashAmount(){
        return this.cash.getAmount();
    }
    public Money getPointAmount(){
        return this.point.getAmount();
    }
}
