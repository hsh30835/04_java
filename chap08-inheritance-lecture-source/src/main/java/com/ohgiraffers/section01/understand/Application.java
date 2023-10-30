package main.java.com.ohgiraffers.section01.understand;

import main.java.com.ohgiraffers.section01.understand.car.Car;
import main.java.com.ohgiraffers.section01.understand.car.ElectricCar;
import main.java.com.ohgiraffers.section01.understand.car.OldCar;
import main.java.com.ohgiraffers.section01.understand.employee.Seller;

public class Application {
    public static void main(String[] args){
        System.out.println("자동차 판매 프로그램 입니다.");
        System.out.println("전기차");
        ElectricCar ionic = new ElectricCar("H",1000,"ionic1","1000km");
        ElectricCar ionic2 = new ElectricCar("H",1500,"ionic2","1500km");
        ElectricCar ionic3 = new ElectricCar("H",2000,"ionic3","2000km");
        ElectricCar kona = new ElectricCar("H",2100,"kona","2100km");

        System.out.println("내연기관 자동차");
        OldCar porter = new OldCar("H",1500,"poter","disel");
        OldCar avante = new OldCar("H",1500,"avante","GasoLine");
        OldCar sonata = new OldCar("H",2000,"sonata","disel");

        System.out.println("영업 사원 입사");
        //노홍철 사원이 입사를함
        Seller seller = new Seller("노홍철");
        //노홍철 사원이 판매한 제품
//        OldCar[] sellers = {porter, avante, sonata, porter};
//        seller.oldCarSale(sellers);

        Car[] cars = {porter, kona, ionic2, sonata, avante};
        seller.sale(cars);
        System.out.println(seller);

        Car car = new Car("h",100);
        System.out.println("car와 oldcar가 같은지 비교 " + (car instanceof  ElectricCar));

        System.out.println("=====================");
        System.out.println("형변환");
        Car car2 = kona;
        System.out.println(kona.hashCode());
        System.out.println(car2.hashCode());
        System.out.println("형 변환 후 다시 형변환");
        kona = (ElectricCar)car2;
        System.out.println(kona.hashCode());
        System.out.println(car2.hashCode());


//        Car car = new Car("H",1000);
//
//        System.out.println("같은 자료형인지 비교하기");
//        System.out.println(sonata instanceof Car); //istanceof는 같은 자료형인지 비교하기
//        System.out.println(kona instanceof Car);
        //이 4줄코드를 한줄로 줄임

//        ElectricCar[] electricCars = {ionic2,ionic3,ionic,kona};
//        seller.electricCarSale(electricCars);

    }
}
