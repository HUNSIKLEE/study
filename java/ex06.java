/*인스턴스 메서드란 인스턴스 변수를 다루는 메서드입니다.
 * 인스턴스 주소없이는 호출 할수 없으며 호출 할때에 인스턴스 주소가 반드시 필요합니다.
 *클래스의 코드는 Method Area 메모리 영역에 로딩되며 클래스 코드인 인스턴스 메서드 역시
 * Method Area 영역에 로딩됩니다. 아까 클래스 변수 얘기할때 언급 했지만 그 반대로
 *인스턴스 변수를 다루지 않는다면 클래스 변수로 선언하는 것이 낫습니다.
 * 
 * */
public class ex06 {

  static class Calculator {

    int result;             // 인스턴스 변수

    public void plus(int value) {   // 인스턴스 메소드
      this.result += value;         // static 안붙어있다.

    }

    public void minus(int value) {      // 인스턴스 메소드
      this.result -= value;
    }

    {} // 인스턴스 블록
  }

  /*인스턴스 변수란 클래스 영역에 생성되며, 클래스의 인스턴스를 생성할 때 만들어 집니다.
   *멤버변수 중 static이 붙지 않은 변수를 인스턴스 변수라고 합니다.
   */

  /*인스턴스 초기화 블록은 단순하게 중괄호만 사용 하여 정의 할 수 있으며
   * 인스턴스 초기화 블럭은 생성자와 마찬가지로 인스턴스가 생성될 떄마다 실행됩니다.
   * 실행 될떄는 인스턴스 초기화 블록이 생성자 보다 먼저 실행되며 생성자와 거의 차이가 없어서
   * 잘 사용되지 않습니다.
   * */


}