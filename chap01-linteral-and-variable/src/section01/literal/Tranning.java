package section01.literal;

public class Tranning {
    public static void main(String[] args){

        System.out.println("========== 연습 문제 ===========");
        //F=ma, 힘 = F, 질량 = m, 가속도 = a, 지구 중력 가속도 = 9.81, 달의 중력 가속도 = 1.63
        //(질량이 100kg인 사람이 지구에서 받는 힘과 달에서 받는 힘의 몫 연산값을 구하고 정수로만 표현하시오.)

        int m = 100;
        double ea = 9.81;
        double ma = 1.63;
        double eF = m*ea;
        double mF = m*ma;

        System.out.println("지구에서 받는 힘 : " + (int)eF);
        System.out.println("달에서 받는 힘 : " + (int)mF);

        System.out.println("힘의 몫 : " +(int)(eF%mF));

//        int m = 100;
//        float a = 9.81f; //int는 정수 float은 소수점 float뒤엔 f를 붙여야됨
//        float mA = 1.63f; //a는 지구중력가속 mA는 달의중력가속도
//        float f = m * a;
//        float mF = m * mA;
//        System.out.println((int)(f % mF));
    }
}
