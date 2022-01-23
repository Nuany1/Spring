package com.lucky.extension.selfTx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Loki
 * @data: 2021-11-06 19:49
 **/
@Service
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Transactional(propagation = Propagation.NESTED  )
    public Integer updUser(User user){
        String sql = "update t_user set version = version-1 where id = ?";
        return jdbcTemplate.update(sql,user.getId());
    }

    @Transactional
    public String  getUser(Integer userId){
        String sql = "select userName from t_user where id = ?";
        return jdbcTemplate.queryForObject(sql,String.class,userId);
    }
}
