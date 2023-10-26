package main.java.com.ohgiraffers.section05.parameter;

public class Application {
    public static void main(String[] args){
        ParameterTest pt = new ParameterTest();

        int num = 20;
        pt.testPrimaryTypeParameter(num);
        System.out.println();

        int[] iarr = new int[] {1,2,3,4,5,6,7};
        System.out.println("인자로 전달하는 값 : " + iarr[0]);
        pt.testPrimaryTypeArrayParameter(iarr);
        System.out.println("전달 후 iarr의 값 : " + iarr[0]);

        System.out.println();

        RactAngle r1 = new RactAngle(12.5, 22.5);
        //new RactAngle(12.5, 22.5); 생성자
        System.out.println("인자로 전달하는 r1의 값 " + r1);

        pt.testClassTypeParameter(r1);
        System.out.println("변경 후 사각형의 넓이와 둘레 : " );

        //가변 인자
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("홍길동","농구","헬스","무에타이","뮤지컬");
        //가변은 항상 마지막에 써야함
    }

}
