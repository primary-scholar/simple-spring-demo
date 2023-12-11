package com.simple.spring.cycledependency.nonconstructor.autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Autowired 的依赖注入解析是 首先按照 type 进行依赖 bean 的获取，如果发现有多个 bean，则 根据 beanName 进行优先注入
 * 这里 可以通过 修改 other 中的 field 名称来 验证；当 other 中 field 为 noConstructorCycleDependencyAutowiredParentA 时可以正常注入
 * 其他 时 失败；
 * <p>
 * 这里 spring 要创建的单例除了 当前类之外，共有三个 分别是 一个 父类 parentA，一个子类 childA，
 * 除此之外还有一个 other，对于这三个单例的创建和依赖 需要单独分析
 * 实例化 parentA：首先调用默认构造函数创建 parentA 对象，然后添加到 singletonFactory中即进行提前暴露，然后开始填充其属性，
 * 填充时 autowired 依赖一个 childA；这时 就 走 实例 childA 的流程(该流程和实例化parentA一样)；
 * 实例化 childA：首先调用默认构造函数创建 childA 对象，然后添加到 singletonFactory中即进行提前暴露 然后填充其属性；
 * 填充时 autowired 依赖一个 parentA；这时的 parentA 已经实例化且提前暴露 所以这里可以直接填充属性parentA 属性填充完毕后 执行后续的初始话流程;自此 childA 实例化完毕；
 * childA 实例化完毕后 则可以填充到 parentA 的属性中，至此 parentA，childA 都初始化完毕；
 * <p>
 * 实例化 other时 和上面的流程一样，首先调用默认构造函数 然后添加到 singletonFactory中即进行提前暴露，然后开始填充其属性；
 * 填充时 autowired 依赖一个 parentA，根据 autowired 的注入流程 这时 发现 parentA 的类型有 2 个 一个是 parentA，一个是其子类 childA；
 * 然后根据 beanName 进行优先注入 根据 beanName 填充时 找不到 该 beanName 的 bean 这时注入就会报错
 */
@Configuration
@ComponentScan(basePackageClasses = NonConstructorCycleDependencyAutowiredConfig.class)
public class NonConstructorCycleDependencyAutowiredConfig {
}
