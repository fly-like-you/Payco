package domain;

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
    @Override
    public String toString(){
        return "상품 이름: " + name;
    }
}
