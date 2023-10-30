package main.java.com.ohgiraffers.section01.extend;

public class FireCar extends Car/*Car(부모)를 상속받음*/ {
    public FireCar(){
        /*
        * 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
        * 부모의 기본 생성자를 호출하는 구문이다.
        * 해당 생성자가 호출 될 시 가장 먼저 Car() 클래스를 호출 내용이 출력될 것이다.
        * 명시적, 묵시적 전부 사용 가능하다.
        * */
        super(); //Car를 상속받음 / 자바는 다중상속이 안됨 부모를 두명 둘수 없음
    }

    @Override //부모가 가진 기능을 내가 재정의 하겠다.
    public void soundHorn(){
        if(super.isRunning()){ //super가 가진 isRunning을 호출함
            System.out.println("빠아아아앙");
        }else{
            System.out.println("소방차가 앞으로 갈 수 없습니다");
        }
    }

    public void sprayWater(){ //소방차만 갖는 속성
        System.out.println("불난 곳을 발견 했습니다. 물을 뿌립니다.");
    }

    /*@Override
    public int soundHorn(){
        //오류남 타입 맞춰줘야됨
    }*/

}
