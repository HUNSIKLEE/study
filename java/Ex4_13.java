package javaStudy;


class Ex4_13
{
	public static void main(String[] args)
	{
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;


		for(int i=0; i < value.length() ;i++) {

			ch = value.charAt(i);

			if(!('0'<=ch && ch <='9')) {
				System.out.println("숫자가 아닙니다.");
				isNumber = false;

			}
			System.out.println(ch+": "+(int)ch);
		}
		if (isNumber) {
			System.out.println(value+" 는 숫자입니다."); 
		} else {
			System.out.println(value+" 는 숫자가 아닙니다."); 
		}
	} // end of main
} // end of class
