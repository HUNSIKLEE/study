/* 캡슐화란 연관된 목적을 가지는 변수와 함수를 하나의 클래스로 묶어 외부에서 쉽게 접근 못하도록
 * 은닉하는 것입니다. 캡슐화를 통해 외부에서 내부의 정보에 접근하거나 변경 할 수 없게 직접적인
 * 접근을 막고 객체가 제공하는 필드와 메소드를 통해서만 접근이 가능합니다.
 * 이렇게 접근을 제한해서 유지 보수나 확장 시 오류의 범위를 최소화 할 수있고 
 * 객체 내의 정보 손상이랑 오용을 방지하고 데이터가 변경되어도 다른 객체에 영향을 주지 않습니다.
 * 접근 제어자로는 public, protected, private 등이 있습니다.
 * 
 * 
 * */

public class ex10 {
  private int id;
  private String name;      //private 타입 접근 제어자

  public int getId() {
    return id;
  }

  void setId(int id) {      //아무 것도 없으면 default 기본 접근 제어자 
    this.id = id;
  }

  public String getName() {     // public 타입 접근 제어자
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    // write your code here
    ex10 cap = new ex10();

    cap.setId(123);
    cap.setName("jay");

    System.out.println(cap.getId());
    System.out.println(cap.getName());
  }



}
