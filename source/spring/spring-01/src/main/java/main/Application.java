package main;

public class Application {
    public static void main(String[] args) {
        AppClassPathXmlApplicationContext context = new AppClassPathXmlApplicationContext("application.xml");
        AppBO app = (AppBO) context.getBean("app");
        System.out.println(app);
    }
}
