package section01.baek;

import java.util.Scanner;

public class Main1002 {
    public static void main(String[] args){
        //조규현의 좌표 x1,y1 백승환의 좌표 x2,y2
        //조규현이 계산한 류재명과의 거리 r1, 백승환이 계산한 류재명과의 거리 r2
        //첫째 줄엔 테스트 케이스가 주어진다
        //x1,y1,r1,x2,y2,r2가 주어진다
        //예제 입력 0 0 13 40 0 37
        //조규현의 좌표(0,0) 백승환의 좌표(40,0) 조규현과 류재명의 거리 13 백승환과 류재명의 거리 37
        //원의 접점 문제
        //조규현은 원의 중심좌표가 0,0이고 반지름이 13임
        //류재명은 원의 중심좌표가 40,0이고 반지름이 37임
        //두 원의 접점은 2개임

        //테스트케이스 입력할거 만들기
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        //T의 수만큼 반복하는 정수6개 입력하기
        for(int i=0;i<T;i++){
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();
            System.out.println(contactPoint(x1,y1,r1,x2,y2,r2));
        }
    }

    // 접점구하기
    private static int contactPoint(int x1, int y1, int r1, int x2, int y2, int r2) {
        //Math.sqrt는 제곱근 구하기
        //두 원의 중심 거리를 d라고 할때
        //교점이 0개인 경우
        //r1+r2 < d 이면 교점 0개
        //r1-r2 > d 이면 교점 0개
        //교점이 1개인 경우
        //r1+r2 = d 이면 교점 1개
        //r1-r2 = d 이면 교점 1개
        //교점이 2개인 경우
        //r1-r2 < d < r1+r2 이면 교점 2개
        //이 외는 교점이 무한
        //r1=13 r2=37 d=40일때 교점이 2개임
        //r1=3 r2=4 d=7 일때 교점이 1개임
        //r1=1 r2=5 d=0 일때 교점이 0개임

        //중점거리의 제곱 구하기
        int circleDistance = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        if(x1==x2 && y1==y2 && r1==r2){
            return -1; //무한일시 -1 출력하게 조건을 걸었음
        } else if (circleDistance > Math.pow(r1+r2, 2)) {
            return 0;
        } else if (circleDistance < Math.pow(r2-r1,2)) {
            return 0;
        } else if (circleDistance == Math.pow(r2-r1,2)) {
            return 1;
        } else if (circleDistance == Math.pow(r1+r2,2)){
            return 1;
        } else {
            return 2;
        }

    }
}
