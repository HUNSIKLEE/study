package lang.immutable.test;

public class MydateMain {

    public static void main(String[] args) {
        MyDate date1 = new MyDate(2024, 1, 1);
        MyDate date2 = date1;

        System.out.println("data1 = " + date1);
        System.out.println("data2 = " + date2);

        System.out.println("2025 - > date1");
        date1.setYeat(2025);

        System.out.println("data1 = " + date1);
        System.out.println("data2 = " + date2);


    }
}
