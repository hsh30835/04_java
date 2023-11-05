package main.java.com.ohgirrafers.book.traning5;

class Tiger extends Animal implements Barkable{
    public String getFood() {
        return "apple";
    }

    public void bark(){
        System.out.println("어흥");
    }
}
