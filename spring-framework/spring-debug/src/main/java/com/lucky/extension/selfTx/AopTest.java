package com.lucky.extension.selfTx;

import com.lucky.extension.selfTx.User;
import com.lucky.extension.selfTx.UserDao;
import com.lucky.extension.selfTx.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: Loki
 * @data: 2021-11-05 14:00
 **/

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("tx.xml");
        final UserService bean = ac.getBean(UserService.class);
        final User user = ac.getBean(User.class);
        user.setId(1);
        bean.checkUser(user);
    }
}
