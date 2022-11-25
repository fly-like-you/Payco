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
    public String toString(){
        return "회원번호: "+member.getId() + "\n 결제 가격: "+price.toString() + "\n\n가맹점 정보:" + franchises.toString();
    }




}
