package com.we.security.dao;

import com.we.security.entity.Community;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 测试
 */
@Repository
public interface CommunityDaoTest {

    /**
     * 查询全部社区信息
     * @return
     */
    List<Community> selectAll();

}
