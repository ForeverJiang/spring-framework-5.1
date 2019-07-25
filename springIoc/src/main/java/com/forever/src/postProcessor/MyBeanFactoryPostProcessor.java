package com.forever.src.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Description:
 * Creator: jiangyongheng
 * Date: 2019/07/25
 * Time: 16:00
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        AnnotatedBeanDefinition annotatedBeanDefinition = (AnnotatedBeanDefinition)beanFactory.getBeanDefinition("DemoService");
    }
}
