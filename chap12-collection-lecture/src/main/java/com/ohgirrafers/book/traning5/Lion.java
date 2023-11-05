package main.java.com.ohgirrafers.book.traning5;

class Lion extends Predator implements Barkable{
    public String getFood(){
        return "bananan";
    }

    public void bark(){
        System.out.println("으르렁");
    }
}
