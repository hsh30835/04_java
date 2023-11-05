package main.java.com.ohgirrafers.book.traning5;

import java.util.List;

public class Sample {
    public static void main(String[] args){
        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
//        zookeeper.feed(tiger);
//        zookeeper.feed(lion);

        Bouncer bouncer = new Bouncer();
        bouncer.barkAniaml(tiger);
        bouncer.barkAniaml(lion);

        System.out.println(lion.getFood());
        System.out.println(tiger.getFood());


    }
}
