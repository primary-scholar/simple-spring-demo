package com.mimu.simple.spring.bean.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

import java.lang.reflect.Constructor;

public class LifeCycleBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("LifeCycleBeanPostProcessor predictBeanType() invoke...");
        return null;
    }

    @Override
    public Class<?> determineBeanType(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("LifeCycleBeanPostProcessor determineBeanType() invoke...");
        return beanClass;
    }

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("LifeCycleBeanPostProcessor determineCandidateConstructors() invoke...");
        return null;
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        System.out.println("LifeCycleBeanPostProcessor getEarlyBeanReference() invoke...");
        return null;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("LifeCycleBeanPostProcessor postProcessBeforeInstantiation() invoke...");
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("LifeCycleBeanPostProcessor postProcessAfterInstantiation() invoke...");
        return Boolean.FALSE;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("LifeCycleBeanPostProcessor postProcessProperties() invoke...");
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("LifeCycleBeanPostProcessor postProcessBeforeInitialization() invoke...");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("LifeCycleBeanPostProcessor postProcessAfterInitialization() invoke...");
        return bean;
    }
}
