package com.simple.spring.cycledependency.constructor;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ObjectProvider 与 @Autowired 类似用于依赖注入
 * 1. @Autowired 注解可以用于 field,setter,constructor 而 ObjectProvider 主要用于 constructor
 * 2. @Autowired 标注的依赖对象不存在时,则注入过程会出现异常,而 ObjectProvider.getIfAvailable() 可返回 Null 而不报异常
 * 这里 可以 通过 把 objectA 或者 objectB 类上的 @component 注释掉 进行验证
 * 对于 ObjectProvider 的依赖注入过程 参考
 *
 * @see DefaultListableBeanFactory.DependencyObjectProvider#getIfAvailable()
 */
@Configuration
@ComponentScan(basePackageClasses = ConstructorCycleDependencyConfig.class)
public class ConstructorCycleDependencyConfig {
}
