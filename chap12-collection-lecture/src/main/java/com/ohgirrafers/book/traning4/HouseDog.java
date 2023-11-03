package main.java.com.ohgirrafers.book.traning4;

class HouseDog extends Dog{
    HouseDog(String name){
        this.setName(name);
    }
    HouseDog(int type){
        if(type == 1){
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    void sleep(){
        System.out.println(this.name + " zzz in house");
    }
    void sleep(int hour){
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}
