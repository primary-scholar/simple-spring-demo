package com.simple.spring.source;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackageClasses = SourceConfig.class)
@PropertySource(value = {"classpath:config.properties"})
public class SourceConfig {

}
