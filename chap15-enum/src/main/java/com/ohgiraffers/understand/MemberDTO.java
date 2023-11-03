package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.type.HType;

public class MemberDTO {
    private String name;
    private int weight;
    private HType type;

    public MemberDTO(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void setType() {
    }

    public HType getType(){
        return type;
    }


}
