/* 클래스 메서드란 인스턴스 변수나 인스턴스 메서드를 사용하지 않는 메서드를 클래스 메서드라 합니다.
 * 클래스가 동작시키는 메소드. 간편 기능 구현에 유용 합니다.
 * 클래스 변수는 인스턴스를 생성하지 않아도 사용할 수 있습니다.
 * 클래스 메서드는 인스턴스 변수를 사용 할 수 없습니다.
 * 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 생각해봐야 합니다.
 */


class MyMath2{
  long a, b;

  long add() {return a+b;}            //인스턴스 메서드
  long multiply() {return a*b;}       //인스턴스 메서드

  static long add(long a, long b) {return a+b;}             //클래스 메서드
  static long multiply(long a, long b) {return a*b;}        //클래스 메서드

}


public class ex04 {

  public static void main(String[] args) {
    System.out.println(MyMath2.add(200L, 100L));
    System.out.println(MyMath2.multiply(200L, 100L));

    MyMath2 mm = new MyMath2();
    mm.a = 200L;
    mm.b = 100L;

    System.out.println(mm.add());
    System.out.println(mm.multiply());

  }

}