package main;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class AppBONameSpaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("appBO", new AppBODeanDefinitionParser());
    }
}
