package com.lucky.extension.selfAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author: Loki
 * @data: 2021-11-05 15:56
 **/
//@Aspect
public class LogUtil {

    //切入点表达式 execution(public void com.lucky.extension.*(..))
    //@Pointcut("execution(void com.lucky.extension.selfAop.AopLog.*(..))")
    public void point(){};
    /**
     * 前置通知 (@Before)
     */
    //@Before("point()")
    public void logStart(JoinPoint joinPoint){
        System.out.println("开始运行 目标方法"+joinPoint.getSignature().getName());
    }
    /**
     * 后置通知
     */
    //@After(value = "point()")
    public void logStop(){
        System.out.println("结束运行");
    }

    /**
     * 返回通知
     */
    //@AfterReturning(value = "point()",returning="result")
    public void logReturn(Objects result){
        System.out.println("正常返回" +result);
    }
    /**
     * 异常通知
     */
    //@AfterThrowing(value = "point()",throwing="exception")
    public void logException(Exception exception){
        System.out.println("异常返回"+exception);
    }
    /**
     * 环绕通知  动态代理 手动推送日志方法
     */
    //@Around(value = "point()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable{
        Object[] args = joinPoint.getArgs();
        System.out.println("环绕通知 方法参数："+args);
        return joinPoint.proceed(args);
    }
}
