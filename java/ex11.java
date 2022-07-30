/* 추상 메소드란 선언은 되어 있으나 코드가 구현되어 있지 않은 메소드입니다.
 * 추상메소드는 abstract키워드를 선언하는 선언부만이 존재하고, 구현부는 작성하지 않고 사용합니다.
 * 작성되어 있지 않은 구현부는 서브클래스에서 오버라이딩하여 사용합니다.
 * */
public  abstract  class ex11 {


  public abstract String get();
  public abstract void set(String s);


}
