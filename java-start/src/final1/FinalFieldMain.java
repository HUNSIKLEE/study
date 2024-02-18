package final1;

public class FinalFieldMain {

    public static void main(String[] args) {


        System.out.println("생성자 초기화");
        CounstructInit counstructInit1 = new CounstructInit(10);
        CounstructInit counstructInit2 = new CounstructInit(20);

        System.out.println(counstructInit1.value);
        System.out.println(counstructInit2.value);

        System.out.println("필드 초기화");

        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        System.out.println("상수");

        System.out.println(FieldInit.CONST_CALUE );

    }
}
