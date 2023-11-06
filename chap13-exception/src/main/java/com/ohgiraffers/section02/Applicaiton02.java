package main.java.com.ohgiraffers.section02;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class Applicaiton02 {
    public static void main(String[] args){
        ExceptionTest et = new ExceptionTest();
        try{
            et.checkEnoughMoney(-10000,-500);
        }catch(NotEnoughMoneyException e){
            e.printStackTrace();
        }catch (PriceNegativeException | MoneyNegativeException e){
            //PriceNegativeException와 MoneyNegativeException는 부모가 같아 동일한 타입임
            //NotEnoughMoneyException은 Exception을 상속받아서 같이 못함
            e.printStackTrace();
        }finally {
            System.out.println("무조건 마지막에 동작됨");
        }
    }
}
