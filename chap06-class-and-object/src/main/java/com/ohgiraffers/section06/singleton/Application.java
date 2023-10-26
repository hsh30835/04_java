package main.java.com.ohgiraffers.section06.singleton;

public class Application {
    public static void main(String[] args){
        /*
        * singleton pattern
        * 애플리케이션이 시작될 때 어떤 클래스가 최초 한 번만 메모리를 할당하고 그 메모리에 인스턴스를 만들어서
        * 하나의 인스턴스를 공유해서 사용하며 메모리 낭비를 방지할 수 있게함(매번 인스턴스를 생성하지 않는다)
        *
        * 장점
        * 1. 첫 번째 이용 시에는 인스턴스를 생성해야 하므로 속도 차이가 나지 않지만
        *    두 번째 이용 시에는 인스턴스 생성 시간 없이 사용할 수 있다.
        * 2. 인스턴스가 절대적으로 한 개만 존재하는 것을 보증할 수 있다.
        * 단점
        * 1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하며 결합도가 높아지다.
        *    (유지보수와 테스트에 문제점이 있음)
        * 2. 동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 있다.
        * */

        /*
        * 싱글톤 구현 방법
        * 1. 이른 초기화 (Eager Initialization)
        * 2. 게으른 초기화 (Lazy Initialization)
        * */

        EagerSingleton eager1 = EagerSingleton.getInstance();
        //static 메서드는
        System.out.println(eager1.hashCode());
        eager1 = EagerSingleton.getInstance();
        System.out.println(eager1.hashCode());

        EagerSingleton test1 = EagerSingleton.getInstance();
        System.out.println("test의 주소 : " + test1.hashCode());

        EagerSingleton test2 = EagerSingleton.getInstance();
        System.out.println("test2의 주소 : " + test2.hashCode());
        //single은 인스턴스가 단 하나밖에 안나오게 함 둘의 주소가 같음
        //로그인할때 생각해보면 id한개를 한명이 로그인 할수있는데
        //메일을 보낼려면 로그인 정보를 가지고있어야하고 로그인을 해야됨
        //근데 이걸 100명이 보낸다 생각하면 100명이 동시에 로그인 시도를 하니 로그인이 안됨
        //100명이 로그인1의 정보를 시도해서 불가능함
        //어플리케이션에서 인스턴스를 호출한 순간 로그인을 한거임
        //네이버메일 보내는 객체 1개를 만듬
        //그리고 100명이 메일을 보내려면 100개의 객체를 생성 해야됨
        //집 열쇠가 하나만 있으면 열쇠 하나만 지키면됨 100개 있으면 100개 전부를 지켜야됨
        //집 하나에 열쇠를 100개를 꽂음
        //동일한 하나를 만들어서 다수가 사용할 수 있도록함.

        System.out.println("=======lazy========");
        LazySingleton lazy = LazySingleton.getInstance();
        System.out.println(lazy.hashCode());
        lazy = LazySingleton.getInstance();
        System.out.println(lazy.hashCode());

    }
}
