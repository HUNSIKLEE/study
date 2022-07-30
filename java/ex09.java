/* 다형성 이란?
 * 하나의 메소드나 클래스가 있을때 이것들이 다양한 방법으로 동작하는 것을 의미합니다.
 * 다형성을 구현하는 방법으로는 오버로딩 오버라이딩 함수형 인터페이스가 있습니다.
 * 오버로딩이란 여러 종류의 타입을 받아들여서 결국엔 같은 기능을 하도록 만들기 위한 작업.
 * 오버라이딩이란 슈퍼클래스의 메소드를 서브클래스 형식에 맞춰 재정의 하는것입니다.
 * 
 * 
 * */
public class ex09 {

  class O{
    public void a(int param){
      System.out.println("숫자출력");
      System.out.println(param);
    }
    public void a(String param){
      System.out.println("문자출력");
      System.out.println(param);
    }
  }
  public class PolymorphismOverloadingDemo {
    public void main(String[] args) {
      O o = new O();
      o.a(1);;
      o.a("one");
    }
  }
}