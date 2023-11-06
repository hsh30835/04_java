package main.java.com.ohgiraffers.section01.exception;

public class Application02 {
    public static void main(String[] args){
        ExceptionText et = new ExceptionText();
        try{
            et.checkEnoughMoney(10000,100);
//            et.checkEnoughMoney(5000,10000);
//            따로 try를 만들어서 거기에 넣어줘야됨 안그러면 에러남
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("종료");
        //return은 정상적으로 실행되는걸 가정하고 하는것
        //thorws는 발생하면 멈춤
    }
}
