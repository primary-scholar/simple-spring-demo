package com.simple.spring.imports.selector;

import com.simple.spring.imports.actions.FlySecond;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 可以通过 import 直接 import 某个 bean
 */
@Configuration
@Import(FlySecond.class)
public class BeanImportConfig {
}
