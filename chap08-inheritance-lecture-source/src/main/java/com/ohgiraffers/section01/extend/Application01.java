package main.java.com.ohgiraffers.section01.extend;

public class Application01 {
    public static void main(String[] args){
//        Car car = new Car(); //여기서 93122545 라는 주소를 생성함
//        System.out.println(car.hashCode());
//
//        Car car2; //선언만 해줘서 주소공간 없음
//        car2 = car; // 여기서 93122545 주소공간을 전달해줌
//        System.out.println(car2.hashCode());
//
//        Car car3 = returnCar(car);
//        System.out.println(car3.hashCode());
//
//        System.out.println("======================");
//        String test = "test";
//        String test1 = "test"; //String은 문자열이 같으면 같은 주소값을 가짐
//        String test2 = "test";
//        System.out.println(test.hashCode());
//        System.out.println(test1.hashCode());
//        System.out.println(test2.hashCode());
//        System.out.println("======================");
//        test1 += "1";
//        test2 += "2";
//        System.out.println(test);
//        System.out.println(test.hashCode());
//        System.out.println(test1.hashCode());
//        System.out.println(test2.hashCode());
//        int[] inum = {1,2,3};
//        int[] inum2 = inum;
//        inum2[0] = 100;
//        System.out.println(inum[0]);
//        System.out.println("======================");

//        Car car2; //선언함
//        car2 = returnCar(); //초기화함
//        //생성됨 / Car를 받을 그릇을 만듬
//        //car2는 Car를 담을수 잇는 그릇
//        System.out.println(car2.hashCode());

        /*
        * 상속(inheritance)은 현실 세계의 상속과 비슷한 개념이다.
        * 부모가 가지고 있는 재산(자바에서는 클래스가 가지고 있는 맴버)를 자식이 물려받는 의미이다.
        * 클래스 또한 부모 클래스와 자식 클래스로 역할을 나누어서 부모가 가지는 맴버를 자식이 물려 받아
        * 자기의 맴버인 것 처럼 사용할 수 있도록 만든 기술이다.
        *
        * 하지만 단순 물려받는 개념보다는 조금 더 나아간다면
        * 자바에서 상속은 부모클래스의 확장(extend)의 개념을 가진다.
        * 물려받아서 자신의 것 처럼 사용하는 것 뿐 아니라 추가적인 맴버도 작성이 가능하다.
        * 특히 메소드 재정의(oveerriding)이라는 기술을 이용해서 부모가 가진 메소드를 재정의 하는 것도 가능하다.
        *
        * 메소드 재정의(overriding)이란 부모가 가지는 메소드 선언부를 그대로 사용하면서
        * 자식 클래스가 정의한 메소드 대로 동작하도록 구현 몸체 부분을 새롭게 다시 작성하는 기술이다.
        * 메소드 재정의를 하면 메소드를 호출할 시 재정의한 메소드가 우선적으로 동작하게 된다.
        *
        * 이러한 상속이라는 기술을 사용하게 되면 얻게되는 이점은 크게 두 가지로 볼 수 있다.
        * 1. 새로운 클래스를 작성할 시 기존에 작성한 클래스를 재상용 할 수 있다.
        *   1-1. 재사용 시 생산성을 크게 향상시킬 수 잇다.
        *   1-2. 공통적으로 사용하는 코드가 부모 클래스에서 존재하면 수정사항이 생길 시 부모 클래스만 수정해도
        *        전체적으로 적용된다. (유지보수성 증가)
        * 2. 클래스 간의 계층 관계가 형성되며 다형성 문법적인 토대가 된다.
        *
        * 하지만 상속으로 인한 단점도 존재한다.
        * 1. 부모 클래스의 기능을 추가/변경할 시 자식클래스가 정상적으로 동작하는지에 대한 예측이 힘들다.
        *    상속 구조가 복잡해 질 수록 그 영향에 대한 예측이 힘들며 이러한 단점이 유지보수성을 증가한다는 장점과는
        *    반대로 유지보수에 악영향을 미친다.
        * 2. 또한 부모클래스의 변경 또한 쉽지 않다. 자식 클래스에서 중요하게 사용하는 기능인 경우
        *    부모 클래스를 변경할 시 자식 클래스에 모두 영향을 줄 수 있다.
        *    역시 유지보수에 악영향을 미친다.
        * 3. 부모클래스에서는 의미있었던 기능이 자식 클래스에서는 무의미 할 수 있다. (불필요한 기능이 추가됨)
        *
        * 장점과 단점을 고려했을때
        * 상속은 재사용이라는 장점만 바라보게 되면 오용의 가능성이 있기 떄문에 유지 보수에 좋지 않은 코드를 작성할
        * 확률이 높다. 상속은 IS-A관계로 구분이 되는 경우에만 사용해야 한다.
        *
        * 객체지향 설계 관점에서 바라보는 상속
        * 모든 객체는 자신이 수신한 메세지에 대해 응답을 해야하는 책임을 가지며, 그 책임의 규모는 적절해야 한다.
        * 적절한 책임을 가진 객체들이 서로 협력(메세지 수신과 응답)을 통해 프로그램이 동작하는 것이
        * 객체지향 프로그램이다.
        *
        * 적절한 책임을 수행하는 객체 또한 그 객체만 수행할 수 있는 기능이라기 보다 역할의 관점으로 바라봐야한다.
        * 역할이란 동일한 동작을 수행하는 것을 정의한 것이며 대체 가능성을 의미한다.
        * 부모클래스를 추상화 하는 경우에는 역할의 관점을 바라봐야한다.
        * 그래야 자식클래스로 생성한 객체들이 서로 역할을 수행해가며 유연한 코드를 작성할 수 있게 된다.
        * 객체별로 그 메세지에 응답하는 방식은 서로 다를 수 있다.(다형성)
        * */
        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        FireCar fireCar = new FireCar(); //부모한테 가진 기능을 갖고 더 기능을 확장시킴
        fireCar.toString(); //Object에 상속받은 Car에 상속받은 FireCar를 받을수있음
        fireCar.run();
        fireCar.soundHorn();
        fireCar.sprayWater();

        System.out.println("자식을 부모에게 넣어준다.");
        Car test = fireCar;
        //test.sprayWater(); 에러남 그릇의 크기가 달라서 집어 넣을수 없음
        test.isRunning();
        test.soundHorn();

        System.out.println();
        System.out.println("레이싱 카 테스트");
        RacingCar racingCar = new RacingCar();
        racingCar.isRunning();
        racingCar.soundHorn();
        racingCar.stop();

        //FireCar fireCar1 = racingCar; 안됨 상속은 부모한테만 받아야됨 악어는 동물이고 원숭이도 동물이지만 악어랑 원숭이는 다름
    }

    public static Car returnCar(Car car){
        return car;
    }
}
