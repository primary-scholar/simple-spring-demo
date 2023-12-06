package com.simple.spring.lifecycle;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClassBean {
    private String name;
    private Integer grade;
    private ClassStudentBean classStudentBean;


    @Setter
    @Getter
    public static class ClassStudentBean {
        private Integer age;
        private String name;
    }

}
