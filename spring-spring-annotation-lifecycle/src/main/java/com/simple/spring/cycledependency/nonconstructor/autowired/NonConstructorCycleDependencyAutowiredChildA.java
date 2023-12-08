package com.simple.spring.cycledependency.nonconstructor.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class NonConstructorCycleDependencyAutowiredChildA extends NoConstructorCycleDependencyAutowiredParentA {
    private String childField;
    @Autowired
    private NoConstructorCycleDependencyAutowiredParentA parentA;
}
