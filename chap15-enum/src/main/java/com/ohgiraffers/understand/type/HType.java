package main.java.com.ohgiraffers.understand.type;

public enum HType {
    벌크업(100,-40), 감량(70,-20), 다이어트(50,-10),
    요가(30, 20), 유령(30, 0);

    int cache;
    int demage;

    HType(int cache, int demage) {
        this.cache = cache;
        this.demage = demage;
    }
}
