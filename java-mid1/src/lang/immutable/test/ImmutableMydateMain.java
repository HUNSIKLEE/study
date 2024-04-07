package lang.immutable.test;

public class ImmutableMydateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;

        System.out.println("data1 = " + date1);
        System.out.println("data2 = " + date2);

        System.out.println("2025 - > date1");


        date1 = date1.withYear(2025);

        System.out.println("data1 = " + date1);
        System.out.println("data2 = " + date2);


    }
}
