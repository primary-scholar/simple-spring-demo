package com.simple.spring.cycledependency.nonconstructor.multiautowired;

import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Getter
//@Component
public class CycleDependencyResource {
    private IDependencyObject object;

    @Resource
    public void setObject(IDependencyObject object) {
        this.object = object;
    }

}
