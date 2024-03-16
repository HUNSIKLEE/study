package poly.ex4;

public class Dog extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍!!!!!!!!!!!!!!!!!");
    }

    @Override
    public void move() {
        System.out.println("강아지 이동중입니다!!!!!!!!!!");
    }
}
