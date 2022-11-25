package purchase;

import domain.Money;


public class Credit extends Payment{

    String creditName;


    public Credit(Money amount, String creditName) {
        super(amount);
        this.creditName = creditName;
    }


}
