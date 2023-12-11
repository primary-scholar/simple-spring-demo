package com.simple.spring.cycledependency.nonconstructor.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 这里 属性名为 noConstructorCycleDependencyAutowiredParentA 是可注入成功，其他时 失败
 * 参考 该包 config 解析
 */
@Component
public class NonConstructorCycleDependencyAutowiredOther {

    @Autowired
    private NoConstructorCycleDependencyAutowiredParentA noConstructorCycleDependencyAutowiredParentA;
}
