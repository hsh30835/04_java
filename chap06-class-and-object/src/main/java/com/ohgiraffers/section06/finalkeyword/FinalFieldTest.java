package main.java.com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {

    /*
    * 필기
    * final
    * : final은 종단의 의미를 가지는 키워드이다.
    * final 키워드를 사용할 수 있는 위치는 다앙한 편이며 의미가 약간 다르지만, 결국 변경은 불가의 의미이다.
    * 1. 지역변수 : 초기화 이후 값 변경 불가 final String value = "final";
    * 2. 매개변수 : 호출시 전달한 인자 변경 불가 method(final String value = "final";)
    * 3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
    * 4. 클래스 (static) 변수 : 프로그램 start 이후 값 변경 불가
    * 5. non-static 메소드 : 메소드 재작성(overriding) 불가
    * 6. static 메소드 : 메소드 재작성(overriding) 불가
    * 7. 클래스 : 상속 불가
    *
    * final은 변경 불가의 의미를 가진다
    * 따라서 초기 인스턴스(생성된 객체)가 생성되고 나면 기본값 0이 필드에 들어가게 되는데,
    * 그 초기화 이후 값을 변경할 수 없기 떄문에 선언하면서 바로 초기화를 해 주어야 한다.
    * 그렇지 않으면 complie error가 발생한다.
    * */
    //private final int nonStaticNuml; 에러발생함
    private final int NON_STATIC_NUM = 1;

    private final String NON_STATIC_NAME;  //상수필드는 스네이크에 대문자써야됨

    public FinalFieldTest(String nonStaticName){
        this.NON_STATIC_NAME = nonStaticName;
    } //기본생성자만 만들면 에러남 스태틱이 필수임

    //private static final int STTATIC_NUM; //스태틱은 실행시 이미 메모리에 올라오는데 값이 없음(초기화를 안해놓은 상태)

    private static final int STATIC_NUM = 10;

    //public FinalFieldTest(int nonStaticNum){
    //    this.STATIC_NUM = nonStaticNum;
    //}  파이널은 값을 고정시키는데 이미 생성된 값을 변경하려고 하니 에러가 남

    private static final double STATIC_DOBULE;

    static{
        STATIC_DOBULE = 10.0;
    } //스태틱 블록초기화

}
