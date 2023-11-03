package main.java.com.ohgiraffers.section03.grammer;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args){
        UserRole1 admin = UserRole1.ADMIN;
        UserRole1 producer = UserRole1.PRODUCER;
        System.out.println(admin);
        System.out.println(producer);
        System.out.println(admin.getNameToLowerCase());
        System.out.println(producer.getNameToLowerCase());
        System.out.println("==============");
        UserRole2 consumer = UserRole2.CONSUMER;
        UserRole2 consumer2 = UserRole2.CONSUMER;
        System.out.println(consumer == consumer2); //값을 비교해서 true
        System.out.println(consumer2.hashCode());
        System.out.println(consumer.hashCode());
        System.out.println("=============");
        Application app = new Application();
        Application app2 = new Application();
        System.out.println(app == app2); //주소값을 비교해서 false
        System.out.println("=================");
        EnumSet<UserRole2> rolse = EnumSet.allOf(UserRole2.class); //class라서 클래스명이 나옴
        Iterator<UserRole2> iter = rolse.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next().name());
        }
        System.out.println("=====================");
        EnumSet<UserRole2> notGuest = EnumSet.complementOf(EnumSet.of(UserRole2.GUEST)); //complementOf() 빼기
        Iterator<UserRole2> notGuestIter = notGuest.iterator();
        while (notGuestIter.hasNext()){
            UserRole2 role2 = notGuestIter.next();
            System.out.println(role2.ordinal() + " " + role2.getDescription());
        }

    }
}
