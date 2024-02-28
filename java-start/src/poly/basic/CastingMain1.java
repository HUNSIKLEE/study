package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        Parent ploy = new Child();

        Child child = (Child) ploy;
        child.childMethod();
    }
}
