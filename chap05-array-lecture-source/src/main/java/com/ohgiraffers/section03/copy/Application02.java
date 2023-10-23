package main.java.com.ohgiraffers.section03.copy;

public class Application02 {
    public static void main(String[] args){
        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("mnames의 hashcode : " + names.hashCode());

        print(names);
        String[] animals = getAnimals();
        System.out.println("리턴 받은 animals의 hashcode : " + animals.hashCode());

        print(animals);
    }

    public static void print(String[] args){
        System.out.println("args의 hashcode : " + args.hashCode());

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + " ");
        }
        System.out.println();
    }

    public static String[] getAnimals(){
        String[] animals = new String[]{"낙타", "호랑이", "나무늘보"};

        return  animals;
    }
}
