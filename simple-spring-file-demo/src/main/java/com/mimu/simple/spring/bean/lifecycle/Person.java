package com.mimu.simple.spring.bean.lifecycle;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, ResourceLoaderAware, ApplicationContextAware, DisposableBean {

    private String name;
    private int phone;
    private String beanName;

    private ApplicationContext applicationContext;
    private ResourceLoader resourceLoader;
    private BeanFactory beanFactory;

    public Person() {
        System.out.println("Person constructor() invoke...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Person setName() invoke...");
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        System.out.println("Person setPhone() invoke...");
        this.phone = phone;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Person BeanFactoryAware setBeanFactory() invoke...");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Person BeanNameAware setBeanName() invoke...");
        this.beanName = name;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Person DisposableBean destroy() invoke...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Person InitializingBean afterPropertiesSet() invoke...");
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
        System.out.println("Person ResourceLoaderAware setResourceLoader() invoke...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("Person ApplicationContextAware setApplicationContext() invoke...");
    }

    public void customInit() {
        System.out.println("Person init-method invoke...");
    }

    public void customDestory() {
        System.out.println("Person destory-method invoke...");
    }

}