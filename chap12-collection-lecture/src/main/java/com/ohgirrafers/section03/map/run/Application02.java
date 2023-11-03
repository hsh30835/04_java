package main.java.com.ohgirrafers.section03.map.run;

import java.io.*;
import java.util.EmptyStackException;
import java.util.Properties;
import java.util.Stack;

public class Application02 {
    public static void main(String[] args){
        /*
        * Properties란
        * hashMap을 구현하여 사용 용법이 거의 유사하지만 key와 value 모두 문자열만 사용할 수 있는 자료구조이다.
        * 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다.
        * */
        Properties prop = new Properties();

        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "localhost");
        prop.setProperty("user", "user");
        prop.setProperty("pass", "pass");
//        prop.setProperty(123,12345); 문자열이 아니라 안됨
        System.out.println(prop);

//        try{ // 예외가 발생될 수 있는 코드를 묶는다.
//            // 엄마가 고기를 사오라고 헀다.
//        }catch (/*엄마 카드에 돈이 없는 경우*/){ // 대상 예외에 해당되면 아래의 코드 블럭에서 처리한다.
//            // 내카드로 결제
//        }catch (/*편의점을 못찾는 경우*/){
//            // 인터넷으로 주문
//        }catch (/*엄마 카드와 내 카드 모두 돈이 없는 경우*/){
//            // 계산 취소
//        }
//        try{
//            prop.store(new FileOutputStream("driver.dat"),"jdbcDriver"); //store는 존재하는지 확인
//            prop.store(new FileWriter("driver.text"),"jdbc driver");
//            prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc dirver");
//        }catch(FileNotFoundException e){
//            e.printStackTrace();
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//        Stack<Integer> integerStack = new Stack<>();
//        try{
//            integerStack.push(1);
//            integerStack.pop();
//            integerStack.pop();
//            integerStack.pop();
//        }catch (EmptyStackException e){
//            e.printStackTrace();
//            System.out.println("testest");
//        }
        System.out.println("setsetsetset");

        Properties prop2 = new Properties();

        try{
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileReader("driver.text"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));

            prop2.list(System.out);
            System.out.println(prop2.getProperty("driver"));
            System.out.println(prop2.getProperty("url"));
            System.out.println(prop2.getProperty("user"));
            System.out.println(prop2.getProperty("password"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
