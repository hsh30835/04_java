package main.java.com.ohgiraffers.story;

public class Application {
    public static void main(String[] args){
        /*
        * 개발관련 목표가 없던 지호
        * 그는 강사에게 과제를 받았다.
        * 과제는 job에 대한 조사를 하는 것이다.
        * 생각보다 직업이 많아서 고민을 하던 지호
        * 배열을 가지고 직업 리스트를 만들기로 하였다.
        * */
        // 처음 개발 관련 직군이 몇개가 있는지 모르는 지호
        // ArrayList를 사용하는 것이 아직은 익숙하지 않아
        // 상대적으로 접근하기 쉬운 배열로 관리하기로 하였다.

        Jobs[] joblist = new Jobs[5];

        try { //try는 오류를 찾는것
            joblist[0] = new Jobs(1, "백엔드");
            joblist[1] = new Jobs(2, "프론트엔드");
            joblist[2] = new Jobs(3, "데브옵스");
            joblist[3] = new Jobs(4, "DBA");
            joblist[4] = new Jobs(5, "PM");
            // ArrayIndexOutOfBoundsException가 발생됨에 따라서 프로그램이 멈춤
            joblist[5] = new Jobs(6, "PL");
            joblist[6] = new Jobs(7, "BigData");
            // 배열의 길이를 5로했는데 7까지 만들어서 에러남
//        }catch(Exception e) {
//            e.printStackTrace(); //if문 마냥 여러개 쓸수있기는함
//            //Exception은 모든 에러의 최상위버전
//            //ArrayIndexOutOfBoundsException얘는 Exception의 자손이라 있으나마나라 에러뜸 순서바꾸면 에러안남
//            //궁극적으로는 에러를 안나는 코드를 만들어야하기에 에러메세지는 자세할수록 좋음
//        }
        }catch(ArrayIndexOutOfBoundsException e){ //catch는 에러를 처리해주는것, catch에 해당되지 않으면 오류를 안잡음
            //catch도 여러개 가능은 하지만 보통은 그렇게 하지 않음
            e.printStackTrace(); //실행하고 빠져나가는데 종료는 되지 않음
            //e.printStackTrace();안쓰면 빨간코드가 안뜨지만 현명한 방법은 아님
            //유지보수를 좋게 코드를 짜고 미리 에러날수 있는 부분을 예상해 예외처리를 하는게 잘하는것
        }finally { //예외가있든 없든 무조건 실행됨
            System.out.println("실행됨");
        }



        for (int i=0; i< joblist.length; i++){
            System.out.println(joblist[i]);
        }
    }
}
