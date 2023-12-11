package com.simple.spring.cycledependency.nonconstructor.multiautowired;

import org.springframework.stereotype.Component;

@Component
public class DependencyObjectA implements IDependencyObject {
    public void info() {
        System.out.println("this is dependencyA");
    }
}
