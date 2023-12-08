package com.simple.spring.cycledependency.nonconstructor.multiautowired;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Component
public class CycleDependencyAutowiredSecond {
    private IDependencyObject object;

    @Autowired
    @Qualifier(value = "dependencyObjectA")
    public void setObject(IDependencyObject object) {
        this.object = object;
    }
}
