package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public AppClassPathXmlApplicationContext(String configuration) {
        super(configuration);
    }

    @Override
    protected void initPropertySources() {
        System.out.println("this is a extension for tne initPropertySource of method!");
        getEnvironment().setRequiredProperties("user");
    }
}
