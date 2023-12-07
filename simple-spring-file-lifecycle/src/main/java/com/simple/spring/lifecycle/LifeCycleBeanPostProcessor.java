package com.simple.spring.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

import java.lang.reflect.Constructor;

public class LifeCycleBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(LifeCycleBeanPostProcessor.class);

    public LifeCycleBeanPostProcessor() {
        super();
        LOGGER.info("LifeCycleBeanPostProcessor constructor() invoke... ");
    }

    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        LOGGER.info("LifeCycleBeanPostProcessor predictBeanType() invoke... beanClass {},beanName {}", beanClass, beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.predictBeanType(beanClass, beanName);
    }

    @Override
    public Class<?> determineBeanType(Class<?> beanClass, String beanName) throws BeansException {
        LOGGER.info("LifeCycleBeanPostProcessor determineBeanType() invoke... beanClass {},beanName {}", beanClass, beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.determineBeanType(beanClass, beanName);
    }

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        LOGGER.info("LifeCycleBeanPostProcessor determineCandidateConstructors() invoke... beanClass {},beanName {}", beanClass, beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.determineCandidateConstructors(beanClass, beanName);
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        LOGGER.info("LifeCycleBeanPostProcessor getEarlyBeanReference() invoke... bean {},beanName {}", bean.getClass(), beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.getEarlyBeanReference(bean, beanName);
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        LOGGER.info("LifeCycleBeanPostProcessor postProcessBeforeInstantiation() invoke... beanClass {},beanName {}", beanClass.getClass(), beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        LOGGER.info("LifeCycleBeanPostProcessor postProcessAfterInstantiation() invoke... bean {},beanName {}", bean.getClass(), beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        LOGGER.info("LifeCycleBeanPostProcessor postProcessProperties() invoke... pvs {},bean {},beanName {}", pvs, bean.getClass(), beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.info("LifeCycleBeanPostProcessor postProcessBeforeInitialization() invoke... bean {},beanName {}", bean.getClass(), beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.info("LifeCycleBeanPostProcessor postProcessAfterInitialization() invoke... bean {},beanName {}", bean.getClass(), beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
