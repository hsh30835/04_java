package main.java.com.ohgiraffers.section01.exception;

public class Application03 {
    public static void main(String[] args){
        ExceptionText et = new ExceptionText();

        try{
            et.checkEnoughMoney(5000,10000);
            //money에 price보다 낮은 수를 넣으면
            //at main.java.com.ohgiraffers.section01.exception.ExceptionText.checkEnoughMoney(ExceptionText.java:12)
            //오류메세지가 뜸
            System.out.println("상품 구매완료");
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
