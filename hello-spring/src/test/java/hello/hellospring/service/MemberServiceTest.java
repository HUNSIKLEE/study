package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MemberServiceTest {

    MemverService memverService = new MemverService();
    MemoryMemberRepository memberRepository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void 회원가입() {

            Member member = new Member();
            member.setName("spring");

               Long saveId = memverService.join(member);

        Member findMember = memverService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());


    }

    @Test
    public void 중복_회원_예외() {
        Member member1 = new Member();
        member1.setName("spring");


        Member member2 = new Member();
        member2.setName("spring");

        memverService.join(member1);

        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memverService.join(member2));

        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원");





  /*       try {
        memverService.join(member2);
        fail();
        } catch (IllegalStateException e){
             assertThat(e.getMessage()).isEqualTo("존재함");
        }

    }*/
    }
    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}