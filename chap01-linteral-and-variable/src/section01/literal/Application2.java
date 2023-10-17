package section01.literal;

public class Application2 {
    public static void main(String[] args){
        /*수업 목표. 정수 리터널 연산 형식의 값을 직접 연산한다.*/

        /*
        1. 123 + 456
        2. 123 - 456
        3. 123 * 456
        4. 40 / 10
        5. 10 % 2
         */
        System.out.println(123 + 456);
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(40 / 10);
        System.out.println(10 % 2);
        /*숫자는 그냥씀*/
        System.out.println('a'*'3');


        System.out.println("-------");
        /*실수와 실수 리터럴 연산*/
        /*
        1. 1.23 + 1.23
        2. 1.23 - 1.23
        3. 1.23 * 1.23
        4. 1.23 / 1.23
        5. 1.23 % 1.23
         */
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 1.23);
        System.out.println(1.23 * 1.23);
        System.out.println(1.23 / 1.23);
        System.out.println(1.23 % 1.23);

        System.out.println("-------");
        /*정수와 실수 연산*/
        /*
        1. 1+0.5
        2. 1-0.5
        3. 1*0.5
        4. 1/0.4
        5. 1%1.0
         */
        System.out.println(1 + 0.5);
        System.out.println(1 - 0.5);
        System.out.println(1 * 0.5);
        System.out.println(1 / 0.5);
        System.out.println(1 % 0.5);

        System.out.println("=====문자와 문자의 연산=======");
        /*목차 2. 문자의 연산*/
        /*목차 2-1. 문자와 문자의 연산*/
        /*필기. 문자끼리의 연사도 사칙연산에 mod 연산까지 가능하다.*/
        //('a' + 'b');
        //('a' - 'b');
        //('a' * 'b');
        //('a' / 'b');
        //('a' % 'b');
        System.out.println('a' + 'b'); //문자에 대응하는 아스키코드표가있음
        // a= 97, b= 98
        System.out.println('a' - 'b'); //a랑 b가 숫자로 바뀜
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        /*목차. 3-2 문자열과 다른 형태의 값 연산*/
        /*필기. 문자열과 연산은 '+' 연산만 가능하다.*/
        /*필기. 연산결과는 다른 형태의 값들도 문자열로 취급하여 문자열 이어붙이기(문자열 합치기)결과가 나오게 된다.*/
        System.out.println("============문자열과 다른 형태의 값 연산=========");
        System.out.println("helloworld" + 1004);
        System.out.println("helloworld" + 123.456);
        System.out.println("helloworld" + 'a');
        System.out.println("helloworld" + true); //모든 데이터의 최상위가 문자열이다
        //불리언 타입은 문자열을 제외하고 아무연산도 안됨
        System.out.println("123 " + true + " qwe " + false);

        System.out.println("123" + "456");
        System.out.println('a' + "helloworld");

        /*논리값 연산*/
        /* 4-1 논리값과 논리값 연산 */
        //System.out.println(true + false);
        //System.out.println(true + 1); 불리언은 연산이 문자열만 됨
        System.out.println(true + "false"); //문자열이라 연산이 됨
        System.out.println("안녕 " + 'f'+'a'+'l'+'s'+'e'); //문자열이 있어서 문자열로 취급됨
        System.out.println('f'+'a'+'l'+'s'+'e'); //문자열이 없어서 숫자로 변환됨
    }
}
