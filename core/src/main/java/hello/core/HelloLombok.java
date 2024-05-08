package hello.core;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {


    private String name;
    private int age;


    public static void main(String[] args) {
        HelloLombok hello = new HelloLombok();
        hello.setName("Hello");
        hello.setAge(20);

        String name = hello.getName();
        System.out.println("name = " + name);

    }
}
