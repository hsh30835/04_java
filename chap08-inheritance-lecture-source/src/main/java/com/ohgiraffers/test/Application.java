package main.java.com.ohgiraffers.test;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args){
        System.out.println("게임 입문");
        System.out.println("온라인");

        OnlineGame maple = new OnlineGame("메이플","PC","RPG","Nexon");
        OnlineGame lol = new OnlineGame("롤","PC","AOS","Riot");
        OnlineGame watch = new OnlineGame("옵치2","PC","FPS","Blizzard");


        System.out.println("스팀");
        SteamGame oneshot = new SteamGame("원샷","PC","ADVENTURE",11000);
        SteamGame omori = new SteamGame("오모리","PC","FEAR",20500);
        SteamGame lovesam = new SteamGame("러브샘","PC","FEAR",5600);


        System.out.println("뉴비 등장");
        Me me = new Me("나");

        Game[] games = {maple,lol,watch,oneshot,omori,lovesam};
        me.play(games);

        System.out.println("내가 선택한 게임은 " + oneshot.getName() + " 입니다.");

    }
}
