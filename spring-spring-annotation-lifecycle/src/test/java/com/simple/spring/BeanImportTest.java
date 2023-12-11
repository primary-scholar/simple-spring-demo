package com.simple.spring;

import com.alibaba.fastjson.JSONObject;
import com.simple.spring.imports.registrar.BeanImportRegistrarConfig;
import com.simple.spring.imports.selector.BeanImportConfig;
import com.simple.spring.imports.selector.BeanImportSelectorConfig;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanImportTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(BeanImportTest.class);

    @Test
    public void beanImportRegistrarTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanImportRegistrarConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            Object bean = applicationContext.getBean(definitionName);
            LOGGER.info("definitionName {},bean {}", definitionName, JSONObject.toJSON(bean));
        }
    }

    @Test
    public void beanImportSelectorTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanImportSelectorConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            Object bean = applicationContext.getBean(definitionName);
            LOGGER.info("definitionName {},bean {}", definitionName, JSONObject.toJSON(bean));
        }
    }

    @Test
    public void beanImportTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanImportConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            Object bean = applicationContext.getBean(definitionName);
            LOGGER.info("definitionName {},bean {}", definitionName, JSONObject.toJSON(bean));
        }
    }
}
