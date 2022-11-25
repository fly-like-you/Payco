package purchase;

import domain.Money;


public class Cash extends Payment{
    public Cash(Money amount) {
        super(amount);
    }

    @Override
    public String toString(){
        return "현금 결제";
    }
}
