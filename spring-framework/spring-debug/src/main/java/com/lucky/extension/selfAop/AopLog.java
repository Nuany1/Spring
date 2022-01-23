package com.lucky.extension.selfAop;

/**
 * @author: Loki
 * @data: 2021-11-05 19:46
 **/
public class AopLog {

    public void info(int i ,int x) {
        System.out.println("打印除法"+i/x);
    }
}
