package poly.diamond;

public class Child implements InterfaceA,InterfaceB{
    @Override
    public void methodA() {
        System.out.println("함수A입니당!!!!!!!!!!!");
    }

    @Override
    public void methodB() {
        System.out.println("함수B입니당!!!!!!!!!!!");
    }

    @Override
    public void methodCommon() {
        System.out.println("공통메소드입니당!!!!!!!!!!!!!!!");
    }
}
