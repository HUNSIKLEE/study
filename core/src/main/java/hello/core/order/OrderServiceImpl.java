package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemortMemberRepository;

public class OrderServiceImpl implements OrderService {


    private final MemberRepository memberRepository = new MemortMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String ItemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice =  discountPolicy.discount(member, itemPrice);

        return new Order(memberId, ItemName, itemPrice, discountPrice);
    }
}
