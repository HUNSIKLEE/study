package poly.ex.sender.pay1;

public abstract class PayStore {

    public static Pay findPay (String option){

        if(option.equals("kakao")){
            return new KakaoPay();
        } else if(option.equals("naver")){
            return new NaverPay();
        } else if(option.equals("new")){
            return new NewPay();
        } else {
            return new DefaultPay();
        }
    }
}
