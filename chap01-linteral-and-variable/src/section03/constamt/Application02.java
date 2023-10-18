package section03.constamt;

public class Application02 {
    public static void main(String[] args){ //실행시킬시 스태틱 영역을 가져옴
        /*
        필기
        상수의 명명 규칙은 변수의 명명규칙과 컴파일 에러를 발생시키는 규칙은 동일하다.
        단 개자들 끼리 암묵적인 규칙에 일부 차이를 보인다.
        1. 모든 문자는 영문자 대문자 속은 숫자만 사용한다.
        2. 단어와 단어 연결은 언더슼어(_)를 사용한다.
         */

        final int AGE1 = 10;
        final int AGE2 = 20;
        final int age3 = 30;

        final int MAX_AGE = 50; //상수필드는 예외적으로 스네이크케이스를 쓴다 구분하기 위해 써줌
        final int maxAge = 10;


    }
}
