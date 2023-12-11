package com.simple.spring;

import com.alibaba.fastjson.JSONObject;
import com.simple.spring.source.SourceConfig;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SourceConfigTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(SourceConfigTest.class);

    @Test
    public void sourceConfigTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SourceConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            Object bean = applicationContext.getBean(definitionName);
            LOGGER.info("definitionName {},bean {}", definitionName, JSONObject.toJSON(bean));
        }
    }
}
