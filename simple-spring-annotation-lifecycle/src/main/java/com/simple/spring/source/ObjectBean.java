package com.simple.spring.source;

import lombok.Getter;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;


/**
 * value 字段的 数值填充 是在
 *
 * @see AutowiredAnnotationBeanPostProcessor 中处理的，而 填充数值的获取 是在
 * @see PropertySourcesPlaceholderConfigurer 中 解析的，而该对象的引入是在
 * @see org.springframework.context.annotation.ConfigurationClass#doProcessConfigurationClass 方法
 * 有对 注解 @PropertySource 和  @PropertySources 的处理
 */
@Getter
@Component
public class ObjectBean {

    @Value("${config.model.field}")
    private String field;

}
