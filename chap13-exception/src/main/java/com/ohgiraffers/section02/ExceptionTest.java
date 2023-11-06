package main.java.com.ohgiraffers.section02;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money)
            throws PriceNegativeException,MoneyNegativeException,NotEnoughMoneyException{
        //얘를 호출시 발생될 수 있는 예외를 미리 만듬 //thorws는 처리해주는게 아니라 발생될수 있다고 알려줌
        System.out.println("가지고 있는 돈은 " + money + "원 입니다.");

        if(price<0){
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
            //별도로 예외를 정의
        }
        if(money<0){ //유효성 체크를할때 else if를 안쓰고 if를 여러개 씀
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }
        if(money < price){
            throw new NotEnoughMoneyException("가진 돈 보다 상품 가격이 더 비쌉니다.");
        }
        System.out.println("즐거운 쇼핑되세요");
    }
}
