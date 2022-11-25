package purchase;

import domain.Franchises;
import domain.Money;


import java.util.ArrayList;
import java.util.List;

public abstract class Payment {
    protected Money amount;

    public Payment(Money amount) {
        this.amount = amount;
    }
    public Money usePaymentAmount(Franchises franchises, Money price){
        this.amount = amount.minus(price);
        return this.amount;
    }
    public Money depositPaymentAmount(Money deposit){
        this.amount = amount.plus(deposit);
        return this.amount;
    }
    public Money getAmount(){
        return this.amount;
    }
}
