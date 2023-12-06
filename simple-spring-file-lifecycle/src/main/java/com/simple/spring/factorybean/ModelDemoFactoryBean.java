package com.simple.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class ModelDemoFactoryBean implements FactoryBean<ModelBean> {
    @Override
    public ModelBean getObject() throws Exception {
        ModelBean modelDemo = new ModelBean();
        modelDemo.setFieldString("field string");
        modelDemo.setFieldInteger(1);
        return modelDemo;
    }

    @Override
    public Class<?> getObjectType() {
        return ModelBean.class;
    }
}
