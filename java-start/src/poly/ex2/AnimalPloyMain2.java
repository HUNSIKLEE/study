package poly.ex2;

public class AnimalPloyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

//        Animal[] animalArr = new Animal[]{dog, cat, caw};
        Animal[] animalArr = {dog, cat, caw, duck};

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }

    }



}
