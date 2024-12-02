package test;


public class Test2 {

    public static void main(String[] args) {

        String str = "hello";

        System.out.println("str = " + str);

        String[] str2 = str.split("");

        String str3 = "";
        for(int i = 0; i < str2.length; i++){
            str3 += str2[(str2.length - 1) - i];
        }
        System.out.println("str3 = " + str3);
    }

}
