package com.lucky.extension.selfAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;

import java.security.AccessControlContext;

/**
 * BeanPostProcessor  Bean后置处理器
 * BeanFactoryPostProcessor BeanFactory后置处理器, 是对BeanDefinition对象进行修改。
 * BeanDefinition：存储bean标签的信息，用来生成bean实例
 *
 * @author: Loki
 * @data: 2021-10-13 16:20
 **/
public class MyAwareProcessor implements BeanPostProcessor {

    private final ConfigurableApplicationContext applicationContext;

    public MyAwareProcessor(ConfigurableApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    /**
     * 会在每一个bean对象的初始化方法调用之前回调
     * @param bean the new bean instance
     * @param beanName the name of the bean
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        AccessControlContext acc = null;

        if (System.getSecurityManager() != null) {
            acc = this.applicationContext.getBeanFactory().getAccessControlContext();
        }


        return bean;
    }

    /**
     * 会在每个bean对象的初始化方法调用之后被回调
     * @param bean the new bean instance
     * @param beanName the name of the bean
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
