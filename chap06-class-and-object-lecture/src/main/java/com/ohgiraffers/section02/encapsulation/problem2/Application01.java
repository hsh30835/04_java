package main.java.com.ohgiraffers.section02.encapsulation.problem2;

public class Application01 {
    public static void main(String[] args){
        /*
        * 참조 자료형의 필드가 변경되는 경우 직접 참조를 하는 필드의 모든 값을 변경해야 하는 문제가 발생된다.
        * */
        Monster monster = new Monster();
        //new가 생성자 Monster가 오브젝트 monster는 Moster오브젝트를 참조한 인스턴스
        System.out.println(monster.hashCode());
        //실행시 93122545.hp
        monster.kind = "두치"; //93122545.name
        monster.hp = 200; //93122545.hp
        //Monster.name = "두치";
        System.out.println("monster name : " + monster.kind);
        System.out.println("monster hp : " + monster.hp);

        Monster monster2 = new Monster();
        //monster2 == 940553268
        System.out.println(monster2.hashCode());
        //실행시 940553268.hp
        monster2.kind = "뿌꾸"; //940553268.name = "뿌꾸";
        monster2.hp=-200; //940553268.hp = -200;
        System.out.println("monster2의 name " + monster2.kind);
        //문자는 null 값을 허용할수있음 String형태의 기본자료는 null
        System.out.println("monster2의 hp : " + monster2.hp);

        Monster monster3 = new Monster();
        monster3.kind = "드라큘라";
        monster3.setHp(-200);
        System.out.println("monster3의 name " + monster3.kind);
        System.out.println("monster3의 hp : " + monster3.hp);

        Monster monster4 = new Monster();
        monster4.kind = "프랑켄슈타인";
        monster4.setHp(1000);
        System.out.println("monster4의 name " + monster4.kind);
        System.out.println("monster4의 hp " + monster4.hp);
    }
}
