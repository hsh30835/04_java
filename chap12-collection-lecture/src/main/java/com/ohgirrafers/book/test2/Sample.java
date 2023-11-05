package main.java.com.ohgirrafers.book.test2;

public class Sample {
    public static void main(String[] args){
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        cal.add(new Diamond());
        System.out.println(cal.getValue());
    }
}
