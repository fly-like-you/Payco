import discount.CouponFixedDiscount;
import discount.CouponNoneDiscount;
import discount.CouponPercentDiscount;
import domain.Franchises;
import domain.Money;
import domain.Product;
import domain.Selling;
import member.Coupon;
import member.Member;

import purchase.Cash;
import purchase.Credit;
import purchase.Payment;
import purchase.Point;

import java.math.BigDecimal;
import java.util.Scanner;

public class PaycoApp {

    public static void main(String[] args) {


        Money money = new Money(new BigDecimal(0));

        Credit credit = new Credit(money, "카카오뱅크");
        Cash cash = new Cash(money);
        Point point = new Point(money);
        Coupon coupon = new Coupon(new CouponNoneDiscount());
        Member member = new Member(1L, coupon, credit, cash, point);
        member.setSelected(credit);



        // 각 제품은 제품명과 가격을 가진다.
        Product product = new Product("꼬깔칩",
                new Money(new BigDecimal (10000)));

        // 가맹점마다 제품을 가지고 있고 적립되는 포인트의 비율은 모두 다르다.
        Franchises franchises = new Franchises("씨유", product, 0.1);


//        Selling selling = franchises.sell(member);
//        selling.getSellInfo();
//        System.out.println("point = " + point.toString());

        while(true){
            System.out.println("Payco App");
            Scanner scanner = new Scanner(System.in);
            System.out.println("1: 잔액 충전\n2: 쿠폰 받기\n3: 결제하기\n 4: 잔액 조회\n5: 결제 내역 조회\n6: 앱 종료");
            int cmd = scanner.nextInt();
            switch (cmd){
                case 1:
                    System.out.println("충전할 결제 수단을 선택하세요");
                    System.out.println("1: 카드\n2: 포인트");
                    int num = scanner.nextInt();
                    System.out.println("충전할 금액을 입력하세요");
                    int charge = scanner.nextInt();

                    if(num == 1) {
                        member.setSelected(credit);
                        member.deposit(new Money(new BigDecimal(charge)));
                    }if(num == 2){
                        member.setSelected(point);
                        member.deposit(new Money(new BigDecimal(charge)));
                    }
                    break;
                case 2:
                    if(member.couponFull()){
                        System.out.println("더 이상 쿠폰을 추가할 수 없습니다!! 현재 최대 저장가능 쿠폰 수 1");
                        break;
                    }
                    System.out.println("쿠폰종류를 선택하세요");
                    System.out.println("1: 고정 할인 쿠폰\n2: 비율 할인 쿠폰");
                    num = scanner.nextInt();

                    if(num == 1){
                        System.out.println("쿠폰의 할인 값을 적어주세요");
                        int discount = scanner.nextInt();
                        member.addCoupon(new Coupon(new CouponFixedDiscount(
                                new Money(new BigDecimal(discount)))));
                    } else if (num == 2) {
                        System.out.println("쿠폰의 할인 비율을 적어주세요(소수점)");
                        double discount = scanner.nextDouble();
                        member.addCoupon(new Coupon(new CouponPercentDiscount(discount)));
                    }
                    break;
                case 3:
                    System.out.println(franchises.getStoreName() + "에서 결제를 진행합니다.");
                    System.out.println("결제 수단을 선택하세요");
                    System.out.println("1: 카드\n2: 포인트\n3: 현금");
                    System.out.println("카드 잔액: " + member.getCreditAmount() + "\n포인트 잔액: " + member.getPointAmount() + "\n현금 잔액: " + member.getCashAmount());

                    int select = scanner.nextInt();
                    if(member.getSelected().getAmount().isLessThan( franchises.getProduct().getPrice())){
                        System.out.println("잔액부족 다시 시도해주세요!");
                        break;
                    }
                    if(select == 1) {
                        member.setSelected(credit);
                    }else if(select == 2){
                    member.setSelected(point);
                    }else if(select == 3){
                        member.setSelected(cash);
                    }
                    System.out.println("쿠폰은 자동으로 사용됩니다.");
                    Selling sellInfo = franchises.sell(member);
                    System.out.println("구매내역");
                    System.out.println(sellInfo.toString());

                    break;
                case 4: checkBalance(); break;
                case 5: checkPayList(); break;
                case 6: return;
            }
        }
    }
    static private void chargeBalance(Member member){


    }
    private static void checkPayList() {

    }

    private static void checkBalance() {

    }

    private static void purcharse() {

    }

    private static void makeCoupon() {
        makeCoupon();
    }



}
