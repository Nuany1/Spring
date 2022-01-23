package com.lucky.extension.selfConverter;

import org.springframework.beans.factory.FactoryBean;

/**
 * 通过FactoryBean 创建对象,会有两个对象创建出来交给Spring管理
 * 通过FactoryBean 创建的对象不会放在一级缓存中 会放在factoryBeanObjectCache
 * @author: Loki
 * @data: 2021-11-02 18:40
 **/
public class StudentFactoryBean implements FactoryBean<Student> {

    @Override
    public Student getObject() throws Exception {
        return new Student();
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
