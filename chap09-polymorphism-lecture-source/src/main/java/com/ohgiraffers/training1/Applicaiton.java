package main.java.com.ohgiraffers.training1;

public class Applicaiton {
    public static void main(String[] args){
        //bird와 snake만이 가진 값을 추가한다
        Animal bird = new Bird("울음소리를 낸다");
        Animal snake = new Snake("겨울잠을 잔다");

        //새와 뱀의 정보를 출력한다
        bird.eat();
        bird.move();
        System.out.println(((Bird)bird).cry);

        //내가 한것 bird.cry();는 함수호출이고 private String cry는 필드추가라 안됐던것
        //private로 추가를 한거라 외부에서 참조를 못하고
        //Animal에 들어가있지 않아서 없는정보를 불러올려고 해서 에러가난것
        //그래서 Bird와 Snake에서 private를 public으로 바꿔주고
        //형변환을 해줘서 System.out.println으로 출력해준다

        System.out.println();

        snake.eat();
        snake.move();
        System.out.println(((Snake) snake).hibernation);

    }
}
