package main.java.com.ohgirrafers.book.traning2;

public class Sample {
    int a;
    void varTest(){
        this.a++;
    }

    public static void main(String[] args){
        Sample sample = new Sample();
        sample.a = 1;
        sample.varTest();
        System.out.println(sample.a);
    }
}
