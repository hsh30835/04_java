package main.java.com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num){
        System.out.println("매개변수로 전달받은 값 : " + num);
    }

    public void testPrimaryTypeArrayParameter(int[] iarr){
        System.out.println("매개 변수로 전달받은 값" + iarr);

        System.out.println("배열의 값 출력 : ");
        for(int i=0; i<iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
        iarr[0] = 99;
        System.out.println("변경 후 배열의 값 출력:");
        for ( int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }
    public void testClassTypeParameter(RactAngle ractAngle){
        System.out.println("매개변수로 전달받은 값 : " + ractAngle);

        System.out.println("변경 전 사각형의 넓이와 둘레 ====");
        ractAngle.calcArea();
        ractAngle.calcRound();
        System.out.println("변경 후 사각형의 둘레와 넓이 ====");
        ractAngle.setWidth(100);
        ractAngle.setHeight(100);
        ractAngle.calcArea();
        ractAngle.calcRound();
    }

    public void testVariableLengthArrayParameter(String name, String... hobbys){ //String... 가변/ 배열의 길이를 모를때 사용함
        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 " + hobbys.length);
        System.out.println("취미 : ");
        for(String hobby: hobbys){
            System.out.println(hobby + " ");
        }
        System.out.println();
    }
}
