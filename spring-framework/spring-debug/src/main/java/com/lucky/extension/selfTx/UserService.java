package com.lucky.extension.selfTx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Loki
 * @data: 2021-11-06 19:50
 **/
@Component
public class UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 通过动态代理会跳转到这个类的 DynamicAdvisedInterceptor intercept();
     * doGetTransaction() 创建事物
     * @param user
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public void checkUser(User user){
        /*String userD = userDao.getUser(user.getId());
        System.out.println(userD);*/
        /*String sql = "update t_user set user_stats = user_stats-1 where id = ?";
        jdbcTemplate.update(sql,user.getId());*/
        //Integer num = userDao.updUser(user);
        updUser(user);
        //System.out.println(1/0);
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void updUser(User user){
        String sql = "update t_user set version = version-1 where id = ?";
        jdbcTemplate.update(sql,user.getId());
    }
}
