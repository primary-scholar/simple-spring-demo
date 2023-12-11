package com.simple.spring.imports.registrar;

import com.simple.spring.imports.actions.Move;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BeanImportDefinitionRegistrar.class)
@ComponentScan(basePackageClasses = Move.class)
public class BeanImportRegistrarConfig {
}
