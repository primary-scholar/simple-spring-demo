package com.simple.spring.condition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class SimpleConditionC implements Condition {
    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleConditionC.class);

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        LOGGER.info("context {},metaData {}", context, metadata);
        return System.currentTimeMillis() % 2 == 0;
    }
}
