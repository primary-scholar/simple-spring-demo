package com.simple.spring.cycledependency;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NoneConstructorCycleDependencyAB_B {
    private String field;
    private NoneConstructorCycleDependencyAB_A dependencyAB_a;
}
