package com.we.security.dao;

import com.we.security.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class UserDaoTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void test1(){
        List<User> list = userDao.selectAllUser();
        for (User user : list) {
            System.out.println(user.getU_name());
        }
    }
}
