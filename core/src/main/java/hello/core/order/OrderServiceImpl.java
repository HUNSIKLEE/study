package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

import java.util.Dictionary;

public class OrderServiceImpl implements OrderService{

    private  final MemberRepository memberRepository;
//    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
   //private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    // DIP 법칙에 위배된다. 구현체가 직접 인터페이스 역할 하는 다른 구현체 까지 구현해버린다.
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
