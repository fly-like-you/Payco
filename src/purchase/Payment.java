package purchase;

import domain.Money;

public interface Payment {
    Money pay(Money price);
    boolean canPay(Money price);

}
