package purchase;

import domain.Franchises;
import domain.Money;


public class Point extends Payment{
    private double percent;


    public Point(Money amount) {
        super(amount);
    }

    @Override
    public String toString(){

        return "amount: "+ amount;
    }

    public void savePointsAmount(Franchises franchises, Money money){
        this.amount = amount.plus(money.times(franchises.getPercent()));
    }
}
