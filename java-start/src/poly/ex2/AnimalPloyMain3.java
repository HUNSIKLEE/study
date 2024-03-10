package poly.ex2;

public class AnimalPloyMain3 {

    public static void main(String[] args) {



//        Animal[] animalArr = new Animal[]{dog, cat, caw};
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(),new Duck(),new Pig()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }


}
