package com.lucky.extension.selfAware;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: Loki
 * @data: 2021-11-03 11:30
 **/
public class MyMethodInterceptor implements MethodInterceptor {
    private final Log logger = LogFactory.getLog(getClass());


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        logger.info("目标方法之前"+ method);
        final Object o1 = methodProxy.invokeSuper(o, objects);
        logger.info("目标方法之后"+ method);
        return o1;
    }
}
