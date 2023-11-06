package main.java.com.ohgiraffers.section02;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class Applicaiton01 {
    public static void main(String[] args){
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(-1000, -5000);
        }
//        catch (Exception e){
//            e.printStackTrace();
//        } //자세하게 오류를 알 수 없음
        catch(PriceNegativeException e){
            System.out.println("PriceNegativeException 발생");
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e){
            System.out.println("MoneyNegativeException 발생");
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e){
            System.out.println("NotEnoughMoneyException 발생");
            System.out.println(e.getMessage());
        }
    }
}
