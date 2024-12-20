/*상속이란 super 클래스의 사용권을 획득하여 내 것처럼 사용하는 것이다.
 * 상속이란 문법이 생기게된 이유는 
 * 상속을 하지 않고 기능을 원본을 수정하게 되면 연관되어 있는 프로그램도 영향을 받고
 * 심각한 오류가 발생 할 수 있으므로 기존의 소스 원본을 손대는 것은 위험한 일이고
 * 코드를 덧 붙이다 보면 코드가 난잡해지고 누더기 코드가 누적이될 문제가 있었다.
 * 다른 방법인 복제 하는 방법은 원본을 수정하지는 않아서 좋지만 한쪽에서 에러가 나면 다른쪽들도
 * 하나하나 다 수정을 해줘야 하고 사람이 하는 일인지라 실수도 하게 되면 찾는것도 일이고 복사한
 * 소스 파일들이 많아지다보면 유지 보수가 어려워진다 그래서 상속이란 문법이 생겼습니다.
 * */
public class ex08 {

  public void m3() {
    System.out.println("C.m3()");
  }
}
