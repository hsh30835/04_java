package main.java.com.ohgiraffers.section01.exception;

public class ExceptionText {
    public void checkEnoughMoney(int price, int money) throws Exception, ArrayIndexOutOfBoundsException{
        //얘를 호출시 발생될 수 있는 예외를 미리 만듬 //thorws는 처리해주는게 아니라 발생될수 있다고 알려줌
        System.out.println("가지고 있는 돈은 " + money + "원 입니다.");


        if(money >= price){
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
        }else{
            throw new Exception(); //일부러 예외를 강제화 했음 //내가 처리할지 다른곳에서 처리할지 결정해야됨
        }
        System.out.println("즐거운 쇼핑되세요");
    }
}
