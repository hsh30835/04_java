package main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

    String name;
    int hp;
    public void setHp(int hp){
        if(hp>0){
            /*
            * this는 인스턴스가 생성되었을 때 자신의 주소를 저장하는 래퍼런스 변수이다.
            * 지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선적으로 접근하기 떄문에
            * 전역변수에 접근하기 위해서는 this.을 명시해야한다
            * */
            System.out.println("양수 값이 입력되어 몬스터의 체력을 입력한 값으로 변경합니다.");
            this.hp = hp;
            //this는 자기자신 //class Monster에서 hp를 가져옴
            //전역 메소드는 모든 범위를 포함하고 지역 메소드는 자기 지역만 포함함
            //그래서 int hp;가있어도 this.hp = hp;를 쓸 수 있음
        }else{
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 설정합니다.");
            this.hp = 0;
        }
    }
}
