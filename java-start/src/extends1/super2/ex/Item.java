package extends1.super2.ex;

public class Item {


    private String name;
    private int price;


    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public int getPrice() {
        return price;
    }


    void print() {
        System.out.println("이름: " + name + ", 가격: " + price);
    }
}
