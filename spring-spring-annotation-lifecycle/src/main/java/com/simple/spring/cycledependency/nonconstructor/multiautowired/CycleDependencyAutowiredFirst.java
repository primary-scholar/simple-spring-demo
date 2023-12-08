package com.simple.spring.cycledependency.nonconstructor.multiautowired;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
//@Component
public class CycleDependencyAutowiredFirst {
    private IDependencyObject object;

    @Autowired
    public void setObject(IDependencyObject object) {
        this.object = object;
    }
}
