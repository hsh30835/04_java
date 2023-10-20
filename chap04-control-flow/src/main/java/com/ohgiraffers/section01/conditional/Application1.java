package main.java.com.ohgiraffers.section01.conditional;

public class Application1 {
    public static void main(String[] args){
        /*A_if a_if = new A_if();
        a_if.testSimpleIfstatement();*/

        /*B_ifElseif b_if = new B_ifElseif();
        b_if.testNestedIfEleseIfStatement();*/

        D_switch d = new D_switch();
        String result = d.testSwitchVendingMachine();
        System.out.println(result);

    }
}
