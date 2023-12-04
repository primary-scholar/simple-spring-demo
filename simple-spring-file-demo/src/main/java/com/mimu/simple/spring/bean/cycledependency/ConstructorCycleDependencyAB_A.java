package com.mimu.simple.spring.bean.cycledependency;


import lombok.Getter;

@Getter
public class ConstructorCycleDependencyAB_A {
    private final String field;
    private final ConstructorCycleDependencyAB_B dependencyAB_b;

    public ConstructorCycleDependencyAB_A(String field, ConstructorCycleDependencyAB_B dependencyAB_b) {
        this.field = field;
        this.dependencyAB_b = dependencyAB_b;
    }
}
