package com.forever.src;

import com.forever.src.config.AppConfig;
import com.forever.src.service.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * Creator: jiangyongheng
 * Date: 2019/07/24
 * Time: 11:47
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(AppConfig.class);
        annotationConfigApplicationContext.refresh();
        DemoService bean = annotationConfigApplicationContext.getBean(DemoService.class);
        bean.say();

    }
}
