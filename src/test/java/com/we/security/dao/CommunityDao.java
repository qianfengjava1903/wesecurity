package com.we.security.dao;

import com.we.security.entity.Community;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @program: we-security
 * @description: 测试
 * @author: Mr.YangXin
 * @create: 2019-07-22 10:57
 * @return
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class CommunityDao {

    @Autowired
    private CommunityDaoTest communityDaoTest;

    @Test
    public void testSelectAll(){
        List<Community> communities = communityDaoTest.selectAll();
        for (Community com : communities) {
            System.out.println(com.getCName());
        }
    }
}
