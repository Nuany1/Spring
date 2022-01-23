package com.lucky.extension.selfEditor;

import com.lucky.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Loki
 * @data: 2021-10-13 15:28
 **/
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("selfEditor.xml");
        Customer customer = ac.getBean("customer",Customer.class);
        System.out.println(customer.getAddress());
    }
}
