package com.simple.spring;

import com.alibaba.fastjson.JSONObject;
import com.simple.spring.condition.SimpleConditionConfig;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleConditionTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleConditionTest.class);

    @Test
    public void simpleConditionTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SimpleConditionConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            Object bean = applicationContext.getBean(definitionName);
            LOGGER.info("definitionName {},bean {}", definitionName, JSONObject.toJSON(bean));
        }
    }
}
