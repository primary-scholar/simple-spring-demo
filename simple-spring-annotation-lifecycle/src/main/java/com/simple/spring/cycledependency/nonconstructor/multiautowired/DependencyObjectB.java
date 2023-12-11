package com.simple.spring.cycledependency.nonconstructor.multiautowired;

import org.springframework.stereotype.Component;

@Component
public class DependencyObjectB implements IDependencyObject {
    @Override
    public void info() {
        System.out.println("this is dependencyB");
    }
}
