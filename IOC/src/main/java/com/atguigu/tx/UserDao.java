package com.atguigu.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author CJYong
 * @create 2021-10-28 20:30
 */

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(){
        String sql = "INSERT INTO user_table(USER,PASSWORD,balance) VALUES(?,?,?)";
        String username = UUID.randomUUID().toString().substring(0, 20);
        jdbcTemplate.update(sql,username,"25466",3000);
    }
}
