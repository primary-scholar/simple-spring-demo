package com.mimu.simple.spring.bean.cycledependency;

import lombok.Getter;

@Getter
public class ConstructorCycleDependencyAB_B {
    private final String field;
    private final ConstructorCycleDependencyAB_A dependencyAB_a;

    public ConstructorCycleDependencyAB_B(String field, ConstructorCycleDependencyAB_A dependencyAB_a) {
        this.field = field;
        this.dependencyAB_a = dependencyAB_a;
    }
}
