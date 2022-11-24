package domain;

import domain.Franchises;
import domain.Money;
import member.Member;

public class Selling {
    private Member member;
    private Money price;
    private Franchises franchises;

    public Selling(Member member,Franchises franchises, Money price) {
        this.member = member;
        this.price = price;
        this.franchises = franchises;
    }
    public void getSellInfo(){
        System.out.println("price.toString() = " + price.toString());
    }





}
