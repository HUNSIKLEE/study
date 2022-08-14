package javaStudy;

public class Ex4_9 {

	public static void main(String[] args) {

		String string = "12345";
		int sum = 0;


		for (int i =0; i < string.length(); i++) {

			sum = sum + Integer.parseInt(string.charAt(i)+"");	


		}
		System.out.println("sum=" + sum );
	}

}
