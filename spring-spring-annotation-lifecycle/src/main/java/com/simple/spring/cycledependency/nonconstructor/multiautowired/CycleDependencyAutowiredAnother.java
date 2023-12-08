package com.simple.spring.cycledependency.nonconstructor.multiautowired;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class CycleDependencyAutowiredAnother {
    private DependencyObjectA dependencyObjectA;

    @Autowired
    public void setDependencyObjectA(DependencyObjectA dependencyObjectA) {
        this.dependencyObjectA = dependencyObjectA;
    }
}
