package org.pk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.pk.bean", "org.pk.config","org.pk.implementation","org.pk.service"})
public class PersonConfig {
}
