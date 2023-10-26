package main.java.com.ohgiraffers.section05.overloading;

public class OverloadingTest {
    public static void main(String[] args){
        /*
        * 오버로딩의 사용
        * 매게변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우들이 종종 있다.
        * 이 때, 동일한 기능의 메소드를 매게변수에 따라 다르게 이름을 정의하면 복잡하고
        * 관리하기가 매우 어려울 것이다.
        * 규모가 작은 프로그램의 경우는 정도가 덜 하지만, 규모가 거대해지면 메소드 또한
        * 관리하기가 매우 어려워진다.
        * 따라서 동일한 이름으로 다양한 종류의 매게변수에 따라 처리해야 하는 여러 메소드를
        * 동일한 이름으로 관리하기 위해 사용하는 기술을 오버로딩이라고 한다.
        *
        * 오버로딩의 조건
        * 동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수의 타입, 갯수, 순서를 다르게 작성하여
        * 한클래스 내에 동일한 이름의 메소드를 여러 개 작성할 수 있도록한다.
        * 메소드의 시그니쳐(signature)가 다르면 다른 메소드로 인식하기 때문이다.
        * 즉, 시그니쳐 중 메소드 이름은 동일해야 하기 때문에 파라미터 선언부가 다르게
        * 작성되어야 오버로딩이 성립된다.
        * 매개변수 : 함수에서 받을 값
        *
        * 메소드의 시그니처란
        * public void method(int num){} 이라는 메소드의 메소드명과 파라미터 선언 부분을
        * 시그니처라고 부른다. mehthod(int num)이 부분이 시그니처이다.
        * 메소드의 시그니처가 달라야 하기 때문에 접근제한자나 반환형은 오버로딩 성립 요건에 해당하지 않는다.
        * */

    }
    // 오버로딩의 조건
    // 1. 매개변수의 타입, 갯수, 순서를 다르게 작성하여
    // 2. 이름의 메소드
    // 3. 메소드의 시그니쳐(signature)가 다르면

    // 5개 만들기
        /*public void test(){

        }

        public int test(){

        }

        public String test(){

        }

        public boolean test(){

        }

        public double test(){

        }*/
    //메소드의 시그니쳐가 다 같아서 오류났음 ()안에 있는게 시그니쳐(매개변수를 받는곳)
    public void test(int num){

    }

    public int test(int num1, int num2){
        return 0;
    }

    public String test(String s, String a){
        return " ";
    }

    public boolean test(boolean a){
        return a;
    }

    public double test(double a){
        return a;
    }
}
