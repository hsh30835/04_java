package main.java.com.ohgirrafers.book.traning5;

abstract class Predator extends Animal{

    void printFood(){
        System.out.println("my food is %s\n");
    }


    static int LEG_COUNT = 4;

    static int speed(){
        return LEG_COUNT * 30;
    }
}
