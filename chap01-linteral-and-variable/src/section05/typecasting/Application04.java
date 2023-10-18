package section05.typecasting;

public class Application04 {
    public static void main(String[] args){

        int inum = 290;
        byte bnum = (byte) inum;
        System.out.println("inum : " + inum);
        System.out.println("bnum : " + bnum); //바로 앞부분의 손질로 인해 예측이 어렵다.

        double height = 178.5;
        int floorHeight = (int) height;
        System.out.println("height : " + height);
        System.out.println("floorHeight : " + floorHeight);
        //소수점은 일부러 다운캐스팅해서 소수점을 내림

        System.out.println("========");
        /*5명의 반 학생이 있으며 학생들의 키는 각각 178.5 170.3 190.7 188.678 160.8 이다.
        * 우리는 학새의 평균 키를 구해서 화면에 보여주고자 한다. (소수자리 절삭)
        * 1반 학생 5명의 키의 평균은 000cm이다 */

        float q = 178.5f;
        float w = 170.3f;
        float e = 190.7f;
        float r = 188.678f;
        float t = 160.8f;
        float a = (q + w + e + r + t)/5;
        System.out.println("1반 학생 5명의 키의 평균은 " + (int)a + "cm이다");

        System.out.println("===========");
        /*문자 z에 대응하는 (정수)숫자를 화면에 출력해주세요*/
        char ch1 = 'z';
        int charNumber = 122;
        System.out.println((int)ch1);
        System.out.println("===========");

        /*long lnum = 10L
        int num = 190;

        아래의 연산의 차이를 옆사람에게 설명해주세요
        int sum = (int)lnum + num;
        int sum2 = (int)(num + lnum);*/
        long lnum = 10L;
        int num = 190;
        //int sum = lnum + num;
        System.out.println("===========");
        /*사업을 시작한 홍길동은 10월18일 매출에서 부가세(10%)를 제외한 소득을 알고 싶다.
        10-18의 매출은 다음과 같다.
        150400원
        1400원
        25000원
        30000원

        여기서 부가세 10%는 변하지 않는 값이라는 점에 유의하자*/

        int q1 = 150400;
        int w1 = 1400;
        int e1 = 25000;
        int r1 = 30000;
        final double a1 = 0.9;
        int s = (int)((q1 + w1 + e1 + r1)*a1);

        System.out.println(s);
        System.out.println("===========");

    }
}
