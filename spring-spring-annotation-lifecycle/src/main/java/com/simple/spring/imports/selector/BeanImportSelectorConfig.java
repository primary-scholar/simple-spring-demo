package com.simple.spring.imports.selector;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BeanImportSelector.class)
public class BeanImportSelectorConfig {
}
