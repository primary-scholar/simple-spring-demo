package com.mimu.simple.spring.bean.cycledependency;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ConstructorCycleDependencyAB_A {
    private String field;
    private ConstructorCycleDependencyAB_B dependencyAB_b;

    public ConstructorCycleDependencyAB_A(String field, ConstructorCycleDependencyAB_B dependencyAB_b) {
        this.field = field;
        this.dependencyAB_b = dependencyAB_b;
    }
}
