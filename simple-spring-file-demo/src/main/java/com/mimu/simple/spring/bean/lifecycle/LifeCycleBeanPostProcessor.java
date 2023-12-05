package com.mimu.simple.spring.bean.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

import java.lang.reflect.Constructor;

public class LifeCycleBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

    public LifeCycleBeanPostProcessor() {
        super();
        System.out.println("LifeCycleBeanPostProcessor constructor() invoke... ");
    }

    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        String format = String.format("LifeCycleBeanPostProcessor predictBeanType() invoke... beanClass %s,beanName %s", beanClass.getClass(), beanName);
        System.out.println(format);
        return SmartInstantiationAwareBeanPostProcessor.super.predictBeanType(beanClass, beanName);
    }

    @Override
    public Class<?> determineBeanType(Class<?> beanClass, String beanName) throws BeansException {
        String format = String.format("LifeCycleBeanPostProcessor determineBeanType() invoke... beanClass %s,beanName %s", beanClass.getClass(), beanName);
        System.out.println(format);
        return SmartInstantiationAwareBeanPostProcessor.super.determineBeanType(beanClass, beanName);
    }

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        String format = String.format("LifeCycleBeanPostProcessor determineCandidateConstructors() invoke... beanClass %s,beanName %s", beanClass.getClass(), beanName);
        System.out.println(format);
        return SmartInstantiationAwareBeanPostProcessor.super.determineCandidateConstructors(beanClass, beanName);
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        String format = String.format("LifeCycleBeanPostProcessor getEarlyBeanReference() invoke... bean %s,beanName %s", bean.getClass(), beanName);
        System.out.println(format);
        return SmartInstantiationAwareBeanPostProcessor.super.getEarlyBeanReference(bean, beanName);
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        String format = String.format("LifeCycleBeanPostProcessor postProcessBeforeInstantiation() invoke... beanClass %s,beanName %s", beanClass.getClass(), beanName);
        System.out.println(format);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        String format = String.format("LifeCycleBeanPostProcessor postProcessAfterInstantiation() invoke... bean %s,beanName %s", bean.getClass(), beanName);
        System.out.println(format);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        String format = String.format("LifeCycleBeanPostProcessor postProcessProperties() invoke... pvs %s,bean %s,beanName %s", pvs, bean.getClass(), beanName);
        System.out.println(format);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        String format = String.format("LifeCycleBeanPostProcessor postProcessBeforeInitialization() invoke... bean %s,beanName %s", bean.getClass(), beanName);
        System.out.println(format);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        String format = String.format("LifeCycleBeanPostProcessor postProcessAfterInitialization() invoke... bean %s,beanName %s", bean.getClass(), beanName);
        System.out.println(format);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
