package com.simple.spring.imports.selector;

import com.simple.spring.imports.actions.FlyFirst;
import com.simple.spring.imports.actions.WalkFirst;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * 可以明确指定 需要 import 的 beanName
 */
public class BeanImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{WalkFirst.class.getName(), FlyFirst.class.getName()};
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return ImportSelector.super.getExclusionFilter();
    }
}
