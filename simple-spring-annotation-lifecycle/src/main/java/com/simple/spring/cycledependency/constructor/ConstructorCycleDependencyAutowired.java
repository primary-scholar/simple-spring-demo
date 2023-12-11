package com.simple.spring.cycledependency.constructor;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ConstructorCycleDependencyAutowired {
    private DependencyObjectA objectA;
    private DependencyObjectB objectB;

    @Autowired
    public ConstructorCycleDependencyAutowired(DependencyObjectA objectA, DependencyObjectB objectB) {
        this.objectA = objectA;
        this.objectB = objectB;
    }
}
