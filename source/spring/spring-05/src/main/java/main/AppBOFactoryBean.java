package main;

import org.springframework.beans.factory.FactoryBean;

public class AppBOFactoryBean implements FactoryBean<AppBO> {
    @Override
    public AppBO getObject() throws Exception {
        return new AppBO("axemc", "this is factory bean ...");
    }

    @Override
    public Class<?> getObjectType() {
        return AppBO.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
