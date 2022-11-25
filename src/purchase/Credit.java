package purchase;

import domain.Money;


public class Credit extends Payment{

    String creditName;

    public Credit(Money amount, String creditName) {
        super(amount);
        this.creditName = creditName;
    }

    @Override
    public String toString(){
        return "카드 결제\n카드 이름:" +this.creditName;
    }
}
