package com.simple.spring.imports.registrar;

import com.simple.spring.imports.actions.Fly;
import com.simple.spring.imports.actions.Move;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.util.ClassUtils;

import java.util.*;

/**
 * ImportBeanDefinitionRegistrar 可以自定义 beanDefinition 的注册，包括 filter package等
 */
public class BeanImportDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    private static final Logger LOGGER = LoggerFactory.getLogger(BeanImportDefinitionRegistrar.class);

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        ImportBeanDefinitionRegistrar.super.registerBeanDefinitions(importingClassMetadata, registry, importBeanNameGenerator);
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(importingClassMetadata.getAnnotationAttributes(ComponentScan.class.getName()));
        Set<String> packagesToScan = new LinkedHashSet<>();
        if (Objects.isNull(annotationAttributes)) {
            packagesToScan.add(ClassUtils.getPackageName(importingClassMetadata.getClassName()));
        } else {
            String[] basePackages = annotationAttributes.getStringArray("basePackages");
            Class<?>[] basePackageClasses = annotationAttributes.getClassArray("basePackageClasses");
            String[] values = annotationAttributes.getStringArray("value");
            packagesToScan.addAll(Arrays.asList(basePackages));
            packagesToScan.addAll(Arrays.asList(values));
            for (Class<?> basePackageClass : basePackageClasses) {
                packagesToScan.add(ClassUtils.getPackageName(basePackageClass));
            }
        }

        ClassPathBeanDefinitionScanner definitionScanner = new ClassPathBeanDefinitionScanner(registry);
        definitionScanner.addIncludeFilter(new AssignableTypeFilter(Move.class));
        definitionScanner.addExcludeFilter(new AssignableTypeFilter(Fly.class));

        definitionScanner.scan(packagesToScan.toArray(new String[0]));

    }
}
