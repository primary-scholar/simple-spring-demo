package com.simple.spring.cycledependency;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NoneConstructorCycleDependencyAB_A {
    private String field;
    private NoneConstructorCycleDependencyAB_B dependencyAB_b;


}
