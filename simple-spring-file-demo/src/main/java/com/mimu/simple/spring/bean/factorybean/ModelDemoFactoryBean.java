package com.mimu.simple.spring.bean.factorybean;

import com.mimu.simple.spring.bean.ClassBean;
import org.springframework.beans.factory.FactoryBean;

public class ModelDemoFactoryBean implements FactoryBean<ClassBean> {
    @Override
    public ClassBean getObject() throws Exception {
        ClassBean modelDemo = new ClassBean();
        modelDemo.setName("field");
        return modelDemo;
    }

    @Override
    public Class<?> getObjectType() {
        return ClassBean.class;
    }
}
