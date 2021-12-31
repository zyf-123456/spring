package com.mashibing.g_bfpp.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import sun.security.provider.Sun;

@Configuration
@Import(Sun.class)
public class ImportAnnotation {

    private String name;
}
