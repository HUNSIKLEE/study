package javaStudy;

public class Ex4_7 {

	public static void main(String[] args) {


		int value =(int) (Math.random()* 10)% 6 + 1;
		//Math 함수 double 이다. 그래서 int로 형변환
		System.out.println("value:" + value);

	}

}
