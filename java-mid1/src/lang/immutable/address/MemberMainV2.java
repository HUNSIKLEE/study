package lang.immutable.address;

public class MemberMainV2 {


    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);


//        memberB.getAddress().setValue("부산");

        memberB.setAddress(new ImmutableAddress("부산"));

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
