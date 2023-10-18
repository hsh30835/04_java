package section05.typecasting;

public class Application03 {
    public static void main(String[] args){
        /*자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형 끼리 연산은 큰 자료형으로 자동 형변환 후 연산처리 된다.
        * */

        int inum = 10;
        long lnum = 10L;

        /* 자바에서는 같은 자료형 끼리만 연산이 가능하다
        * 따라서 서로 자료형이 다른 두 자료를 연산 할 때 자료형이 같아지도록 형 변환을 해주어야 한다.
        * */

        int isum = inum + (int)lnum;
        //1번 10 + (int) 10; 과정에서 int를 붙임
        isum = (int)(isum + lnum);
        // 10 + 10L   10L + 10L로 변경되고 결과에서 int를 붙임 (int)20

        byte bnum = 1;
        short snum = 2;
        short snum2 = 3;
        short snum3 = 3;

        int result1 = bnum + snum2; //byte 데이터 + short 데이터 short이 더 커서 자동으로 byte가 short으로 변함
        //컴파일러하면 (int)((short)bnum + snum2);로 short로 선 연산하고 후에 int로 형변환됨
        //(int)bnum (int)snum2 으로 연산이되고 그담에 short로 형변환이 됨
        int result2 = snum2 + bnum;
        int result3 = bnum + result1;
        //연산의 최소단위는 int 기본적으로 int를 내장하고있음 int보다 낮을때 앞에 넣지만 거의 안씀
    }
}
