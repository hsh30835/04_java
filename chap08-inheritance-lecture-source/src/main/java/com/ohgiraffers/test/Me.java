package main.java.com.ohgiraffers.test;

public class Me {
    private String name;

    private String result;
    public Me(String name) { this.name = name; }

    public void play(Game[] games){
        for (Game game : games){
            if(game instanceof OnlineGame){
                OnlineGame onlineGame = (OnlineGame) game;
                System.out.println(onlineGame.getCompany() + "사의 " + onlineGame.getName() + " 입니다.");
            }else{
                SteamGame steamGame = (SteamGame) game;
                System.out.println(steamGame.getPrice() + "원의 " + steamGame.getName() + " 입니다.");
            }
        }
    }

//    public void onLineGame(OnlineGame[] onlineGames){
//        for(OnlineGame on : onlineGames){
//            System.out.println("ㅇ");
//            result += on.getCompany();
//        }
//    }

}
