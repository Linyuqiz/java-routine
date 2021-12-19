package main;

import lombok.SneakyThrows;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    @SneakyThrows
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        AppBO appBO = (AppBO) context.getBean("appBOFactoryBean");
        System.out.println(appBO);

//        AppBOFactoryBean appBOFactoryBean = (AppBOFactoryBean) context.getBean("&appBOFactoryBean");
//        AppBO appBO = appBOFactoryBean.getObject();
//        System.out.println(appBO);

    }
}
