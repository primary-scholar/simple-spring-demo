package com.simple.spring.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration 对于 spring container  来说 被该注解标注的类是一个配置文件 类似于 xml 文件,bean 注解 类似于 <bean> 标签 用于定义 beanDefinition Configuration 的解析过程在
 *
 * @see org.springframework.context.annotation.ConfigurationClassPostProcessor 中，该类会把 config 中定义的 beanDefinition 注册到 DefaultListableBeanFactory 中
 * 对于 嵌套的 Configuration 类，则进行递归处理
 * beanDefinition 注册时
 * 把 bean 注解 的 方法名当作 beanDefinitionName Method 当作 BeanDefinition 注册到 DefaultListableBeanFactory 中
 * singleton 对象创建时
 * 会根据 BeanDefinition 定义中的 @Condition 来判断是否跳过该对象的创建
 */
@Configuration
public class SimpleConditionConfig {

    @Configuration
    public static class SimpleInnerConditionConfig {

        @Bean
        @Conditional({SimpleConditionA.class, SimpleConditionB.class})
        public ObjectBean conditionAB() {
            return ObjectBean.builder().conditionDesc("SimpleConditionA and  return true").build();
        }
    }

    @Bean
    @Conditional(SimpleConditionA.class)
    public ObjectBean conditionA() {
        return ObjectBean.builder().conditionDesc("SimpleConditionA return true").build();
    }

    @Bean
    @Conditional(SimpleConditionB.class)
    public ObjectBean conditionB() {
        return ObjectBean.builder().conditionDesc("conditionB return true").build();
    }

    @Bean
    @Conditional(SimpleConditionC.class)
    public ObjectBean conditionC() {
        return ObjectBean.builder().conditionDesc("SimpleConditionC return true").build();
    }
}
