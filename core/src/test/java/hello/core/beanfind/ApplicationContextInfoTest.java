package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        @Test
        @DisplayName("모든 빈 출력하기")
        void findAllBean(){
            String[] beanDefinitionNames = ac.getBeanDefinitionNames();

            // iter + tab 하면 자동완성
            for (String beanDefinitionName : beanDefinitionNames){
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println("name = " + beanDefinitionName + " object = " + bean);

//                System.out.println("ApplicationContextInfoTest.findAllBean");
//                sout + m 하면 메소드명 자동완성 n 네임 자동완성
            }
        }

    @Test
    @DisplayName("애플리케이션 빈 출력하기")
    void findApplicationBean(){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames){
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);

            //
            if(beanDefinition.getRole() == beanDefinition.ROLE_APPLICATION){
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println("name = " + beanDefinitionName + " object = " + bean);

            }
        }
    }

}
