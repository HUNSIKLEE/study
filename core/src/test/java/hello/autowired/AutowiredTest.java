package hello.autowired;

import hello.core.member.Member;
import jakarta.annotation.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

public class AutowiredTest {



    @Test
    void AutowiredOption() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {

        @Autowired(required = false)
        public void setNoBean1(Member member1) {
            System.out.println("member = " + member1);
        }

        @Autowired(required = false)
        public void setNoBean2(@Nullable Member member2) {
            System.out.println("member = " + member2);
        }


        @Autowired(required = false)
        public void setNoBean3(Optional<Member> member3) {
            System.out.println("member = " + member3);
        }
    }
}
