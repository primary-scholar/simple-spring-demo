package com.mimu.simple.spring.bean.lifecycle;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

@Setter
@Getter
public class StudentBean implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
    private Integer age;
    private String name;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setBeanName(String name) {

    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
