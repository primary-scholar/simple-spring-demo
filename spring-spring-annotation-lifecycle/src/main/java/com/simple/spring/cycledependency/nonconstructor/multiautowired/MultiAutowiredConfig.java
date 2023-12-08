package com.simple.spring.cycledependency.nonconstructor.multiautowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * 这里再次验证 Autowired 的依赖注入解析是 首先按照 type 进行依赖 bean 的获取，如果发现有多个 bean，则 根据 beanName 进行优先注入
 *
 * @see CycleDependencyAutowiredFirst 中 由于 接口 的实现类有多个 所以注入时报错
 * @see CycleDependencyAutowiredSecond 中 可以使用 Qualifier 注解 进行注入 限制
 * @see CycleDependencyAutowiredAnother 中 由于接口的某个具体实现类 只有一个 所以 注入正常
 */
@Configuration
@ComponentScan(basePackageClasses = MultiAutowiredConfig.class)
public class MultiAutowiredConfig {
}
