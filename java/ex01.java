
public class ex01 {
  //TV라는 클래스 설계도


  String color;// 색이라는 속성(변수)
  boolean power;//전원이라는 속성(변수)
  int channel;//채널이라는 속성 (변수)


  void power() {power = ! power; } // 전원에 관련된 기능(메소드)
  void channelUp() { channel++;}//채널에관련된 기능(메소드)
  void channelDown() {channel--;}//채널에 관련된 기능(메소드)
  /*
    클래스란 객체를 정의한 것 .쉽게 말하면 
    유사한 특성을 지닌 데이터와 그 데이터를 다루는 기능들이 묶여 있는 것 입니다.
    (객체란: 같은 종류의 데이터와 로직이 함께 있는 구성
    실제로 존재하는 것, 사물 or 개념 , 클래스에 정의된 내용대로 메모리에 생선된 것
    객체의 용도는 객체가 가지고 있는 기능과 속성에 따라 다름)
    클래스에는 객체의 모든 속성과 기능이 정의되어 있습니다.
    클래스 용도는 객체를 생성하는데사용 됩니다.

   */

}
