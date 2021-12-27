package com.mashibing.g_bfpp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author libin
 * @description
 * @date 2021-12-26
 */
@Configuration
@ComponentScan("com.mashibing.g_bfpp")
public class MyComponentScan {

    @Configuration
    @ComponentScan("com.mashibing.g_bfpp")
    public class MyIneerComponentScan {
    }
}
