package main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Application01 {
    public static void main(String[] args){
        Monster monster = new Monster();
        //new가 생성자 Monster가 오브젝트 monster는 Moster오브젝트를 참조한 인스턴스
        System.out.println(monster.hashCode());
        //실행시 93122545.hp
        monster.name = "두치"; //93122545.name
        monster.hp = 200; //93122545.hp
        //Monster.name = "두치";
        System.out.println("monster name : " + monster.name);
        System.out.println("monster hp : " + monster.hp);

        Monster monster2 = new Monster();
        //monster2 == 940553268
        System.out.println(monster2.hashCode());
        //실행시 940553268.hp
        monster2.name = "뿌꾸"; //940553268.name = "뿌꾸";
        monster2.hp=-200; //940553268.hp = -200;
        System.out.println("monster2의 name " + monster2.name);
        //문자는 null 값을 허용할수있음 String형태의 기본자료는 null
        System.out.println("monster2의 hp : " + monster2.hp);

        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(-200);
        System.out.println("monster3의 name " + monster3.name);
        System.out.println("monster3의 hp : " + monster3.hp);

        Monster monster4 = new Monster();
        monster4.name = "프랑켄슈타인";
        monster4.setHp(1000);
        System.out.println("monster4의 name " + monster4.name);
        System.out.println("monster4의 hp " + monster4.hp);
    }
}
