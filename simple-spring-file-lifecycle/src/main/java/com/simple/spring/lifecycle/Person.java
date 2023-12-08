package com.simple.spring.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, ResourceLoaderAware, ApplicationContextAware, DisposableBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(Person.class);
    private String name;
    private String beanName;
    private Integer phone;
    private ApplicationContext applicationContext;
    private ResourceLoader resourceLoader;
    private BeanFactory beanFactory;

    public Person() {
        LOGGER.info("Person constructor() invoke...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        LOGGER.info("Person setName() invoke...");
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        LOGGER.info("Person setPhone() invoke...");
        this.phone = phone;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        LOGGER.info("Person BeanFactoryAware setBeanFactory() invoke...");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        LOGGER.info("Person BeanNameAware setBeanName() invoke...");
        this.beanName = name;
    }

    @Override
    public void destroy() throws Exception {
        LOGGER.info("Person DisposableBean destroy() invoke...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("Person InitializingBean afterPropertiesSet() invoke...");
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
        LOGGER.info("Person ResourceLoaderAware setResourceLoader() invoke...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        LOGGER.info("Person ApplicationContextAware setApplicationContext() invoke...");
    }

    public void customInit() {
        LOGGER.info("Person init-method invoke...");
    }

    public void customDestory() {
        LOGGER.info("Person destory-method invoke...");
    }

}