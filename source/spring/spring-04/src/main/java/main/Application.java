package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        AppBO app = (AppBO) context.getBean("app");
        System.out.println(app);
    }
}
