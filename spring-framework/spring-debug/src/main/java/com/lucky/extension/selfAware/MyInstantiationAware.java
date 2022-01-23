package com.lucky.extension.selfAware;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;

/**
 * 通过动态代理创建一个类的实例
 * AbstractAutowireCapableBeanFactory-> resolveBeforeInstantiation();
 *
 * @author: Loki
 * @data: 2021-11-03 11:22
 **/
public class MyInstantiationAware implements InstantiationAwareBeanPostProcessor {
    private final Log logger = LogFactory.getLog(getClass());

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanClass == BeforeInstantiation.class){
            logger.info("通过动态代理生成对象");
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(beanClass);
            enhancer.setCallback(new MyMethodInterceptor());
            final BeforeInstantiation before =(BeforeInstantiation) enhancer.create();
            return before;
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return false;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        return pvs;
    }
}
