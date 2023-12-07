package com.simple.spring.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

import java.util.Objects;

public class LifeCycleBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(LifeCycleBeanFactoryPostProcessor.class);

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        LOGGER.info("LifeCycleBeanFactoryPostProcessor postProcessBeanDefinitionRegistry() invoke...");
        BeanDefinition classBeanDefinition = registry.getBeanDefinition("classBean");
        ClassBean.ClassStudentBean classStudentBean = new ClassBean.ClassStudentBean();
        classStudentBean.setName("student name");
        classStudentBean.setAge(10);
        classBeanDefinition.getPropertyValues().addPropertyValue("classStudentBean", classStudentBean);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        LOGGER.info("LifeCycleBeanFactoryPostProcessor postProcessBeanFactory() invoke...");
        BeanDefinition definition = beanFactory.getBeanDefinition("person");
        if (Objects.nonNull(definition)) {
            LOGGER.info("LifeCycleBeanFactoryPostProcessor postProcessBeanFactory() invoke... beanDefinition person");
            definition.getPropertyValues().addPropertyValue("phone", 123);
        }
    }
}
