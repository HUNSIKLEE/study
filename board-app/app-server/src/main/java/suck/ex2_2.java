package suck;

public class ex2_2 {
    public static void main(String[] args) {
        int x = 10, y = 20; // stack 메모리에 x라는 변수 안에 10이라는 값이 들어있고 , y라는 변수 안에 20이라는 값이 들어있다.
        int tmp = 0 ; // stack 메모리에 tmp라는 변수안에 0이라는 값이 들어있다.

        System.out.println("x:" + x + " y:" + y); // x는 10 이 출력되고 , y는 20이 출력된다.
        tmp = x; // x값인 10을 tmp에 저장하면 tmp엔 10이 저장된다.
        x = y; // y값인 20을 x에 저장하면 x는 20이 된다.
        y = tmp; // tmp 값안에 10이 저장되어 있는데 그 10의 값을 y에다 가 넣는다.
        System.out.println("x:" + x + " y:" + y); // x는 20이 들어가고 y는 10이 들어가있다. tmp = 10
        System.out.println(tmp);
    }
}
