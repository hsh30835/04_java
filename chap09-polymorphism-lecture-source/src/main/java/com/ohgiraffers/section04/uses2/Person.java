package main.java.com.ohgiraffers.section04.uses2;

public class Person {

    private SaveProvider saveProvider;

    public Person(SaveProvider saveProvider){
        this.saveProvider = saveProvider;
    }

    public void doSomething(){
        String date = "string data";
        saveProvider.save(date);
    }
}
