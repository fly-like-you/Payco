package domain;

import domain.Franchises;
import domain.Money;
import member.Member;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Selling {
    private Member member;
    private Money price;
    private Franchises franchises;
    private LocalDateTime whenSelled;
    public Selling(Member member,Franchises franchises, Money price) {
        this.member = member;
        this.price = price;
        this.franchises = franchises;
        this.whenSelled = LocalDateTime.now(); // 2018-07-26 00:42:24
    }

    public String toString(){
        return "판매일시: "+ whenSelled.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +
                "\n회원번호: "+member.getId() +
                "\n상품명: " + franchises.getProduct().getName() +
                "\n결제 수단: "+ member.getSelected() +
                "\n결제 가격: "+price.toString() +
                "\n---------------------------------\n가맹점 정보\n" + franchises.toString()+"\n---------------------------------";
    }




}
