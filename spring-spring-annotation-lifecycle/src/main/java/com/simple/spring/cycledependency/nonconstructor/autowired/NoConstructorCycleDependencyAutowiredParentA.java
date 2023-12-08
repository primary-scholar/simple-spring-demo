package com.simple.spring.cycledependency.nonconstructor.autowired;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class NoConstructorCycleDependencyAutowiredParentA {
    private String parentFiledA;
    @Autowired
    private NonConstructorCycleDependencyAutowiredChildA childA;
}
