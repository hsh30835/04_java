package main.java.com.ohgiraffers.section02.encapsulation.problem4;

public class Application {
    public static void main(String[] args){
        /* 접근제어자의 필요성 */
        Monster monster = new Monster();
        monster.setKind("프랑켄슈타인");
        monster.setHp(500);
        System.out.println(monster.getHp() + " " + monster.getKind());
        System.out.println(monster instanceof Object); //instanceof는 몬스터랑 오브젝트랑 같은지 물어봄
        System.out.println(monster.toString()); //println은 toString()을 기본으로 실행시킴
    }
}
