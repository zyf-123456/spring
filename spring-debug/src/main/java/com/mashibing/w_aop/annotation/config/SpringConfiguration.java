package com.mashibing.w_aop.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages= "com.mashibing.w_aop.annotation")
@EnableAspectJAutoProxy
public class SpringConfiguration { }