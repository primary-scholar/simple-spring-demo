package com.simple.spring;


import com.alibaba.fastjson.JSONObject;
import com.simple.spring.cycledependency.constructor.ConstructorCycleDependencyConfig;
import com.simple.spring.cycledependency.nonconstructor.autowired.NonConstructorCycleDependencyAutowiredConfig;
import com.simple.spring.cycledependency.nonconstructor.multiautowired.MultiAutowiredConfig;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CycleDependencyTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(CycleDependencyTest.class);

    @Test
    public void nonConstructorCycleDependencyTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(NonConstructorCycleDependencyAutowiredConfig.class);
        String[] singletonNames = applicationContext.getBeanFactory().getSingletonNames();
        for (String singletonName : singletonNames) {
            Object bean = applicationContext.getBean(singletonName);
            Assert.assertNotNull(bean);
        }
    }

    @Test
    public void constructorCycleDependencyTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConstructorCycleDependencyConfig.class);
        String[] singletonNames = applicationContext.getBeanFactory().getSingletonNames();
        for (String singletonName : singletonNames) {
            Object bean = applicationContext.getBean(singletonName);
            LOGGER.info("definitionName {},bean {}", singletonNames, JSONObject.toJSON(bean));
            Assert.assertNotNull(bean);
        }
    }

    @Test
    public void multiNonConstructorCycleDependencyTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MultiAutowiredConfig.class);
        String[] singletonNames = applicationContext.getBeanFactory().getSingletonNames();
        for (String singletonName : singletonNames) {
            Object bean = applicationContext.getBean(singletonName);
            LOGGER.info("definitionName {},bean {}", singletonNames, JSONObject.toJSON(bean));
            Assert.assertNotNull(bean);
        }
    }

}