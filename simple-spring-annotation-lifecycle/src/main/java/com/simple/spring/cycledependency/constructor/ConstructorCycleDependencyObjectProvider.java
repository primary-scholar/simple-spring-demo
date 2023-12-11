package com.simple.spring.cycledependency.constructor;

import lombok.Getter;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ConstructorCycleDependencyObjectProvider {
    private DependencyObjectA objectA;
    private DependencyObjectB objectB;

    @Autowired
    public ConstructorCycleDependencyObjectProvider(ObjectProvider<DependencyObjectA> aObjectProvider, ObjectProvider<DependencyObjectB> bObjectProvider) {
        this.objectA = aObjectProvider.getIfAvailable();
        this.objectB = bObjectProvider.getIfAvailable();
    }
}
