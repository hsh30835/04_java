package main.java.com.ohgiraffers.test;

public abstract class Game {

    private String name; //게임 이름
    private String exe; //pc겜인지 모바일겜인지 어디서 실행하나
    private String gener; //무슨 장르인지

    public Game(String name, String exe, String genre) {
        this.name = name;
        this.exe = exe;
        this.gener = genre;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setExe(String exe) {
        this.exe = exe;
    }

    public String getExe(){
        return this.exe;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getGener(){
        return this.gener;
    }

}
