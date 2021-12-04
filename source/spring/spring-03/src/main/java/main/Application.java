package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserBO userBO = (UserBO) context.getBean("user");
        System.out.println(userBO);
    }
}
